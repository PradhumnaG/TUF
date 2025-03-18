package TUF;

public class secondlargest {
    public int getSecondLargest(int[] arr) {
        int max = arr[0],min = -1;
        for (int i = 1;i< arr.length;i++){
            if(arr[i] > max){
                min = max;
                max = arr[i];
            }
            else if ( min < arr[i] && arr[i] != max )
            {
                min = arr[i];
            }

        }
        if(min != max)
            return min;
        else
            return min;

    }
}

