
import java.util.Optional;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gebac
 */
public class Perro extends Animal implements Mascota{
    private String nombre;
    
    public Perro(){
        super(0);
        nombre = null;        
    }
    public Perro(String nombre, int edad){
        super(edad);
        this.nombre = nombre;        
    }
    
    public boolean persegir(){
        throw new NotImplementedException();
    }

    @Override
    public boolean comer(SerVivo comida) {
        throw new NotImplementedException();
    }

    @Override
    public void darNombre(String nombre) {
        throw new NotImplementedException();
    }

    @Override
    public Optional<String> getNombre() {
        throw new NotImplementedException();
    }
}
