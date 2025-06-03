package srp;

// Classe pour afficher le rapport sur l'employé
public class EmployeeReportPrinter {

    public void printReport(Employee e, Double annualSalary){
        System.out.println("Rapport de l'employé : ");
        System.out.println("Nom                  : " + e.getName() + ".");
        System.out.println("Salaire annuel       : " + annualSalary.toString() + " FCFA.");
    }
}
