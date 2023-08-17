class LogicalOperators{
    public static void main(String args[]){
        int Salary = 24000;
        boolean Month_salary = (Salary>20000) && (Salary<25000);
        System.out.println(Month_salary);
        boolean Month_salary1 = (Salary<24000)||(Salary>=2000);
        System.out.println(Month_salary1);
        boolean Month_salary2 = !(Salary<=25000);
        System.out.println(Month_salary2);
    }
}