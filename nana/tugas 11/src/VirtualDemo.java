import java.util.Scanner;

public class VirtualDemo {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Input nomor nota: ");
            String nomorNota = scanner.next();

            System.out.print("input nama pelanggan: ");
            String namaPelanggan = scanner.next();

            System.out.print("Input nama barang: ");
            String namaBarang = scanner.next();

            System.out.print("Input harga barang: ");
            double hargaBarang = scanner.nextDouble();

            System.out.print("Input jumlah: ");
            int jumlahBeli = scanner.nextInt();

             // Membuat objek Invoice
            Nota invoice = new Nota( nomorNota,namaPelanggan, namaBarang, hargaBarang, jumlahBeli);

            // Menampilkan detail Invoice dan total bayar
            System.out.println("\n========== Detail Faktur ==========\n"+ invoice);
            System.out.println("Total Bayar : Rp.  " + invoice.hitungTotalBayar());
        }
        catch(Exception e){
            System.out.println("Terjadi Kesalahan Input"+ e.getMessage());
        }
        finally{
            scanner.close();
        }
    }
}