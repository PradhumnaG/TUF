package TUF;
//https://www.naukri.com/code360/problems/reverse-star-triangle_6573685?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems&leftPanelTabValue=SUBMISSION
public class Pattern7 { public static void nStarTriangle(int n) {
    // Write your code here
    for(int i=n-1;i>=0;i--){
        for(int j=n-i-1;j>0;j--){
            System.out.print(" ");
        }
        for(int j=2*i+1;j>0;j--){
            System.out.print("*");
        }
        for(int j =n-i-1;j>0;j--){
            System.out.print(" ");
        }
        System.out.println();
    }
}
}
