package TUF;
//https://www.naukri.com/code360/problems/rotated-triangle_6573688?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems&leftPanelTabValue=SUBMISSION
public class Pattern9 {public static void nStarTriangle(int n) {
    for(int i=0;i<=n-1;i++){
        for(int j =0;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    for(int i=n-2;i>=0;i--){
        for(int j=i;j>=0;j--){
            System.out.print("*");
        }
        System.out.println();
    }
}
}
