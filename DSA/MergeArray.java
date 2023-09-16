import java.util.ArrayList;

public class MergeArray{
    public static ArrayList<Integer> merge(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> mergedList = new ArrayList<>();
        
        int i = 0; // Index for list1
        int j = 0; // Index for list2
        
        while (i < list1.size() && j < list2.size()) {
            int num1 = list1.get(i);
            int num2 = list2.get(j);
            
            if (num1 <= num2) {
                mergedList.add(num1);
                i++;
            } else {
                mergedList.add(num2);
                j++;
            }
        }
        
        // Add remaining elements from both lists, if any
        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i++;
        }
        
        while (j < list2.size()) {
            mergedList.add(list2.get(j));
            j++;
        }
        
        return mergedList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(5);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(4);
        list2.add(6);

        ArrayList<Integer> mergedList = merge(list1, list2);

        System.out.println("Merged List: " + mergedList);
    }
}
