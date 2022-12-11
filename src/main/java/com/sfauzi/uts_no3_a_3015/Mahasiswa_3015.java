/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sfauzi.uts_no3_a_3015;

/**
 *
 * @author S FAUZI
 */
public class Mahasiswa_3015 {
     String nim_3015;
     String nama_3015;
     String jurusan_3015;
     int ipk_3015;
    
    
    public Mahasiswa_3015(){
    }
    
    public Mahasiswa_3015(String nim_3015, String nama_3015, String jurusan_3015, int ipk_3015){
        this.nim_3015 = nim_3015;
        this.nama_3015 = nama_3015;
        this.jurusan_3015 = jurusan_3015;
        this.ipk_3015 = ipk_3015;
        
    }
    
    public void tampilDataMhs(){
        System.out.println("NIM : "+nim_3015);
        System.out.println("Nama : "+nama_3015);
        System.out.println("Jurusan : "+jurusan_3015);
        System.out.println("IPK : "+ipk_3015);
        
    }
}
