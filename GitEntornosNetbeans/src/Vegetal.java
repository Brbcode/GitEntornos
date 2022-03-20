
import java.util.Random;

/**
 *
 * @author Bruno García Trípoli
 */
public class Vegetal extends SerVivo{
    
    public Vegetal(){
        super(new Random().nextInt(19)+1);
    }
    
    @Override
    public boolean comer(SerVivo comida) {
        return false; 
    }
    
}

/*

*/