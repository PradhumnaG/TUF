package TUF;

public class StringPalindrome {
    public boolean isPalindrome(String s) {

        if(s.isEmpty())
        {
            return true;
        }
        s=s.toLowerCase();
        int start = 0;
        int last = s.length() - 1;
        while(start < last){
            char left = s.charAt(start++);
            char right = s.charAt(last--);
            while(start <  s.length() &&  (left<97 || left>122) && (left < 48 || left > 57))
                left=s.charAt(start++);
            while(last >=0 && (right<97 || right>122) && (right < 48 || right > 57))
                right=s.charAt(last--);
            if(start <  s.length() && last >=0 && left != right){
                return false;
            }
        }
        return true;
    }
}
