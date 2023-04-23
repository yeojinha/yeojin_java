package binary_search_230423;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class binary{

    String binSearch(List<Integer> arr, int key){
        int pl = 0;
        int pr = arr.size()-1;

        int mid=0;
        do{
            mid = (pl+pr)/2;
            if(arr.get(mid)==key){
                return "Your key has found at index["+String.valueOf(mid)+"]!";
            }
            else if(arr.get(mid)<key){
                pl=mid+1;
            }else if(arr.get(mid) >key){
                pr = mid-1;
            }
        }while(pl<=pr);

        return "There is no ["+String.valueOf(key)+"]!";
    }


}
class sort{
    void swap(List<Integer> arr, int idx1, int idx2){
        int temp = arr.get(idx1);
        arr.set(idx1, arr.get(idx2));
        arr.set(idx2,temp);
    }
    void BubbleSort(List<Integer> arr){
        int leng=arr.size();
        for(int i=0;i<leng-1;i++){
            for(int j =leng-1;j>i;j--){
                if(arr.get(j-1)>arr.get(j)){
                    swap(arr,j-1,j);
                }
            }
        }
    }
}
public class binarySearch {

    public static void main(String[] args) {
    List<Integer> list = Arrays.asList(22,5,11,32,120,68,70,1);
    sort st = new sort();

        System.out.println("Before Sort");
    list.forEach(System.out::println);
    st.BubbleSort(list);
        System.out.println("After Sort");
    list.forEach(System.out::println);

        System.out.println("BinarySearch");

    binary bin = new binary();
    String result= bin.binSearch(list,121);
        System.out.println(result);
    }
}
