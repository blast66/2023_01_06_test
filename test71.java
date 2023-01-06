import java.util.Set;

public class test71 {
    public static void main(String[] args){
        int [] arr = {1, 2, 3, 4, 5, 6, 7};
        int [] arr2 = arr;
        int x = 10;
        int y = x;

        setVariable (x) ;
        System.out.println("setVriable  :" + x);

        setArray(arr);
        for (int i : arr)
            System.out.println("setArray  :" + i);
    }

    public static void setVariable (int x){
        x = 20;
    }
    public static void setArray(int arr[] ){
        arr[0] = 20 ;
    }
}