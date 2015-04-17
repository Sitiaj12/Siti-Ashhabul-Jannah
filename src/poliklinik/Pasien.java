/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poliklinik;

/**
 *
 * @author Siti AJ
 */
public class Pasien {
    
    private String nama;
    private String noAntrian;
    private String keluhan;
    
    public void setNama (String nama){
        this.nama = nama;
    }
    
    public void setNoAntrian (String noAntrian) {
        this.noAntrian = noAntrian;
    }
    
    public String getNama(){
        return nama;
    }
    
    public String getNoAntrian(){
        return noAntrian;
    }
    
    public void setKeluhan (String keluhan){
        this.keluhan = keluhan;
    }
        
    public String getKeluhan(){
        return keluhan;
}
}
