
import java.util.Optional;
import java.util.Random;

/**
 *
* @author Bruno García Trípoli
 */
public class Gato extends Animal implements Mascota{
    private String nombre;
    private int vidas;
    
    public Gato(){
        super(0);
        nombre = null;
        vidas = 7;
    }
    
    public Gato(String nombre, int edad){
        super(edad);
        this.nombre = nombre;
        this.vidas = 7;
    }
    
    @Override
    public void darNombre(String nombre){
        this.nombre = nombre;
    }
    
    @Override
    public Optional<String> getNombre(){
        if(nombre==null)
            return Optional.empty();
        else
            return Optional.of(nombre);
    }
    
    @Override
    protected void setEstaVivo(boolean estado){
        if(!estado && vidas>0)
            vidas--;
        else 
            super.setEstaVivo(estado);
    }
    
    public String maullar(){
        Random rnd = new Random();
        StringBuilder b = new StringBuilder("Mi");
        
        for (int i = 0; i < (rnd.nextInt(5)+1); i++) 
            b.append('a');
        
        b.append('u');
        
        return b.toString();
    }
    
    @Override
    public boolean comer(SerVivo otro){
        if(otro instanceof Pez)
        {
            otro.setEstaVivo(false);
            return true;
        }
        
        return false;
    }
}
