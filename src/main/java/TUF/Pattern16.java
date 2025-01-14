package TUF;
//https://www.naukri.com/code360/problems/alpha-hill_6581921?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems
public class Pattern16 { public static void alphaHill(int n) {
    for(int i=1;i<=n;i++){
        char max = 'A';
        for(int j = 1;j <= n-i;j++)
        {
            System.out.print(" ");
        }
        int breakpoint = (2*i-1)/2;
        for(int j = 1;j<=i*2-1;j++){
            System.out.print(max+" ");
            if(j<=breakpoint){
                max++;
            }
            else{
                max--;
            }
        }
        for(int j=0;j<=n-i;j++);
        {
            System.out.print(" ");
        }


        System.out.println();
    }

    // Write your code here
}
}
