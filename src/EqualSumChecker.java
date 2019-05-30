public class EqualSumChecker {
    public static Boolean HasEqualsSum(int a,int b,int c)
    {
        int d=a+b;
        if(d==c)
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
        System.out.println(HasEqualsSum(2,5,7));

    }
}
