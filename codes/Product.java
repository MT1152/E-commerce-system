/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programing.project;

/**
 *
 * @author Lenovo
 */
public class Product {
 protected  int productid;
 protected String name ;
   float price;
   Product (String name , int productid,  float price)
   {
       this.productid= Math.abs(productid) ;
       this.name= name ;
       this.price= Math.abs(price);
    }

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
   }
