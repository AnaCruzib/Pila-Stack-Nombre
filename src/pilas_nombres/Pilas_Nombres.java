/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas_nombres;
import java.util.Stack;
/**
 *
 * @author Anitta
 */
public class Pilas_Nombres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Stack pila = new Stack ();
       pila.push("Antonio");
       pila.push("Pedro");
       pila.push("Jose");
       pila.push("Maria");
       pila.push("Carlos");
       pila.push("Guadalupe");
       pila.pop();
       System.out.println("El ultimo elemento de la pila es: " +pila.peek());
       pila.push("Juan");
       pila.pop();
       pila.pop();
       System.out.println("El ultimo elemento de la pila es: " +pila.peek());
       while(pila.empty()==false)
       {
           System.out.println(pila.pop());
       }
    }
    
    
}
