/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ariel
 */
import java.util.Scanner;
public class ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*se le pedira al usuario 10 numeros y cuando el usuario ingrese un -1, el programa va a terminar
        una vez que termine mostrara lo siguiente: mayor numero introducido, menor numero introducido
        suma de todos los numeros, suma de los numeros positivos, suma de los numeros negativos, media
        de la suma de todos los numeros de la primera que se pide, el numero -1 no contara como numero en esta
        seccion
        */
        
        Scanner lector=new Scanner(System.in);
        int numeros=0, suma=0,numNegativos=0, numPositivos=0,contador=0;
        double mediaDeNums; int numerosMenor=0; int numerosMayor=0;
      
        
        do{
        if(numeros>=0){
          numPositivos+=numeros;
            
        }else if(numeros<0 && numeros!=-1){
          numNegativos+=numeros;
        }
        if(numeros>numerosMayor){
           numerosMayor=numeros; 
        }
        
        if(numeros<numerosMenor ){
            numerosMenor=numeros;
        }

            
        suma+=numeros;
        contador++;
        System.out.println("ingrese un numero");
        numeros=lector.nextInt();
        }while(numeros!=-1);
         
        mediaDeNums=(double)suma/contador;
        
        System.out.println("el mayor numero introducido "+numerosMayor);
        System.out.println("el menor numero introducido "+numerosMenor);
        System.out.println("la suma de todos los numeros es de "+suma );
        System.out.println("la suma de los numeros positvos es de "+numPositivos);
        System.out.println("la suma de los numeros negativos es de "+numNegativos);
        System.out.println("la media de los numeros es de "+mediaDeNums);
    }
    
}
