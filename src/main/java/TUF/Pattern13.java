package TUF;
//https://www.naukri.com/code360/problems/increasing-letter-triangle_6581897?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems&leftPanelTabValue=SUBMISSION
public class Pattern13 { public static void nLetterTriangle(int n) {
    for(int i=1;i<=n;i++){
        char start ='A';
        for(int j=1;j<=i;j++){
            System.out.print(start+" ");
            start++;
        }
        System.out.println();
    }

}
}
