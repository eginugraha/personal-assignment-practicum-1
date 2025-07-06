import java.util.ArrayList; // Import library ArrayList
import java.util.Collections; //Import library untuk sorting

// Class untuk semua operasi yang menggunakan ArrayList
public class ArrayListOperations {


    // Melakukan traversal dengan fungsi get
    public static double traversal(ArrayList<Integer> list) {
        long start = System.nanoTime();
        for (int i = 0; i < list.size(); i++) {
            int val = list.get(i);
        }
        long end = System.nanoTime();
        return (end - start) / Comparison.NANO_TO_MILLI;
    }

    // Melakukan pencarian menggunakan linear search
    public static double linearSearch(ArrayList<Integer> list, int target) {
        long start = System.nanoTime();
        for (int val : list) {
            if (val == target) break;
        }
        long end = System.nanoTime();
        return (end - start) / Comparison.NANO_TO_MILLI;
    }

    // Melakukan pencarian menggunakan binary search
    public static double binarySearch(ArrayList<Integer> list, int target) {
        ArrayList<Integer> sorted = new ArrayList<>(list);
        Collections.sort(sorted);
        long start = System.nanoTime();
        Collections.binarySearch(sorted, target);
        long end = System.nanoTime();
        return (end - start) / Comparison.NANO_TO_MILLI;
    }

    // Melakukan insert item dengan fungsi add
    public static double insert(ArrayList<Integer> list, int index, int value) {
        ArrayList<Integer> copy = new ArrayList<>(list);
        long start = System.nanoTime();
        copy.add(index, value);
        long end = System.nanoTime();
        return (end - start) / Comparison.NANO_TO_MILLI;
    }

    // Melakukan delete item dengan fungsi remove
    public static double delete(ArrayList<Integer> list, int index) {
        ArrayList<Integer> copy = new ArrayList<>(list);
        long start = System.nanoTime();
        copy.remove(index);
        long end = System.nanoTime();
        return (end - start) / Comparison.NANO_TO_MILLI;
    }

    // Melakukan pengurutan menggunakan collection
    public static double sort(ArrayList<Integer> list) {
        ArrayList<Integer> copy = new ArrayList<>(list);
        long start = System.nanoTime();
        Collections.sort(copy);
        long end = System.nanoTime();
        return (end - start) / Comparison.NANO_TO_MILLI;
    }
}
