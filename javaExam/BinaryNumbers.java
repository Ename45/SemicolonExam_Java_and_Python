package javaExam;

public class BinaryNumbers {
    public static void main(String[] args) {
        int binaryNumber = 1101;
        System.out.println(decimalEquivalentOfBinaryNumber(binaryNumber));
    }

    public static int decimalEquivalentOfBinaryNumber(int binaryNumber){
        int sum = 0;
        int multiply = 1;
        while (binaryNumber != 0) {
            if (binaryNumber % 10 == 1){
                sum += multiply;
            }
            binaryNumber /= 10;
            multiply *= 2;
        }
        return sum;
    }

}
