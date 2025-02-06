package Vishal;

import java.util.Arrays;

public class MergedSort {
    public static void main(String[] args) {
        int[] num1 = {1,2};
        int[] num2 = {3,4};

            int n1Size = num1.length;
            int n2Size = num2.length;

            int newSize = n1Size + n2Size;

            int[] newArray = new int[newSize];

            for (int i = 0; i < n1Size ; i++){
                newArray[i] = num1[i];
            }
            for (int i = 0; i < n2Size; i++){
                int index = i + n1Size;
                newArray[index] = num2[i];
            }

            for (int i=0; i < newArray.length; i++ ){
                for (int j = i+1; j < newArray.length;j++){
                    if (newArray[j] < newArray[i]){
                        int temp = newArray[j];
                        newArray[j] = newArray[i];
                        newArray[i] = temp;
                    }
                }
            }

            if (newSize % 2 == 0){
                int median1 = newArray[newSize/2];
                int median2 = newArray[(newSize/2)-1];
                double evenMedian =(median1 + median2)/2.0;
                System.out.println("even "+ evenMedian);
            }
            else{
                int oddMedian = newArray[newSize / 2];
                System.out.println("odd "+ oddMedian);
            }

    }
}
