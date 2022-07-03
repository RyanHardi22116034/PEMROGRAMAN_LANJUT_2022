package com.ryanhardi.tugas;

import java.util.ArrayList;
import  java.util.Scanner;

public class DataMahasiswa {
    public static void main(String[] args){
        ArrayList<String> nama = new ArrayList<>();
        ArrayList<String> NIM = new ArrayList<>();
        ArrayList<String> alamat = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        int pilihan;

        do{
            System.out.println("\nProgram Data Mahasiswa");
            System.out.println("========================");
            System.out.println("1.Tambahkan");
            System.out.println("2.Tampilkan");
            System.out.println("3.Cari");
            System.out.println("4.Hapus");
            System.out.println("5.Keluar");
            System.out.println("\nPilih Menu : ");
            pilihan = input.nextInt();

            if (pilihan == 1){
                System.out.print("Masukkan nama : ");
                String nm = input.next();
                nama.add(nm);

                System.out.print("Masukkan NIM : ");
                String nim = input.next();
                NIM.add(nim);

                System.out.print("Masukkan Alamat : ");
                String alm = input.next();
                alamat.add(alm);

            } else if (pilihan == 2) {
                System.out.println("Data Mahasiswa");
                System.out.println("==============");

                for (int i = 0; i <NIM.size() ; i++){
                    System.out.print(i + 1 + "." + NIM.get(i));
                }

                System.out.println("Untuk melihat data lengkap, cari Data (3)");
            } else if (pilihan == 3) {
                System.out.print("Masukkan data nomor yang ingin di cari: ");
                int cari = input.nextInt();
                if (cari == 1){
                    System.out.println("Nama : " + nama.get(0));
                    System.out.println("NIM : " + NIM.get(0));
                    System.out.println("Alamat : " + alamat.get(0));
                }
                System.out.println("=============");

                if (cari == 2){
                    System.out.println("Nama : " + nama.get(1));
                    System.out.println("NIM : " + NIM.get(1));
                    System.out.println("Alamat : " + alamat.get(1));
                }
            } else if (pilihan == 4) {
                System.out.println("Data Mahasiswa");
                System.out.println("==============");

                for (int i = 0; i <NIM.size() ; i++){
                    System.out.println(i + 1 + "." + NIM.get(i));
                }
                System.out.print("Masukkan nim yang akan dihapus: ");
                String nim = input.next();
                NIM.remove(nim);
            } else if (pilihan == 5) {
                System.out.println("selesai");
            }else {
                System.err.println("menu tidak tersedia");
            }

        }while (pilihan != 5);
    }
}
