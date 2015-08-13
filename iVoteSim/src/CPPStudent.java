//import java.security.*;

//could add authentication, access control, accountability
public class CPPStudent extends RandomStudent{
    private int broncoID;
    private String firstName;
    private String lastName;
    //private String secret;
    
    public CPPStudent(int bID, String fName, String lName){
        broncoID = bID;
        firstName = fName;
        lastName = lName;
        setStudentID();
    }
    /*
    public String MD5(String plainStr) {
        try {
            java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
            byte[] array = md.digest(plainStr.getBytes());
            StringBuilder hashStr = new StringBuilder();
            
            for (int i = 0; i < array.length; ++i) {
                hashStr.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1,3));
            }
            return hashStr.toString();
        } catch (java.security.NoSuchAlgorithmException e) {
        }
        return null;
    }*/
}
