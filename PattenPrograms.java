public class PattenPrograms {
    public static void main(String args[]) {
        /*  
            *****
            *****
            *****
            *****
            *****
         */
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        /*
          1 1 1 1 1
          2 2 2 2 2
          3 3 3 3 3
          4 4 4 4 4
          5 5 5 5 5
         */
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i);
            }
            System.out.println("");
        }
        /*
          1 2 3 4 5
          1 2 3 4 5
          1 2 3 4 5
          1 2 3 4 5
          1 2 3 4 5
         */
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
