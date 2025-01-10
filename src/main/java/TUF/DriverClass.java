package TUF;

import java.util.ArrayList;

public class DriverClass {
    public static void main(String[] args) {
      //  DecisionMakingGFG decisionMakingGFG = new DecisionMakingGFG();
       // System.out.println(decisionMakingGFG.compareNM(3,4));
        SwitchCaseGFG switchCaseGFG = new SwitchCaseGFG();
        ArrayList<Double> al = new ArrayList<>();
        al.add(5.0);
        al.add(3.9);
        System.out.println(switchCaseGFG.switchCase(2,al));
    }
}
