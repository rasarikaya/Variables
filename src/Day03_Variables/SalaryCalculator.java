package Day03_Variables;

public class SalaryCalculator {

    public static void main(String[] args) {

        int hourlyRate = 60;
        int weeklyHour = 50;
        int numberOfWeeksInAYear = 48;

        int salary = hourlyRate * weeklyHour * numberOfWeeksInAYear;

        System.out.println(salary);

        double taxRate = 0.24;
        double totalTax = salary * taxRate;
        double salaryAfterTax = salary - totalTax;

        System.out.println(salaryAfterTax);
    }
}
