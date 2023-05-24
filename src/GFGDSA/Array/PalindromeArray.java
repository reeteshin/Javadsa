package GFGDSA.Array;

// Given a Integer array A[] of n elements. 
// Your task is to complete the function PalinArray. 
// Which will return 1 if all the elements of the Array are palindrome
// otherwise it will return 0.
class Calculate{
    int nums = 148;
    int r;
    int sum = 0;
    boolean flag = false;
    public void CheckPelindrome(){
      
            while(nums>0)
            {
                System.out.println("&nums -:"+nums+" &sum -:"+sum);
                r = nums % 10; // getting remainder
                sum = (sum * 10) + r;
                nums = nums / 10;
               
            }
        System.out.println("Sum -:"+sum);
        if(flag){
            System.out.println("Array ELEment Not Pelindrom");
        }
        else{
            System.out.println("All Elements are palindrom");
        }
    }
}

public class PalindromeArray {
    public static void main(String[] args){
        System.out.println("");
        Calculate obj = new Calculate();
        obj.CheckPelindrome();
    }
}
// Input:
// 5
// 111 222 333 444 555

// Output:
// 1

// Explanation:
// A[0] = 111 //which is a palindrome number.
// A[1] = 222 //which is a palindrome number.
// A[2] = 333 //which is a palindrome number.
// A[3] = 444 //which is a palindrome number.
// A[4] = 555 //which is a palindrome number.
// As all numbers are palindrome so This will return 1.