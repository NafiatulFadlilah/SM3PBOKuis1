/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuis1;
import java.util.Scanner;
/*
Nama: Nafiatul Fadlilah
NIM: 2141762030
Kelas: SIB2E
*/
/*
 * @author Nafiaaeluv
 */
public class Main {
    public static void main(String[] args){
        Scanner enter = new Scanner(System.in);
        String answer; 
        
        do{
            System.out.println("==========||SISTEM HITUNG GAJI HARIAN PT. XYZ||==========");
            System.out.println("Masukkan NIP Karyawan: ");
            String nip = enter.next();
            System.out.println("Masukkan Nama Karyawan: ");
            String nama = enter.next();
            
            Pegawai pgw = new Pegawai(nama, nip);
            
            System.out.println("Masukkan jumlah jam kerja: ");
            int jam = enter.nextInt();
            
            pgw.setJamKerja(jam);
            pgw.hitungGajiHarian();
            pgw.cetakPenghasilan();
            
            System.out.println("Apakah Anda ingin memasukkan data karyawan lagi? Jika setuju enter y / Y.");
            answer = enter.next();
        }while(answer.equalsIgnoreCase("y"));   
    }
}