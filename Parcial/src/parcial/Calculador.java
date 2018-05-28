/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

/**
 *
 * @author Estudiantes
 */
public class Calculador implements iCalculador {

punto punto1=new punto();
punto punto2=new punto();

    @Override
    public double calcularArea() {
     
       
        double dx=((punto2.getX()-punto1.getX())*punto1.getY());
        double calcularArea=((punto2.getX()-punto1.getX()*punto2.getY()-punto1.getY())/2);
        
        return calcularArea+dx;
        
    }

    @Override
    public double calcularPendiente() {
      double dx=Math.pow((punto2.getX()-punto1.getX()),2);
        double dy=Math.pow((punto2.getY()-punto1.getY()),2);
        Math.sqrt(dx+dy);
        
        return Math.sqrt(dx+dy);
        
        
    }

    public double calcularDistancia() {
        
    double dx=Math.pow((punto2.getX()-punto1.getX()),2);
        double dy=Math.pow((punto2.getY()-punto1.getY()),2);
        Math.sqrt(dx+dy);
        
        return Math.sqrt(dx+dy);
    }

    @Override
    public double calcularDista() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    }







    
