package TUF;
//https://www.naukri.com/code360/problems/reverse-letter-triangle_6581906?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems&leftPanelTabValue=SUBMISSION
public class Pattern14 {public static void nLetterTriangle(int n) {
    for(int i=n;i>=1;i--){
        char max ='A';
        for(int j=1;j<=i;j++){
            System.out.print(max+" ");
            max++;
        }
        System.out.println();
    }
    // Write your code here
}
}
