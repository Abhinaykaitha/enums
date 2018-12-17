/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sandwich;

/**
 *
 * @author Kaitha, Abhinay Reddy;
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class SandwichDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner scan=new Scanner(new File("input.txt"));
        while(scan.hasNext())
        {
            SandwichList sandwichList=new SandwichList();
            String date=scan.nextLine();
            Day day=new Day(date);
            do{
                String SandwichName=scan.nextLine();
                String Size=scan.nextLine();
                String Bread=scan.nextLine();
                String Cheese=scan.nextLine();
                String veggiesString=scan.nextLine();
                String[] Veggies=veggiesString.split(",");
                String saucesString=scan.nextLine();
                String[] Sauces=saucesString.split(",");
                int Quantity=scan.nextInt();
                if(scan.hasNextLine()){
                    scan.nextLine();
                }
                Sandwich sandwich=new Sandwich(SandwichName,Size,Bread,Cheese,Veggies,Sauces,Quantity);
                sandwich.completeOrder();
                sandwichList.addSandwich(sandwich);
                
            }while(scan.hasNext("[A-Za-z_]+"));
            System.out.println("*******************   "+Day.getOrderDate()+"   *******************+ \n");
            System.out.println(sandwichList.printReceipt());
            
            
        }
       scan.close();
    }
    
}
