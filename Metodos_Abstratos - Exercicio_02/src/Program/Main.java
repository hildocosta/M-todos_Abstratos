package Program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Company;
import Entities.Individual;
import Entities.TaxPayer;

public class Main {

    public static void main(String[] args) {
        
        // Configura o idioma padrão para entrada de dados como US para suporte ao formato de números com ponto decimal
        Locale.setDefault(Locale.US);
        
        // Cria um objeto Scanner para capturar entrada do teclado
        Scanner scanner = new Scanner(System.in);
        
        // Lista para armazenar os contribuintes
        List<TaxPayer> list = new ArrayList<TaxPayer>();

        // Solicita ao usuário que insira o número de contribuintes
        System.out.print("Enter the number of taxpayers: ");
        int N = scanner.nextInt();
        
        // Loop para cada contribuinte
        for (int i = 1; i <= N; i++) {
            System.out.println("Taxpayer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char type = scanner.next().charAt(0);
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Annual income: ");
            Double anualIncome = scanner.nextDouble();
            if (type == 'i') {
                System.out.print("Health expenditures: ");
                Double healthExpenditures = scanner.nextDouble();
                list.add(new Individual(name, anualIncome, healthExpenditures));
            } else {
                System.out.print("Number of employees: ");
                Integer numberOfEmployees = scanner.nextInt();
                list.add(new Company(name, anualIncome, numberOfEmployees));
            }
        }
        
        System.out.println();
        System.out.println("TAXES PAID:");
        
        // Exibe os impostos pagos por cada contribuinte
        for (TaxPayer tp : list) {
            System.out.println(tp.getName() + ": $ " + String.format("%.2f", tp.tax()));
        }
        
        System.out.println();
        
        // Calcula e exibe o total de impostos pagos por todos os contribuintes
        double sum = 0.0;
        for (TaxPayer tp : list) {
            sum += tp.tax();
        }
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
        
        // Fecha o scanner
        scanner.close();
    }
}
