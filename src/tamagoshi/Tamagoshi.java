/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tamagoshi;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego Goncalves
 */
public class Tamagoshi {
    
    public void EscogerPensamiento(){
        
    }
    
    public void EscogerPensamiento(int opcion, int wattsapostados, int watts, int amistad){
        Random random = new Random();
        
        int num1 = random.nextInt(9)+1;
        
        if (opcion == num1) {
                JOptionPane.showMessageDialog(null, "Acertaste!");
                watts += wattsapostados * 2;
            }else{
                JOptionPane.showMessageDialog(null, "Fallaste!");
                watts -= wattsapostados;
                amistad += wattsapostados;
            }
    }
}
    
