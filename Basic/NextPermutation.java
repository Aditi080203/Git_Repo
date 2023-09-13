public class NextPermutation {
    void reverse(int nums[], int start) {
        int i = start;
        int j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void nextPermutation(int[] nums) {
        int ind = -1;
        int n = nums.length;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                ind = i;
                break;
            }
        }
        if (ind == -1) {
            reverse(nums, 0);
        } else {
            int ind1 = -1;
            for (int i = n - 1; i >= 0; i--) {
                if (nums[i] > nums[ind]) {
                    ind1 = i;
                    break;
                }
            }
            swap(nums, ind, ind1);
            reverse(nums, ind + 1);
        }
    }

    public static void main(String[] args) {
        NextPermutation sol = new NextPermutation();

        int[] nums = {1, 2, 3};
        System.out.print("Original Array: ");
        printArray(nums);
        sol.nextPermutation(nums);
        System.out.print("Next Permutation: ");
        printArray(nums);
    }

    // Helper method to print an array
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
