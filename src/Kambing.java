/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alfi Nurizkya
 * NAMA     : ALFI NURIZKYA
 * KELAS    : PBO
 * NIM      : 10119036
 * DESKRIPSI PROGRAM : PERINTAH MASUKAN DATA
 */
public class Kambing {
    
    public void tambahKambing() {
       //Deklarasi Variabel Lokal
       int jumlahKambing = 0;
       
       jumlahKambing = jumlahKambing + 5;
       System.out.println("Jumlah Kambing Setelah Ditambah: " + jumlahKambing);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kambing kambingjantan = new Kambing();
        kambingjantan.tambahKambing();
    }
    
}
