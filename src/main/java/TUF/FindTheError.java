package TUF;

public class FindTheError{


    public static void main(String[] args) {

        int n=100;
        int arr[]= new int[100];

        int i=0;

        while(arr[i]==0 && i<100)
        {
            arr[i]=1;
            i++;
        }
        int sum=0;
        for(int a:arr)
            sum+=a;
        System.out.println(sum);
    }
}
