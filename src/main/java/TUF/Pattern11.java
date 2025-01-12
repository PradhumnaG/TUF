package TUF;
//https://www.naukri.com/code360/problems/number-crown_6581894?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems&leftPanelTabValue=SUBMISSION
public class Pattern11 {  public static void numberCrown(int n) {
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++)
        {
            System.out.print(j);
            System.out.print(" ");
        }

        for(int j=i;j<=(n*3)-1;j++){
            System.out.print(" ");
        }
        for(int j=i;j>=1;j--){
            System.out.print(j);
            System.out.print(" ");
        }
        System.out.println();
    }
}
}
