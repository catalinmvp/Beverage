
package beverage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Company implements Company1{
 
    public String name;
    public String address;
    public long number; //phone number
    public String email;
    private HashMap<String, Beverage> beverages = new HashMap<>(); 
    private List<Beverage> bevs =new ArrayList<Beverage>();
    
   
    public Company(String n, String a, long nr, String em)
    {
        this.beverages = new HashMap<>();
        this.name=n;
        this.address=a;
        this.number=nr;
        this.email=em;
    }
    
    public void addBeverage(Beverage bev)
    {
        
        beverages.put("bev1", bev);
    }
    public void addBevs(Beverage be)
    {
        bevs.add(be);
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getAddress()
    {
        return address;
        
    }
    
    public long getNumber()
    {
        return number;
    }
    
    public String getEmail()
    {
        return email;
        
    }
    
    public HashMap<String, Beverage> getbeverages()
    {
        return beverages;
    }
    
}
