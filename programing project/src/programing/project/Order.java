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
public class Order {
   private  int customerid;
    private int orderid;
    private Product[]products2;
    private float totalprice;

    public Order(int customerid, int orderid, Product[]products2, float totalprice) {
       super();
        this.customerid = Math.abs(customerid);
        this.orderid = Math.abs(orderid);
        this.products2 = products2;
        this.totalprice = Math.abs(totalprice);
    }

    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public Product[] getProducts2() {
        return products2;
    }

    public void setProducts2(Product[] products2) {
        this.products2 = products2;
    }

    

    

    public float getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(float totalprice) {
        this.totalprice = totalprice;
    }
   
    public void printOrderInfo()
    {
        System.out.println("here is your order summary:"+" "+"\norder id "+" "+orderid+" "
        +"\ncustomer id "+" "+customerid
        +"\nproducts:");
        for ( Product products2:this.products2){
            System.out.println(products2.getName()+" "+"$"+products2.getPrice());
        }
        System.out.println("total price :"+ totalprice);
    }
    
}
