package TUF;
//https://www.geeksforgeeks.org/problems/count-digits5716/1
public class CountDigits {
    static int evenlyDivides(int n) {
        int a = n;
        int b = 0;
        while(a>0){
            int temp = a%10;


            if(temp!= 0){
                b +=(n % temp == 0)? 1:0;
            }
            a/=10;

        }
        return b;
    }
}
