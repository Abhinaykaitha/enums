/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sandwich;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Kaitha Abhinay Reddy;
 */
public class Day {
    private static String orderDate;
   
    /**
     * 
     * @param orderDate stores orderdate
     */
    public  Day(String orderDate)
    {
        Day.orderDate=orderDate;
    }
/**
 * 
 * @return return order date
 */
    public static String getOrderDate() {
        return orderDate;
    }
    /**
     * 
     * @return the day of week
     */
    public static DayOfWeek  getDay() 
    {
        DateTimeFormatter fmt=DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate date=LocalDate.parse(orderDate,fmt);
        return date.getDayOfWeek();
       
    }
    /**
     * 
     * @return true if the order date is weekend
     */
    public static boolean isWeekend(){
       boolean x;
       switch(getDay().name()){
           case "FRIDAY":
           case "SATURDAY":
           case "SUNDAY":
               x=true;
               break;
           default:
               x=false;
               break;
                       
    }     
       return x;
    }
    
       
}
