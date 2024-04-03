/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tamagoshi;

/**
 *
 * @author Diego Goncalves
 */
public class ArbolAVL {
    
    NodoArbol raiz;
    
    public ArbolAVL(){
        raiz = null;
    }
    
    public NodoArbol obtenerRaiz(){
        return raiz;
    }
    
    public int obtenerFE(NodoArbol x){
        if (x == null) {
            return -1;
        }else{
            return x.fe;
        }
    }
    
    public NodoArbol rotacionIzquierda(NodoArbol test){
        NodoArbol auxiliar = test.hijoizquierdo;
        test.hijoizquierdo = auxiliar.hijoderecho;
        auxiliar.hijoderecho = test;
        test.fe = Math.max(obtenerFE(test.hijoizquierdo), obtenerFE(test.hijoderecho)) + 1;
        auxiliar.fe = Math.max(obtenerFE(auxiliar.hijoizquierdo),obtenerFE(auxiliar.hijoderecho)) + 1;
        return auxiliar;
    }
    
    public NodoArbol rotacionDerecha(NodoArbol test){
        NodoArbol auxiliar = test.hijoderecho;
        test.hijoderecho = auxiliar.hijoizquierdo;
        auxiliar.hijoizquierdo = test;
        test.fe = Math.max(obtenerFE(test.hijoizquierdo), obtenerFE(test.hijoderecho)) + 1;
        auxiliar.fe = Math.max(obtenerFE(auxiliar.hijoizquierdo),obtenerFE(auxiliar.hijoderecho)) + 1;
        return auxiliar;
    }
    
    public NodoArbol rotacionDobleIzquierda(NodoArbol test){
        NodoArbol temporal;
        test.hijoizquierdo = rotacionDerecha(test.hijoizquierdo);
        temporal = rotacionIzquierda(test);
        return temporal;
    }
    
    public NodoArbol rotacionDobleDerecha(NodoArbol test){
        NodoArbol temporal;
        test.hijoderecho = rotacionIzquierda(test.hijoderecho);
        temporal = rotacionDerecha(test);
        return temporal;
    }
    
    public NodoArbol insertarAVL(NodoArbol nuevo, NodoArbol subarbol){
        NodoArbol nuevoPadre = subarbol;
        if (nuevo.dato < subarbol.dato) {
            if (subarbol.hijoizquierdo == null) {
                subarbol.hijoizquierdo = nuevo;
            }else{
                subarbol.hijoizquierdo = insertarAVL(nuevo, subarbol.hijoizquierdo);
                if (((obtenerFE(subarbol.hijoizquierdo) - obtenerFE(subarbol.hijoderecho)) == 2)) {
                    if (nuevo.dato < subarbol.hijoizquierdo.dato) {
                        nuevoPadre = rotacionIzquierda(subarbol);
                    }else{
                        nuevoPadre = rotacionDobleIzquierda(subarbol);  
                    }
                }
            }
        }
        else if(nuevo.dato > subarbol.dato){
            if (subarbol.hijoderecho == null) {
                subarbol.hijoderecho = nuevo;            
            }else{
                subarbol.hijoderecho = insertarAVL(nuevo, subarbol.hijoderecho);
                if (((obtenerFE(subarbol.hijoderecho) - obtenerFE(subarbol.hijoizquierdo)) == 2)) {
                    if (nuevo.dato > subarbol.hijoderecho.dato) {
                        nuevoPadre = rotacionDerecha(subarbol);
                    }else{
                        nuevoPadre = rotacionDobleDerecha(subarbol);  
                    }
                }
            }
        }
        else{
            System.out.println("Nodo duplicado.");
        }
        
        if ((subarbol.hijoizquierdo == null) && (subarbol.hijoderecho != null)) {
            subarbol.fe = subarbol.hijoderecho.fe + 1;
        }
        else if ((subarbol.hijoderecho == null) && (subarbol.hijoizquierdo != null)) {
            subarbol.fe = subarbol.hijoizquierdo.fe + 1;
        }
        else{
            subarbol.fe = Math.max(obtenerFE(subarbol.hijoizquierdo), obtenerFE(subarbol.hijoderecho)) + 1;
        }
        return nuevoPadre;
    }
    
    public void insertar(int dato){
        NodoArbol nuevo = new NodoArbol(dato);
        
        if (raiz == null) {
            raiz = nuevo;
        }else{
            raiz = insertarAVL(nuevo, raiz);
        }
    }
    
    public void inOrden(NodoArbol r){
        if (r != null) {
            inOrden(r.hijoizquierdo);
            System.out.println(raiz.dato + ", ");
            inOrden(r.hijoderecho);            
        }
    }
}
