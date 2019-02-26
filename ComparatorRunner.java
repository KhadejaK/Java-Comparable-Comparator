import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorRunner 
{

   public static void main(String[] args)
   {
      ArrayList<CollegeWrestler> wrestlers = new  ArrayList<CollegeWrestler>();
      wrestlers.add(new CollegeWrestler("Collin", 175.5));
      wrestlers.add(new CollegeWrestler("Dong", 124.5));
      wrestlers.add(new CollegeWrestler("Jose", 140.9));
      wrestlers.add(new CollegeWrestler("Enrique", 290));  
      
      Collections.sort(wrestlers, new Comparator<CollegeWrestler>()
      {
            public int compare(CollegeWrestler w1, CollegeWrestler w2) 
            {
               return Double.compare(w1.getWeight(), w2.getWeight());
            }
      }  );

     for (CollegeWrestler w : wrestlers)
     {
        System.out.println(w.getWeight() + " " + w.getName());    
     }
     
     Collections.sort(wrestlers, new Comparator<CollegeWrestler>()
     {
           public int compare(CollegeWrestler w1, CollegeWrestler w2) 
           {
              return w1.getName().compareTo(w2.getName());
           }
     }  );
     
     for (CollegeWrestler w : wrestlers)
     {
        System.out.println(w.getName() + " " + w.getWeight());    
     }
   }
}