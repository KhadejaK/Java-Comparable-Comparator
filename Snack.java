
public class Snack extends Product implements Comparable<Snack>, Cloneable
{
   private int gramsOfFat;
   
   public Snack(String d, double p, int fatGrams)
   {
      super(d, p);
      gramsOfFat = fatGrams;
   }
   
   public int getGramsOfFat()
   {
      return gramsOfFat;
   }
   
   public boolean isHealthier(Snack other)
   {
      if (other.getGramsOfFat() > gramsOfFat)
         return true;
      else
         return false;
   }
   
   @Override
   public boolean equals(Object otherObject)
   {
      if (!super.equals(otherObject))
         return false;
      else
      {
         Snack other = (Snack) otherObject;
         return other.gramsOfFat == gramsOfFat;
      }
   }
   
   @Override
   public String toString()
   {
      return super.toString() + "[gramsOfFat=" + gramsOfFat + "]";
   }
   
   public int compareTo(Snack other)
   {
      if (other.gramsOfFat == gramsOfFat)
         if (getPrice() == other.getPrice())
            return getDescription().compareTo(other.getDescription());
         else
            return Double.compare(getPrice(), other.getPrice());
      else
         return Double.compare(gramsOfFat, other.gramsOfFat);
   } 
   
   public Snack clone()
   {
      try
      {
         return (Snack) super.clone();
      }
      catch (CloneNotSupportedException e)
      {
         return null;
      }
   }
}