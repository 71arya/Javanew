public class Employee {
    private double salary;
    private int hoursOfWorkPerDay;
	
    public void getInfo(double salary, int hoursOfWorkPerDay) {
        this.salary = salary;
        this.hoursOfWorkPerDay = hoursOfWorkPerDay;
    }
    public void addSal() {
        if (salary < 500) {
            salary += 10;
        }
    }
    public void addWork() {
        if (hoursOfWorkPerDay > 6) {
            salary += 5;
        }
    }
    public double getFinalSalary() {
        return salary;
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.getInfo(480, 7);
        emp.addSal();
        emp.addWork();
        double finalSalary = emp.getFinalSalary();
        System.out.println("Final Salary: $" + finalSalary);
    }
}
