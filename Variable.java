class Variable{
    public static void main(String args[]){
        /* 
        Variable used to store or hold data/value in the variable_name;
        Variable name should starts with letters or $ (dollar) or _ (underscore)
        Do not starts with numbers or any other special characters
        Syntax:
                Datatype Variable_name;  ----- this called variable declaration
                Datatype Variable_name = value; ----- this called variable initialization
          */
         double total_salary;  
         int Month_salary = 24000;
         total_salary = Month_salary * 12;
         System.out.println(total_salary + " per annum");
         int a = 10;
         int b = a %2; //13%2 ==1 
         int c = a /2; //13/2 ==6 
         System.out.println(b);
         System.out.println(c);
    }
}