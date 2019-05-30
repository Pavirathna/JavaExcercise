public class EqualityPrinter {
    public static void PrintEqual(int x,int y,int z)
    {
       if(x>0&&y>0&&z>0)
       {
           if(x==y&&y==z&&z==x){
               System.out.println("ALL NUMBERS ARE EQUAL");
           }
            else if(x!=y&&y!=z&&z!=x)
           {
               System.out.println("All are Different");

           }
            else
           {
               System.out.println("Neither all are equal or different");
           }
       }
       else
       {
           System.out.println("Invalid Numbers");
       }


    }
    public static void main(String[]args)
    {
    PrintEqual(1,1,1);
    }
}
