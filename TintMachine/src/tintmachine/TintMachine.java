/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tintmachine;

/**
 *
 * @author tmeutz
 */
public class TintMachine {
    private Colors colorent;
    private int colorentRed;
    private int colorentGreen;
    private int colorentBlue;
    private Shaker shakeLevel;
    private Modes tintMode;

    public Colors getColorent() {
        return colorent;
    }

    public void setColorent(Colors colorent) {
        this.colorent = colorent;
    }

    public int getColorentRed() {
        return colorentRed;
    }

    public void setColorentRed(int colorentRed) {
        this.colorentRed = colorentRed;
    }

    public int getColorentGreen() {
        return colorentGreen;
    }

    public void setColorentGreen(int colorentGreen) {
        this.colorentGreen = colorentGreen;
    }

    public int getColorentBlue() {
        return colorentBlue;
    }

    public void setColorentBlue(int colorentBlue) {
        this.colorentBlue = colorentBlue;
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
    
    
    public int CheckTinter() throws TintExeption{
        int errorCode = 123;
        int tintUses = 0;
        
        if (colorentRed == 0 || colorentGreen == 0 || colorentBlue == 0){
            throw new TintExeption("No Colorent in System", TintError.NO_TINT);
        } else if (colorentRed <= 10 || colorentGreen <= 10 || colorentBlue <= 10){
            throw new TintExeption("Low Cooerent Please Refill",TintError.LOW_TINT);
        } else if (tintUses > 12){
            throw new TintExeption("Tinter Requires Cleaning. Please Clean", TintError.DIRTY);
        }
        
        switch(tintMode){
            case TINTING:
                System.out.println("ERRR...KACHUNK.KACHUNK...ERR");
                tintUses++;
                if(colorentRed > 20 || colorentGreen > 20 || colorentBlue > 20){
                    if(colorentRed > 50 || colorentGreen > 50 || colorentBlue > 50){
                        System.out.println(Shaker.LONG_SHAKE.getSound());
                        break;
                    }
                    System.out.println(Shaker.NORMAL_SHAKE.getSound());
                }else{
                    System.out.println(Shaker.NONE.getSound());
                }
                return 99;
            case CLEANING:
                System.out.println("PURGING...EUURRR...SQUEEK..SQUEEK");
                return 145;
            case STIR:
                System.out.println("DUDUN DUDUN DUDNUN....ERRRR");
                return 80;
            default:
                System.out.println("Invalid Mode Please Restart.");
                return errorCode;
        }
        return 99;
    }
}