public class BarkingDog
{
    public static Boolean ShouldWakeUP(boolean Barking, int HourOfDay) {

            if (Barking == true) {
                if (HourOfDay < 0 || HourOfDay > 23) {
                    return false;
                }

            if (HourOfDay <= 8 || HourOfDay > 22) {
                return true;
            } else {
                return false;
            }
        }
        else
        {
            return false;
        }

    }
    public static  void main(String[] args)
    {
        System.out.println(ShouldWakeUP(true,8));

    }
}
