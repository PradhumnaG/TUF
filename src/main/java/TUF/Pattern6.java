package TUF;
//https://www.naukri.com/code360/problems/star-triangle_6573671?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems&leftPanelTabValue=SUBMISSION
public class Pattern6 {
    public static void nStarTriangle(int n) {
        for(int i=0;i<n;i++){
            for(int j=1;j<=n-1-i;j++)
            {
                System.out.print(" ");

            }           for(int j=0;j<=2*i;j++)
            {
                System.out.print("*");
            }
            for(int j=1;j<=n-1-i;j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
        // Write your code here
    }
}
