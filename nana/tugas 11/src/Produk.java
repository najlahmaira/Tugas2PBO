public class Produk implements HitungTotalBayar {
    private String namaProduk;
    private double hargaProduk;
    private int jumlahBeli;

    // Konstruktor
    public Produk(String namaProduk, double hargaProduk,int jumlahBeli){
        this.namaProduk = namaProduk;
        this.hargaProduk = hargaProduk;
        this.jumlahBeli = jumlahBeli;

    }

     // Implementasi metode dari interface HitungTotalBayar
    public double hitungTotalBayar(){
        return hargaProduk*jumlahBeli;
    }

    // Representasi string dari objek Item
    @Override
    public String toString(){
        return "Nama Barang :" + namaProduk + "\nHarga Barang :" + hargaProduk + "\nJumlah Beli :" + jumlahBeli ;
    }


    
}