/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sfauzi.uts_no3_a_3015;

/**
 *
 * @author S FAUZI
 */
public class AsistenPraktikum_3015 extends Mahasiswa_3015{
    
    String mkAsistensi_3015, nim_3015;;
    int jmlPertemuan_3015;
    
    
    
    public double totalPendapatanAsprak_3015(){
        return(jmlPertemuan_3015 * 50000);
    }
    public void infoAsistenPraktikum_3015() {
        super.tampilDataMhs_3015();
        System.out.println(" Mata Kuliah    : " + mkAsistensi_3015);
        System.out.println(" Jumlah Pertemuan   : " + jmlPertemuan_3015);
        System.out.println(" Total Pendapatan : " + totalPendapatanAsprak_3015());
        
        
    }
   
    
    
   
   
}