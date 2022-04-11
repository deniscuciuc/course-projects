package lesson18homework.employees;

public class Employee {
    private String fullName;
    private String companyPosition;
    private int age;
    private int yearsOfActivity;

    public Employee(String fullName, String companyPosition, int age, int yearsOfActivity) {
        this.fullName = fullName;
        this.companyPosition = companyPosition;
        this.age = age;
        this.yearsOfActivity = yearsOfActivity;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCompanyPosition() {
        return companyPosition;
    }

    public void setCompanyPosition(String companyPosition) {
        this.companyPosition = companyPosition;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYearsOfActivity() {
        return yearsOfActivity;
    }

    public void setYearsOfActivity(int yearsOfActivity) {
        this.yearsOfActivity = yearsOfActivity;
    }

    public void displayEmployeeInfo() {
        System.out.println("Full name: " + getFullName());
        System.out.println("Company position: " + getCompanyPosition());
        System.out.println("Age: " + getAge());
        System.out.println("Years of activity: " + getYearsOfActivity());
    }

    public void verifyYearsOfActivity() {
        if (getYearsOfActivity() >= 5) {
            displayEmployeeInfo();
        }
    }

}
