/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sandwich;

import java.util.ArrayList;

/**
 *
 * @author Kaitha Abhinay Reddy;
 */
public class SandwichList {
    private ArrayList<Sandwich> sandwichList=new ArrayList<Sandwich>();
/**
 * 
 * @return the sandwich list
 */
    public ArrayList<Sandwich> getSandwichList() {
        return sandwichList;
    }
    /**
     * 
     * @param sandwich add the sandwich
     */
public void addSandwich(Sandwich sandwich)
{
    sandwichList.add(sandwich);
}
/**
 * 
 * @return the total cost 
 */
public double calculateTotalCost()
{
    double total=0.0;
    for(Sandwich sandwich:sandwichList)
    {
        total+=sandwich.getSandwichCost();
    }
    return total;
}
/**
 * 
 * @return the discount
 * 0.5 times the total cost
 */
public double calculateDiscount() 
{
    double discount;
    if(Day.isWeekend())
    {
        discount=0.5*calculateTotalCost();
    }
    else{
        discount=0;
        
    }
    return discount;
}
/**
 * 
 * @return tax 
 */
public double calculateTotalBillWithTax() 
{
    double tax=0;
    tax=(calculateTotalCost()-calculateDiscount())*(8.6/100);
    return tax;
}
/**
 * 
 * @return total bill
 */
private double calculateTotalBill()
{
    return (calculateTotalCost()-calculateDiscount())+calculateTotalBillWithTax();
}
/**
 * 
 * @return receipt of type string
 */
 public String printReceipt()
 {
     String x="";
     for(Sandwich sandwich:sandwichList)
     {
         x+=sandwich+"\n\n";
     }
     String y;
        y = "-----------------------------------------------------\n"+
                "\t\tOrder Total :\t\t$"+String.format("%.2f",calculateTotalCost())+"\n"+
                "\t\tDiscount@50 :\t\t$"+String.format("%.2f",calculateDiscount())+"\n"+
                "\t\tTax@8.6 :\t\t$"+String.format("%.2f",calculateTotalBillWithTax())+"\n"+
                "\t\tTotal Amount with tax : $"+String.format("%.2f",calculateTotalBill() )+
                "	\n" +
                "-----------------------------------------------------\n";
     return x+y;
             }
    
    
    
}
