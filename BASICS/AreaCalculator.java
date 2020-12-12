package BASICS;
public class AreaCalculator {
    //to calculate area of circle and rectangle
    public static double area(double radius)
    {
        double PI=Math.PI;
        if(radius<0)
        return -1;
        else
        return radius*radius*PI;
        
    }
     public static double area(double x, double y)
     {
         if(x<0 || y<0)
         return -1;
         else
         return x*y;
     }

     


}
