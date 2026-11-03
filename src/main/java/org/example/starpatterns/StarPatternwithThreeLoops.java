package org.example.starpatterns;

public class StarPatternwithThreeLoops {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            String row = " ";
            for(int j=0;j<n-(i+1);j++){
                row = row+"";
            }
            for(int k=0;k<i+1;k++){
                row = row+"*";
            }

            System.out.println(row);
        }
    }
}
