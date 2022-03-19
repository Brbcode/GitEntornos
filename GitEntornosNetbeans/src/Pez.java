
import java.util.Random;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sofya
 */
public class Pez extends Animal {
    
    public Pez(){
        super(new Random().nextInt(10));
    }
    
    public void nadar(){
        System.out.println("El pez está nadando");
    }

    @Override
    public boolean comer(SerVivo comida) {
        throw new NotImplementedException();
    }
}

