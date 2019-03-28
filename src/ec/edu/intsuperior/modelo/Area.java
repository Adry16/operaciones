/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author PC-IVAN
 */
public class Area {
    
    public void area_Triangulo(){
         int a,b,c=0;
         a= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresar la altura:" ));
         b= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la base:"));
         
         if (a>0&&b>0){
             c=(a*b)/2;
             JOptionPane.showMessageDialog(null,"El area del triangulo es:"+c);
         }else{
             JOptionPane.showMessageDialog(null,"Datos incorrectos");
         }
    }
    
    public void area_Circulo(){
        double radio, cir;
        radio = Double.parseDouble(JOptionPane.showInputDialog("Ingresar el radio:"));
        if (radio > 0){
            cir = Math.PI * (radio*radio);
            JOptionPane.showInternalMessageDialog(null, "El area del circulo es: "+cir);
        }else{
         JOptionPane.showInternalMessageDialog(null,"Datos incorrectos");
            
         
        }
    }
}
