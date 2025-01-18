package TUF;
//https://leetcode.com/problems/palindrome-number/
public class Palindrom { int n = 0;
    int a = x;
        if(a<0){
        return false;
    }
        while(a>0){
        a/= 10;
        n++;
    }
    a=x;
    int arr[] = new int[n];

        for(int i=0;i<n;i++){
        arr[i]=(a % 10);
        a/=10;
    }
    int ans =0;
        for (int num:arr){

        ans = ans*10+num;
    }
        if (ans == x){
        return true;
    }
        return false;
}
}
