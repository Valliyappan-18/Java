class Datatypes{
    public static void main(String args[]){
        /* 
        Non-primitive Datatypes

        To store whole numbers

        1.byte  - 1 byte 
        2.short - 2 
        3.int   - 4
        4.long  - 8

        To store decimal values

        5.float  - 4
        6.double - 8

        To store single character or special characters

        7.char  - 2

        To store either true or false values 

        8.boolean  - only 1 bit

        */

       Byte Employee_id = 17;
       Short Employee_salary = 24000;
       int Employee_TotalSalary = 42000;
       long Employee_PhoneNumber = 9626261708L;
       float Tax = 2500.50f;
       double ProvidentFund = 7300.25;
       char Gender = 'M';
       Boolean Salary = true;
       System.out.println("Employee Details - Employee_id "+Employee_id +" Employee_Salary "+Employee_salary +" total_salary "+Employee_TotalSalary+" Employee_contactNumber "+Employee_PhoneNumber+" Gender is "+Gender +" Salary credited this month "+Salary);
    }
}