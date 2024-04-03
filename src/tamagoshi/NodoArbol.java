/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tamagoshi;

/**
 *
 * @author Diego Goncalves
 */
public class NodoArbol {
    int dato;
    int fe;
    NodoArbol hijoizquierdo, hijoderecho;
    
    public NodoArbol(int numero){
        this.dato = numero;
        this.fe = 0;
        this.hijoizquierdo = null;
        this.hijoderecho = null;
    }
    

}
