/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;
import java.util.Scanner;

/**
 *
 * @author marine
 * @date 02/11/2026
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc;
        int operateur;
        int operande1;
        int operande2;
        int operation;
        
        sc = new Scanner(System.in);
        
        operation=0;
        
        System.out.println("Please enter the operator:\n 1)add\n 2)substract\n 3)multiply\n 4)divide\n 5)modulo");
        operateur = sc.nextInt();
        
        if((operateur < 1) || (operateur > 5)){
            System.out.println("Erreur, veuillez choisir un nombre entre 1 et 5");
        }else{
            System.out.println("Veuillez entrer un premier nombre :");
            operande1 = sc.nextInt();
            System.out.println("Veuillez entrer un second nombre :");
            operande2 = sc.nextInt();

            switch(operateur){
                case 1:
                    operation = operande1 + operande2;
                    break;
                case 2:
                    operation = operande1 - operande2;
                    break;
                case 3:
                    operation = operande1 * operande2;
                    break;
                case 4:
                    operation = operande1 / operande2;
                    break;
                case 5:
                    operation = operande1 % operande2;
                    break;
                default:
                    operation = operande1 + operande2;
            }
        }
        
        System.out.println("Le resultat est " + operation);
       
    }
    
}
