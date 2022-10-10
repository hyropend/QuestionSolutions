/*
LEETCODE QUESTION 9

Given an integer x, return true if x is palindrome integer.

An integer is a palindrome when it reads the same backward as forward.

    For example, 121 is a palindrome while 123 is not.
*/

class Solution {
    public boolean isPalindrome(int x) {
        int input=x;
        int kalan;
        int ters=0;

        if(x<0){
            return false;
        }
        while(input!=0){
            kalan=input%10;
            ters=ters*10+kalan;
            input=input/10;
        }

        if(ters==x){
            return true;
        }
        else{
            return false;
        }
    }
}