
package beverage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import static jdk.nashorn.internal.runtime.JSType.toInteger;

/**
 *
 * @author andrei.nichita0308
 */
public class Shop {
    
  private List<Beverage> mybev;
  private ArrayList freq= new ArrayList<>();
 
  public List<Beverage> getbev()
  { 
     return Collections.unmodifiableList(this.mybev); 
  }
  public void collectbevs(Collection<? super Beverage> be)
  {
     be.addAll(mybev);
  }
  
  public int getNR(Collection<? super Beverage> be, String s)
  {
      for(Beverage b: mybev)
      { 
          if(b.getIngredients().equalsIgnoreCase(s));
          {
              freq[(toInteger.b.getingrcode())%10]++;//create a frequency array in which i ll have the last digit of the code of the ingredients
          }
      }
     
     return freq[toInteger.s.getingrcode())%10];//return the number of  products with a the code corresponding to s;
  }
  
}
