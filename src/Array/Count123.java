package Array;

public class Count123 {
    public static void main(String args[]) {

        int arr[] = { 1, 2, 0, 1, 0, 2 };
        int count0 = 0, count1 = 0, count2 = 0;
        int len = arr.length;
        int genarr[] = new int[len];

        for (int i = 0; i < len; i++) {
            if (arr[i] == 0) {
                count0++;

            }
            if (arr[i] == 1) {
                count1++;

            }
            if (arr[i] == 2) {
                count2++;

            }

        }
        int j = 0;
        while (count0 > 0) {
            genarr[j++] = 0;
            count0--;
        }
        while (count1 > 0) {
            genarr[j++] = 1;
            count1--;
        }
        while (count2 > 0) {
            genarr[j++] = 2;
            count2--;
        }
        for(int i = 0;i<len;i++)
        { 
            System.out.print(genarr[i] + " ");
        }
    }
}