/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class Parcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
   
        Calculador miCalculador= new Calculador();
        
        Scanner miEscanner=new Scanner (System.in);
        
        System.out.println( "x1");
        int x1= miEscanner.nextInt();
        miCalculador.punto1.setX(x1);
        
        
        
        System.out.println( "y1");
        int y1= miEscanner.nextInt();
        miCalculador.punto1.setX(y1);
        
        
        System.out.println( "x2");
        int x2= miEscanner.nextInt();
        miCalculador.punto2.setX(x2);
        
        
        System.out.println( "y2");
        int y2= miEscanner.nextInt();
        miCalculador.punto1.setX(y2);
        
        
        
            System.out.println( "miCalculador.CalcularDistancia");
            System.out.println( "miCalculador.CalcularArea");
            System.out.println( "miCalculador.CalcularPendiente");
            
    }
    
}
