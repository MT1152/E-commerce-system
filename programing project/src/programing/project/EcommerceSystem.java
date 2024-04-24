/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programing.project;
import java.util.Scanner;

public class EcommerceSystem {

    
    public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    //products
    Electronic_product p1= new Electronic_product("Smartphone",1,(float)599.9 ,"sumsung",1 );
    clothing_brands p2 = new clothing_brands("T-shirt",2,(float)19.99,"meduim","cotton");
    Book_product p3 = new Book_product( "OOP",3,(float)39.99,"O'Reilly","XPublications");
    
    //customer
        System.out.println("welcome to ecommerce system ");
        System.out.println("enter customerid:");
        int id = s.nextInt();
        System.out.println("name");
        s.nextLine();
        String name = s.nextLine();
        System.out.println("enter the address ");
        String  address = s.nextLine();
        customer c1 = new customer(id,name,address);
        
    //shopping cart 
    System.out.println("how many products do you want ?");
        int productsN= s.nextInt();
       
      cart cart= new cart ( c1.getCustomerid(),productsN);
        
      for ( int i =0; i< productsN ; i++)
      {System.out.println("which product do you want 1-Smartphone ,2-T-shirt ,3-OOP");
          System.out.println("enter the product id ");
         
          int productID= s.nextInt();
          System.out.println("enter the quantity");
          int q = s.nextInt();
         switch (productID)
          {
              case 1:
                   cart.addProduct(p1);
                  
                  
                  break;
              case 2 :
                  cart.addProduct(p2);
                 
                 break;
              case 3 :
                  cart.addProduct(p3);
                 
               break;
                 
              default :
                  System.out.println("inavlid id ");
                }
         }
         //placing the order 
        System.out.println("your order's total price is "+cart.calculateProduct());
        System.out.println("do you want to place the order if yes the press 1 else if no then press 2");
        int answer =s.nextInt();
        if ( answer==1)
        {
         cart.placeOrder();
        }else 
        {
           
            System.out.println("the order is not placed");
            
        }
    }
}
