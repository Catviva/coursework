public class Employee {

    private String name;
    private int department;
    private double salary;
    private int id;
    public static int counter = 1;


    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public static int getCounter() {
        return counter;
    }


    public String toString() {
        return this.id + "." + " ФИО: " + this.name + "," + " ЗП " + this.salary + "," + " Отдел " + this.department;
    }

    public Employee(String name, int department, double salary) {
        id = counter++;
        this.name = name;
        this.department = department;
        this.salary = salary;

    }

}
