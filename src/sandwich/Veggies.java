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
public enum Veggies {
    CUCUMBER(0,0.25),OLIVES(0,0.5),JALAPENOS(0,0.75),
    GREEN_PEPPERS(0,0.25),LETTUCEE(0,0),RED_ONIONS(0,0),TOMATOES(0,0),PICKLES(0,1.0);
    
    private final double regularPrice;
    private final double extraPrice;
    /**
     * 
     * @param regularPrice stores the regular price for veggies
     * @param extraPrice stores the extra price for veggies
     */
    private Veggies(double regularPrice,double extraPrice)
    {
        this.regularPrice=regularPrice;
        this.extraPrice=extraPrice;
    }
/**
 * 
 * @return the regular price of veggies
 */
    public double getRegularPrice() {
        return regularPrice;
    }
/**
 * 
 * @return the extra price of veggies
 */
    public double getExtraPrice() {
        return extraPrice;
    }
    
    
}
