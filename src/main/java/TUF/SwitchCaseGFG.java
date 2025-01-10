package TUF;

import java.util.List;

//https://www.geeksforgeeks.org/problems/java-switch-case-statement3529/1
public class SwitchCaseGFG {
     double switchCase(int choice, List<Double> arr){
        switch(choice)
        {
            case 1:{
                return Math.PI*arr.get(0)*arr.get(0);
            }

            default:
            {
                return arr.get(0) * arr.get(1);
            }

        }
    }
}
