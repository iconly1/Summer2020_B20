package Day47_Encapsulation;
/*
2. create a class called CapitalOneEmployees
                instance variables:
                        employeeName
                        employeeAge
                        jobTitle
                    private ID
                    private salary
                    private address
                    company name = "Capital One"
                    generate getters & setters for private variables


 */
public class CapitalOneEmployees {

public String employeeName;
public int employeeAge;
public String jobTitle;

private long ID;
private double salary;
private String address;

public static String companyName;

static {
    companyName = "Capital One";
}

public CapitalOneEmployees(String employeeName,int employeeAge, String jobTitle){
this.employeeName = employeeName;
this.employeeAge = employeeAge;
this.jobTitle = jobTitle;

}
    public void setID(long ID){
    this.ID = ID;
    }
    public void setSalary(double salary){
    this.salary = salary;
    }
    public void setAddress(String address){
    this.address = address;
    }
    public long getID(){
    return ID;
    }

    public double getSalary(){
    return salary;
    }

    public String getAddress (){
    return address;
    }



}
