

import java.util.Scanner;


public class NIMRun {
    public static void main(String[] args) {
        String Nama = "Nama = Rezki Quratul NF";
        System.out.println(Nama);

        System.out.print("NIM = ");

        Scanner input = new Scanner(System.in);
        String nim = input.nextLine();
        NIM objNim = new NIM();
        objNim.setNim(nim);

        System.out.println("Jenjang Pendidikan =" + objNim.getJenjangPendidikan());
        System.out.println("Tahun Masuk = " + objNim.getTahunMasuk());
        System.out.println("Fakultas = " + objNim.getFakultas());
        System.out.println("Jurusan = " + objNim.getJurusan());
        System.out.println("Jenis Kelamin = " + objNim.getJenisKelamin());
        System.out.println("Nomor Urut Mahasiswa = " + objNim.getNomorUrutMHS());
    }
}
