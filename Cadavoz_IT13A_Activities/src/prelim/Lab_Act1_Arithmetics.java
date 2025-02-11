
package prelim;

/**
 *
 * @author User
 */
public class Lab_Act1_Arithmetics {
   public static void main(String[] args){
        int firstnumber= 10;
        int secondnumber= 4;
        int thirdnumber= 6;
        int fourthnumber= 3;
        
        int firstoperation= firstnumber * secondnumber + thirdnumber;
        int secondoperation= (firstnumber - secondnumber) % thirdnumber;
        int thirdoperation= (firstnumber + secondnumber + thirdnumber) / fourthnumber;
        int fourthoperation= firstnumber * thirdnumber - (secondnumber * secondnumber);
        
        System.out.println("10 * 4 + 6 = " + firstoperation);
        System.out.println("10 - 4 % 6 = " + secondoperation);
        System.out.println("10 + 4 + 6 / 3 = " + thirdoperation);
        System.out.println("10 x 6 - 4 x 4 = " + fourthoperation);
   }
}
