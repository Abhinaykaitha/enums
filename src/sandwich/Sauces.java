/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sandwich;

/**
 *
 * @author Kaitha Abhinay Reddy;
 */
public enum Sauces {
    MAYONAISE(0,0.1),YELLOW_MUSTARD(0,0.2),RANCH(0,0.15),CHIPOTLE_SOUTHWEST(0,0.25),HONEY_MUSTARD(0,0.1),CAESER(0,0.25);
    
    private final double regularPrice;
    private final double extraPrice;
    /**
     * 
     * @param regularPrice stores the regular price for sauces
     * @param extraPrice stores the extra price for sauces
     */
    private Sauces(double regularPrice,double extraPrice)
    {
        this.regularPrice=regularPrice;
        this.extraPrice=extraPrice;
    }
/**
 * 
 * @return the  regular price for sauces
 */
    public double getRegularPrice() {
        return regularPrice;
    }
/**
 * 
 * @return the extra price for sauces
 */
    public double getExtraPrice() {
        return extraPrice;
    }
    
    
}
