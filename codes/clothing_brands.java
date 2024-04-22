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
public class clothing_brands  extends Product{
   private String size;
     private String fabric;

    public clothing_brands( String name, int productid, float price,String size,String fabric ) 
    {
        super (name,productid, price);
        this.size = size;
        this.fabric = fabric;
    }
    public String getsize()
    {
        return size;
    }
    public void setsize(String size )
    {
        this.size= size;
    }
    public String getfabric()
    {
        return fabric ;
    }
    public void setfabric( String fabric )
    {
     this.fabric= fabric;   
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
