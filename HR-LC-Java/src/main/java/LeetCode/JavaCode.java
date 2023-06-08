package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class JavaCode {
    public void rotateArray(int[] intArr, int k) {
//    Problem: Rotate an array of n elements to the right by k steps. For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
        List<Integer> listBeforeK = new ArrayList<>();
        List<Integer> listAfterK = new ArrayList<>();

        if(k > intArr.length || intArr.length == 0 || k < 0 || intArr == null) {
            System.out.println("This will not work");
        } else {
            for (int i = 0; i < intArr.length; i++) {
                if (k < i) {
                    listBeforeK.add(intArr[i]);
                } else {
                    listAfterK.add(intArr[i]);
                }
            }
            listBeforeK.addAll(listAfterK);
            System.out.println(listBeforeK);
        }
    }
}
