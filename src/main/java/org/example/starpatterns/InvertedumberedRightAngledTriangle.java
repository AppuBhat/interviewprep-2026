package org.example.starpatterns;

public class InvertedumberedRightAngledTriangle {
    public static void main(String[] args) {
        System.out.println("Try clicking the Run button.");
        for(int i=5;i>0;i--){
            String row = " ";
            for(int j=0;j<i;j++){
                row = row + i;
            }
            System.out.println(row);
        }
    }
}
