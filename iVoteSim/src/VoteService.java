import java.util.ArrayList;
public interface VoteService {
    
    String getQType();
    ArrayList<String> getCandAnswers();
    void submitAnswer(String studentID, String ansStr);
    void submitAnswers(String studentID, String[] ans);
    String AnwserStatistics();
    String CorrectnessStatistics();
}
