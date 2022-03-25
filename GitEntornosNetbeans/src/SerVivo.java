/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jose
 */
public abstract class SerVivo {
    
    private boolean estaVivo;
    private int edad;
    
    public SerVivo(int edad){
        this.edad=edad;
        estaVivo=true;
    }
    protected void setEstaVivo(boolean estado){
        estaVivo=estado;
    }
    public boolean estaVivo(){
        return estaVivo;
    }
    public int getEdad(){
        return edad;
    }
    public abstract boolean comer(SerVivo comida);
        
  
    
    
    
}
