import java.util.Scanner; // Import libarary untuk menerima inputan

// Class utama untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean ulang = true;

        // Pilihan menu untuk program perbandingan array vs arraylist
        while (ulang) {
            System.out.println("=== MENU PERBANDINGAN ARRAY vs ARRAYLIST ===");
            System.out.println("1. Traversal");
            System.out.println("2. Pencarian");
            System.out.println("3. Penyisipan");
            System.out.println("4. Penghapusan");
            System.out.println("5. Pengurutan");
            System.out.println("6. Jalankan Semua");
            System.out.println("7. Keluar");
            System.out.print("Pilih menu (1-7): ");

            int pilihan = scanner.nextInt();
            System.out.println();

            switch (pilihan) {
                case 1:
                    Comparison.traversal();
                    break;
                case 2:
                    Comparison.search();
                    break;
                case 3:
                    Comparison.insert();
                    break;
                case 4:
                    Comparison.delete();
                    break;
                case 5:
                    Comparison.sort();
                    break;
                case 6:
                    Comparison.run();
                    break;
                case 7:
                    ulang = false;
                    System.out.println("Terima kasih. Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }

            System.out.println();
        }

        scanner.close();
    }
}
