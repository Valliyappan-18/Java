import java.util.Scanner;

public class ArraysInJava {
    public static void main(String args[]) {
        /*
         * syntax : declaring one dimensional array
         * 
         * datatype array_name[] = new datatype(size);
         * 
         * (or)
         * 
         * datatype array_name[] = {values};
         * 
         */

        // method 1
        int intArray[] = new int[5];

        intArray[0] = 15;

        intArray[1] = 20;

        intArray[2] = 40;

        intArray[3] = 50;

        intArray[4] = 70;

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
        System.out.println("");
        // method 2
        byte byteArray[] = { 25, 38, 47, 50, 89 };

        for (int i = 0; i < byteArray.length; i++) {
            System.out.println(byteArray[i]);
        }
        // getting value from user
        int array_size;
        System.out.println("Enter Size Of The Array: ");
        Scanner s = new Scanner(System.in);
        array_size = s.nextInt();
        int marks[] = new int[array_size];
        System.out.println("Enter " + array_size + " Marks");
        Scanner mark = new Scanner(System.in);
        for (int i = 0; i < marks.length; i++) {
            marks[i] = mark.nextInt();
        }
        ;
        System.out.println("You Entered Marks Are Below ");
        for (int j = 0; j < marks.length; j++) {
            System.out.println(marks[j]);
        }
    }
}