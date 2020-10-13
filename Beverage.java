/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beverage;

/**
 *
 * @author andrei.nichita0308
 */
public class Beverage {

    public String brand;
    public String ingredients;
    public int codebar;
    public int ingrcode;
    public int price;
    public String prodd;
    public String prode;
    
    public Beverage(String b, String ing, int c,int in, int p, String pr1, String pr2)
    {
        this.brand=b;
        this.ingredients=ing;
        this.ingrcode=in;
        this.codebar=c;
        this.price=p;
        this.prodd=pr1;
        this.prode=pr2;
    }


    public int getingrcode()
    {
        return ingrcode;
    }
    public String getBrand()
    {
        return brand;
    }
    
    public String getIngredients()
    {
        return ingredients;
    }
    public int getcodebar()
    {
        return codebar;
    }
    public int getprice()
    {
        return price;
    }
    public String getprodd()
    {
        return prodd;
    }
    public String getprode()
    {
        return prode;
    }
    
    public boolean comparenames(Beverage b1 , Beverage b2)
    {
        if(b1.getIngredients().equalsIgnoreCase(b2.getIngredients()))
            return true;
        else
            return false;
    }
    public boolean compareprices(Beverage b1, Beverage b2)
    {
        if(b1.getprice() == b2.getprice())
            return true;
        else
            return false;
    }
   
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
