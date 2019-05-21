public class PlayingCat {
    public static boolean IsCatPlaying(boolean Summer,int Temp)
    {
        if(Summer==true)
        {
            if(Temp>=25&&Temp<=45)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else if(Temp>=25&&Temp<=35)
        {
            return true;
        }
        else
        {
            return  false;
        }
    }
    public static  void main(String[]args)
    {
        System.out.println(IsCatPlaying(true,40));
    }
}
