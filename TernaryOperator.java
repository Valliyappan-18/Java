public class TernaryOperator{
    public static void main(String args[]){
        int a = 40;
        int b = 20;
        /*
        Syntax:
           (condition)?true:false;
        */
        int c = (a>=b)?a:b;
        System.out.println(c);
    }
}