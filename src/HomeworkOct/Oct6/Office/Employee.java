package HomeworkOct.Oct6.Office;

public abstract class Employee {
    String name;
    double age;
    double hourRate;

    public Employee(String name, double age, double hourRate) {
        this.name = name;
        this.age = age;
        this.hourRate = hourRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public double getHourRate() {
        return hourRate;
    }

    public void setHourRate(double hourRate) {
        this.hourRate = hourRate;
    }

    public abstract double salary(double hours);

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", age=" + age +
                ", hourRate=" + hourRate +
                '}';
    }
}