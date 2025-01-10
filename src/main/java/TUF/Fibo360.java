package TUF;
//https://www.naukri.com/code360/problems/nth-fibonacci-number_74156?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION

public class Fibo360 {

    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) {
            System.out.print("1");
            return;
        }
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
        }
        System.out.print(arr[n - 1]);


    }

}

