/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public  abstract class Animal extends SerVivo{
    private boolean despierto;
      
    public Animal(int edad) {
        super(edad);
        despierto=true;
    }
    
    public void dormir(){
        this.despierto=false;
    
    }
    public void despertar(){
    this.despierto=true;
    }
    public boolean estadespierto(){
        return despierto;
    }
}