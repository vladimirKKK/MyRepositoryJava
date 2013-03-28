package ru.relex.education.string;
import java.io.*;

//kkkkkk
public class NumMaxOne {
    
    
    public static void main(String args[]) throws IOException
    {
        

        int indexElement = 0;
        int repeatNumber = 1;
        int repeatNumberMax = 1;
        int indexElementMax = 1;
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in, "Cp866"));
       
        //int[] myArray2 = new int[10];
        str = br.readLine();
        int[] myArray = new int[str.length()];
        
        for (int i = 0; i < str.length(); i++) {
           myArray[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        //int[] myArray = { 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3 };

        for (int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] == myArray[j]) {
                    indexElement = j;
                    repeatNumber++;
                }
            }
            if (repeatNumberMax <= repeatNumber) {
                indexElementMax = indexElement;
                repeatNumberMax = repeatNumber;
            }
            repeatNumber = 1;
        }
        System.out.println(myArray[indexElementMax] + "   " + repeatNumberMax);
    }
}
