/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package julian123;
import java.util.Scanner;


/**
 *
 * @author alumno
 */
public class JULIAN123 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    System.out.println("Calculadora IMC");
    //Paso 1. Declaración de variables (identificadores)
    double w, l, imc;
    String eIMC;
    //En la siguiente linea, le indico a Java que utilizaré
    // Teclado
    Scanner keyboard = new Scanner (System.in);
    //Paso 2. Asignar valores a las variables.
    System.out.println( "Introduce el peso");
    w=keyboard.nextDouble();
    System.out.println( "Introduce la estatura");
    l=keyboard.nextDouble();
    //Paso 3. Resolver el problema.
    imc= w / Math.pow (l,2);
    //Paso 4. Mostrar el resulado.
    System.out.println("Peso= " + w);
    System.out.println("Estatura= " + l);
    System.out.println("IMC= " +imc); 
    //3.1 Evalaución IMC.
    if (imc>25){
        eIMC=" Sobrepeso";
    }else if(imc<19){
        eIMC="Desnutricón";
    }else  {
        eIMC="Normal";
    }
    //Paso 4. Mostrar el resultado.
    System.out.println("Peso= " + w);
    System.out.println("Estatura= " + l);
    System.out.println("IMC= " + imc);
    System.out.println(eIMC);
            }
    
}
