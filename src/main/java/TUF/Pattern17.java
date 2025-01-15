package TUF;
//https://www.naukri.com/code360/problems/alpha-triangle_6581429?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems&leftPanelTabValue=SUBMISSION
public class Pattern17 { public static void alphaTriangle(int n) {
    for(int i=n;i>0;i--){
        int mo = 65;
        for(int j=n;j>=i;j--){

            System.out.print((char)(mo+(n-1))+" ");
            mo--;

        }
        System.out.println();
    }
}
}
