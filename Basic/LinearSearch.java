package Basic;

public class LinearSearch {
    public static void main(String[] args) {
        int[] ar={12,65,23,39,67,99};
        System.out.println(search(ar,65));
    }

    private static boolean search(int[] ar, int x) {
        for (int i = 0; i < ar.length; i++) {
            if(ar[i]==x)
            return true;
        }
        return false;
    }
}
