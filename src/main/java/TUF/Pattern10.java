package TUF;
//https://www.naukri.com/code360/problems/binary-number-triangle_6581890?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems&leftPanelTabValue=SUBMISSION
public class Pattern10 {
    public static void nBinaryTriangle(int n) {
        for(int i =0;i<=n;i++){
            for(int j=0;j<i;j++){
                if((j+i) % 2 == 0){
                    System.out.print("0 ");
                }
                else{
                    System.out.print("1 ");
                }

            }
            System.out.println();

        }
    }
}
