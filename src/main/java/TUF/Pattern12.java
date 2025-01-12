package TUF;
//https://www.naukri.com/code360/problems/increasing-number-triangle_6581893?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems&leftPanelTabValue=SUBMISSION
public class Pattern12 { public static void nNumberTriangle(int n) {
    int x=1;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(x++);

            System.out.print(" ");
        }

        System.out.println();
    }
    // Write your code here
}
}
