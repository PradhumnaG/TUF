package TUF;

public class duplicate {class Solution  {
        int i = 0;
        for(int j = 0; j < nums.length; j++){
            if(nums[i] != nums[j]){
                i++;

                nums[i] = nums[j];

            }
        }
        return i + 1 ;
    }
}

