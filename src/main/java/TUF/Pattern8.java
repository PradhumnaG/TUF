package TUF;
//https://www.naukri.com/code360/problems/star-diamond_6573686?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems&leftPanelTabValue=SUBMISSION
public class Pattern8 {  public static void nStarDiamond(int n) {
    for(int i = 0;i<n;i++){
        for(int j=1;j<= n-i-1;j++){
            System.out.print(" ");
        }
        for(int j= 0; j<=2*i;j++){
            System.out.print("*");
        }
        for(int j=1;j<=n-i-1;j++){
            System.out.print(" ");
        }
        System.out.println();
    }
    for(int i=n;i>0;i--)
    {
        for(int j=n-i;j>0;j--){
            System.out.print(" ");
        }
        for(int j=i*2-1;j>0;j--){
            System.out.print("*");
        }
        for(int j=n-i;j>0;j--){
            System.out.print(" ");
        }
        System.out.println();
    }


}
}
