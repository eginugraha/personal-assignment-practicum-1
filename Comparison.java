import java.util.*;

// Class untuk menjalankan perbandingan
public class Comparison {
    static int[] array = {90, 10, 70, 30, 100, 60, 40, 20, 80, 50}; // Inisialisassi Array
    static ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(90, 10, 70, 30, 100, 60, 40, 20, 80, 50)); // Inisialisasi ArrayList
    static int target = 40; // Inisialisasi value pencarian
    static int insertIndex = 2; // Inisialisasi insert pada index ke berapa
    static int insertValue = 25; // Inisialisasi untuk insert value
    static int deleteIndex = 3; // Inisialisasi delete pada index ke berapa
    public static double NANO_TO_MILLI = 1_000_000.0; // Convert nano to milli

    // Menjalankan perbandingan traversal
    public static void traversal() {
        System.out.println("Traversal");
        System.out.println("==========================");
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("ArrayList: " + arrayList);
        System.out.printf("Waktu Eksekusi Array: %.4fms\n", ArrayOperations.traversal(array));
        System.out.printf("Waktu Eksekusi ArrayList: %.4fms\n", ArrayListOperations.traversal(arrayList));
    }

    // Mejalankan perbandingan pencarian
    public static void search() {
        System.out.println("Pencarian");
        System.out.println("==========================");
        System.out.printf("Target: %d\n\n", target);

        System.out.println("[Linear Search]");
        System.out.printf("Waktu Eksekusi Array: %.4fms\n", ArrayOperations.linearSearch(array, target));
        System.out.printf("Waktu Eksekusi ArrayList: %.4fms\n\n", ArrayListOperations.linearSearch(arrayList, target));

        System.out.println("[Binary Search (Setelah diurutkan)]");
        System.out.printf("Waktu Eksekusi Array: %.4fms\n", ArrayOperations.binarySearch(array, target));
        System.out.printf("Waktu Eksekusi ArrayList: %.4fms\n", ArrayListOperations.binarySearch(arrayList, target));
    }

    // Menjalankan perbandingan penyisipan
    public static void insert() {
        System.out.println("Penyisipan");
        System.out.println("==========================");
        System.out.printf("Menyisipkan %d di index %d\n", insertValue, insertIndex);
        System.out.printf("Waktu Eksekusi Array: %.4fms\n", ArrayOperations.insert(array, insertIndex, insertValue));
        System.out.printf("Waktu Eksekusi ArrayList: %.4fms\n", ArrayListOperations.insert(arrayList, insertIndex, insertValue));
    }

    // Menjalankan perbandingan penghapusan
    public static void delete() {
        System.out.println("Penghapusan");
        System.out.println("==========================");
        System.out.printf("Menghapus index %d\n", deleteIndex);
        System.out.printf("Waktu Eksekusi Array: %.4fms\n", ArrayOperations.delete(array, deleteIndex));
        System.out.printf("Waktu Eksekusi ArrayList: %.4fms\n", ArrayListOperations.delete(arrayList, deleteIndex));
    }

    // Menjalankan perbandingan pengurutan
    public static void sort() {
        System.out.println("Pengurutan");
        System.out.println("==========================");
        int[] unsortedArray = {50, 10, 40, 20, 30};
        ArrayList<Integer> unsortedList = new ArrayList<>(Arrays.asList(50, 10, 40, 20, 30));
        System.out.printf("Waktu Eksekusi Array: %.4fms\n", ArrayOperations.sort(unsortedArray));
        System.out.printf("Waktu Eksekusi ArrayList: %.4fms\n", ArrayListOperations.sort(unsortedList));
    }

    // Menjalankan semua perbandingan
    public static void run() {
        traversal();
        System.out.println();
        search();
        System.out.println();
        insert();
        System.out.println();
        delete();
        System.out.println();
        sort();
    }
}