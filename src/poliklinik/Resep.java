/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poliklinik;

/**
 *
 * @author Siti AJ
 */
public class Resep {
    
    private Pasien pasien;
    private Dokter dokter;
    private Obat obat;
    private String dosisPemakaian;
    private String biaya;
    
    public Pasien getPasien(){
        return pasien;
    }
    
    public Pasien setPasien(Pasien pasien){
        this.pasien = pasien;
        return null;
    }
    
    public Dokter getDokter(){
        return dokter;
    }
    
    public Dokter setDokter(Dokter dokter){
        this.dokter = dokter;
        return null;
    }
    
    public Obat getObat(){
        return obat;
    }
    
    public Obat setObat(Obat obat){
        this.obat = obat;
        return null;
    }
    
    public String getDosisPemakaian() {
        return dosisPemakaian;
    }

    public void setDosisPemakaian(String dosisPemakaian) {
        this.dosisPemakaian = dosisPemakaian;
    }

    public String getBiaya() {
        return biaya;
    }

    public void setBiaya(String biaya) {
        this.biaya = biaya;
    }

}
