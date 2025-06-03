package srp;

// Classe Main (point d'entrée)
public class Main {
    public static void main(String[] args) {
        Employee omar = new Employee("Omar Diop", 350000D);
        SalaryCalculator salaryCalculator = new SalaryCalculator();
        EmployeeReportPrinter employeeReportPrinter = new EmployeeReportPrinter();

        Double annualSalary = salaryCalculator.calculateAnnualSalary(omar);
        employeeReportPrinter.printReport(omar, annualSalary);
    }
}