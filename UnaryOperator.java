public class UnaryOperator{
    public static void main(String args[]){
        // initializing value of a
        int a = 9;
        System.out.println(a); //9
        // post increment 
        int a1 = a++;
        System.out.println(a1); // 9   a1 = now 10
        // pre increment
        int a2 = ++a; 
        System.out.println(a2);//11  a2 = 10+1;
        // post decrement
        int b1 = a--; 
        System.out.println(b1); // 11; now 10
        // pre decrement 
        int b2 = --a;  
        System.out.println(b2);  //  9  b2 = 10-1;
    }
}