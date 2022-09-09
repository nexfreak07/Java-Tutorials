// Time Complextity O(N/2)

public class DivideArrayAndMerge {
    public static void main(String[] args) {
        int arr[] = {1,2,9,5,56,75,2};
        int result [] = new int[arr.length];
        int low = 0, range = 0, high =0, index =0;
        if(arr.length%2 == 0) {
            range = high = arr.length / 2;
        }
        else {
            range = high = (arr.length / 2) + 1;
        }

        //System.out.println(arr.length/2-1);
        while((low<range) && high<=arr.length-1)
        {
            if(index <= arr.length-1) {
                result[index++] = arr[low++];

                result[index++] = arr[high++];
            }
        }
        if (low < range)
            result[index++] = arr[low++];
        else if(high<=arr.length-1)
            result[index++] = arr[high++];

        for(int i: result)
            System.out.print(i+"\t");

    }
}
