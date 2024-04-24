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
public class customer {
   private  int customerid;
    private String name;
    private String address;

    public customer(int customerid, String name, String address)
    {
        this.customerid = customerid;
        this.name = name;
        this.address = address;
        if ( customerid<0)
        {
            Math.abs(customerid);
        }
        
    }

    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
}
