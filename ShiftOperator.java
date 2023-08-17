public class ShiftOperator{
    public static void main(String args[]){
        int num = 2;
        // left shift operator denoted by <<
        // num = 2 binary value is 0 0 1 0  == 2 
        // 1 0 0 0  == 8
        int op1 = num<<2; // 2 decimal places left side <---
        System.out.println(op1);
        // here num 2 binary value is 0 0 1 0 == 2
        // 0 0 0 0 == 0
        int op2 = num>>2; // 2 decimal places right side --->
        System.out.println(op2);
    }
}