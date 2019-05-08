package tintmachine;

/**
 *
 * @author tmeutz
 */
public enum Shaker {
    NORMAL_SHAKE ("erung erung shwoosh"),
    LONG_SHAKE ("SHOOSH..SHOOSH..ERRU..SHSH"),
    NONE ("Silence...");
    
    private String sound;
    
    Shaker(String s){
        sound = s;
    }
    /**
     * Gets the sound effect from the proper enum.
     * 
     * @return 
     */
    public String getSound(){
        return sound;
    }
}
