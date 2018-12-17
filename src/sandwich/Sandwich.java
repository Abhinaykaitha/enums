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
public class Sandwich {
    
    private final String sandwichName;
    private final String size;
    private final String bread;
    private final String cheese;
    private final String[] veggies;
    private final String[] sauces;
    private final int quantity;
    private double sandwichCost;
/**
 * 
 * @param sandwichName stores the name of sandwich
 * @param size stores the size of sandwich
 * @param bread stores the type of bread
 * @param cheese stores  the type of cheese added to sandwich
 * @param veggies array to store the veggies added to sandwich
 * @param sauces Array to store the sauces added to the sandwich
 * @param quantity number of sandwiches needed to the customer
 */
    public Sandwich(String sandwichName, String size, String bread, String cheese,
            String[] veggies, String[] sauces, int quantity) {
        this.sandwichName = sandwichName;
        this.size = size;
        this.bread = bread;
        this.cheese = cheese;
        this.veggies = veggies;
        this.sauces = sauces;
        this.quantity = quantity;
    }
    
    // getter methods
/**
 * 
 * @return the name of sandwich
 */
    public String getSandwichName() {
        return sandwichName;
    }
/**
 * 
 * @return the size of sandwich
 */
    public String getSize() {
        return size;
    }
/**
 * 
 * @return the type of bread
 */
    public String getBread() {
        return bread;
    }
/**
 * 
 * @return the type of cheese
 */
    public String getCheese() {
        return cheese;
    }
/**
 * 
 * @return the veggies added  to sandwich
 */
    public String[] getVeggies() {
        return veggies;
    }
/**
 * 
 * @return the sauces added to sandwich
 */
    public String[] getsauces() {
        return sauces;
    }
/**
 * 
 * @return the quantity needed to the customer
 */
    public int getQuantity() {
        return quantity;
    }
/**
 * 
 * @return the cost of individual sandwich 
 */
    public double getSandwichCost() {
        return sandwichCost;
    }
    /**
     * 
     * @return extra veggies cost of type double
     */
    private double calcVeggiesCost()
    {
        double x=0;
        String a;
        for(String veggie:veggies)
        {
             if(veggie.substring(0,2).equals("E_"))
             {
                 a=veggie.substring(2,veggie.length());
                 x= x + Veggies.valueOf(a.toUpperCase()).getExtraPrice();
                 
             }
          
        }
        return x;
    }
    /**
     * 
     * @return extra sauces cost of type double
     */
    private double calcSaucesCost()
    {
        double x=0;
        String a;
        for(String sauce:sauces)
        {
            if("E_".equals(sauce.substring(0,2)))
            {
                a=sauce.substring(2,sauce.length());
                x=x + Sauces.valueOf(a.toUpperCase()).getExtraPrice();
            }
           
        }
        return x;
    }
    /**
     * 
     * @return extra cheese cost of type double
     */
    private double calcCheeseCost()
    {
       double x=0.0;
       String a;
      
           if(cheese.substring(0,2).equals("E_"))
           {
               a=cheese.substring(2,cheese.length());
               x= x + Cheese.valueOf(a.toUpperCase()).getExtraPrice();
           }
      return x;
    }
    /**
     * 
     * @return the cost of one sandwich 
     */
    public double completeOrder()
    {
       double total=0.0;
        if(size.equals("Footlong")){
            total=SandwichName.valueOf(getSandwichName().toUpperCase()).getFootLongPrice()+calcVeggiesCost()+calcSaucesCost()+calcCheeseCost();
        }
        if(size.equals("Sixinch")){
            total=SandwichName.valueOf(getSandwichName().toUpperCase()).getSixInchPrice()+calcVeggiesCost()+calcSaucesCost()+calcCheeseCost();
            
        }
        if(size.equals("Chopped Salad"))
        {
            total=SandwichName.valueOf(getSandwichName().toUpperCase()).getSaladPrice()+calcVeggiesCost()+calcSaucesCost()+calcCheeseCost();
        }
        sandwichCost=total*quantity;
        return sandwichCost;
    }
    @Override
    /**
     * total details
     */
   public String toString(){
       String veggie ="";
       String sauce = "";
       String s=sandwichName.toUpperCase()+"\t "+"Quantity : "+quantity+"\n";
       String ch=cheese;
        if(ch.substring(0,2).equals("E_"))
        {
            ch=ch.substring(2)+ "(extra)";
        }
        String x=bread+" "+","+ch;
        for(String vegg:veggies){
            if(vegg.substring(0,2).equals("E_")){
                veggie=veggie+vegg.substring(2)+"(extra)"+",";
            }
            else
            {
                veggie=veggie+vegg+",";
            }
        }
        for(String sau:sauces){
            if(sau.substring(0,2).equals("E_")){
                sauce=sauce+sau.substring(2)+"(extra)"+",";
            }
            else{
                sauce=sauce+sau+",";
            }
        }
        String a=veggie+sauce;
        String b=s+x+"\n"+ a +"Sandwich Cost: "+completeOrder();
        return b;
    }
   /**
    * end of toString
    */
    
}
