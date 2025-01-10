package TUF;
//https://www.geeksforgeeks.org/problems/while-loop-printtable-java/1
public class MultiplicationTable {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 10;i>=2;i--){
            int b = i*n;
            System.out.print(b+" ");
        }
        System.out.print(n);

    }
}
