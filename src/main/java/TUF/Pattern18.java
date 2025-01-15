package TUF;
//https://www.naukri.com/code360/problems/symmetric-void_6581919?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems
public class Pattern18 {public static void symmetry(int n) {
    for(int i=n;i>0;i--){
        int ch = (n-i)*2;
        for(int j=0;j<i;j++){

            System.out.print("* ");
        }

        for(int j=0;j<ch;j++){
            System.out.print("  ");
        }
        for(int j=0;j<i;j++)
        {
            System.out.print("* ");

        }

        System.out.println();
    }
    // Write your code here
    for(int i=1;i<=n;i++){
        int ch = (n-i)*2;
        for(int j=0;j<i;j++){

            System.out.print("* ");
        }

        for(int j=0;j<ch;j++){
            System.out.print("  ");
        }
        for(int j=0;j<i;j++)
        {
            System.out.print("* ");

        }

        System.out.println();
    }
}
}

