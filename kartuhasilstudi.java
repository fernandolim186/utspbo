package uts;

import java.util.ArrayList;

public class kartuhasilstudi {
    /* Nama : Fernando
       Kelas : 20TI2
       NIM : 03082200021*/

    /*Semester*/
    int semester ;
    /*Mahasiswa*/
    mahasiswa Mahasiswa;
    /*Import SKS*/
    matakuliah MataKuliah;
    /*ListNilaiStudi*/
    ArrayList<nilaistudi> NilaiStudi = new ArrayList<nilaistudi>();

    public kartuhasilstudi(int semester,mahasiswa mhs){
        this.semester = semester;
        this.Mahasiswa = mhs;
    }

    public int getSemester() {
        return this.semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public mahasiswa getMahasiswa() {
        return this.Mahasiswa;
    }

    public void setMahasiswa(mahasiswa Mahasiswa) {
        this.Mahasiswa = Mahasiswa;
    }

    public ArrayList<nilaistudi> getNilaiStudi() {
        return this.NilaiStudi;
    }

    public void setNilaiStudi(ArrayList<nilaistudi> NilaiStudi) {
        this.NilaiStudi = NilaiStudi;
    }

    public void tambahNilaiStudi(matakuliah mk,char nilai){
        nilaistudi ns = new nilaistudi(mk, nilai);
        NilaiStudi.add(ns);
    }
   
    public int totalSKS(){
        int total = 0;
        for (nilaistudi nilai : NilaiStudi){
            total += nilai.getSKS();
        }
        return total;
    }

    public double ipk(){
        double totalsatu = 0.0, totaldua = 0.0;
        for(nilaistudi i : NilaiStudi){
            totalsatu += i.getNilaiAngka() * i.getMataKuliah().getSKS();
            totaldua += i.getSKS();
        }
        return totalsatu/totaldua;
    }

    public void tampilkanKHS(){
        int count = 1;
        System.out.println("Nama Mahasiswa : " + Mahasiswa.nama);
        System.out.println("Semester : " + semester);
        System.out.println("IPK : " + ipk());
        System.out.println("Total SKS : " + totalSKS());
        System.out.println("");
        System.out.println("Nilai");
        System.out.println("No.\t" +  "Kode MataKuliah\t\t" + "Nama MataKuliah\t\t" + "Sks\t\t" + "Nilai");
        for(nilaistudi a : NilaiStudi){
            System.out.print(count);
            System.out.println(a.toString());
            count++;
        }
    }
}