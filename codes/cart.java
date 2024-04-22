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
public class cart {
    protected int customerid;
    protected int nproducts;
    protected Product[]products ;
    protected  int i =0;
    public cart(int customerid, int nproducts) {
        this.customerid=Math.abs(customerid);
        this.nproducts=Math.abs(nproducts);
       this.products= new Product[nproducts];
    }
public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public int getNproducts() {
        return nproducts;
    }

    public void setNproducts(int nproducts) {
        this.nproducts = nproducts;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }
 public void  addProduct(  Product product)
    {
      products[i]=product;
      
      i++;
        }
    public void removeProduct( int index)
    {
      if ( index>=0&&index<nproducts)
      {
          for ( int i = index;i <nproducts;i++)
          {
              products[i]=products[i+1];
              
          }
          nproducts--;
          products [nproducts]= null;
      }else 
      {
          System.out.println("invaled index");
      }
      
    }
     public float calculateProduct()
     {
         float totalprice =0;
        for ( Product product:products)
        {
         totalprice += product.getPrice();
     }
        return totalprice;
     }
     public void placeOrder ( )
     {
       Order o1 = new Order( customerid, 12, products,calculateProduct()) ;
       o1.printOrderInfo();
         
     }
      

   
}

