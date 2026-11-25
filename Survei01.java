import java.util.Scanner;
public class Survei01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] survei = new int[10][6];
        
        //A. Menyimpan hasil survei
        System.out.println("--- INPUT HASIL SURVEI ---");
        for (int i = 0; i < survei.length; i++) {
            System.out.println("Responden ke-" + (i + 1));
            for (int j = 0; j < survei[i].length; j++) {
                System.out.print("Pertanyaan ke-" + (j + 1) + ": ");
                survei[i][j] = input.nextInt();
            }
        }

        // . Menghitung rata-rata tiap responden
        System.out.println("=== RATA-RATA TIAP RESPONDEN ===");
        for (int i = 0; i < survei.length; i++) {
            int total = 0;
            for (int j = 0; j < survei[i].length; j++) {
                total += survei[i][j];
            }
            double rataRata = (double) total / survei[i].length;
            System.out.printf("Responden ke-%d: %.2f%n", (i + 1), rataRata);
        }

        // C. Menghitung rata-rata setiap pertanyaan
        System.out.println("=== RATA-RATA SETIAP PERTANYAAN ===");
        for (int j = 0; j < survei[0].length; j++) {
            int total = 0;
            for (int i = 0; i < survei.length; i++) {
                total += survei[i][j];
            }
            double rataRata = (double) total / survei.length;
            System.out.printf("Pertanyaan ke-%d: %.2f%n", (j + 1), rataRata);
        }
    }
}