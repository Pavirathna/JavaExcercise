public class TeenNumberCalculator {

    public static boolean IsTeen(int a,int  b,int c)
    {
        if(( a>=13 && a<=19)|| (b>13 && b<=19) ||(c>=13 &&  c<=19))
        {
            return true;
        }
        else
        {
           return false ;
        }
    }
    public static boolean IsTeen(int a)
    {
      if ( a>=13 && a<=19)
      {
          return true;
      }
      else
      {
          return false;
      }
    }
    public static void main(String[]args)
    {
        System.out.println(IsTeen(22,17,33));
        System.out.println(IsTeen(17));
    }
}
