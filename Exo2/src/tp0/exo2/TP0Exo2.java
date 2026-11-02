/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp0.exo2;
import java.util.Scanner;

/**
 *
 * @author marin
 * @group BDML2
 * @date 02/11/2026
 */
public class TP0Exo2 {

    public static void main(String[] args) {
        //Declaration des variables
        int nb; // nombre d'entiers a additionner
        int result; // resultat
        int ind; //indice
        Scanner sc;
        
        sc = new Scanner(System.in);
        System.out.println("Veuillez entrer un nombre : ");
        nb=sc.nextInt();
        result=0;
        // Addition des nb premiers entiers
        ind=1;
        
        while (ind <= nb) {
            result=result+ind;
            ind++;
        }
        
        // Affichage du resultat
        System.out.println();
        System.out.println("La somme des "+ nb + " entiers est: "+result);
    }
    
}
