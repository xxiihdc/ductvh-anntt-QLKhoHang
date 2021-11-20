/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ductr
 */
public class NewClass1 {
    public static void main(String[] args) {
        int min,max;
        int sum=0,avg=0,count=0;
        min=11;
        max=11;
        int i=min;
        while(i<=max){
            if(i%2==0){
                sum+=i;
                count++;
            }
            i++;
        }
        avg= sum/count;
        System.out.print(avg);
    }
}
