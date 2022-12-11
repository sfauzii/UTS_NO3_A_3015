/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.sfauzi.uts_no3_a_3015;


/**
 *
 * @author S FAUZI
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UTS_NO3_A_3015 {

    public static void main(String[] args) {
        AsistenPraktikum_3015[] A = new AsistenPraktikum_3015[1];
        StudentStaff_3015[] S = new StudentStaff_3015[1];
        
        A[0] = new AsistenPraktikum_3015();
        S[0] = new StudentStaff_3015();

        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
        try {
            
            for(int i = 0; i < 1; i++){
                System.out.print("NIM              : ");
                A[i].nim_3015 = br.readLine();
                System.out.print("Nama             : ");
                A[i].nama_3015 = br.readLine();
                System.out.print("Jurusan          : ");
                A[i].jurusan_3015 =br.readLine();
                System.out.print("IPK              : ");
                A[i].ipk_3015 =Integer.parseInt(br.readLine());
                System.out.print("Mata Kuliah      : ");
                A[i].mkAsistensi_3015 = br.readLine();
                System.out.print("Jumlah Pertemuan : ");
                A[i].jmlPertemuan_3015 = Integer.parseInt(br.readLine());
                System.out.println();
            }
            
            System.out.println("DATA ASISTEN PRAKTIKUM");
            for(AsistenPraktikum_3015 a : A){
                a.infoAsistenPraktikum_3015();
                System.out.println("");
            }

            for(int i = 0; i < 1; i++){
                System.out.print("NIM         : ");
                S[i].nim_3015 = br.readLine();
                System.out.print("Nama        : ");
                S[i].nama_3015 = br.readLine();
                System.out.print("Jurusan     : ");
                S[i].jurusan_3015 =br.readLine();
                System.out.print("IPK         : ");
                S[i].ipk_3015 =Integer.parseInt(br.readLine());
                System.out.print(" Unit Kerja : ");
                S[i].unitKerja_3015 = Integer.parseInt(br.readLine());
                System.out.print("Jam Kerja   : ");
                S[i].jamKerja_3015 = Integer.parseInt(br.readLine());
                System.out.println();
            }
            
            
            System.out.println("DATA STUDENT STAFF");
            for(StudentStaff_3015 s : S){
                s.infoStudentStaff_3015();
                System.out.println("");
            }
        } 
        catch (Exception ex){ 
            System.out.println(ex);
        }
        
    }
}
