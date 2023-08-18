import java.util.*;
public class IfElseIF{
    public static void main(String args[]){
        //if - else if statement
        int StudentMark;
        System.out.println("Enter Your Mark");
        Scanner Mark = new Scanner(System.in);
        StudentMark = Mark.nextInt();
        if(StudentMark>=90){
            System.out.println("A Grade");
        }else if(StudentMark>=80){
            System.out.println("B Grade");
        }
        else if(StudentMark>=70){
            System.out.println("C Grade");
        }else if(StudentMark>=50){
            System.out.println("D Grade");
        }else{
            System.out.println("You Should Try to Get More Marks");
        }
    }
}