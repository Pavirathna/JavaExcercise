public class MegaByteConverter {

    public static void PrintMegaByteAndKiloBytes(int KiloBytes)
    {
        int MegaByte=KiloBytes/1024;
        int KB=KiloBytes%1024;
        System.out.println(KiloBytes+" = "+ MegaByte+"MB and "+KB+ "KB");
    }


    public static  void main(String[] args)
    {
        int KiloByte=1700;
        PrintMegaByteAndKiloBytes(KiloByte);

    }
}
