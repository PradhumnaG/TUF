package TUF;

public class numberofnodes {
    static long count(int n) {
        if(n<=2){
            return n;
        }
        int edge = n*(n-1)/2;
        return (long) Math.pow(2, edge);

    }
}

