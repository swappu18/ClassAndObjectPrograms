public class EmployeeSalary {
    int salary;
    int numberOfHours;
    void setEmployeeInformation(int sal,int hours){
        salary=sal;
        numberOfHours=hours;
    }
    void addSalary(){
        if (salary<500){
            salary=salary+10;
        }
    }
    void addWork(){
        if (numberOfHours>6)
            salary=salary+5;
    }

    public static void main(String[] args) {
        EmployeeSalary emp=new EmployeeSalary();
        emp.setEmployeeInformation(1000,12);
        emp.addSalary();
        emp.addWork();
        System.out.println("Salary of Employee at the end of Day"+emp.salary);
    }
}
