package GFGDSA.Array.Top50Quetions;
class LstsCount{
    int CountFuntion(){
        return 0;
    }
}
public class CountNumberOfOccurrences {
//     Input: arr[] = {1, 1, 2, 2, 2, 2, 3,},   x = 2
//   Output: 4 // x (or 2) occurs 4 times in arr[]


/// Binary Search Will Do Leter
    public static void main(String[] arg){
        //
        int arr[] = {1, 1, 2, 2, 2, 2, 3,};
        int k = 2;
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==k)
            {
                count++;
            }
        }
        System.out.println("Count -:"+count);
    }
}
