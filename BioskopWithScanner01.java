import java.util.Scanner;
public class BioskopWithScanner01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] penonton = new String[4][2];
        int menu, baris, kolom;

        do {
            System.out.println("\n=== MENU BIOSKOP ===");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("Masukkan nama: ");
                    String nama = sc.nextLine();
                    while (true) {
                        System.out.print("Masukkan baris: ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan kolom: ");
                        kolom = sc.nextInt();
                        sc.nextLine();

                        if (baris < 1 || baris > 4 ||
                            kolom < 1 || kolom > 2) {
                            System.out.println("Nomor kursi tidak tersedia!");
                        } else if (penonton[baris-1][kolom-1] != null) {
                            System.out.println("Kursi sudah terisi!");
                        } else {
                            penonton[baris-1][kolom-1] = nama;
                            System.out.println("Data berhasil disimpan.");
                            break;
                        }
                    }
                    break;

                case 2:
                    System.out.println("\n=== DAFTAR PENONTON ===");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] == null) {
                                System.out.print("***\t");
                            } else {
                                System.out.print(penonton[i][j] + "\t");
                            }
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Menu tidak tersedia!");
            }

        } while (menu != 3);
        sc.close();
    }
}