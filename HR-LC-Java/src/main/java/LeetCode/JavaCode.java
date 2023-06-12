package LeetCode;

import org.w3c.dom.Notation;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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


//    Evaluate the value of an arithmetic expression in Reverse Polish Notation. Valid operators are +, -, *, /.
    public void reversePolishNotation(String[] tokens) {
        String operators = "+-*/";
        Stack<String> stackRPN = new Stack<>();

        for (String string : tokens) {
            if(!operators.contains(string)) {
                stackRPN.push(string);
            } else {
//                pop from the stack returns the element that is available at the top of the stack and removes it from the stack to be placed in a variable
                int x = Integer.parseInt(stackRPN.pop());
                int y = Integer.parseInt(stackRPN.pop());
                int index = operators.indexOf(string);

                switch (index) {
                    case 0 -> stackRPN.push(String.valueOf(x + y));
                    case 1 -> stackRPN.push(String.valueOf(y - x));
                    case 2 -> stackRPN.push(String.valueOf(y * x));
                    case 3 -> stackRPN.push(String.valueOf(y / x));
                }
            }
        }
        System.out.println(Integer.valueOf(stackRPN.pop()));
    }



//    Given two strings s and t, determine if they are isomorphic. Two strings are isomorphic if the characters in x can be replaced to get y.
//    For example,"egg" and "add" are isomorphic, "foo" and "bar" are not.
    public void isomorphicStrings(String x, String y) {

    }

}
