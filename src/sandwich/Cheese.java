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
public enum Cheese {
     
    AMERICAN(0,0.8),PROVOLONE(0,0.65),PEPPERJACK(0,0.5),MOZZERELLA(0,1.00),MONTERRYJACK(0,0.75),NO(0,0);
    
    private final double regularPrice;
    private final double extraPrice;
    /**
     * 
     * @param regularPrice stores the normal price
     * @param extraPrice stores the extra price
     */
    private Cheese(double regularPrice,double extraPrice)
    {
        this.regularPrice=regularPrice;
        this.extraPrice=extraPrice;
    }
/**
 * 
 * @return the regular price of cheese
 */
    public double getRegularPrice() {
        return regularPrice;
    }
/**
 * 
 * @return the extra price of cheese
 */
    public double getExtraPrice() {
        return extraPrice;
    }
    

}
