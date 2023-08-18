import java.util.*;
public class calculatorTask{
    public static void main(String args[]){
        int input1,input2;
        System.out.println("Enter 2 Numbers ");
        Scanner i1 = new Scanner(System.in);
        input1 = i1.nextInt();
        input2 = i1.nextInt();
        System.out.println("You have Enterted this values "+input1+" "+input2);
        System.out.println("what you want do now ? ");
        System.out.println(" + ");
        System.out.println(" - ");
        System.out.println(" * ");
        System.out.println(" / ");
        System.out.println(" % ");
        Scanner ch = new Scanner(System.in);
        char operation = ch.next().charAt(0);
        switch(operation){
            case '+':
                double c = input1 + input2;
                System.out.println(c);
                break;
            case '-':
                c = input1 - input2;
                System.out.println(c);
                break;
            case '*':
                c = input1 * input2;
                System.out.println(c);
                break;
            case '/':
                c = input1 / input2;
                System.out.println(c);
                break;
            case '%':
                c = input1 % input2;
                System.out.println(c);
                break;
            default:
                System.out.println("Enter Option to check math operations");
        }
    }
}