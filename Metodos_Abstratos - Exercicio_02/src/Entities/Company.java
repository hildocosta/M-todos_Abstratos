package Entities;

public class Company extends TaxPayer {

    private Integer numberOfEmployees;

    // Construtor padrão
    public Company() {
    }

    // Construtor com argumentos
    public Company(String name, Double anualIncome, Integer numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    // Getters e setters
    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    // Método de cálculo do imposto, implementado de acordo com as regras para empresas
    @Override
    public double tax() {
        if (numberOfEmployees > 10) {
            return getAnualIncome() * 0.14;
        } else {
            return getAnualIncome() * 0.16;
        }
    } 
}
