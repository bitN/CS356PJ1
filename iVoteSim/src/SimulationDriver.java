import java.util.ArrayList;
import java.util.Arrays;
import java.io.*;
 //
public class SimulationDriver {
    public static void main (String[] args){
        //1) create a question type and configure it
        String[] candAns = {"Windows XP", "Windows Vista", "win7", "win8(.1)", "win10", "OSX", "Gentoo"};
        MultipleChoiceQuestion mQ = new MultipleChoiceQuestion(candAns);
        //2) configure the question for iVoteService
        String[] corAns = {"Windows XP", "Windows Vista", "win7", "win8(.1)", "win10"};
        //rrayList corAnsArr = Arrays.asList(corAns);
        iVoteService vServer = new iVoteService(mQ, corAns);
        System.out.println("Vote Service Initialized");
        System.out.println("What OS does Microsoft make?");
        //3) generate random students
        RandomStudent rS1 = new RandomStudent();
        RandomStudent rS2 = new RandomStudent();
        RandomStudent rS3 = new RandomStudent();
        RandomStudent rS4 = new RandomStudent();
        RandomStudent rS5 = new RandomStudent();
        
        //4) submit all the student's answers to vote service
        vServer.submitAnswer(rS1.getStudentID(), "win10");
        vServer.submitAnswer(rS2.getStudentID(), "Apple");
        vServer.submitAnswer(rS2.getStudentID(), "win10");
        vServer.submitAnswer(rS3.getStudentID(), "Apple");
        vServer.submitAnswer(rS4.getStudentID(), "Windows XP");
        String[] rS5sub = {"Windows XP", "Windows Vista", "win7", "win8(.1)", "win10"};
        vServer.submitAnswer(rS5.getStudentID(), "rS5sub");
        //5)Call Vote Service output functions to display result
        System.out.println(vServer.AnwserStatistics());
        System.out.println(vServer.CorrectnessStatistics());
    }
}
