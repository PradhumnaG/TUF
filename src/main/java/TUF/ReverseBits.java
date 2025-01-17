package TUF;

public class ReverseBits {
    public static long reverseBits(long x) {
        //Scanner sc = new Scaner(System.in);
        //while(n>0){
        //n--;
        byte arr[] = new byte[32];
        //int x =sc.nextInt();

        int i=0;
        while(x>0)
        {
            arr[i++]=(byte)(x%2);
            x=x/2;
        }

        for(int s:arr)
        {
            x=x*2+s;
        }
        return x;

    }
}
