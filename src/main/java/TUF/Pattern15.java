package TUF;
//https://www.naukri.com/code360/problems/alpha-ramp_6581888?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems&leftPanelTabValue=SUBMISSION
public class Pattern15 {public static void alphaRamp(int n) {
    char max = 'A';
    for(int i=1;i<=n;i++){

        for(int j=1;j<=i;j++){
            System.out.print(max+" ");
        }
        max++;
        System.out.println();
    }
    // Write your code here
}
}
}
