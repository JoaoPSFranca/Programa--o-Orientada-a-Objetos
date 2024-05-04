package br.edu.ifsp.pep.modelo;

public final class Employee {
    
    String name; 
    String surname;
    double salary;
   
    public Employee(String name, String surname, double salary){
        setName(name);
        setSurname(surname);
        setSalary(salary);
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setSurname(String surname){
        this.surname = surname;
    }
    
    public String getSurname(){
        return this.surname;
    }
    
    public boolean setSalary(double salary){
        if (salary >= 0){
            this.salary = salary;
            return true;
        }
        return false;
    }
    
    public double getSalry(){
        return this.salary;
    }
    
    public double getAnnualSalary(){
        return getSalry() * 12;
    }
    
    public void setIncreasedAnnualSalary(){
        setSalary((getSalry() * 1.1));
    }
}
 