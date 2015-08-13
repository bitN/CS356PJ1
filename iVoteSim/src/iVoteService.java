import java.util.ArrayList;
import java.util.HashMap;
import java.util.Arrays;
import java.lang.Object;
//starts with question type and candidate answers
public class iVoteService implements VoteService {
    private Question theQ;
    //private ArrayList<String> theCandAns;
    private String[] theCorAns;
    private HashMap<String, String[]> results = new HashMap();
    private int correctNum;
    private int count;
    private int wCount;
    private ArrayList<String[]> storedAns = new ArrayList();
    String outStr;
    
    iVoteService(Question qIn){
        theQ = qIn;
    }
    iVoteService(Question qIn, String[] ansIn){
        theQ = qIn;
        //theCorAns = Arrays.asList(ansIn);
        theCorAns = ansIn;
    }
    //
    iVoteService(String qType, ArrayList<String> cAns){
        if(qType.equals("MultipleChoice")){
            theQ = new MultipleChoiceQuestion(cAns);
        }
        if(qType.equals("SingleChoice")){
            //theQ = new SingleChoiceQuestion(cAns);
        }
    }
    @Override
    public String getQType(){
        return theQ.getQuestionType();
    }
    @Override
    public ArrayList<String> getCandAnswers(){
        return theQ.getCandidateAnswers();
    }
    @Override
    public void submitAnswer(String studentID, String ansStr){
        String[] ans = {ansStr};
        ans = results.put(studentID, ans);
    }
    @Override
    public void submitAnswers(String studentID, String[] ans){
        if(theQ.getQuestionType().equalsIgnoreCase("MultipleChoiceQuestion")){
            results.put(studentID, ans);
        }
    }
    @Override
    //for each answer in candidate answers
    //how many times has it been submitted
    public String AnwserStatistics(){
        outStr ="";
        for(int i=0; i < storedAns.size(); i++){
            storedAns.remove(i);
        }
        storedAns.addAll(results.values());
        for(int i=0; i < theQ.getCandidateAnswers().size(); i++){
            count=0;
            for(int j=0; j < storedAns.size(); j++){
                if(Arrays.asList(storedAns.get(j)).contains(theQ.getCandidateAnswers().get(i))){
                    count++;
                }
            }
           outStr = outStr + " " + theQ.getCandidateAnswers().get(i) + " was submitted ";
           outStr = outStr + count + " times\n";
        }
        return outStr;
    }
    @Override
    public String CorrectnessStatistics(){
        outStr ="";
        count=0;
        wCount=0;
        for(int i=0; i < storedAns.size(); i++){
            storedAns.remove(i);
        }
        storedAns.addAll(results.values());
        for (int j = 0; j < storedAns.size(); j++) {
            for (int i = 0; i < theCorAns.length; i++) {
                if (Arrays.asList(storedAns.get(j)).contains(theCorAns[i])) {
                    count++;
                }
            }
        }
        outStr = outStr + "Right: " + count + "\n";
        outStr = outStr + "Wrong: " + (storedAns.size() - count) + " \n";
        return outStr;
        
    }
}
