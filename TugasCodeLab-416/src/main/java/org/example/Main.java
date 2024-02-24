package org.example;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
        public class Main {
            public static void main(String[] args) {

                String nama;
                String jenisKelSing;
                String jenisKelLeng;
                String tanggalLahirStr;

                Scanner objInput = new Scanner(System.in);
                System.out.print("Masukkan nama Anda: ");
                nama = objInput.nextLine();
                System.out.print("Masukkan jenis kelamin (P/L): ");
                jenisKelSing = objInput.nextLine();
                System.out.print("Masukkan tanggal lahir (YYYY-MM-DD): ");java.lang.Object scanner;
                tanggalLahirStr = objInput.nextLine();



                switch (jenisKelSing.toUpperCase()) {
                    case "P":
                        jenisKelLeng = "Perempuan";
                        break;
                    case "L":
                        jenisKelLeng = "Laki-laki";
                        break;
                    default:
                        jenisKelLeng = "Jenis kelamin tidak valid";
                }

                LocalDate tanggalLahir = LocalDate.parse(tanggalLahirStr);
                LocalDate today = LocalDate.now();
                Period period = Period.between(tanggalLahir, today);

                System.out.println("\nNama: " + nama);
                System.out.println("Jenis Kelamin: " + jenisKelLeng);
                System.out.println("Umur: " + period.getYears() + " tahun, " + period.getMonths() + " bulan, " + period.getDays() + " hari");

            }
        }

