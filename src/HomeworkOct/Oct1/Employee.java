package HomeworkOct.Oct1;

public class Employee {
    private String name;
    private String eNumber;
    private int hireDate;

    public Employee(String name, String eNumber, int hireDate) {
        this.name = name;
        this.eNumber = eNumber;
        this.hireDate = hireDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String geteNumber() {
        return eNumber;
    }

    public void seteNumber(String eNumber) {
        this.eNumber = eNumber;
    }

    public int getHireDate() {
        return hireDate;
    }

    public void setHireDate(int hireDate) {
        this.hireDate = hireDate;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", eNumber='" + eNumber + '\'' +
                ", hireDate=" + hireDate +
                '}';
    }
}
