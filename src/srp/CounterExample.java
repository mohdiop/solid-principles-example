package srp;

public class CounterExample {

    static class EmployeeManager{
        private String name;
        private Double salary;
        public EmployeeManager(String name, Double salary){
            this.name = name;
            this.salary = salary;
        }
        public String getName(){
            return name;
        }
        public Double getSalary() {
            return salary;
        }
        public Double calculateAnnualSalary(Employee e){
            return e.getSalary() * 12;
        }
        public void printReport(Employee e, Double annualSalary){
            System.out.println("Rapport de l'employé : ");
            System.out.println("Nom                  : " + e.getName() + ".");
            System.out.println("Salaire annuel       : " + annualSalary.toString() + " FCFA.");
        }
    }
}
