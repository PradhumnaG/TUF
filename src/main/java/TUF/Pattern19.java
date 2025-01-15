package TUF;
//https://www.naukri.com/code360/problems/symmetry_6581914?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems&leftPanelTabValue=SUBMISSION
public class Pattern19 { public static void symmetry(int n) {
    for(int i=1;i<=n;i++)
    {
        int xo = (n-i)*2;
        for(int j=1;j<=i;j++)
        {
            System.out.print("* ");
        }
        for(int j=1;j<=xo;j++){
            System.out.print("  ");
        }
        for(int j=1;j<=i;j++)
        {
            System.out.print("* ");
        }
        System.out.println();
    }
    for(int i=n-1;i>=1;i--)
    {
        int xo = (n-i)*2;
        for(int j=1;j<=i;j++)
        {
            System.out.print("* ");
        }
        for(int j=1;j<=xo;j++){
            System.out.print("  ");
        }
        for(int j=1;j<=i;j++)
        {
            System.out.print("* ");
        }
        System.out.println();
    }
}
}
