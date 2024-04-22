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
public class Book_product extends Product {
   private  String author;
    private String publisher;

    public Book_product(String name,int productid, float price ,String author ,String publisher )
    {
        super(name,productid,price);
        this.author = author;
        this.publisher = publisher;
    }
     public String getauthor()
     {
         return author;
     }
     public void setauthor(String author)
     {
         this.author= author;
     }
     public String getpublisher()
     {
         return publisher;
     }
     public void setpublisher(String publisher)
     {
         this.publisher= publisher;
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
