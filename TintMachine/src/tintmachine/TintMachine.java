package tintmachine;

/**
 *
 * @author tmeutz
 */
public class TintMachine {
    private Colors colorent;
    private int colorantRed;
    private int colorantGreen;
    private int colorantBlue;
    private Shaker shakeLevel;
    private Modes tintMode;

    public Colors getColorent() {
        return colorent;
    }

    public void setColorent(Colors colorent) {
        this.colorent = colorent;
    }

    public int getColorentRed() {
        return colorantRed;
    }

    public void setColorentRed(int colorentRed) {
        this.colorantRed = colorentRed;
    }

    public int getColorentGreen() {
        return colorantGreen;
    }

    public void setColorentGreen(int colorentGreen) {
        this.colorantGreen = colorentGreen;
    }

    public int getColorentBlue() {
        return colorantBlue;
    }

    public void setColorentBlue(int colorentBlue) {
        this.colorantBlue = colorentBlue;
    }
    
    public Shaker getShakeLevel() {
        return shakeLevel;
    }

    public void setShakeLevel(Shaker shakeLevel) {
        this.shakeLevel = shakeLevel;
    }

    public Modes getTintMode() {
        return tintMode;
    }
    
    public void setTintMode(Modes TintMode) {
        this.tintMode = TintMode;
    }
    
    public TintMachine(){
        tintMode = Modes.TINTING;
    }
    /**
     * Checks colorant levels in the machine, generates errors for improper tint
     * leveling. Frequent use of the tinting machine without proper cleaning could 
     * result in a TintError.
     * Simulates a tinting machines functions, like tinting, purging old 
     * colorant, and stirring. 
     * 
     * @return
     * @throws TintExeption 
     */
    
    public int CheckTinter() throws TintExeption{
        int errorCode = 123;
        int tintUses = 0;
        
        if (colorantRed == 0 || colorantGreen == 0 || colorantBlue == 0){
            throw new TintExeption("No Colorent in System", TintError.NO_TINT);
        } else if (colorantRed <= 10 || colorantGreen <= 10 || colorantBlue <= 10){
            throw new TintExeption("Low Cooerent Please Refill",TintError.LOW_TINT);
        } else if (tintUses > 12){
            throw new TintExeption("Tinter Requires Cleaning. Please Clean", TintError.DIRTY);
        }
        
        switch(tintMode){
            //Tinting mode
            case TINTING:
                System.out.println("ERRR...KACHUNK.KACHUNK...ERR");
                //Incraments when the user uses the tinter.
                tintUses++;
                // Checks colorant if it has the proper levels to complete the job
                if(colorantRed > 20 || colorantGreen > 20 || colorantBlue > 20){
                    // Determines if it needs a longer Shake
                    if(colorantRed > 50 || colorantGreen > 50 || colorantBlue > 50){
                        System.out.println(Shaker.LONG_SHAKE.getSound());
                        break;
                    }
                    //Gives a normal length shake
                    System.out.println(Shaker.NORMAL_SHAKE.getSound());
                }else{
                    System.out.println(Shaker.NONE.getSound());
                }
                return 99;
            // Cleaning mode
            case CLEANING:
                System.out.println("PURGING...EUURRR...SQUEEK..SQUEEK");
                return 145;
            // Stir mode
            case STIR:
                System.out.println("DUDUN DUDUN DUDNUN....ERRRR");
                return 80;
            //  only occurs if user gives a invalid mode
            default:
                System.out.println("Invalid Mode Please Restart.");
                return errorCode;
        }
        return 99;
    }
}