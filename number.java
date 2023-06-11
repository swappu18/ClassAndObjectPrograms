import java.util.Scanner;

public class number {
    public  static float getAverage;
    int num1;
    int num2;
    int num3;
 float getAverage(){
     return (num1+num2+num3)/3;
 }


    public static void main(String[] args) {
        System.out.println("enter three number");

        Scanner scanner=new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        System.out.println("average of three number"+(float)(number.getAverage));
     }

}
