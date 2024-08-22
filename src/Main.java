import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int[] a = {15, 12, 788, 1, -1, -778, 2, 0};
        System.out.print("Enter a number: ");
        int x = scanner.nextInt();

        int distanceForMin, minOne;
        int distanceForMax, maxOne;

        minOne = a[0];
        distanceForMin = a[0] - x;
        maxOne = a[0];
        distanceForMax = a[0] - x;

        for(int i = 1; i < a.length; i++){
            if (a[i] > x){
                if (distanceForMax > a[i] - x){
                    distanceForMax = a[i] - x;
                    maxOne = a[i];
                }
            }
            if (a[i] < x){
                if (distanceForMin > x - a[i]){
                    distanceForMin = x - a[i];
                    minOne = a[i];
                }
            }
        }

        System.out.println("Max one: "+maxOne+" | Distance to our entered number: "+distanceForMax);
        System.out.println("Min one: "+minOne+" | Distance to our entered number: "+distanceForMin);

    }
}