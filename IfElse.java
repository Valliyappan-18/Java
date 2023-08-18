import java.util.*;
public class IfElse{
    public static void main(String args[]){
        //if - else statement
        // getting user input
        int BirthYear,Age;
        System.out.println("Enter You Birth Year: ");
        Scanner ip = new Scanner(System.in);
        BirthYear = ip.nextInt();
        Age = 2023 - BirthYear;
        System.out.println("Your age is: "+Age);
        if(Age>=18){
            System.out.println("You are eligible to apply license");
        }
        else{
            int ageCondition = 18 - Age;
            System.out.println("You have wait for "+ageCondition+" years");
        };
        
    }
}