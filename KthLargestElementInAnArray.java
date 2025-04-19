
import java.util.*;
public class KthLargestElementInAnArray {
    public int partition(int[] nums, int low, int high)
    {
        Random rand = new Random();
        int randInx = low + rand.nextInt(high - low + 1);
        int pivot = nums[randInx];

        swap(nums, randInx, high);

        int storeIndex = low;
        for(int i = low; i < high; i++)
        {
            if(nums[i] < pivot)
            {
                swap(nums, i, storeIndex);
                storeIndex++;
            }
        }

        swap(nums, storeIndex, high);
        return storeIndex;
    }

    public void swap(int[] nums, int a, int b) {
        int temp =  nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public int findKthLargest(int[] nums, int k) {
        return findKthLargestHelper(nums, 0,  nums.length -1 , nums.length - k );
    }

    public int findKthLargestHelper(int[] nums, int low, int high, int k)
    {
        if(low >= high)
            return nums[low];

        int partition = partition(nums, low , high);
        if(k == partition)
            return nums[partition];
        else if(k < partition)
            return findKthLargestHelper(nums, low, partition - 1, k);
        else
            return findKthLargestHelper(nums, partition + 1, high, k);
    }
}
