/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuis1;
/*
Nama: Nafiatul Fadlilah
NIM: 2141762030
Kelas: SIB2E
*/
/*
 * @author Nafiaaeluv
 */
public class Pegawai {
    String nama, nip;
    double gajiPokok, lembur, uangMakan, transport;
    int jumlahJamKerja;
    
    Pegawai(String nama, String nip){
        this.nama = nama;
        this.nip = nip;
    }
    
    public void setJamKerja(int jamKerja){
        this.jumlahJamKerja = jamKerja;
    }
    
    public int getJamKerja(){
        return jumlahJamKerja;
    }
    
    public void hitungGajiHarian(){
        if(getJamKerja() > 7){
            lembur = 1.5 * 2000;
            if(getJamKerja() >= 8){
                uangMakan = 3500;
                if(getJamKerja() >= 9){
                    transport = 4000;
                }
            }
            gajiPokok = getJamKerja() * 2000;
        }else{
            gajiPokok = getJamKerja() * 2000;
        } 
    }

    public void cetakPenghasilan(){
        System.out.println("==============||Data Gaji Harian Karyawan||==============");
        System.out.println("NIP: " + nip);
        System.out.println("Nama: " + nama);
        System.out.println("Gaji Pokok: Rp. " + gajiPokok);
        System.out.println("Lembur: Rp. " + lembur);
        System.out.println("Uang Makan: Rp. " + uangMakan);
        System.out.println("Transport Lembur: Rp. " + transport);
        System.out.println("Take Home Pay: Rp. " + (gajiPokok + lembur + uangMakan + transport));
        System.out.println("=========================================================");
    }
}