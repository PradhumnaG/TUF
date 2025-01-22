package TUF;
import java.util.Scanner;
import java.lang.Math;
public class Amstrom {



        public static void main(String[] args) {
            Scanner myOb = new Scanner(System.in);
            int n = myOb.nextInt();
            int x = n;
            int sum = 0;
            int temp = 0;
            int count = 0;
            int i=0;
            int [] arr = new int[10];
            if(n == 0){
                System.out.print("false");
            }
            while(x>0)
            {
                arr[i++] = x%10;
                x/=10;
                count++;
            }
            for(int j = 0;j<arr.length;j++){

                temp = (int)Math.pow(arr[j],count);
                sum+=temp;
            }
            if (sum == n ){
                System.out.print("true");
            }else{
                System.out.print("false");
            }
            return ;
        }

    }
}
