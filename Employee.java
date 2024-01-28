public class Employee {
    int employeeId;
    int salary;
    String dept;
    Employee(int empId,int salary,String d){
        employeeId=empId;
        this.salary=salary;
        dept=d;
    }

    public static void main(String[] args) {
        Employee harsh=new Employee(101,3000,"Testing");
        Employee varsha=new Employee(102,5000,"Engineering");
        System.out.println(harsh.employeeId+" Salary "+ harsh.salary+" Dept "+harsh.dept);
        System.out.println(varsha.employeeId+" Salary "+ varsha.salary+" Dept "+varsha.dept);
    }
}
