import java.util.*;
public class UserInput{
    public static void main(String args[]){
        // Getting input from user
        int userId;
        System.out.println("Enter Your User ID:");
        Scanner user = new Scanner(System.in);
        userId = user.nextInt();
        String userGender;
        System.out.println("Enter Your Gender M or F:");
        userGender = user.next();
        double salary;
        System.out.println("Enter Your Salary ");
        salary = user.nextDouble();
        System.out.println(userId);
        System.out.println(salary);
        System.out.println(userGender);
        System.out.println(userId+" "+userGender+" "+salary);
    }
}