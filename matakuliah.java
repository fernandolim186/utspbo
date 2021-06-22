package uts;

public class matakuliah {
    /* Nama : Fernando
       Kelas : 20TI2
       NIM : 03082200021*/

    /*KodeMataKuliah*/
    String KodeMataKuliah;
    /*NamaMataKuliah*/
    String NamaMataKuliah;
    /*SKS*/
    int SKS;


    public matakuliah(String kodematakuliah,String namamatakuliah,int SKS) {
        this.KodeMataKuliah = kodematakuliah;
        this.NamaMataKuliah = namamatakuliah;
        this.SKS = SKS;
    }

    public String getKodeMataKuliah() {
        return this.KodeMataKuliah;
    }

    public void setKodeMataKuliah(String KodeMataKuliah) {
        this.KodeMataKuliah = KodeMataKuliah;
    }

    public String getNamaMataKuliah() {
        return this.NamaMataKuliah;
    }

    public void setNamaMataKuliah(String NamaMataKuliah) {
        this.NamaMataKuliah = NamaMataKuliah;
    }

    public int getSKS() {
        return this.SKS;
    }

    public void setSKS(int SKS) {
        this.SKS = SKS;
    }

}