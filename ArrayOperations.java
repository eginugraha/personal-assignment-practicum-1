import java.util.Arrays;

// Class untuk semua operasi yang menggunakan Array
public class ArrayOperations {

    // Menyusuri item array satu persatu menggunakan looping
    public static double traversal(int[] array) {
        long start = System.nanoTime();
        for (int i = 0; i < array.length; i++) {
            int val = array[i];
        }
        long end = System.nanoTime();
        return (end - start) / Comparison.NANO_TO_MILLI;
    }

    // Melakukan pencarian menggunakan linear search
    public static double linearSearch(int[] array, int target) {
        long start = System.nanoTime();
        for (int val : array) {
            if (val == target) break;
        }
        long end = System.nanoTime();
        return (end - start) / Comparison.NANO_TO_MILLI;
    }

    // Melakukan pencarian menggunakan binary search
    public static double binarySearch(int[] array, int target) {
        int[] clone = array.clone();
        Arrays.sort(clone);
        long start = System.nanoTime();
        Arrays.binarySearch(clone, target);
        long end = System.nanoTime();
        return (end - start) / Comparison.NANO_TO_MILLI;
    }

    // Melakukan penyisipan item
    public static double insert(int[] array, int index, int value) {
        long start = System.nanoTime();
        int[] result = new int[array.length + 1]; // Inisialisassi untuk jumlah array baru
        for (int i = 0, j = 0; i < result.length; i++) {
            if (i == index) {
                result[i] = value;
            } else {
                result[i] = array[j++];
            }
        }
        long end = System.nanoTime();
        return (end - start) / Comparison.NANO_TO_MILLI;
    }

    // Melakukan penghapusan item
    public static double delete(int[] array, int index) {
        long start = System.nanoTime();
        int[] result = new int[array.length - 1]; // Inisialisassi untuk jumlah array baru
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i != index) {
                result[j++] = array[i];
            }
        }
        long end = System.nanoTime();
        return (end - start) / Comparison.NANO_TO_MILLI;
    }

    // Melakukan pengurutan array
    public static double sort(int[] array) {
        int[] clone = array.clone();
        long start = System.nanoTime();
        Arrays.sort(clone);
        long end = System.nanoTime();
        return (end - start) / Comparison.NANO_TO_MILLI;
    }
}
