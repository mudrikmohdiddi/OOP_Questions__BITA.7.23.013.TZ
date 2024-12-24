public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("MUDRIK","MOHD",50000000);
        System.out.println("Employee's first name:"+employee1.getFirstName());
        System.out.println("Employee's last name:"+employee1.getLastName());
        System.out.println("Employee's yearly salary:"+employee1.getMonthlySalary());
        Employee employee2 = new Employee("SALMA","KOMBO",30000000);
        System.out.println("Employee's first name:"+employee2.getFirstName());
        System.out.println("Employee's last name:"+employee2.getLastName());
        System.out.println("Employee's yearly salary:"+employee2.getMonthlySalary());

        int raiseSalary1 = employee1.getMonthlySalary() * 10/100 + employee1.getMonthlySalary();
        int raiseSalary2 = employee2.getMonthlySalary() * 10/100 + employee2.getMonthlySalary();
        employee1.setMonthlySalary(raiseSalary1);
        employee2.setMonthlySalary(raiseSalary2);
        System.out.println("Employee's first name:"+employee1.getFirstName());
        System.out.println("Employee's last name:"+employee1.getLastName());
        System.out.println("Employee's yearly salary:"+employee1.getMonthlySalary());

        System.out.println("Employee's first name:"+employee2.getFirstName());
        System.out.println("Employee's last name:"+employee2.getLastName());
        System.out.println("Employee's yearly salary:"+employee2.getMonthlySalary());


    }
}
