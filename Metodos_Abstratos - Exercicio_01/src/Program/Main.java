package Program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Circle;
import Entities.Rectangle;
import Entities.Shape;
import Entities.enums.Color;

public class Main {

	public static void main(String[] args) {
		
		// Configura o idioma padrão para entrada de dados como US para suporte ao formato de números com ponto decimal
        Locale.setDefault(Locale.US);
        
        // Cria um objeto Scanner para capturar entrada do teclado
        Scanner scanner = new Scanner(System.in);
        
        
        
            // Metodo Instanciar Classe Shape
     		List<Shape> list = new ArrayList<>();
     		
         
     		
     		
                  
        // Solicita ao usuário que insira o número de formas a serem registrados
        System.out.print("Entre com o numero de formas: ");
        int formas = scanner.nextInt();
        
        
     // Metodo For para ler repetidamente os Formas
     		for (int i=1; i <= formas; i++) {
     			System.out.println(" Shape #" + i + " data:");
     			System.out.print(" Rectangle or Circle(r/c)?");
     			char ch = scanner.next().charAt(0);

     			System.out.print(" Color: (BLACK/BLUE/RED): ");
     		    Color color = Color.valueOf(scanner.next());

     			
     			if (ch == 'r') {
    				System.out.print(" Width: ");
    				double width = scanner.nextDouble();
    				
    				System.out.print(" Height: ");
    				double height = scanner.nextDouble();

    				
    				// Metodo para adicionar na Lista
    				list.add(new Rectangle(color, width, height));
    			}

    			else {
    				
    				
    				// Se o forma for circulo 
                    System.out.print(" Radius: ");
                    double radius = scanner.nextDouble();
                    
                    
   				    // Metodo para adicionar na Lista
    				list.add(new Circle(color, radius));

    			}

    		}
    		
            
        System.out.println();
        System.out.println(" SHAPE AREAS: ");
        
        for (Shape shape : list) {
            System.out.println(String.format("%.2f%n", shape.area()));
        }
        
        
        scanner.close();

	}

	}

