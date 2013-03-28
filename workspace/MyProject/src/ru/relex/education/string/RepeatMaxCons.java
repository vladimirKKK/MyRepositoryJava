package ru.relex.education.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * Класс определения наибольшего колличества включений числа в строке.
 * @author Vladimir K.
 *
 */
public class RepeatMaxCons {
 
    /**
     * Метод подсчета наибольшего колличества включений числа в строке при вводе строки из консоли.
     * @param args
     * @throws IOException
     */
    
    public static void main(String args[]) throws IOException
    {
        int repeatNumberMax = 0;
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in, "Cp866"));
       
        str = br.readLine();
        int[] myArray = new int[str.length()];
        int[] numRepeat = new int[10];
        for (int i = 0; i < str.length(); i++) {
           myArray[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        
        for (int i = 0; i < myArray.length; i++) {
           if (myArray[i] == 0) numRepeat[0]++;
           if (myArray[i] == 1) numRepeat[1]++;
           if (myArray[i] == 2) numRepeat[2]++;
           if (myArray[i] == 3) numRepeat[3]++;
           if (myArray[i] == 4) numRepeat[4]++;
           if (myArray[i] == 5) numRepeat[5]++;
           if (myArray[i] == 6) numRepeat[6]++;
           if (myArray[i] == 7) numRepeat[7]++;
           if (myArray[i] == 8) numRepeat[8]++;
           if (myArray[i] == 9) numRepeat[9]++;
           
           if (numRepeat[i] > repeatNumberMax) repeatNumberMax = numRepeat[i];
         }
        
        for (int i = 0; i < 10; i++) {
            if (numRepeat[i] > repeatNumberMax) repeatNumberMax = numRepeat[i];
        }
        for (int i = 0; i < 10; i++) {
            if (numRepeat[i] == repeatNumberMax) System.out.println("Наибольшее число повторов число : " + i + " колличество повторов: "+ numRepeat[i]);
        }    
        
        //System.out.println(myArray[indexElementMax] + "   " + repeatNumberMax);
    }

}
