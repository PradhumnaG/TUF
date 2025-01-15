package TUF;
//https://www.naukri.com/code360/problems/ninja-and-the-star-pattern-i_6581920?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems&leftPanelTabValue=SUBMISSION
public class Pattern20 { public static void getStarPattern(int n) {
    for(int i=n;i>0;i--){
        System.out.print("*");

    }
    System.out.println();
    for(int j=n-1;j>1;j--){

        System.out.print("*");
        System.out.print(" ");
        System.out.print("*");
        System.out.println();
    }
    System.out.println();
    if(n!=1){
        for(int i=n;i>0;i--){
            System.out.print("*");

        }
    }



    // Write your code here
}
}
