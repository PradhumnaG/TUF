package TUF;


//https://www.geeksforgeeks.org/problems/data-type-1666706751/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=data-type
public class DataTypeGFG {

     static int dataTypeSize(String str) {
        if(str.equals("Character")){
            return Character.BYTES;
        }
        else if(str.equals("Integer")){
            return Integer.BYTES;
        }
        else if(str.equals("Long")){
            return Long.BYTES;
        }
        else if(str.equals("Float")){
            return Float.BYTES;
        }
        else if(str.equals("Double")){
            return Double.BYTES;
        }else{
            return -1;
        }


        // code here
    }
}
