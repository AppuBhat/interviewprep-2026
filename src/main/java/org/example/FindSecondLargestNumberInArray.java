package org.example;

public class FindSecondLargestNumberInArray {
    public static void main(String[] args) {
        int[] numbers = {10,100,100,3,45,90};
        System.out.println("SecondLargest number is "+findSecondLargest(numbers));
    }

    public  static int findSecondLargest(int[] numbers){
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        if(numbers.length<2){
            return -1;
        }
        else{
            for(int i=0;i<numbers.length;i++){
                if(numbers[i]>firstLargest){
                    secondLargest = firstLargest;
                    firstLargest = numbers[i];
                }
                else if(numbers[i]>secondLargest && numbers[i]!= firstLargest ){
                    secondLargest = numbers[i];
                }
            }
            return secondLargest;
        }
    }
}
