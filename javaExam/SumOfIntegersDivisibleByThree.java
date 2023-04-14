package javaExam;

public class SumOfIntegersDivisibleByThree {
    public static void main(String[] args) {
        System.out.println(sumOfNumbersDivisibleByThree());
    }

    public static int sumOfNumbersDivisibleByThree(){
        int sum = 0;
        for (int i = 1; i < 30; i++) {
            if(i%3 == 0){
                sum+=i;
            }
        }
        return sum;
    }
}
