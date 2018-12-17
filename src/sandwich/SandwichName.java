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
public enum SandwichName {
   VEGGIE_DELIGHT(5.49,3.99,5.78),OVEN_ROASTED_CHICKEN(7.49,5.29,7.78),
   SPICY_ITALIAN(6.49,4.29,6.78),ROTISSERIE_STYLE_CHICKEN(8.49,5.49,7.98),
   TURKEY_BREAST(7.49,5.29,7.78),SWEET_ONION_CHICKEN_TERIYAKI(7.99,5.49,7.98),BLACK_FOREST_HAM(6.49,4.29,6.78);
   
   private final double footLongPrice;
   private final double sixInchPrice;
   private final double saladPrice;
   /**
    * 
    * @param footLongPrice  stores the footlong price
    * @param sixInchPrice stores the sixinch prie
    * @param saladPrice stores the salad price
    */
   private SandwichName(double footLongPrice,double sixInchPrice,double saladPrice)
   {
       this.footLongPrice=footLongPrice;
       this.sixInchPrice=sixInchPrice;
       this.saladPrice=saladPrice;
       
   }  
/**
 * 
 * @return the footlong price
 */
    public double getFootLongPrice() {
        return footLongPrice;
    }
/**
 * 
 * @return the six inch price
 */
    public double getSixInchPrice() {
        return sixInchPrice;
    }
/**
 * 
 * @return the salad price
 */
    public double getSaladPrice() {
        return saladPrice;
    }
   
}
