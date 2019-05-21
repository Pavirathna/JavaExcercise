//import java.sql.SQLOutput;

import java.util.Scanner;

public class SpeedConverter {
    public static void main (String[] args)
    {
     Scanner sc=new Scanner(System.in);
        System.out.println("Enter Distance in Number:");
        double KilometerPerHour=sc.nextDouble();
        System.out.println(toMilesPerHour(KilometerPerHour));
        PrintConversion(KilometerPerHour);
    }

    public static long toMilesPerHour(double KilometersPerHour)
    {
        if(KilometersPerHour>0){
            Double MilePerHour= KilometersPerHour*0.621371;
            //long l = (new Double(MilePerHour)).longValue();//another method to convert long to double
            long l =Math.round(MilePerHour);

            return l;
        }
        else
            return -1;
    }

    public static void  PrintConversion(double KiloMeterPerHour)
    {

        if(KiloMeterPerHour>0){
            Double MilePerHour= KiloMeterPerHour*0.621371;
            //long l = (new Double(MilePerHour)).longValue();//another method to convert long to double
            long l =Math.round(MilePerHour);
            System.out.println(KiloMeterPerHour+"km/h= "+l+"m/h");
        }
        else
        {
            System.out.println("INVALID VALUE");
        }


    }
}
