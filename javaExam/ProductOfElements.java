package javaExam;

import java.util.Arrays;

public class ProductOfElements {
    public static void main(String[] args) {
        int[] numberList = {1, 2, 3, 4};
        System.out.println(Arrays.toString(productOfElements(numberList)));
    }

    public static int[] productOfElements(int[] numberList){
        int[] result = new int[numberList.length];
        int product = 1;
        for (int i = 0; i < numberList.length; i++) {
            for (int j = 0; j < numberList.length; j++) {
                if (i != j){
                    product *= numberList[i];
                    result[i] = product;
                }
            }
        }
        return result;
    }
}
