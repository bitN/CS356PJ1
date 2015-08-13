import java.util.ArrayList;
public interface Question {
    //array?
    public static final String[] validTypes = {"MultipleChoice", "SingleChoice"};
    public String getQuestionType();
    public ArrayList<String> getCandidateAnswers();
}
