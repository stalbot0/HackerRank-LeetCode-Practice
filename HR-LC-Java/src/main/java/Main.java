import LeetCode.JavaCode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        problem 1
        JavaCode rotateArrObj = new JavaCode();
        int[] rotateArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int[] rotateArr2 = {};
        rotateArrObj.rotateArray(rotateArr, 9);
        rotateArrObj.rotateArray(rotateArr2, 4);
        System.out.println();
    }
}
