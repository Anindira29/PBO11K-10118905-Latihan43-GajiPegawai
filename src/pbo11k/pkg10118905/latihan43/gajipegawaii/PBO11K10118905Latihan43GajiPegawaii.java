/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118905.latihan43.gajipegawaii;

/**
 *
 * @author Fitri
 * Nama     : Anindira Dina Fitriani
 * Kelas    : IF11-K
 * Nim      : 10118905
 * Deskripsi: Program Gaji Pegawai
 */
public class PBO11K10118905Latihan43GajiPegawaii {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GajiPegawai gp = new GajiPegawai();
        gp.setNama("Rizki Adam Kurniawan");
        gp.setAlamat("Jalan Semar dlm 4 No 72/66");
        gp.setUangTransport(250000);
        gp.setUangTunjangan(300000);
        gp.setGajiPokok(4500000);
        gp.tampilData(gp.getNama(), gp.getUangTunjangan(), gp.getUangTransport(), gp.getGajiPokok(), gp.totalGaji(gp.getUangTunjangan(), gp.getUangTransport(), gp.getGajiPokok()));
    }
    
}