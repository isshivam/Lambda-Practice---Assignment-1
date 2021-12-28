public class FindMaximumNumber {
    public static void main(String[] args) {

//       writing lambda function
        MaxNumber maxNumber = (num1, num2) ->(num1>num2)?num1:(num1<num2)?num2:0;

//        Calling the function
        int max = maxNumber.findMaxNumber(30,43);
        System.out.println(max);
    }
}