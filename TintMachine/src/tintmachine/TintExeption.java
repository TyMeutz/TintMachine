package tintmachine;

/**
 *
 * @author tmeutz
 */
public class TintExeption extends Exception{
        TintError error;    
    /**
     * Throws an error when the machine has an insufficient amount of colorant
     * 
     * @param msg
     * @param err 
     */
    public TintExeption(String msg, TintError err){
        super(msg);
        error = err;
    }
}
