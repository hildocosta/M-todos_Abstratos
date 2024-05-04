package Entities;

public abstract class TaxPayer {

    private String name;
    private Double anualIncome;

    // Construtor padrão
    public TaxPayer() {
    }

    // Construtor com argumentos
    public TaxPayer(String name, Double anualIncome) {
        this.name = name;
        this.anualIncome = anualIncome;
    }

    // Getters e setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnualIncome() {
        return anualIncome;
    }

    public void setAnualIncome(Double anualIncome) {
        this.anualIncome = anualIncome;
    }

    // Método abstrato para cálculo do imposto, a ser implementado pelas subclasses
    public abstract double tax();
}
