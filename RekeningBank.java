class RekeningBank {
    private String nomorRekening;
    private String namaPemilik;
    private double saldo;

    public RekeningBank(String nomorRekening, String namaPemilik, double saldo) {
        this.nomorRekening = nomorRekening;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }

    public void setor(double jumlah) {
        saldo += jumlah;
        System.out.println(namaPemilik + " menyetor Rp" + jumlah + ". Saldo sekarang: Rp" + saldo);
    }

    public void tarik(double jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah;
            System.out.println(namaPemilik + " menarik Rp" + jumlah + ". (Berhasil) Saldo sekarang: Rp" + saldo);
        } else {
            System.out.println(namaPemilik + " menarik Rp" + jumlah + ". (Gagal, Saldo tidak mencukupi) Saldo saat ini: Rp" + saldo);
        }
    }

    public void tampilkanRekening() {
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Saldo: Rp" + saldo);
        System.out.println();
    }

    public static void main(String[] args) {
        RekeningBank rekening1 = new RekeningBank("202410370110297", "Dzaki Shofian Hizbullah", 500000.0);
        RekeningBank rekening2 = new RekeningBank("202410370110298", "Kahlil Abrar", 1000000.0);

        rekening1.tampilkanRekening();
        rekening2.tampilkanRekening();

        rekening1.setor(200000);
        rekening2.setor(500000);

        rekening1.tarik(800000);
        rekening2.tarik(300000);

        rekening1.tampilkanRekening();
        rekening2.tampilkanRekening();
    }
}
