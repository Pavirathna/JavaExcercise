public class MinutesToCalculator {
    public static void PrintYearandDays(int Minutes)
    {
        if(Minutes>0)
        {
            int YY=Minutes/525600;//525600=No.of.Minutes in year
            int D=Minutes%525600;
            int DD=D/1440;//1440=No.of.minutes in days 24*60
            System.out.println(Minutes+"Minutes ="+YY+" YEAR "+DD+" DAYS");
        }
    }
    public static  void main(String[] args)
    {
          PrintYearandDays(561600);
    }
}
