import java.util.Scanner;

public class Solution {
    public static int SqrtNumber(int x){
        int lo =0;
        int hi = x;

        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            long square = (long)mid*mid;
            if(square == x) return mid;
            if(square > x) hi = mid-1;
            if(square < x) lo = mid+1;
        }
        return hi;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();

        int result = SqrtNumber(x);
        System.out.println("The square root of " + x + " is " + result);

    }
}
