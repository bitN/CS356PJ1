import java.security.*;
import java.math.*;

public class RandomStudent implements Student{
    private String studentID;
    private SecureRandom random = new SecureRandom();
    
    RandomStudent(){
        setStudentID();
    }
    protected void setStudentID(){
        studentID = new BigInteger(130, random).toString(32);
    }
    @Override //implementation
    public String getStudentID(){
        return studentID;
    }
}
