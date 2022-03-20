
import java.util.Optional;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author AntonioRG
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
    
    public boolean persegir(SerVivo otro){
        boolean check = false;
        if(otro instanceof Gato){
            if(((Gato) otro).estadespierto() == true)
                check = true;
        }
        if(otro instanceof Perro && otro.estaVivo() == true) check = true;
        return check;
    }

    @Override
    public boolean comer(SerVivo comida) {
        boolean check = false;
        if (comida instanceof Gato && comida.estaVivo()== true){
            check = true;
        }    
        return check;
    }

    @Override
    public void darNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public Optional<String> getNombre() {
        Optional<String> o = null;
        if (nombre == null){
            o = Optional.empty();
        }else{
            o = Optional.of(nombre);
        }
        return o;
    }
}
