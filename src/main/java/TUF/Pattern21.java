package TUF;
//https://www.naukri.com/code360/problems/ninja-and-the-number-pattern-i_6581959?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems&leftPanelTabValue=SUBMISSION
public class Pattern21 {     int x = (n*2)-1;
    int[][] arr = new int[x][x];

    int y = x;
    int r=0;
    int iter=0;
        for(int i=n;i>=1;i--){


        for(int j=iter;j<x-iter;j++){
            arr[r][j] = i;

        }
        for(int j=iter;j<x-iter;j++){
            arr[j][r] = i;
        }
        r++;
        for(int j=iter;j<x-iter;j++){
            arr[y-1][j] = i;

        }
        for(int j=iter;j<x-iter;j++){
            arr[j][y-1] = i;

        }
        y--;iter++;
    }
        for(int i=0;i<x;i++){
        for(int j=0;j<x;j++){
            System.out.print(arr[i][j]+"");
        }
        System.out.println();
    }

}

}
