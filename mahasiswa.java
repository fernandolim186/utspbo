package uts;

public class mahasiswa {
    /* Nama : Fernando
       Kelas : 20TI2
       NIM : 03082200021*/

    /* Nama Mahasiswa */
    String nama;
    
    
    public mahasiswa() {
    }

    public mahasiswa(String nama) {
        this.nama=nama;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public String toString() {
        return "" +
            " " + getNama() + "\t\t\t";
    }

    
}