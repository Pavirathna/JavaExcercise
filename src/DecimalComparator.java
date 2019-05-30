public class DecimalComparator
{
    public static boolean AreEqualBythreedecimal(double X,double Y)
{
    if((int)(X*1000)==(int)(Y*1000))
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
        System.out.println(AreEqualBythreedecimal(3.147,3.337));
    }
}