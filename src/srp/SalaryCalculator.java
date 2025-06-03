package srp;

// Classe pour calculer le salaire de l'employé
public class SalaryCalculator {
    public Double calculateAnnualSalary(Employee e){
        return e.getSalary() * 12;
    }
}
