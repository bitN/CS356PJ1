import java.util.ArrayList;
import java.util.Arrays;
public class SingleChoiceQuestion implements Question {
    private String questionType = "MultipleChoiceQuestion";
    private ArrayList<String> candidateAnswers;
    
    public SingleChoiceQuestion(){
    }
    public SingleChoiceQuestion(String[] qArray){
        //put qArray in candidateAnswers
        candidateAnswers = new ArrayList<String>(Arrays.asList(qArray));
    }
    public SingleChoiceQuestion(ArrayList<String> cAns){
        candidateAnswers = cAns;
    }
    public String getQuestionType(){
        return questionType;
    }
    public ArrayList<String> getCandidateAnswers(){
        return candidateAnswers;
    }
}
