public class AssignmentOperator{
    public static void main(String args[]){
        int a = 10;
        int sum = 0;
        int sum1 = sum += a;
        System.out.println(sum1);
        int sum2 = sum1 -= a;
        System.out.println(sum2);
        int sum3 = sum2 *= a;
        System.out.println(sum3);
        int sum4 = sum /= a;
        System.out.println(sum4);
        int sum5 = sum %= a;
        System.out.println(sum5);
    }
}