/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poliklinik;

/**
 *
 * @author Siti AJ
 */
public class PoliKlinik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Pasien pasien = new Pasien();
        pasien.setNama("Si A");
        pasien.setNoAntrian("A001");
        pasien.setKeluhan("Pusing"+"demam");
        
        Dokter dokter = new Dokter();
        dokter.setNama("Dokter A");
        dokter.setNoRuangan(001);
        dokter.setSpesialisasi("Poli Umum");
        
        Obat obat = new Obat();
        obat.setJenisObat("Paracetamol");
        obat.setPenyakit("Sakit Flu");
        
        Resep resep = new Resep();
        resep.setPasien(pasien);
        resep.setDokter(dokter);
        resep.setObat(obat);
        resep.setDosisPemakaian("3 x sehari");
        resep.setBiaya("25000");
        
        cetakResep(resep);
        
    }
                
        static void cetakResep(Resep resep) {
                        
        System.out.println("Nama Pasien : "+resep.getPasien().getNama());
        System.out.println("Nama Dokter : "+resep.getDokter().getNama());
        System.out.println("Nama Penyakit : "+resep.getObat().getPenyakit());
        System.out.println("Obat : "+resep.getObat().getJenisObat());
        System.out.println("Dosis Pemakaian : "+resep.getDosisPemakaian());
        System.out.println("Biaya : "+resep.getBiaya());
    }
}