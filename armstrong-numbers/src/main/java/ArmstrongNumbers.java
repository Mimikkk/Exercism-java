import javax.print.DocFlavor;
import java.lang.Math;
import java.util.Enumeration;

class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        int len = numberToCheck==0 ? 1 : (int) Math.floor(Math.log10(numberToCheck)) + 1;
        int initialValue = numberToCheck;
        int sum = 0;

        while (numberToCheck != 0) {
           sum += Math.pow((numberToCheck % 10), len);
           numberToCheck /= 10;
        }

        return sum == initialValue;
    }
}
