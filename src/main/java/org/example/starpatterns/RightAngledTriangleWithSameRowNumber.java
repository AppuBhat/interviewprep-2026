package org.example.starpatterns;

public class RightAngledTriangleWithSameRowNumber {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            String row = " ";
            for(int j=0;j<i+1;j++){
                row = row + " "+ (i+1);

            }
            System.out.println(row);
        }
    }

}
