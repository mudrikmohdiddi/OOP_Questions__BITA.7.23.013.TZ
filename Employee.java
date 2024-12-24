public class Employee {

    private String firstName;
    private String lastName;
    private int monthlySalary;
    public Employee(String firstName,String lastName,int monthlySalary){
        this.firstName = firstName;
        this.lastName = lastName;
        setMonthlySalary(monthlySalary);
    }
    public void setMonthlySalary(int monthlySalary){
        if(monthlySalary >= 0){
            this.monthlySalary = monthlySalary;
        }
        else{
            this.monthlySalary = 0;
        }
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getFirstName(){
        return firstName;
    }
    public  String getLastName(){
        return lastName;
    }
    public int getMonthlySalary(){
        return monthlySalary;
    }
    
}
