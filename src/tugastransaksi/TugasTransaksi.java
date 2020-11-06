/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;
import java.util.Scanner;
/**
 *
 * @author Yuliana
 */
public class TugasTransaksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //scanner input
        Scanner input = new Scanner(System.in);
        String[] jenis = {"","Gula pasir","Gula batu","Gula halus"};
        int[] harga = {0, 5000, 6000, 7000};
        
        //perulangan
        for(int i=1; i<harga.length; i++){
            System.out.println(i+". "+jenis[i]+" >>> "+harga[i]);
        }
        
        System.out.print("Masukkan gula yang anda pilih : ");
        int pilihan = input.nextInt();
        
        System.out.print("Jumlah gula yang anda beli : ");
        int jumlah = input.nextInt();
        
        //total pembayaran 
        int total= harga[pilihan]*jumlah;
        System.out.println("Total Pembelian anda = " +total);
        
        System.out.println("Masukkan uang anda : ");
        int bayar = input.nextInt();
        if (bayar>total){
            int kembalian = bayar-total;
            System.out.println("Kembalian anda = "+ kembalian);
        }else if (bayar<total){
            int uangkurang = total-bayar;
            System.out.println("Mohon Maaf, uang anda kurang "+uangkurang);
        }else {
            System.out.println ("Uang anda pas");
            
            }
        }
        
    
    }

        
