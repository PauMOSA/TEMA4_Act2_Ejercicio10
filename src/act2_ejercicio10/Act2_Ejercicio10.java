/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act2_ejercicio10;
import java.util.Scanner;
/**
 *
 * @GLORIA PAULINA MORENO SALDIVAR
 */
public class Act2_Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner asignar = new Scanner(System.in);
        int num, cont=0;
        
        System.out.println();
        System.out.println("Ingresa un numero positivo: ");
        num = asignar.nextInt();
        
        do
        {
            cont++;
            if(cont%2 == 1)
            {
                System.out.println(cont);
            }
            
        }while(cont != num);
    }
    
}
