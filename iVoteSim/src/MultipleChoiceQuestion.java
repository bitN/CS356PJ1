import java.util.ArrayList;
import java.util.Arrays;
public class MultipleChoiceQuestion implements Question {
    private String questionType = "MultipleChoiceQuestion";
    private ArrayList<String> candidateAnswers;
    
    public MultipleChoiceQuestion(){
    }
    public MultipleChoiceQuestion(String[] qArray){
        //put qArray in candidateAnswers
        candidateAnswers = new ArrayList<String>(Arrays.asList(qArray));
    }
    public MultipleChoiceQuestion(ArrayList<String> cAns){
        candidateAnswers = cAns;
    }
    public String getQuestionType(){
        return questionType;
    }
    public ArrayList<String> getCandidateAnswers(){
        return candidateAnswers;
    }
}
