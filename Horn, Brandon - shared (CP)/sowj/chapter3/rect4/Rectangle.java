package chapter3.rect4;
/**
 * Rectangle class, Phase 4
 * Under Construction!
 */

public class Rectangle
{
   private double length;
   private double width;

   /**
    * The setLength method accepts an argument
    * that is stored in the length field.
    */

   public void setLength(double len)
   {
      length = len;
   }

   /**
    * The setWidth method accepts an argument
    * that is stored in the width field. 
    */

   public void setWidth(double w)
   {
      width = w;
   }

   /**
    * The getLength method returns the value
    * stored in the length field. 
    */

   public double getLength()
   {
      return length;
   }

   /**
    * The getWidth method returns the value
    * stored in the width field.
    */

   public double getWidth()
   {
      return width;
   }

   /**
    * The getArea method returns the value of the
    * length field times the width field. 
    */

   public double getArea()
   {
      return length * width;
   }
}
