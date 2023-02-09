import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int left = 0;
        int right = n-1;
        int top = 0;
        int bottom = n-1;
        int k=1;
        while(left<=right&&top<=bottom){
            for(int j=left;j<=right;j++){
                arr[top][j] = k;
            }
            top++;
            for(int j=top;j<=bottom;j++){
                arr[j][right] = k;
            }
            right--;
            for(int j=right;j>=left;j--){
                arr[bottom][j] = k;
            }
            bottom--;
            for(int j=bottom;j>=top;j--){
                arr[j][left] = k;
            }
            left++;

            k = (k==0)?1:0;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.printf("%2d",arr[i][j]);
            }
            System.out.println();
        }
    }
}
