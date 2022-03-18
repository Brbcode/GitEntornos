/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gebac
 */
public class Perro implements Animal extends Mascota{
    private String nombre;
    public Perro(){
        nombre = null;
        edad = 0;
    }
    public Perro(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    public boolean persegir(){
        
    }
}
