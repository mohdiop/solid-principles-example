package srp;

// Classe pour représenter les données d'un employé
public class Employee {
    private String name;
    private Double salary;

    public Employee(String name, Double salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

    public Double getSalary() {
        return salary;
    }
}
