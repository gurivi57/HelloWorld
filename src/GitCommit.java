import java.sql.SQLOutput;

public class GitCommit {

    public static void main (String [] args){
        System.out.println("Hello Git, this is my first remote commit");
        //Removed extra print message
        System.out.println("Testing git commit");
        GitCommit.add();
    }

    public static void add(){
        int a=1;
        int b=3;
        int total=a+b;
        System.out.println("total is " +total);
    }
}
