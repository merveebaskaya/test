package javaders.lambda.day04;

import java.util.stream.IntStream;

public class MountainArray {

    public static void main(String[] args){


            /*
       INTERWIEW QUESTIONS
       Bir Array'in Mountain Array olup olmadığını kontrol eden bir kod yazınız.
       Mountain Array: Element değerleri bir noktaya kadar sürekli artıp o noktadan
       sonra sürekli azalan Array.
       int arr[]={1,2,3,2,1}
       int brr[]={1,3,7,11,8,7,3} =={2,4,4,-3,-1,-4} 7 elemanli brr array'inin 6 difference(fark) array'i olur.
       int crr[]={3,5,1,11,8}
*/
        int arr[]={1,2,3,2,1};
        System.out.println(isMountainArray(arr));


    }

    private static boolean isMountainArray(int[] arr) {

        int length = arr.length; //5 {1,2,3,2,1}
        int diff[] = new int[length-1]; //[1,1,-1,-1]
        IntStream.
                range(0,length-1).
                forEach(t->diff[t]=arr[t+1]-arr[t]); //[1,1,-1,-1]
        int i=0;
        //yukari cikis kontrolu
        while (i<length-1 && diff[i]>0){
            i++;
        }
        //zirve kontrolu
        if (i==0 || i==length-1){
            return false;
        }
        //asagi inme kontrolu
        while (i<length-1 && diff[i]<0){
            i++;
        }
        return i == length-1;


    }

}
