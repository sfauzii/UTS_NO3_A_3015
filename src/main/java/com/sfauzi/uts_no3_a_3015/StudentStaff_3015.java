/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sfauzi.uts_no3_a_3015;

/**
 *
 * @author S FAUZI
 */
public class StudentStaff_3015 extends Mahasiswa_3015 implements iPendapatan_3015{
    int unitKerja_3015; 
    int jamKerja_3015;
    double totalPendapatan_3015;
    
    
     public StudentStaff_3015() {

    }
     
     public StudentStaff_3015(String nim, String nama, String Jurusan, int ipk,
        int unitKerja, int jamKerja) {
        super(nim, nama, Jurusan, ipk);
        this.unitKerja_3015 = unitKerja_3015;
        this.jamKerja_3015 = jamKerja_3015;
    }
     
    @Override
    public void tampilDataMhs(){
        super.tampilDataMhs();
        infoStudentStaff_3015();
    }
    
    public double totalPendapatanStudent_3015(){
        return (jamKerja_3015 * 30000);
    }
    
    
    public void infoStudentStaff_3015(){
        super.tampilDataMhs();
        System.out.println(" Unit Kerja : " + unitKerja_3015);
        System.out.println(" Jam Kerja : " +jamKerja_3015);
        System.out.println(" Total Pendapatan Student Staff : " +totalPendapatanStudent_3015());
    }

    @Override
    public double totalPendapatan_3015() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
