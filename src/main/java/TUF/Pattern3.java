package TUF;
//https://www.naukri.com/code360/problems/n-triangles_6573689?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems&leftPanelTabValue=PROBLEM
public class Pattern3 {
    public static void nTriangle(int n) {
        for(int i = 1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(+j+" ");
            }
            System.out.println("");
        }
        // Write your code here
    }
}
