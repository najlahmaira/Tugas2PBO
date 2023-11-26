public class Nota extends Produk {
        private String nomorNota;
        private String namaPelanggan;
    
        //konstruktor
        public Nota(String nomorNota, String namaPelanggan, String namaProduk, double hargaProduk, int jumlahBeli ){
            super(namaProduk, hargaProduk, jumlahBeli); //memanggil method item dari kelas item
            this.nomorNota = nomorNota;
            this.namaPelanggan = namaPelanggan;
        }
    
        //memanggil method hitungTotalBayar dari kelas item
        @Override
        public double hitungTotalBayar(){
            return super.hitungTotalBayar();
        }
    
        // Representasi string dari objek Invoice
        @Override
        public String toString(){
            return "Nomor Faktur :" + nomorNota + "\nNama Pelanggan :" + namaPelanggan + "\n" + super.toString();
        }
    }

