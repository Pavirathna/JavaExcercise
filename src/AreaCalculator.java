public class AreaCalculator {
    public static double area(double radius){
        if(radius>0)
        {
            double Ar=radius*radius*Math.PI;
            return Ar;
        }
        else
        {
            return -1.0;
        }

    }

    public static double area(double x,double y){
        if(x>0 && y>0)
        {
            double rect=x*y;
            return rect;
        }
        else
        {
            return -1.0;
        }

    }

    public static void main(String[]args)
    {
        System.out.println(area (2));
        System.out.println(area(2,5));

    }
}
