package entitiesEx01;

public class Informations {
    private int id;
    private String name;
    private double salary;

    public Informations(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getSalary(){
        return salary;
    }

    public void IncreaseSalary(double pourcentage) {
        salary += (salary * pourcentage) /100.00;
    }

}
