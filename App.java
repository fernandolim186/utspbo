import uts.kartuhasilstudi;
import uts.mahasiswa;
import uts.matakuliah;


import java.util.Scanner;
public class App {

    /* Nama : Fernando
       Kelas : 20TI2
       NIM : 03082200021*/
    
    public static void main(String[] args) throws Exception {
        Scanner masukan = new Scanner(System.in);
        int pilih;
        char yn;

        do{

            mahasiswa mhs = new mahasiswa("Fernando");
        
            matakuliah mk1 = new matakuliah("080808", "PBO", 3);
            matakuliah mk2 = new matakuliah("060606", "PKN", 3);
            matakuliah mk3 = new matakuliah("070707", "B.INDO", 3);


            kartuhasilstudi khs = new kartuhasilstudi(3,mhs);
            khs.tambahNilaiStudi(mk1, 'A');
            khs.tambahNilaiStudi(mk2, 'B');
            khs.tambahNilaiStudi(mk3, 'C');

            mahasiswa mhs1 = new mahasiswa("Bejo");
            matakuliah mk4 = new matakuliah("080808", "PBO", 3);
            matakuliah mk5 = new matakuliah("060606", "PKN", 3);
            matakuliah mk6 = new matakuliah("070707", "B.INDO", 3);

            kartuhasilstudi khs1 = new kartuhasilstudi(3,mhs1);
            khs1.tambahNilaiStudi(mk4, 'A');
            khs1.tambahNilaiStudi(mk5, 'B');
            khs1.tambahNilaiStudi(mk6, 'C');

            System.out.println("Program Nilai Mahasiswa");
            System.out.println("=======================");

            System.out.println("Pilih 1 : Tampilkan KHS");
            System.out.println("Pilih 2 : Keluar");

            System.out.print("Pilih no : ");
            pilih = masukan.nextInt();
            System.out.println("");
            
            if (pilih == 1){
                khs.tampilkanKHS();
                System.out.println();
                khs1.tampilkanKHS();
                System.out.println();
            }
            else if(pilih == 2){
                break;
            }

            System.out.print("Ulangi perhitungan ? (y/n) : ");
            masukan.nextLine();
            String yesno = masukan.nextLine();
            yn = yesno.charAt(0);
        }while(yn=='y' || yn=='Y');

        masukan.close();

    }
}