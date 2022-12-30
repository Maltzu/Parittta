package com.maltzu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner terminalInput = new Scanner(System.in);
        int choose;
        boolean isContinue = true;
        while(isContinue){
            ClearScreen();
            System.out.println("1. Tuntunan Puja Bakti");
            System.out.println("2. Upacara Dan Penggunaan Patha");
            System.out.println("3. Aradhana dan Sikkhapada");
            System.out.println("4. Patha Untuk Upacara Mangala");
            System.out.println("5. Patha untuk Upacara Avamangala");
            System.out.println("6. Patha-Patha Khusus");
            System.out.println("7. Puja-Katha pada Hari Suci Buddhis");
            System.out.println("8. Pakinnakakatha");
            System.out.print("Pilihan anda : ");
            choose = terminalInput.nextInt();
            switch (choose){
                case 1:
                    boolean isJalankan = true;
                    int chooseWhat;
                    while(isJalankan){
                    ClearScreen();
                    System.out.println("1. Pembukaan");
                    System.out.println("2. Namakara Patha");
                    System.out.println("3. Puja Katha");
                    System.out.println("4. Pubbabhaganamakara");
                    System.out.println("5. Saranagamana Patha");
                    System.out.println("6. Pancasila");
                    System.out.println("7. Buddhanussati");
                    System.out.println("8. Dhammanussati");
                    System.out.println("9. Sanghanussati");
                    System.out.println("10. Saccakiriya Gatha");
                    System.out.println("11. Mangala Sutta");
                    System.out.println("12. Karaniyametta Sutta");
                    System.out.println("13. Brahmavihara-pharana");
                    System.out.println("14. Abhinhapaccavekkhana Patha");
                    System.out.println("15. Bhavana");
                    System.out.println("16. Pancasila-aradhana");
                    System.out.println("17. Paritta-aradhana");
                    System.out.println("18. Dhammadesana-aradhana");
                    System.out.println("19. Dhammadesana");
                    System.out.println("20. Ettavatatiadipattidana");
                    System.out.println("21. Penutup");
                    System.out.print("Pilihan Anda : ");
                    chooseWhat = terminalInput.nextInt();
                    switch(chooseWhat){
                        case 1:
                            //Pembukaan
                            FileReader pembukaanRead = new FileReader("pembukaan.txt");
                            BufferedReader pembukaanTxt = new BufferedReader(pembukaanRead);
                            Scanner readPembukaan = new Scanner(pembukaanTxt);
                            while(readPembukaan.hasNext()){
                                System.out.println(readPembukaan.nextLine());
                            }
                            break;
                        case 2:
                            //Namakara Patha
                            FileReader NamakaraPathaRead = new FileReader("NamakaraPatha.txt");
                            BufferedReader NamakaraPathaTxt = new BufferedReader(NamakaraPathaRead);
                            Scanner ReadNamakaraPatha = new Scanner(NamakaraPathaTxt);
                            while(ReadNamakaraPatha.hasNext()){
                                System.out.println(ReadNamakaraPatha.nextLine());
                            }
                            break;
                        case 3:
                            //Puja Katha
                            FileReader PujaKathaRead = new FileReader("PujaKatha.txt");
                            BufferedReader PujaKathaTxt = new BufferedReader(PujaKathaRead);
                            Scanner ReadPujaKatha = new Scanner(PujaKathaTxt);
                            while(ReadPujaKatha.hasNext()){
                                System.out.println(ReadPujaKatha.nextLine());
                            }
                            break;
                        case 4:
                            //Pubbabhaganamakara
                            FileReader PubbabhaganamakaraRead = new FileReader("Pubbabhaganamakara.txt");
                            BufferedReader PubbabhaganamakaraTxt = new BufferedReader(PubbabhaganamakaraRead);
                            Scanner ReadPubbabhaganamakara = new Scanner(PubbabhaganamakaraTxt);
                            while(ReadPubbabhaganamakara.hasNext()){
                                System.out.println(ReadPubbabhaganamakara.nextLine());
                            }
                            break;
                        case 5:
                            //Saranagamana Patha
                            FileReader SaranagamanaRead = new FileReader("Saranagamana.txt");
                            BufferedReader SaranagamanaTxt = new BufferedReader(SaranagamanaRead);
                            Scanner ReadSaranagamana = new Scanner(SaranagamanaTxt);
                            while(ReadSaranagamana.hasNext()){
                                System.out.println(ReadSaranagamana.nextLine());
                            }
                            break;
                        case 6:
                            //Pancasila
                            FileReader PancasilaRead = new FileReader("Pancasila.txt");
                            BufferedReader PancasilaTxt = new BufferedReader(PancasilaRead);
                            Scanner ReadPancasila = new Scanner(PancasilaTxt);
                            while(ReadPancasila.hasNext()){
                                System.out.println(ReadPancasila.nextLine());
                            }
                            break;
                        case 7:
                            //Buddhanussati
                            FileReader BuddhanussatiRead = new FileReader("Buddhanussati.txt");
                            BufferedReader BuddhanussatiTxt = new BufferedReader(BuddhanussatiRead);
                            Scanner ReadBuddhanussati = new Scanner(BuddhanussatiTxt);
                            while(ReadBuddhanussati.hasNext()){
                                System.out.println(ReadBuddhanussati.nextLine());
                            }
                            break;
                        case 8:
                            //Dhammanussati
                            FileReader DhammanussatiRead = new FileReader("Dhammanussati.txt");
                            BufferedReader DhammanussatiTxt = new BufferedReader(DhammanussatiRead);
                            Scanner ReadDhammanussati = new Scanner(DhammanussatiTxt);
                            while(ReadDhammanussati.hasNext()){
                                System.out.println(ReadDhammanussati.nextLine());
                            }
                            break;
                        case 9:
                            //Sanghanussati
                            FileReader SanghanussatiRead = new FileReader("Sanghanussati.txt");
                            BufferedReader SanghanussatiTxt = new BufferedReader(SanghanussatiRead);
                            Scanner ReadSanghanussati = new Scanner(SanghanussatiTxt);
                            while(ReadSanghanussati.hasNext()){
                                System.out.println(ReadSanghanussati.nextLine());
                            }
                            break;  
                        case 10:
                            //Saccakiriya Gatha
                            FileReader SaccakiriyaGathaRead = new FileReader("SaccakiriyaGatha.txt");
                            BufferedReader SaccakiriyaGathaTxt = new BufferedReader(SaccakiriyaGathaRead);
                            Scanner ReadSaccakiriyaGatha = new Scanner(SaccakiriyaGathaTxt);
                            while(ReadSaccakiriyaGatha.hasNext()){
                                System.out.println(ReadSaccakiriyaGatha.nextLine());
                            }
                            break;
                        case 11:
                            //Mangala Sutta
                            FileReader MangalaSuttaRead = new FileReader("SaccakiriyaGatha.txt");
                            BufferedReader MangalaSuttaTxt = new BufferedReader(MangalaSuttaRead);
                            Scanner ReadMangalaSutta = new Scanner(MangalaSuttaTxt);
                            while(ReadMangalaSutta.hasNext()){
                                System.out.println(ReadMangalaSutta.nextLine());
                            }
                            break;
                        case 12:
                            //Karaniyamettasutta
                            FileReader KaraniyamettasuttaRead = new FileReader("SaccakiriyaGatha.txt");
                            BufferedReader KaraniyamettasuttaTxt = new BufferedReader(KaraniyamettasuttaRead);
                            Scanner ReadKaraniyamettasutta = new Scanner(KaraniyamettasuttaTxt);
                            while(ReadKaraniyamettasutta.hasNext()){
                                System.out.println(ReadKaraniyamettasutta.nextLine());
                            }
                            break;
                        case 13:
                            //Brahmavihara-pharana
                            FileReader BrahmaviharapharanaRead = new FileReader("Brahmaviharapharana.txt");
                            BufferedReader BrahmaviharapharanaTxt = new BufferedReader(BrahmaviharapharanaRead);
                            Scanner ReadBrahmaviharapharana = new Scanner(BrahmaviharapharanaTxt);
                            while(ReadBrahmaviharapharana.hasNext()){
                                System.out.println(ReadBrahmaviharapharana.nextLine());
                            }
                            break;
                        case 14:
                            //AbhinhapaccavekkhanaPatha
                            FileReader AbhinhapaccavekkhanaPathaRead = new FileReader("AbhinhapaccavekkhanaPatha.txt");
                            BufferedReader AbhinhapaccavekkhanaPathaTxt = new BufferedReader(AbhinhapaccavekkhanaPathaRead);
                            Scanner ReadAbhinhapaccavekkhanaPatha = new Scanner(AbhinhapaccavekkhanaPathaTxt);
                            while(ReadAbhinhapaccavekkhanaPatha.hasNext()){
                                System.out.println(ReadAbhinhapaccavekkhanaPatha.nextLine());
                            }
                            break;
                        case 15:
                            //Bhavana
                            FileReader BhavanaRead = new FileReader("Bhavana.txt");
                            BufferedReader BhavanaTxt = new BufferedReader(BhavanaRead);
                            Scanner ReadBhavana = new Scanner(BhavanaTxt);
                            while(ReadBhavana.hasNext()){
                                System.out.println(ReadBhavana.nextLine());
                            }
                            break;
                        case 16:
                            //Pancasila-aradhana
                            FileReader PancasilaaradhanaRead = new FileReader("Pancasilaaradhana.txt");
                            BufferedReader PancasilaaradhanaTxt = new BufferedReader(PancasilaaradhanaRead);
                            Scanner ReadPancasilaaradhana = new Scanner(PancasilaaradhanaTxt);
                            while(ReadPancasilaaradhana.hasNext()){
                                System.out.println(ReadPancasilaaradhana.nextLine());
                            }
                            break;
                        case 17:
                            //Paritta-aradhana
                            FileReader ParittaaradhanaRead = new FileReader("Parittaaradhana.txt");
                            BufferedReader ParittaaradhanaTxt = new BufferedReader(ParittaaradhanaRead);
                            Scanner ReadParittaaradhana = new Scanner(ParittaaradhanaTxt);
                            while(ReadParittaaradhana.hasNext()){
                                System.out.println(ReadParittaaradhana.nextLine());
                            }
                            break;
                        case 18:
                            //Dhammadesana-aradhana
                            FileReader DhammadesanaaradhanaRead = new FileReader("Dhammadesanaaradhana.txt");
                            BufferedReader DhammadesanaaradhanaTxt = new BufferedReader(DhammadesanaaradhanaRead);
                            Scanner ReadDhammadesanaaradhana = new Scanner(DhammadesanaaradhanaTxt);
                            while(ReadDhammadesanaaradhana.hasNext()){
                                System.out.println(ReadDhammadesanaaradhana.nextLine());
                            }
                            break;
                        case 19:
                            //Dhammadesana
                            FileReader DhammadesanaRead = new FileReader("Dhammadesana.txt");
                            BufferedReader DhammadesanaTxt = new BufferedReader(DhammadesanaRead);
                            Scanner ReadDhammadesana = new Scanner(DhammadesanaTxt);
                            while(ReadDhammadesana.hasNext()){
                                System.out.println(ReadDhammadesana.nextLine());
                            }
                            break;
                        case 20:
                            //Ettavatatiadipattidana
                            FileReader EttavatatiadipattidanaRead = new FileReader("Ettavatatiadipattidana.txt");
                            BufferedReader EttavatatiadipattidanaTxt = new BufferedReader(EttavatatiadipattidanaRead);
                            Scanner ReadEttavatatiadipattidana = new Scanner(EttavatatiadipattidanaTxt);
                            while(ReadEttavatatiadipattidana.hasNext()){
                                System.out.println(ReadEttavatatiadipattidana.nextLine());
                            }
                            break;
                        case 21:
                            //penutup
                            FileReader penutupRead = new FileReader("penutup.txt");
                            BufferedReader penutupTxt = new BufferedReader(penutupRead);
                            Scanner Readpenutup = new Scanner(penutupTxt);
                            while(Readpenutup.hasNext()){
                                System.out.println(Readpenutup.nextLine());
                            }
                            break;
                    }
                    isJalankan = GetYesOrNot("Apakah anda ingin melanjutkan");
                    }
                    break;
                    case 2:
                    boolean isLanjutkan = true;
                    int chooseApa;
                    while(isLanjutkan){
                    ClearScreen();
                    System.out.println("1. Tujuh Bulan kandungan");
                    System.out.println("2. Menjelang Kelahiran");
                    System.out.println("3. Pemberkatan Kelahiran");
                    System.out.println("4. Ulang Tahun, Turun Tanah");
                    System.out.println("5. Potong Rambut");
                    System.out.println("6. Peletakan Batu Pertama");
                    System.out.println("7. Menempati Rumah Baru, Membuka Usaha Baru, dll.");
                    System.out.println("8. Pembersihan Suasana/Tempat");
                    System.out.println("9. Tirta Untuk Orang Sakit");
                    System.out.println("10. Tanam di Sawah (Pemberkahan Benih)");
                    System.out.println("11. Pengukuhan Janji Jabatan");
                    System.out.println("12. Pengukuhan Janji di Pengadilan");
                    System.out.println("13. Wisuda Upasaka/Upasika");
                    System.out.println("14. Upacara Perkawinan");
                    System.out.println("15. Upacara Kematian");
                    System.out.println("16. Peringatan Kematian");
                    System.out.println("17. Catatan");
                    System.out.print("Pilihan Anda : ");
                    chooseApa = terminalInput.nextInt();
                    switch(chooseApa){
                        case 1:
                            //Tujuh Bulan Kandungan
                            boolean pilihLanjut = true;
                            int pilihApa;
                            while(pilihLanjut){
                                System.out.println("1. Pubbabhaganamakara");
                                System.out.println("2. Saranagamana Patha");
                                System.out.println("3. Saccakiriya Gatha");
                                System.out.println("4. Mangalasutta Gatha(Dimulai dari: Asevana ca balanam)");
                                System.out.println("5. Karaniyametta Sutta(Bait 8, 9, dan 10");
                                System.out.println("6. Angulimala Paritta (satu atau tiga kali)");
                                System.out.println("7. Buddhanussati");
                                System.out.println("8. Dhammanussati");
                                System.out.println("9. Sanghanussati");
                                System.out.println("10. Abhaya Paritta atau Devata-uyyojana Gatha");
                                System.out.println("11. Sumangala Gatha II (pemercikan tirta)");
                                System.out.print("Pilihan anda : ");
                                pilihApa = terminalInput.nextInt();
                                switch(pilihApa){
                                    case 1:
                                    FileReader PubbabhaganamakaraRead = new FileReader("Pubbabhaganamakara.txt");
                                    BufferedReader PubbabhaganamakaraTxt = new BufferedReader(PubbabhaganamakaraRead);
                                    Scanner ReadPubbabhaganamakara = new Scanner(PubbabhaganamakaraTxt);
                                    while(ReadPubbabhaganamakara.hasNext()){
                                        System.out.println(ReadPubbabhaganamakara.nextLine());
                                    }
                                        break;
                                    case 2:
                                    FileReader SaranagamanaPathaRead = new FileReader("Saranagamana.txt");
                                    BufferedReader SaranagamanaPathaTxt = new BufferedReader(SaranagamanaPathaRead);
                                    Scanner ReadSaranagamanaPatha = new Scanner(SaranagamanaPathaTxt);
                                    while(ReadSaranagamanaPatha.hasNext()){
                                        System.out.println(ReadSaranagamanaPatha.nextLine());
                                    }
                                    break;
                                    case 3:
                                    FileReader SaccakiriyaRead = new FileReader("SaccakiriyaGatha.txt");
                                    BufferedReader SaccakiriyaTxt = new BufferedReader(SaccakiriyaRead);
                                    Scanner ReadSaccakiriya = new Scanner(SaccakiriyaTxt);
                                    while(ReadSaccakiriya.hasNext()){
                                        System.out.println(ReadSaccakiriya.nextLine());
                                    }
                                    break;
                                    case 4:
                                    FileReader MangalasuttaRead = new FileReader("Mangalasutta.txt");
                                    BufferedReader MangalasuttaTxt = new BufferedReader(MangalasuttaRead);
                                    Scanner ReadMangalasutta = new Scanner(MangalasuttaTxt);
                                    while(ReadMangalasutta.hasNext()){
                                        System.out.println(ReadMangalasutta.nextLine());
                                    }
                                    break;
                                    case 5:
                                    FileReader KaraniyamettasuttaRead = new FileReader("Karaniyamettasutta.txt");
                                    BufferedReader KaraniyamettasuttaTxt = new BufferedReader(KaraniyamettasuttaRead);
                                    Scanner ReadKaraniyamettasutta = new Scanner(KaraniyamettasuttaTxt);
                                    while(ReadKaraniyamettasutta.hasNext()){
                                        System.out.println(ReadKaraniyamettasutta.nextLine());
                                    }
                                    break;
                                    case 6:
                                    FileReader AngulimalaParittaRead = new FileReader("AngulimalaParitta.txt");
                                    BufferedReader AngulimalaParittaTxt = new BufferedReader(AngulimalaParittaRead);
                                    Scanner ReadAngulimalaParitta = new Scanner(AngulimalaParittaTxt);
                                    while(ReadAngulimalaParitta.hasNext()){
                                        System.out.println(ReadAngulimalaParitta.nextLine());
                                    }
                                    case 7:
                                    FileReader BuddhanussatiRead = new FileReader("Buddhanussati.txt");
                                    BufferedReader BuddhanussatiTxt = new BufferedReader(BuddhanussatiRead);
                                    Scanner ReadBuddhanussati = new Scanner(BuddhanussatiTxt);
                                    while(ReadBuddhanussati.hasNext()){
                                    System.out.println(ReadBuddhanussati.nextLine());
                                    }
                                    break;
                                    case 8:
                                    FileReader DhammanussatiRead = new FileReader("Dhammanussati.txt");
                                    BufferedReader DhammanussatiTxt = new BufferedReader(DhammanussatiRead);
                                    Scanner ReadDhammanussati = new Scanner(DhammanussatiTxt);
                                    while(ReadDhammanussati.hasNext()){
                                    System.out.println(ReadDhammanussati.nextLine());
                                    }
                                    break;
                                    case 9:
                                    FileReader SanghanussatiRead = new FileReader("Sanghanussati.txt");
                                    BufferedReader SanghanussatiTxt = new BufferedReader(SanghanussatiRead);
                                    Scanner ReadSanghanussati = new Scanner(SanghanussatiTxt);
                                    while(ReadSanghanussati.hasNext()){
                                    System.out.println(ReadSanghanussati.nextLine());
                                    }
                                    break;
                                    case 10:
                                    FileReader AbhayaParittaRead = new FileReader("AbhayaParitta.txt");
                                    BufferedReader AbhayaParittaTxt = new BufferedReader(AbhayaParittaRead);
                                    Scanner ReadAbhayaParitta = new Scanner(AbhayaParittaTxt);
                                    while(ReadAbhayaParitta.hasNext()){
                                    System.out.println(ReadAbhayaParitta.nextLine());
                                    }
                                    break;
                                    case 11:
                                    FileReader SumangalaGathaIIRead = new FileReader("SumangalaGathaII.txt");
                                    BufferedReader SumangalaGathaIITxt = new BufferedReader(SumangalaGathaIIRead);
                                    Scanner ReadSumangalaGatha = new Scanner(SumangalaGathaIITxt);
                                    while(ReadSumangalaGatha.hasNext()){
                                    System.out.println(ReadSumangalaGatha.nextLine());
                                    }
                                    break;
                                    }

                                pilihLanjut = GetYesOrNot("Apakah anda ingin melanjutkan");

                            }
                            break;
                        case 2:
                            //Menjelang Kelahiran
                            boolean pilihkah = true;
                            int pilihKw;
                            while(pilihkah){
                                System.out.println("1. Pubbabhaganamakara");
                                System.out.println("2. Saranagamana Patha");
                                System.out.println("3. Saccakiriya Gatha");
                                System.out.println("4. Angulimala Paritta (satu atau tiga kali)");
                                System.out.println("5. Buddhanussati");
                                System.out.println("6. Dhammanussati");
                                System.out.println("7. Sanghanussati");
                                System.out.println("8. Sakkatvatiadi Gatha");
                                System.out.println("9. Sumangala Gatha II (pemercikan tirta)");
                                System.out.print("Pilihan anda : ");
                                pilihKw = terminalInput.nextInt();
                                switch(pilihKw){
                                    case 1:
                                    FileReader PubbabhaganamakaraRead = new FileReader("Pubbabhaganamakara.txt");
                                    BufferedReader PubbabhaganamakaraTxt = new BufferedReader(PubbabhaganamakaraRead);
                                    Scanner ReadPubbabhaganamakara = new Scanner(PubbabhaganamakaraTxt);
                                    while(ReadPubbabhaganamakara.hasNext()){
                                        System.out.println(ReadPubbabhaganamakara.nextLine());
                                    }
                                        break;
                                    case 2:
                                    FileReader SaranagamanaPathaRead = new FileReader("Saranagamana.txt");
                                    BufferedReader SaranagamanaPathaTxt = new BufferedReader(SaranagamanaPathaRead);
                                    Scanner ReadSaranagamanaPatha = new Scanner(SaranagamanaPathaTxt);
                                    while(ReadSaranagamanaPatha.hasNext()){
                                        System.out.println(ReadSaranagamanaPatha.nextLine());
                                    }
                                    break;
                                    case 3:
                                    FileReader SaccakiriyaRead = new FileReader("SaccakiriyaGatha.txt");
                                    BufferedReader SaccakiriyaTxt = new BufferedReader(SaccakiriyaRead);
                                    Scanner ReadSaccakiriya = new Scanner(SaccakiriyaTxt);
                                    while(ReadSaccakiriya.hasNext()){
                                        System.out.println(ReadSaccakiriya.nextLine());
                                    }
                                    break;
                                    case 4:
                                    FileReader AngulimalaParittaRead = new FileReader("AngulimalaParitta.txt");
                                    BufferedReader AngulimalaParittaTxt = new BufferedReader(AngulimalaParittaRead);
                                    Scanner ReadAngulimalaParitta = new Scanner(AngulimalaParittaTxt);
                                    while(ReadAngulimalaParitta.hasNext()){
                                        System.out.println(ReadAngulimalaParitta.nextLine());
                                    }
                                    case 5:
                                    FileReader BuddhanussatiRead = new FileReader("Buddhanussati.txt");
                                    BufferedReader BuddhanussatiTxt = new BufferedReader(BuddhanussatiRead);
                                    Scanner ReadBuddhanussati = new Scanner(BuddhanussatiTxt);
                                    while(ReadBuddhanussati.hasNext()){
                                    System.out.println(ReadBuddhanussati.nextLine());
                                    }
                                    break;
                                    case 6:
                                    FileReader DhammanussatiRead = new FileReader("Dhammanussati.txt");
                                    BufferedReader DhammanussatiTxt = new BufferedReader(DhammanussatiRead);
                                    Scanner ReadDhammanussati = new Scanner(DhammanussatiTxt);
                                    while(ReadDhammanussati.hasNext()){
                                    System.out.println(ReadDhammanussati.nextLine());
                                    }
                                    break;
                                    case 7:
                                    FileReader SanghanussatiRead = new FileReader("Sanghanussati.txt");
                                    BufferedReader SanghanussatiTxt = new BufferedReader(SanghanussatiRead);
                                    Scanner ReadSanghanussati = new Scanner(SanghanussatiTxt);
                                    while(ReadSanghanussati.hasNext()){
                                    System.out.println(ReadSanghanussati.nextLine());
                                    }
                                    break;
                                    case 8:
                                    FileReader SakkatvatiadiRead = new FileReader("Sakkatvatiadi.txt");
                                    BufferedReader SakkatvatiadiTxt = new BufferedReader(SakkatvatiadiRead);
                                    Scanner ReadSakkatvatiadi = new Scanner(SakkatvatiadiTxt);
                                    while(ReadSakkatvatiadi.hasNext()){
                                    System.out.println(ReadSakkatvatiadi.nextLine());
                                    }
                                    break;
                                    case 9:
                                    FileReader SumangalaGathaIIRead = new FileReader("SumangalaGathaII.txt");
                                    BufferedReader SumangalaGathaIITxt = new BufferedReader(SumangalaGathaIIRead);
                                    Scanner ReadSumangalaGatha = new Scanner(SumangalaGathaIITxt);
                                    while(ReadSumangalaGatha.hasNext()){
                                    System.out.println(ReadSumangalaGatha.nextLine());
                                    }
                                    break;
                                    }

                                pilihkah = GetYesOrNot("Apakah anda ingin melanjutkan");

                                }
                            break;
                        case 3:
                            //Pemberkatan Kelahiran
                            boolean pilihkah1 = true;
                            int pilihKw1;
                            while(pilihkah1){
                                System.out.println("1. Pubbabhaganamakara");
                                System.out.println("2. Saranagamana Patha");
                                System.out.println("3. Buddhanussati");
                                System.out.println("4. Dhammanussati");
                                System.out.println("5. Sanghanussati");
                                System.out.println("6. Culamangalacakkavala Gatha");
                                System.out.println("7. So Attaladdhotiadi Gatha(syair pertama untuk pria; syair kedua untuk wanita; syair ketiga untuk bayi kembar; satu syair di baca tiga kali)");
                                System.out.println("8. Sumangala Gatha II (pemercikan tirta)");
                                System.out.print("Pilihan anda : ");
                                pilihKw1 = terminalInput.nextInt();
                                switch(pilihKw1){
                                    case 1:
                                    FileReader PubbabhaganamakaraRead = new FileReader("Pubbabhaganamakara.txt");
                                    BufferedReader PubbabhaganamakaraTxt = new BufferedReader(PubbabhaganamakaraRead);
                                    Scanner ReadPubbabhaganamakara = new Scanner(PubbabhaganamakaraTxt);
                                    while(ReadPubbabhaganamakara.hasNext()){
                                        System.out.println(ReadPubbabhaganamakara.nextLine());
                                    }
                                        break;
                                    case 2:
                                    FileReader SaranagamanaPathaRead = new FileReader("Saranagamana.txt");
                                    BufferedReader SaranagamanaPathaTxt = new BufferedReader(SaranagamanaPathaRead);
                                    Scanner ReadSaranagamanaPatha = new Scanner(SaranagamanaPathaTxt);
                                    while(ReadSaranagamanaPatha.hasNext()){
                                        System.out.println(ReadSaranagamanaPatha.nextLine());
                                    }
                                    break;
                                    case 3:
                                    FileReader BuddhanussatiRead = new FileReader("Buddhanussati.txt");
                                    BufferedReader BuddhanussatiTxt = new BufferedReader(BuddhanussatiRead);
                                    Scanner ReadBuddhanussati = new Scanner(BuddhanussatiTxt);
                                    while(ReadBuddhanussati.hasNext()){
                                    System.out.println(ReadBuddhanussati.nextLine());
                                    }
                                    break;
                                    case 4:
                                    FileReader DhammanussatiRead = new FileReader("Dhammanussati.txt");
                                    BufferedReader DhammanussatiTxt = new BufferedReader(DhammanussatiRead);
                                    Scanner ReadDhammanussati = new Scanner(DhammanussatiTxt);
                                    while(ReadDhammanussati.hasNext()){
                                    System.out.println(ReadDhammanussati.nextLine());
                                    }
                                    break;
                                    case 5:
                                    FileReader SanghanussatiRead = new FileReader("Sanghanussati.txt");
                                    BufferedReader SanghanussatiTxt = new BufferedReader(SanghanussatiRead);
                                    Scanner ReadSanghanussati = new Scanner(SanghanussatiTxt);
                                    while(ReadSanghanussati.hasNext()){
                                    System.out.println(ReadSanghanussati.nextLine());
                                    }
                                    break;
                                    case 6:
                                    FileReader CulamangalacakkavalaGathaRead = new FileReader("CulamangalacakkavalaGatha.txt");
                                    BufferedReader CulamangalacakkavalaGathaTxt = new BufferedReader(CulamangalacakkavalaGathaRead);
                                    Scanner ReadCulamangalacakkavalaGatha = new Scanner(CulamangalacakkavalaGathaTxt);
                                    while(ReadCulamangalacakkavalaGatha.hasNext()){
                                    System.out.println(ReadCulamangalacakkavalaGatha.nextLine());
                                    }
                                    break;
                                    case 7:
                                    FileReader SoAttaladdhotiadiGathaRead = new FileReader("SoAttaladdhotiadiGatha.txt");
                                    BufferedReader SoAttaladdhotiadiGathaTxt = new BufferedReader(SoAttaladdhotiadiGathaRead);
                                    Scanner ReadSoAttaladdhotiadiGatha = new Scanner(SoAttaladdhotiadiGathaTxt);
                                    while(ReadSoAttaladdhotiadiGatha.hasNext()){
                                    System.out.println(ReadSoAttaladdhotiadiGatha.nextLine());
                                    }
                                    break;
                                    case 8:
                                    FileReader SumangalaGathaIIRead = new FileReader("SumangalaGathaII.txt");
                                    BufferedReader SumangalaGathaIITxt = new BufferedReader(SumangalaGathaIIRead);
                                    Scanner ReadSumangalaGatha = new Scanner(SumangalaGathaIITxt);
                                    while(ReadSumangalaGatha.hasNext()){
                                    System.out.println(ReadSumangalaGatha.nextLine());
                                    }
                                    break;
                                    }

                                pilihkah1 = GetYesOrNot("Apakah anda ingin melanjutkan");

                                }
                            break;
                        case 4:
                            //Ulang Tahun, Turun Tanah
                            boolean pilihkah2 = true;
                            int pilihKw2;
                            while(pilihkah2){
                                System.out.println("1. Pubbabhaganamakara");
                                System.out.println("2. Saranagamana Patha");
                                System.out.println("3. Mangalasutta Gatha");
                                System.out.println("4. So Attaladdhotiadi Gatha(syair pertama untuk pria; syair kedua untuk wanita; syair ketiga untuk bayi kembar; satu syair di baca tiga kali)");
                                System.out.println("5. Mahajayamangala Gatha");
                                System.out.println("6. Sumangala Gatha I (pemercikan tirta)");
                                System.out.print("Pilihan anda : ");
                                pilihKw2 = terminalInput.nextInt();
                                switch(pilihKw2){
                                    case 1:
                                    FileReader PubbabhaganamakaraRead = new FileReader("Pubbabhaganamakara.txt");
                                    BufferedReader PubbabhaganamakaraTxt = new BufferedReader(PubbabhaganamakaraRead);
                                    Scanner ReadPubbabhaganamakara = new Scanner(PubbabhaganamakaraTxt);
                                    while(ReadPubbabhaganamakara.hasNext()){
                                        System.out.println(ReadPubbabhaganamakara.nextLine());
                                    }
                                        break;
                                    case 2:
                                    FileReader SaranagamanaPathaRead = new FileReader("Saranagamana.txt");
                                    BufferedReader SaranagamanaPathaTxt = new BufferedReader(SaranagamanaPathaRead);
                                    Scanner ReadSaranagamanaPatha = new Scanner(SaranagamanaPathaTxt);
                                    while(ReadSaranagamanaPatha.hasNext()){
                                        System.out.println(ReadSaranagamanaPatha.nextLine());
                                    }
                                    break;
                                    case 3:
                                    FileReader MangalasuttaRead = new FileReader("Mangalasutta.txt");
                                    BufferedReader MangalasuttaTxt = new BufferedReader(MangalasuttaRead);
                                    Scanner ReadMangalasutta = new Scanner(MangalasuttaTxt);
                                    while(ReadMangalasutta.hasNext()){
                                        System.out.println(ReadMangalasutta.nextLine());
                                    }
                                    break;
                                    case 4:
                                    FileReader SoAttaladdhotiadiGathaRead = new FileReader("SoAttaladdhotiadiGatha.txt");
                                    BufferedReader SoAttaladdhotiadiGathaTxt = new BufferedReader(SoAttaladdhotiadiGathaRead);
                                    Scanner ReadSoAttaladdhotiadiGatha = new Scanner(SoAttaladdhotiadiGathaTxt);
                                    while(ReadSoAttaladdhotiadiGatha.hasNext()){
                                    System.out.println(ReadSoAttaladdhotiadiGatha.nextLine());
                                    }
                                    break;
                                    case 5:
                                    FileReader MahajayamangalaGathaRead = new FileReader("MahajayamangalaGatha.txt");
                                    BufferedReader MahajayamangalaGathaTxt = new BufferedReader(MahajayamangalaGathaRead);
                                    Scanner ReadMahajayamangalaGatha = new Scanner(MahajayamangalaGathaTxt);
                                    while(ReadMahajayamangalaGatha.hasNext()){
                                    System.out.println(ReadMahajayamangalaGatha.nextLine());
                                    }
                                    break;
                                    case 6:
                                    FileReader SumangalaGathaIRead = new FileReader("SumangalaGathaI.txt");
                                    BufferedReader SumangalaGathaITxt = new BufferedReader(SumangalaGathaIRead);
                                    Scanner ReadSumangalaGathaI = new Scanner(SumangalaGathaITxt);
                                    while(ReadSumangalaGathaI.hasNext()){
                                    System.out.println(ReadSumangalaGathaI.nextLine());
                                    }
                                    break;
                                }

                                pilihkah2 = GetYesOrNot("Apakah anda ingin melanjutkan");

                                }
                            break;
                        case 5:    
                            // Potong Rambut
                            boolean pilihkah3 = true;
                            int pilihKw3;
                            while(pilihkah3){
                                System.out.println("A. Sebelum Potong Rambut");
                                System.out.println("1. Pubbabhaganamakara");
                                System.out.println("2. Buddhanussati");
                                System.out.println("3. Dhammanussati");
                                System.out.println("4. Sanghanussati");
                                System.out.println("5. Abhaya Paritta");
                                System.out.println("6. So Attaladdhotiadi Gatha(syair pertama untuk pria; syair kedua untuk wanita; syair ketiga untuk bayi kembar; satu syair di baca tiga kali)");
                                System.out.println("B. Saat dipotong");
                                System.out.println("7. Jaya Paritta");
                                System.out.println("8. Sumangala Gatha I (pemercikan tirta)");
                                System.out.print("Pilihan anda : ");
                                pilihKw3 = terminalInput.nextInt();
                                switch(pilihKw3){
                                    case 1:
                                    FileReader PubbabhaganamakaraRead = new FileReader("Pubbabhaganamakara.txt");
                                    BufferedReader PubbabhaganamakaraTxt = new BufferedReader(PubbabhaganamakaraRead);
                                    Scanner ReadPubbabhaganamakara = new Scanner(PubbabhaganamakaraTxt);
                                    while(ReadPubbabhaganamakara.hasNext()){
                                        System.out.println(ReadPubbabhaganamakara.nextLine());
                                    }
                                        break;
                                    case 2:
                                    FileReader BuddhanussatiRead = new FileReader("Buddhanussati.txt");
                                    BufferedReader BuddhanussatiTxt = new BufferedReader(BuddhanussatiRead);
                                    Scanner ReadBuddhanussati = new Scanner(BuddhanussatiTxt);
                                    while(ReadBuddhanussati.hasNext()){
                                    System.out.println(ReadBuddhanussati.nextLine());
                                    }
                                    break;
                                    case 3:
                                    FileReader DhammanussatiRead = new FileReader("Dhammanussati.txt");
                                    BufferedReader DhammanussatiTxt = new BufferedReader(DhammanussatiRead);
                                    Scanner ReadDhammanussati = new Scanner(DhammanussatiTxt);
                                    while(ReadDhammanussati.hasNext()){
                                    System.out.println(ReadDhammanussati.nextLine());
                                    }
                                    break;
                                    case 4:
                                    FileReader SanghanussatiRead = new FileReader("Sanghanussati.txt");
                                    BufferedReader SanghanussatiTxt = new BufferedReader(SanghanussatiRead);
                                    Scanner ReadSanghanussati = new Scanner(SanghanussatiTxt);
                                    while(ReadSanghanussati.hasNext()){
                                    System.out.println(ReadSanghanussati.nextLine());
                                    }
                                    break;
                                    case 5:
                                    FileReader AbhayaParittaRead = new FileReader("AbhayaParitta.txt");
                                    BufferedReader AbhayaParittaTxt = new BufferedReader(AbhayaParittaRead);
                                    Scanner ReadAbhayaParitta = new Scanner(AbhayaParittaTxt);
                                    while(ReadAbhayaParitta.hasNext()){
                                    System.out.println(ReadAbhayaParitta.nextLine());
                                    }
                                    break;
                                    case 6:
                                    FileReader SoAttaladdhotiadiGathaRead = new FileReader("SoAttaladdhotiadiGatha.txt");
                                    BufferedReader SoAttaladdhotiadiGathaTxt = new BufferedReader(SoAttaladdhotiadiGathaRead);
                                    Scanner ReadSoAttaladdhotiadiGatha = new Scanner(SoAttaladdhotiadiGathaTxt);
                                    while(ReadSoAttaladdhotiadiGatha.hasNext()){
                                    System.out.println(ReadSoAttaladdhotiadiGatha.nextLine());
                                    }
                                    break;
                                    case 7:
                                    FileReader JayaParittaRead = new FileReader("JayaParitta.txt");
                                    BufferedReader JayaParittaTxt = new BufferedReader(JayaParittaRead);
                                    Scanner ReadJayaParitta = new Scanner(JayaParittaTxt);
                                    while(ReadJayaParitta.hasNext()){
                                    System.out.println(ReadJayaParitta.nextLine());
                                    }
                                    break;
                                    case 8:
                                    FileReader SumangalaGathaIRead = new FileReader("SumangalaGathaI.txt");
                                    BufferedReader SumangalaGathaITxt = new BufferedReader(SumangalaGathaIRead);
                                    Scanner ReadSumangalaGathaI = new Scanner(SumangalaGathaITxt);
                                    while(ReadSumangalaGathaI.hasNext()){
                                    System.out.println(ReadSumangalaGathaI.nextLine());
                                    }
                                    break;
                                    }

                                pilihkah3 = GetYesOrNot("Apakah anda ingin melanjutkan");
                                }

                            break;
                        case 6:
                            // Peletakan batu pertama
                            //Ulang Tahun, Turun Tanah
                            boolean pilihkah4 = true;
                            int pilihKw4;
                            while(pilihkah4){
                                System.out.println("Sebelum diletakkan");
                                System.out.println("1. Pubbabhaganamakara");
                                System.out.println("2. Saranagamana Patha");
                                System.out.println("3. Vattaka Paritta");
                                System.out.println("Saat diletakkan");
                                System.out.println("4. Jaya Paritta)");
                                System.out.println("5. Ratanattayānubhavādi Gāthā");
                                System.out.println("6. Sumangala Gatha I (pemercikan tirta)");
                                System.out.print("Pilihan anda : ");
                                pilihKw4 = terminalInput.nextInt();
                                switch(pilihKw4){
                                    case 1:
                                    FileReader PubbabhaganamakaraRead = new FileReader("Pubbabhaganamakara.txt");
                                    BufferedReader PubbabhaganamakaraTxt = new BufferedReader(PubbabhaganamakaraRead);
                                    Scanner ReadPubbabhaganamakara = new Scanner(PubbabhaganamakaraTxt);
                                    while(ReadPubbabhaganamakara.hasNext()){
                                        System.out.println(ReadPubbabhaganamakara.nextLine());
                                    }
                                        break;
                                    case 2:
                                    FileReader SaranagamanaPathaRead = new FileReader("Saranagamana.txt");
                                    BufferedReader SaranagamanaPathaTxt = new BufferedReader(SaranagamanaPathaRead);
                                    Scanner ReadSaranagamanaPatha = new Scanner(SaranagamanaPathaTxt);
                                    while(ReadSaranagamanaPatha.hasNext()){
                                        System.out.println(ReadSaranagamanaPatha.nextLine());
                                    }
                                    break;
                                    case 3:
                                    FileReader MangalasuttaRead = new FileReader("Mangalasutta.txt");
                                    BufferedReader MangalasuttaTxt = new BufferedReader(MangalasuttaRead);
                                    Scanner ReadMangalasutta = new Scanner(MangalasuttaTxt);
                                    while(ReadMangalasutta.hasNext()){
                                        System.out.println(ReadMangalasutta.nextLine());
                                    }
                                    break;
                                    case 4:
                                    FileReader JayaParittaRead = new FileReader("JayaParitta.txt");
                                    BufferedReader JayaParittaTxt = new BufferedReader(JayaParittaRead);
                                    Scanner ReadJayaParitta = new Scanner(JayaParittaTxt);
                                    while(ReadJayaParitta.hasNext()){
                                    System.out.println(ReadJayaParitta.nextLine());
                                    }
                                    break;
                                    case 5:
                                    FileReader RatanattayānubhavādiGāthāRead = new FileReader("RatanattayānubhavādiGāthā.txt");
                                    BufferedReader RatanattayānubhavādiGāthāTxt = new BufferedReader(RatanattayānubhavādiGāthāRead);
                                    Scanner ReadRatanattayānubhavādiGāthā = new Scanner(RatanattayānubhavādiGāthāTxt);
                                    while(ReadRatanattayānubhavādiGāthā.hasNext()){
                                    System.out.println(ReadRatanattayānubhavādiGāthā.nextLine());
                                    }
                                    break;
                                    case 6:
                                    FileReader SumangalaGathaIRead = new FileReader("SumangalaGathaI.txt");
                                    BufferedReader SumangalaGathaITxt = new BufferedReader(SumangalaGathaIRead);
                                    Scanner ReadSumangalaGathaI = new Scanner(SumangalaGathaITxt);
                                    while(ReadSumangalaGathaI.hasNext()){
                                    System.out.println(ReadSumangalaGathaI.nextLine());
                                    }
                                    break;
                                }

                                pilihkah4 = GetYesOrNot("Apakah anda ingin melanjutkan");

                                }
                            break;
                        case 7:
                            // Menempati Rumah Baru, Membuka Usaha Baru, dll.
                            boolean pilihLanjut1 = true;
                            int pilihApa1;
                            while(pilihLanjut1){
                                System.out.println("1. Pubbabhaganamakara");
                                System.out.println("2. Saranagamana Patha");
                                System.out.println("3. Buddhanussati");
                                System.out.println("4. Dhammanussati");
                                System.out.println("5. Sanghanussati");
                                System.out.println("6. Mangalasutta Gatha(Dimulai dari: Asevana ca balanam)");
                                System.out.println("7. Karaniyametta Sutta(Bait 8, 9, dan 10");
                                System.out.println("8. Mora Paritta");
                                System.out.println("9. Culamangalacakkavala Gatha");
                                System.out.println("10. Jaya Paritta");
                                System.out.println("11. Sumangala Gatha I (pemercikan tirta)");
                                System.out.print("Pilihan anda : ");
                                pilihApa1 = terminalInput.nextInt();
                                switch(pilihApa1){
                                    case 1:
                                    FileReader PubbabhaganamakaraRead = new FileReader("Pubbabhaganamakara.txt");
                                    BufferedReader PubbabhaganamakaraTxt = new BufferedReader(PubbabhaganamakaraRead);
                                    Scanner ReadPubbabhaganamakara = new Scanner(PubbabhaganamakaraTxt);
                                    while(ReadPubbabhaganamakara.hasNext()){
                                        System.out.println(ReadPubbabhaganamakara.nextLine());
                                    }
                                        break;
                                    case 2:
                                    FileReader SaranagamanaPathaRead = new FileReader("Saranagamana.txt");
                                    BufferedReader SaranagamanaPathaTxt = new BufferedReader(SaranagamanaPathaRead);
                                    Scanner ReadSaranagamanaPatha = new Scanner(SaranagamanaPathaTxt);
                                    while(ReadSaranagamanaPatha.hasNext()){
                                        System.out.println(ReadSaranagamanaPatha.nextLine());
                                    }
                                    break;
                                    case 3:
                                    FileReader BuddhanussatiRead = new FileReader("Buddhanussati.txt");
                                    BufferedReader BuddhanussatiTxt = new BufferedReader(BuddhanussatiRead);
                                    Scanner ReadBuddhanussati = new Scanner(BuddhanussatiTxt);
                                    while(ReadBuddhanussati.hasNext()){
                                    System.out.println(ReadBuddhanussati.nextLine());
                                    }
                                    break;
                                    case 4:
                                    FileReader DhammanussatiRead = new FileReader("Dhammanussati.txt");
                                    BufferedReader DhammanussatiTxt = new BufferedReader(DhammanussatiRead);
                                    Scanner ReadDhammanussati = new Scanner(DhammanussatiTxt);
                                    while(ReadDhammanussati.hasNext()){
                                    System.out.println(ReadDhammanussati.nextLine());
                                    }
                                    break;
                                    case 5:
                                    FileReader SanghanussatiRead = new FileReader("Sanghanussati.txt");
                                    BufferedReader SanghanussatiTxt = new BufferedReader(SanghanussatiRead);
                                    Scanner ReadSanghanussati = new Scanner(SanghanussatiTxt);
                                    while(ReadSanghanussati.hasNext()){
                                    System.out.println(ReadSanghanussati.nextLine());
                                    }
                                    break;
                                    case 6:
                                    FileReader MangalasuttaRead = new FileReader("Mangalasutta.txt");
                                    BufferedReader MangalasuttaTxt = new BufferedReader(MangalasuttaRead);
                                    Scanner ReadMangalasutta = new Scanner(MangalasuttaTxt);
                                    while(ReadMangalasutta.hasNext()){
                                        System.out.println(ReadMangalasutta.nextLine());
                                    }
                                    break;
                                    case 7:
                                    FileReader KaraniyamettasuttaRead = new FileReader("Karaniyamettasutta.txt");
                                    BufferedReader KaraniyamettasuttaTxt = new BufferedReader(KaraniyamettasuttaRead);
                                    Scanner ReadKaraniyamettasutta = new Scanner(KaraniyamettasuttaTxt);
                                    while(ReadKaraniyamettasutta.hasNext()){
                                        System.out.println(ReadKaraniyamettasutta.nextLine());
                                    }
                                    break;
                                    case 8:
                                    FileReader MoraParittaRead = new FileReader("MoraParitta.txt");
                                    BufferedReader MoraParittaTxt = new BufferedReader(MoraParittaRead);
                                    Scanner ReadMoraParitta = new Scanner(MoraParittaTxt);
                                    while(ReadMoraParitta.hasNext()){
                                        System.out.println(ReadMoraParitta.nextLine());
                                    }
                                    break;
                                    case 9:
                                    FileReader CulamangalacakkavalaGathaRead = new FileReader("CulamangalacakkavalaGatha.txt");
                                    BufferedReader CulamangalacakkavalaGathaTxt = new BufferedReader(CulamangalacakkavalaGathaRead);
                                    Scanner ReadCulamangalacakkavalaGatha = new Scanner(CulamangalacakkavalaGathaTxt);
                                    while(ReadCulamangalacakkavalaGatha.hasNext()){
                                    System.out.println(ReadCulamangalacakkavalaGatha.nextLine());
                                    }
                                    break;
                                    case 10:
                                    FileReader JayaParittaRead = new FileReader("JayaParitta.txt");
                                    BufferedReader JayaParittaTxt = new BufferedReader(JayaParittaRead);
                                    Scanner ReadJayaParitta = new Scanner(JayaParittaTxt);
                                    while(ReadJayaParitta.hasNext()){
                                    System.out.println(ReadJayaParitta.nextLine());
                                    }
                                    break;
                                    case 11:
                                    FileReader SumangalaGathaIRead = new FileReader("SumangalaGathaI.txt");
                                    BufferedReader SumangalaGathaITxt = new BufferedReader(SumangalaGathaIRead);
                                    Scanner ReadSumangalaGathaI = new Scanner(SumangalaGathaITxt);
                                    while(ReadSumangalaGathaI.hasNext()){
                                    System.out.println(ReadSumangalaGathaI.nextLine());
                                    }
                                    break;
                                    }
                                    

                                pilihLanjut1 = GetYesOrNot("Apakah anda ingin melanjutkan");

                            }
                            break;
                        case 8:
                            // Pembersihan Suasana / Tempat
                            boolean pilihLanjut2 = true;
                            int pilihApa2;
                            while(pilihLanjut2){
                                System.out.println("1. Pubbabhaganamakara");
                                System.out.println("2. Saranagamana Patha");
                                System.out.println("3. Buddhanussati");
                                System.out.println("4. Dhammanussati");
                                System.out.println("5. Sanghanussati");
                                System.out.println("6. Saccakiriya Gatha");
                                System.out.println("7. Karaniyametta Sutta(Bait 8, 9, dan 10");
                                System.out.println("8. Khandha Paritta(Dimulai dari: Appamano Buddho ...)");
                                System.out.println("9. Atanatiya Paritta");
                                System.out.println("10. Abhaya Paritta atau Dhajagga Paritta");
                                System.out.println("11. Sumangala Gatha II (pemercikan tirta)");
                                System.out.print("Pilihan anda : ");
                                pilihApa2 = terminalInput.nextInt();
                                switch(pilihApa2){
                                    case 1:
                                    FileReader PubbabhaganamakaraRead = new FileReader("Pubbabhaganamakara.txt");
                                    BufferedReader PubbabhaganamakaraTxt = new BufferedReader(PubbabhaganamakaraRead);
                                    Scanner ReadPubbabhaganamakara = new Scanner(PubbabhaganamakaraTxt);
                                    while(ReadPubbabhaganamakara.hasNext()){
                                        System.out.println(ReadPubbabhaganamakara.nextLine());
                                    }
                                        break;
                                    case 2:
                                    FileReader SaranagamanaPathaRead = new FileReader("Saranagamana.txt");
                                    BufferedReader SaranagamanaPathaTxt = new BufferedReader(SaranagamanaPathaRead);
                                    Scanner ReadSaranagamanaPatha = new Scanner(SaranagamanaPathaTxt);
                                    while(ReadSaranagamanaPatha.hasNext()){
                                        System.out.println(ReadSaranagamanaPatha.nextLine());
                                    }
                                    break;
                                    case 3:
                                    FileReader BuddhanussatiRead = new FileReader("Buddhanussati.txt");
                                    BufferedReader BuddhanussatiTxt = new BufferedReader(BuddhanussatiRead);
                                    Scanner ReadBuddhanussati = new Scanner(BuddhanussatiTxt);
                                    while(ReadBuddhanussati.hasNext()){
                                    System.out.println(ReadBuddhanussati.nextLine());
                                    }
                                    break;
                                    case 4:
                                    FileReader DhammanussatiRead = new FileReader("Dhammanussati.txt");
                                    BufferedReader DhammanussatiTxt = new BufferedReader(DhammanussatiRead);
                                    Scanner ReadDhammanussati = new Scanner(DhammanussatiTxt);
                                    while(ReadDhammanussati.hasNext()){
                                    System.out.println(ReadDhammanussati.nextLine());
                                    }
                                    break;
                                    case 5:
                                    FileReader SanghanussatiRead = new FileReader("Sanghanussati.txt");
                                    BufferedReader SanghanussatiTxt = new BufferedReader(SanghanussatiRead);
                                    Scanner ReadSanghanussati = new Scanner(SanghanussatiTxt);
                                    while(ReadSanghanussati.hasNext()){
                                    System.out.println(ReadSanghanussati.nextLine());
                                    }
                                    break;
                                    case 6:
                                    FileReader SaccakiriyaRead = new FileReader("SaccakiriyaGatha.txt");
                                    BufferedReader SaccakiriyaTxt = new BufferedReader(SaccakiriyaRead);
                                    Scanner ReadSaccakiriya = new Scanner(SaccakiriyaTxt);
                                    while(ReadSaccakiriya.hasNext()){
                                        System.out.println(ReadSaccakiriya.nextLine());
                                    }
                                    break;
                                    case 7:
                                    FileReader KaraniyamettasuttaRead = new FileReader("Karaniyamettasutta.txt");
                                    BufferedReader KaraniyamettasuttaTxt = new BufferedReader(KaraniyamettasuttaRead);
                                    Scanner ReadKaraniyamettasutta = new Scanner(KaraniyamettasuttaTxt);
                                    while(ReadKaraniyamettasutta.hasNext()){
                                        System.out.println(ReadKaraniyamettasutta.nextLine());
                                    }
                                    break;
                                    case 8:
                                    FileReader KhandhaParittaRead = new FileReader("KhandhaParitta.txt");
                                    BufferedReader KhandhaParittaTxt = new BufferedReader(KhandhaParittaRead);
                                    Scanner ReadKhandhaParitta = new Scanner(KhandhaParittaTxt);
                                    while(ReadKhandhaParitta.hasNext()){
                                        System.out.println(ReadKhandhaParitta.nextLine());
                                    }
                                    break;
                                    case 9:
                                    FileReader AtanatiyaParittaRead = new FileReader("AtanatiyaParitta.txt");
                                    BufferedReader AtanatiyaParittaTxt = new BufferedReader(AtanatiyaParittaRead);
                                    Scanner ReadAtanatiyaParitta = new Scanner(AtanatiyaParittaTxt);
                                    while(ReadAtanatiyaParitta.hasNext()){
                                    System.out.println(ReadAtanatiyaParitta.nextLine());
                                    }
                                    break;
                                    case 10:
                                    FileReader AbhayaParittaRead = new FileReader("AbhayaParitta.txt");
                                    BufferedReader AbhayaParittaTxt = new BufferedReader(AbhayaParittaRead);
                                    Scanner ReadAbhayaParitta = new Scanner(AbhayaParittaTxt);
                                    while(ReadAbhayaParitta.hasNext()){
                                    System.out.println(ReadAbhayaParitta.nextLine());
                                    }
                                    break;
                                    case 11:
                                    FileReader SumangalaGathaIIRead = new FileReader("SumangalaGathaII.txt");
                                    BufferedReader SumangalaGathaIITxt = new BufferedReader(SumangalaGathaIIRead);
                                    Scanner ReadSumangalaGatha = new Scanner(SumangalaGathaIITxt);
                                    while(ReadSumangalaGatha.hasNext()){
                                    System.out.println(ReadSumangalaGatha.nextLine());
                                    }
                                    break;
                                    }
                                    

                                pilihLanjut2 = GetYesOrNot("Apakah anda ingin melanjutkan");
                            }
                            break;
                        case 9:
                            // Tirta Untuk Orang Sakit
                            boolean pilihLanjut3 = true;
                            int pilihApa3;
                            while(pilihLanjut3){
                                System.out.println("1. Pubbabhaganamakara");
                                System.out.println("2. Saranagamana Patha");
                                System.out.println("3. Buddhanussati");
                                System.out.println("4. Dhammanussati");
                                System.out.println("5. Sanghanussati");
                                System.out.println("6. Saccakiriya Gatha");
                                System.out.println("8. Ratana Sutta (Bait 3, 4, 5, 6, 7, dan 14");
                                System.out.println("7. Karaniyametta Sutta(Bait 8, 9, dan 10");
                                System.out.println("9. Bojjhanga Paritta");
                                System.out.println("10. Sakkatvatiadi Gatha");
                                System.out.println("11. Sumangala Gatha II (pemercikan tirta)");
                                System.out.print("Pilihan anda : ");
                                pilihApa3 = terminalInput.nextInt();
                                switch(pilihApa3){
                                    case 1:
                                    FileReader PubbabhaganamakaraRead = new FileReader("Pubbabhaganamakara.txt");
                                    BufferedReader PubbabhaganamakaraTxt = new BufferedReader(PubbabhaganamakaraRead);
                                    Scanner ReadPubbabhaganamakara = new Scanner(PubbabhaganamakaraTxt);
                                    while(ReadPubbabhaganamakara.hasNext()){
                                        System.out.println(ReadPubbabhaganamakara.nextLine());
                                    }
                                        break;
                                    case 2:
                                    FileReader SaranagamanaPathaRead = new FileReader("Saranagamana.txt");
                                    BufferedReader SaranagamanaPathaTxt = new BufferedReader(SaranagamanaPathaRead);
                                    Scanner ReadSaranagamanaPatha = new Scanner(SaranagamanaPathaTxt);
                                    while(ReadSaranagamanaPatha.hasNext()){
                                        System.out.println(ReadSaranagamanaPatha.nextLine());
                                    }
                                    break;
                                    case 3:
                                    FileReader BuddhanussatiRead = new FileReader("Buddhanussati.txt");
                                    BufferedReader BuddhanussatiTxt = new BufferedReader(BuddhanussatiRead);
                                    Scanner ReadBuddhanussati = new Scanner(BuddhanussatiTxt);
                                    while(ReadBuddhanussati.hasNext()){
                                    System.out.println(ReadBuddhanussati.nextLine());
                                    }
                                    break;
                                    case 4:
                                    FileReader DhammanussatiRead = new FileReader("Dhammanussati.txt");
                                    BufferedReader DhammanussatiTxt = new BufferedReader(DhammanussatiRead);
                                    Scanner ReadDhammanussati = new Scanner(DhammanussatiTxt);
                                    while(ReadDhammanussati.hasNext()){
                                    System.out.println(ReadDhammanussati.nextLine());
                                    }
                                    break;
                                    case 5:
                                    FileReader SanghanussatiRead = new FileReader("Sanghanussati.txt");
                                    BufferedReader SanghanussatiTxt = new BufferedReader(SanghanussatiRead);
                                    Scanner ReadSanghanussati = new Scanner(SanghanussatiTxt);
                                    while(ReadSanghanussati.hasNext()){
                                    System.out.println(ReadSanghanussati.nextLine());
                                    }
                                    break;
                                    case 6:
                                    FileReader SaccakiriyaRead = new FileReader("SaccakiriyaGatha.txt");
                                    BufferedReader SaccakiriyaTxt = new BufferedReader(SaccakiriyaRead);
                                    Scanner ReadSaccakiriya = new Scanner(SaccakiriyaTxt);
                                    while(ReadSaccakiriya.hasNext()){
                                        System.out.println(ReadSaccakiriya.nextLine());
                                    }
                                    break;
                                    case 8:
                                    FileReader KaraniyamettasuttaRead = new FileReader("Karaniyamettasutta.txt");
                                    BufferedReader KaraniyamettasuttaTxt = new BufferedReader(KaraniyamettasuttaRead);
                                    Scanner ReadKaraniyamettasutta = new Scanner(KaraniyamettasuttaTxt);
                                    while(ReadKaraniyamettasutta.hasNext()){
                                        System.out.println(ReadKaraniyamettasutta.nextLine());
                                    }
                                    break;
                                    case 7:
                                    FileReader RatanaSuttaRead = new FileReader("RatanaSutta.txt");
                                    BufferedReader RatanaSuttaTxt = new BufferedReader(RatanaSuttaRead);
                                    Scanner ReadRatanaSutta = new Scanner(RatanaSuttaTxt);
                                    while(ReadRatanaSutta.hasNext()){
                                        System.out.println(ReadRatanaSutta.nextLine());
                                    }
                                    break;
                                    case 9:
                                    FileReader BojjhangaParittaRead = new FileReader("BojjhangaParitta.txt");
                                    BufferedReader BojjhangaParittaTxt = new BufferedReader(BojjhangaParittaRead);
                                    Scanner ReadBojjhangaParitta = new Scanner(BojjhangaParittaTxt);
                                    while(ReadBojjhangaParitta.hasNext()){
                                    System.out.println(ReadBojjhangaParitta.nextLine());
                                    }
                                    break;
                                    case 10:
                                    FileReader SakkatvatiadiGathaRead = new FileReader("SakkatvatiadiGatha.txt");
                                    BufferedReader SakkatvatiadiGathaTxt = new BufferedReader(SakkatvatiadiGathaRead);
                                    Scanner ReadSakkatvatiadiGatha = new Scanner(SakkatvatiadiGathaTxt);
                                    while(ReadSakkatvatiadiGatha.hasNext()){
                                    System.out.println(ReadSakkatvatiadiGatha.nextLine());
                                    }
                                    break;
                                    case 11:
                                    FileReader SumangalaGathaIIRead = new FileReader("SumangalaGathaII.txt");
                                    BufferedReader SumangalaGathaIITxt = new BufferedReader(SumangalaGathaIIRead);
                                    Scanner ReadSumangalaGatha = new Scanner(SumangalaGathaIITxt);
                                    while(ReadSumangalaGatha.hasNext()){
                                    System.out.println(ReadSumangalaGatha.nextLine());
                                    }
                                    break;
                                    }
                                    
                                pilihLanjut3 = GetYesOrNot("Apakah anda ingin melanjutkan");
                            }
                            break;
                        case 10:
                            // Tanam Di Sawah (Pemberkahan Benih)
                             //Ulang Tahun, Turun Tanah
                             boolean pilihkah5 = true;
                             int pilihKw5;
                             while(pilihkah5){
                                 System.out.println("1. Pubbabhaganamakara");
                                 System.out.println("2. Saranagamana Patha");
                                 System.out.println("3. Mangalasutta Gatha");
                                 System.out.println("4. Khandha Paritta)");
                                 System.out.println("5. Mahajayamangala Gatha");
                                 System.out.println("6. Sumangala Gatha II (pemercikan tirta)");
                                 System.out.print("Pilihan anda : ");
                                 pilihKw5 = terminalInput.nextInt();
                                 switch(pilihKw5){
                                     case 1:
                                     FileReader PubbabhaganamakaraRead = new FileReader("Pubbabhaganamakara.txt");
                                     BufferedReader PubbabhaganamakaraTxt = new BufferedReader(PubbabhaganamakaraRead);
                                     Scanner ReadPubbabhaganamakara = new Scanner(PubbabhaganamakaraTxt);
                                     while(ReadPubbabhaganamakara.hasNext()){
                                         System.out.println(ReadPubbabhaganamakara.nextLine());
                                     }
                                         break;
                                     case 2:
                                     FileReader SaranagamanaPathaRead = new FileReader("Saranagamana.txt");
                                     BufferedReader SaranagamanaPathaTxt = new BufferedReader(SaranagamanaPathaRead);
                                     Scanner ReadSaranagamanaPatha = new Scanner(SaranagamanaPathaTxt);
                                     while(ReadSaranagamanaPatha.hasNext()){
                                         System.out.println(ReadSaranagamanaPatha.nextLine());
                                     }
                                     break;
                                     case 3:
                                     FileReader MangalasuttaRead = new FileReader("Mangalasutta.txt");
                                     BufferedReader MangalasuttaTxt = new BufferedReader(MangalasuttaRead);
                                     Scanner ReadMangalasutta = new Scanner(MangalasuttaTxt);
                                     while(ReadMangalasutta.hasNext()){
                                         System.out.println(ReadMangalasutta.nextLine());
                                     }
                                     break;
                                     case 4:
                                     FileReader KhandhaParittaRead = new FileReader("KhandhaParitta.txt");
                                     BufferedReader KhandhaParittaTxt = new BufferedReader(KhandhaParittaRead);
                                     Scanner ReadKhandhaParitta = new Scanner(KhandhaParittaTxt);
                                     while(ReadKhandhaParitta.hasNext()){
                                     System.out.println(ReadKhandhaParitta.nextLine());
                                     }
                                     break;
                                     case 5:
                                     FileReader MahajayamangalaGathaRead = new FileReader("MahajayamangalaGatha.txt");
                                     BufferedReader MahajayamangalaGathaTxt = new BufferedReader(MahajayamangalaGathaRead);
                                     Scanner ReadMahajayamangalaGatha = new Scanner(MahajayamangalaGathaTxt);
                                     while(ReadMahajayamangalaGatha.hasNext()){
                                     System.out.println(ReadMahajayamangalaGatha.nextLine());
                                     }
                                     break;
                                     case 6:
                                     FileReader SumangalaGathaIIRead = new FileReader("SumangalaGathaII.txt");
                                     BufferedReader SumangalaGathaIITxt = new BufferedReader(SumangalaGathaIIRead);
                                     Scanner ReadSumangalaGatha = new Scanner(SumangalaGathaIITxt);
                                     while(ReadSumangalaGatha.hasNext()){
                                     System.out.println(ReadSumangalaGatha.nextLine());
                                     }
                                     break;
                                    }      
                                    pilihkah5 = GetYesOrNot("Apakah Anda Ingin Melanjutkan");          
                                }
                                break;
                        case 11:
                            // Pengukuhan Janji Jabatan
                            FileReader PengukuhanJanjiJabatanRead = new FileReader("PengukuhanJanjiJabatan.txt");
                            BufferedReader PengukuhanJanjiJabatanTxt = new BufferedReader(PengukuhanJanjiJabatanRead);
                            Scanner ReadPengukuhanJanjiJabatan = new Scanner(PengukuhanJanjiJabatanTxt);
                            while(ReadPengukuhanJanjiJabatan.hasNext()){
                            System.out.println(ReadPengukuhanJanjiJabatan.nextLine());
                            }
                            break;
                        case 12:
                            // Pengukuhan Janji di Pengadilan
                            FileReader PengukuhanJanjiDiPengadilanRead = new FileReader("PengukuhanJanjiDiPengadilan.txt");
                            BufferedReader PengukuhanJanjiDiPengadilanTxt = new BufferedReader(PengukuhanJanjiDiPengadilanRead);
                            Scanner ReadPengukuhanJanjiDiPengadilan = new Scanner(PengukuhanJanjiDiPengadilanTxt);
                            while(ReadPengukuhanJanjiDiPengadilan.hasNext()){
                            System.out.println(ReadPengukuhanJanjiDiPengadilan.nextLine());
                            }
                            break;
                        case 13:
                            // Wisuda Upasaka/Upasika
                            FileReader WisudaUpasakaUpasikaRead = new FileReader("WisudaUpasakaUpasika.txt");
                            BufferedReader WisudaUpasakaUpasikaTxt = new BufferedReader(WisudaUpasakaUpasikaRead);
                            Scanner ReadWisudaUpasakaUpasika = new Scanner(WisudaUpasakaUpasikaTxt);
                            while(ReadWisudaUpasakaUpasika.hasNext()){
                            System.out.println(ReadWisudaUpasakaUpasika.nextLine());
                            }
                            break;
                        case 14:
                            // Upacara Perkawinan
                            FileReader UpacaraPerkawinanRead = new FileReader("UpacaraPerkawinan.txt");
                            BufferedReader UpacaraPerkawinanTxt = new BufferedReader(UpacaraPerkawinanRead);
                            Scanner ReadUpacaraPerkawinan = new Scanner(UpacaraPerkawinanTxt);
                            while(ReadUpacaraPerkawinan.hasNext()){
                            System.out.println(ReadUpacaraPerkawinan.nextLine());
                            }
                            break;
                        case 15:
                            // Upacara Kematian
                            boolean pilihkah6 = true;
                            int pilihKw6;
                            while(pilihkah6){
                                System.out.println("1. Membersihkan Jenazah");
                                System.out.println("2. Menjelang Diberangkatkan Ke Makam Atau Ke Perabuan");
                                System.out.println("3. Di Pemakaman Atau Di Perabuan");
                                System.out.println("4. Perihal Makam Dan Abu");
                                System.out.print("Pilihan Anda: ");
                                pilihKw6 = terminalInput.nextInt();
                                switch(pilihKw6){
                                    case 1:
                                    boolean pilihkah7 = true;
                                    int pilihKw7;
                                    while(pilihkah7){
                                        System.out.println("1. Pubbabhaganamakara");
                                        System.out.println("2. Pamsukula Gatha");
                                        System.out.print("Pilihan Anda: ");
                                        pilihKw7 = terminalInput.nextInt();
                                        switch(pilihKw7){
                                            case 1:
                                            FileReader PubbabhaganamakaraRead = new FileReader("Pubbabhaganamakara.txt");
                                            BufferedReader PubbabhaganamakaraTxt = new BufferedReader(PubbabhaganamakaraRead);
                                            Scanner ReadPubbabhaganamakara = new Scanner(PubbabhaganamakaraTxt);
                                            while(ReadPubbabhaganamakara.hasNext()){
                                                System.out.println(ReadPubbabhaganamakara.nextLine());
                                            }
                                                break;
                                            case 2:
                                            FileReader PamsukulaGathaRead = new FileReader("PamsukulaGatha.txt");
                                            BufferedReader PamsukulaGathaTxt = new BufferedReader(PamsukulaGathaRead);
                                            Scanner ReadPamsukulaGatha = new Scanner(PamsukulaGathaTxt);
                                            while(ReadPamsukulaGatha.hasNext()){
                                                System.out.println(ReadPamsukulaGatha.nextLine());
                                            }
                                                break;
                                        }

                                        pilihkah7 = GetYesOrNot("Apakah Anda Ingin Melanjutkan");
                                    }
                                    break;
                                    case 2:
                                    boolean pilihkah9 = true;
                            int pilihKw9;
                            while(pilihkah9){
                                System.out.println("1. Pubbabhaganamakara");
                                System.out.println("2. Saranagamana Patha");
                                System.out.println("3. Buddhanussati");
                                System.out.println("4. Dhammanussati");
                                System.out.println("5. Sanghanussati");
                                System.out.println("6. Pabbatopama Gatha atau Dhammaniyama Sutta");
                                System.out.println("7. Tilakkhanadi Gatha");
                                System.out.println("8. Pamsukula Gatha");
                                System.out.println("9. Bhavana");
                                System.out.print("Pilihan anda : ");
                                pilihKw9 = terminalInput.nextInt();
                                switch(pilihKw9){
                                    case 1:
                                    FileReader PubbabhaganamakaraRead = new FileReader("Pubbabhaganamakara.txt");
                                    BufferedReader PubbabhaganamakaraTxt = new BufferedReader(PubbabhaganamakaraRead);
                                    Scanner ReadPubbabhaganamakara = new Scanner(PubbabhaganamakaraTxt);
                                    while(ReadPubbabhaganamakara.hasNext()){
                                        System.out.println(ReadPubbabhaganamakara.nextLine());
                                    }
                                        break;
                                    case 2:
                                    FileReader SaranagamanaPathaRead = new FileReader("Saranagamana.txt");
                                    BufferedReader SaranagamanaPathaTxt = new BufferedReader(SaranagamanaPathaRead);
                                    Scanner ReadSaranagamanaPatha = new Scanner(SaranagamanaPathaTxt);
                                    while(ReadSaranagamanaPatha.hasNext()){
                                        System.out.println(ReadSaranagamanaPatha.nextLine());
                                    }
                                    break;
                                    case 3:
                                    FileReader BuddhanussatiRead = new FileReader("Buddhanussati.txt");
                                    BufferedReader BuddhanussatiTxt = new BufferedReader(BuddhanussatiRead);
                                    Scanner ReadBuddhanussati = new Scanner(BuddhanussatiTxt);
                                    while(ReadBuddhanussati.hasNext()){
                                    System.out.println(ReadBuddhanussati.nextLine());
                                    }
                                    break;
                                    case 4:
                                    FileReader DhammanussatiRead = new FileReader("Dhammanussati.txt");
                                    BufferedReader DhammanussatiTxt = new BufferedReader(DhammanussatiRead);
                                    Scanner ReadDhammanussati = new Scanner(DhammanussatiTxt);
                                    while(ReadDhammanussati.hasNext()){
                                    System.out.println(ReadDhammanussati.nextLine());
                                    }
                                    break;
                                    case 5:
                                    FileReader SanghanussatiRead = new FileReader("Sanghanussati.txt");
                                    BufferedReader SanghanussatiTxt = new BufferedReader(SanghanussatiRead);
                                    Scanner ReadSanghanussati = new Scanner(SanghanussatiTxt);
                                    while(ReadSanghanussati.hasNext()){
                                    System.out.println(ReadSanghanussati.nextLine());
                                    }
                                    break;
                                    case 6:
                                    FileReader PabbatopamaGathaRead = new FileReader("PabbatopamaGatha.txt");
                                    BufferedReader PabbatopamaGathaTxt = new BufferedReader(PabbatopamaGathaRead);
                                    Scanner ReadPabbatopamaGatha = new Scanner(PabbatopamaGathaTxt);
                                    while(ReadPabbatopamaGatha.hasNext()){
                                    System.out.println(ReadPabbatopamaGatha.nextLine());
                                    }
                                    break;
                                    case 7:
                                    FileReader TilakkhanadiGathaRead = new FileReader("TilakkhanadiGatha.txt");
                                    BufferedReader TilakkhanadiGathaTxt = new BufferedReader(TilakkhanadiGathaRead);
                                    Scanner ReadTilakkhanadiGatha = new Scanner(TilakkhanadiGathaTxt);
                                    while(ReadTilakkhanadiGatha.hasNext()){
                                    System.out.println(ReadTilakkhanadiGatha.nextLine());
                                    }
                                    break;
                                    case 8:
                                    FileReader PamsukulaGathaRead = new FileReader("PamsukulaGatha.txt");
                                            BufferedReader PamsukulaGathaTxt = new BufferedReader(PamsukulaGathaRead);
                                            Scanner ReadPamsukulaGatha = new Scanner(PamsukulaGathaTxt);
                                            while(ReadPamsukulaGatha.hasNext()){
                                                System.out.println(ReadPamsukulaGatha.nextLine());
                                            }
                                                break;
                                    case 9:
                                    FileReader BhavanaRead = new FileReader("Bhavana.txt");
                                    BufferedReader BhavanaTxt = new BufferedReader(BhavanaRead);
                                    Scanner ReadBhavana = new Scanner(BhavanaTxt);
                                    while(ReadBhavana.hasNext()){
                                        System.out.println(ReadBhavana.nextLine());
                                    }
                                        break;
                                    }

                                pilihkah9 = GetYesOrNot("Apakah anda ingin melanjutkan");

                                }
                            break;
                                case 3:
                                boolean pilihkah10 = true;
                                int pilihKw10;
                                while(pilihkah10){
                                    System.out.println("1. Pubbabhaganamakara");
                                    System.out.println("2. Saranagamana Patha");
                                    System.out.println("3. Buddhanussati");
                                    System.out.println("4. Dhammanussati");
                                    System.out.println("5. Sanghanussati");
                                    System.out.println("8. Pamsukula Gatha( Pada Waktu Membacakan Anicca Vata ....., bunga ditaburkan di atas peti jenazah");
                                    System.out.println("9. Sumangala Gatha II");
                                    System.out.println("Catatan: Jika keadaan memungkinkan, dapat diberikan pembabaran Dhamma singkat.");
                                    System.out.print("Pilihan anda : ");
                                    pilihKw10 = terminalInput.nextInt();
                                    switch(pilihKw10){
                                        case 1:
                                        FileReader PubbabhaganamakaraRead = new FileReader("Pubbabhaganamakara.txt");
                                        BufferedReader PubbabhaganamakaraTxt = new BufferedReader(PubbabhaganamakaraRead);
                                        Scanner ReadPubbabhaganamakara = new Scanner(PubbabhaganamakaraTxt);
                                        while(ReadPubbabhaganamakara.hasNext()){
                                            System.out.println(ReadPubbabhaganamakara.nextLine());
                                        }
                                            break;
                                        case 2:
                                        FileReader SaranagamanaPathaRead = new FileReader("Saranagamana.txt");
                                        BufferedReader SaranagamanaPathaTxt = new BufferedReader(SaranagamanaPathaRead);
                                        Scanner ReadSaranagamanaPatha = new Scanner(SaranagamanaPathaTxt);
                                        while(ReadSaranagamanaPatha.hasNext()){
                                            System.out.println(ReadSaranagamanaPatha.nextLine());
                                        }
                                        break;
                                        case 3:
                                        FileReader BuddhanussatiRead = new FileReader("Buddhanussati.txt");
                                        BufferedReader BuddhanussatiTxt = new BufferedReader(BuddhanussatiRead);
                                        Scanner ReadBuddhanussati = new Scanner(BuddhanussatiTxt);
                                        while(ReadBuddhanussati.hasNext()){
                                        System.out.println(ReadBuddhanussati.nextLine());
                                        }
                                        break;
                                        case 4:
                                        FileReader DhammanussatiRead = new FileReader("Dhammanussati.txt");
                                        BufferedReader DhammanussatiTxt = new BufferedReader(DhammanussatiRead);
                                        Scanner ReadDhammanussati = new Scanner(DhammanussatiTxt);
                                        while(ReadDhammanussati.hasNext()){
                                        System.out.println(ReadDhammanussati.nextLine());
                                        }
                                        break;
                                        case 5:
                                        FileReader SanghanussatiRead = new FileReader("Sanghanussati.txt");
                                        BufferedReader SanghanussatiTxt = new BufferedReader(SanghanussatiRead);
                                        Scanner ReadSanghanussati = new Scanner(SanghanussatiTxt);
                                        while(ReadSanghanussati.hasNext()){
                                        System.out.println(ReadSanghanussati.nextLine());
                                        }
                                        break;
                                        case 6:
                                        FileReader PamsukulaGathaRead = new FileReader("PamsukulaGatha.txt");
                                                BufferedReader PamsukulaGathaTxt = new BufferedReader(PamsukulaGathaRead);
                                                Scanner ReadPamsukulaGatha = new Scanner(PamsukulaGathaTxt);
                                                while(ReadPamsukulaGatha.hasNext()){
                                                    System.out.println(ReadPamsukulaGatha.nextLine());
                                                }
                                                    break;
                                        case 7:
                                        FileReader SumangalaGathaIIRead = new FileReader("SumangalaGathaII.txt");
                                         BufferedReader SumangalaGathaIITxt = new BufferedReader(SumangalaGathaIIRead);
                                         Scanner ReadSumangalaGatha = new Scanner(SumangalaGathaIITxt);
                                        while(ReadSumangalaGatha.hasNext()){
                                        System.out.println(ReadSumangalaGatha.nextLine());
                                        }
                                        break;
                                    }
                                    
                                    pilihkah10 = GetYesOrNot("Apakah anda ingin melanjutkan");
    
                                    }
                                    break;
                                    case 4:
                                    FileReader PerihalMakamDanAbuRead = new FileReader("PerihalMakamDanAbu.txt");
                                         BufferedReader PerihalMakamDanAbuTxt = new BufferedReader(PerihalMakamDanAbuRead);
                                         Scanner ReadPerihalMakamDanAbu = new Scanner(PerihalMakamDanAbuTxt);
                                        while(ReadPerihalMakamDanAbu.hasNext()){
                                        System.out.println(ReadPerihalMakamDanAbu.nextLine());
                                        }
                                    break;
                                }
                                pilihkah6 = GetYesOrNot("Apakah Anda Ingin Melanjutkan");
                            }
                            break;
                        case 16:
                            // Peringatan Kematian
                            boolean pilihkah11 = true;
                            int pilihKw11;
                            while(pilihkah11){
                                System.out.println("1. Peringatan Kematian : 3 Hari, 7 Hari, 49 Hari, 100 Hari, 1 Tahun, 1000 Hari, dan Tahunan");
                                System.out.println("2. Ziarah Di Makam");
                                System.out.print("Pilihan Anda: ");
                                pilihKw11 = terminalInput.nextInt();
                                switch(pilihKw11){
                                    case 1:
                                    boolean pilihkah9 = true;
                            int pilihKw9;
                            while(pilihkah9){
                                System.out.println("1. Pubbabhaganamakara");
                                System.out.println("2. Saranagamana Patha");
                                System.out.println("3. Pabbatopama Gatha atau Dhammaniyama Sutta");
                                System.out.println("4. Ariyadhana Gatha");
                                System.out.println("5. Buddhanussati");
                                System.out.println("6. Dhammanussati");
                                System.out.println("7. Sanghanussati");
                                System.out.println("8. Sumangala Gatha I");
                                System.out.println("9. Bhavana");
                                System.out.print("Pilihan anda : ");
                                pilihKw9 = terminalInput.nextInt();
                                switch(pilihKw9){
                                    case 1:
                                    FileReader PubbabhaganamakaraRead = new FileReader("Pubbabhaganamakara.txt");
                                    BufferedReader PubbabhaganamakaraTxt = new BufferedReader(PubbabhaganamakaraRead);
                                    Scanner ReadPubbabhaganamakara = new Scanner(PubbabhaganamakaraTxt);
                                    while(ReadPubbabhaganamakara.hasNext()){
                                        System.out.println(ReadPubbabhaganamakara.nextLine());
                                    }
                                        break;
                                    case 2:
                                    FileReader SaranagamanaPathaRead = new FileReader("Saranagamana.txt");
                                    BufferedReader SaranagamanaPathaTxt = new BufferedReader(SaranagamanaPathaRead);
                                    Scanner ReadSaranagamanaPatha = new Scanner(SaranagamanaPathaTxt);
                                    while(ReadSaranagamanaPatha.hasNext()){
                                        System.out.println(ReadSaranagamanaPatha.nextLine());
                                    }
                                    break;
                                    case 3:
                                    FileReader PabbatopamaGathaRead = new FileReader("PabbatopamaGatha.txt");
                                    BufferedReader PabbatopamaGathaTxt = new BufferedReader(PabbatopamaGathaRead);
                                    Scanner ReadPabbatopamaGatha = new Scanner(PabbatopamaGathaTxt);
                                    while(ReadPabbatopamaGatha.hasNext()){
                                    System.out.println(ReadPabbatopamaGatha.nextLine());
                                    }
                                    break;
                                    case 4:
                                    FileReader AriyadhanaGathaRead = new FileReader("AriyadhanaGatha.txt");
                                    BufferedReader AriyadhanaGathaTxt = new BufferedReader(AriyadhanaGathaRead);
                                    Scanner ReadAriyadhanaGatha = new Scanner(AriyadhanaGathaTxt);
                                    while(ReadAriyadhanaGatha.hasNext()){
                                    System.out.println(ReadAriyadhanaGatha.nextLine());
                                    }
                                    break;
                                    case 5:
                                    FileReader BuddhanussatiRead = new FileReader("Buddhanussati.txt");
                                    BufferedReader BuddhanussatiTxt = new BufferedReader(BuddhanussatiRead);
                                    Scanner ReadBuddhanussati = new Scanner(BuddhanussatiTxt);
                                    while(ReadBuddhanussati.hasNext()){
                                    System.out.println(ReadBuddhanussati.nextLine());
                                    }
                                    break;
                                    case 6:
                                    FileReader DhammanussatiRead = new FileReader("Dhammanussati.txt");
                                    BufferedReader DhammanussatiTxt = new BufferedReader(DhammanussatiRead);
                                    Scanner ReadDhammanussati = new Scanner(DhammanussatiTxt);
                                    while(ReadDhammanussati.hasNext()){
                                    System.out.println(ReadDhammanussati.nextLine());
                                    }
                                    break;
                                    case 7:
                                    FileReader SanghanussatiRead = new FileReader("Sanghanussati.txt");
                                    BufferedReader SanghanussatiTxt = new BufferedReader(SanghanussatiRead);
                                    Scanner ReadSanghanussati = new Scanner(SanghanussatiTxt);
                                    while(ReadSanghanussati.hasNext()){
                                    System.out.println(ReadSanghanussati.nextLine());
                                    }
                                    break;
                                    case 8:
                                    FileReader SumangalaGathaIRead = new FileReader("SumangalaGathaI.txt");
                                    BufferedReader SumangalaGathaITxt = new BufferedReader(SumangalaGathaIRead);
                                    Scanner ReadSumangalaGathaI = new Scanner(SumangalaGathaITxt);
                                    while(ReadSumangalaGathaI.hasNext()){
                                    System.out.println(ReadSumangalaGathaI.nextLine());
                                    }
                                    break;
                                    case 9:
                                    FileReader BhavanaRead = new FileReader("Bhavana.txt");
                                    BufferedReader BhavanaTxt = new BufferedReader(BhavanaRead);
                                    Scanner ReadBhavana = new Scanner(BhavanaTxt);
                                    while(ReadBhavana.hasNext()){
                                        System.out.println(ReadBhavana.nextLine());
                                    }
                                        break;
                                    }

                                pilihkah9 = GetYesOrNot("Apakah anda ingin melanjutkan");

                                }
                                        break;
                                    case 2:
                                    boolean pilihkah7 = true;
                                    int pilihKw7;
                                    while(pilihkah7){
                                        System.out.println("1. Pubbabhaganamakara");
                                        System.out.println("2. Idam vo ..... tiga kali");
                                        System.out.print("Pilihan Anda: ");
                                        pilihKw7 = terminalInput.nextInt();
                                        switch(pilihKw7){
                                            case 1:
                                            FileReader PubbabhaganamakaraRead = new FileReader("Pubbabhaganamakara.txt");
                                            BufferedReader PubbabhaganamakaraTxt = new BufferedReader(PubbabhaganamakaraRead);
                                            Scanner ReadPubbabhaganamakara = new Scanner(PubbabhaganamakaraTxt);
                                            while(ReadPubbabhaganamakara.hasNext()){
                                                System.out.println(ReadPubbabhaganamakara.nextLine());
                                            }
                                                break;
                                            case 2:
                                            FileReader EttavatatiadipattidanaRead = new FileReader("Ettavatatiadipattidana.txt");
                                            BufferedReader EttavatatiadipattidanaTxt = new BufferedReader(EttavatatiadipattidanaRead);
                                            Scanner ReadEttavatatiadipattidana = new Scanner(EttavatatiadipattidanaTxt);
                                            while(ReadEttavatatiadipattidana.hasNext()){
                                            System.out.println(ReadEttavatatiadipattidana.nextLine());
                                            }
                                            break;
                                        }

                                        pilihkah7 = GetYesOrNot("Apakah Anda Ingin Melanjutkan");
                                    }
                                        break;
                                }

                                pilihkah11 = GetYesOrNot("Apakah Anda Ingin Melanjutkan");
                            }
                            break;
                        case 17:
                            // Catatan
                            boolean pilihkah7 = true;
                            FileReader CatatanRead = new FileReader("Catatan.txt");
                            BufferedReader CatatanTxt = new BufferedReader(CatatanRead);
                            Scanner ReadCatatan = new Scanner(CatatanTxt);
                            while(ReadCatatan.hasNext()){
                                System.out.println(ReadCatatan.nextLine());
                                break;
                            }
                            pilihkah7 = GetYesOrNot("Apakah Anda Ingin Melanjutkan");
                    }
                }
                break;
                case 3:
                boolean pilihkah15 = true;
                int pilihkw15;
                while(pilihkah15){
                    System.out.println("Aradhana Dan Sikkhapada");
                    System.out.println("1. Pancasila-aradhana");
                    System.out.println("2. Uposathasila-aradhana");
                    System.out.println("3. Atthasila-aradhana");
                    System.out.println("4. Paritta-aradhana");
                    System.out.println("5. Dhammadesana-aradhana");
                    System.out.println("6. Devata-aradhana");
                    System.out.println("7. Pancasila");
                    System.out.println("8. Atthangasila");
                    System.out.println("9. Dasasila");
                    System.out.println("10. Catatan");
                    System.out.print("Pilihan anda: ");
                    pilihkw15 = terminalInput.nextInt();
                    switch(pilihkw15){
                        case 1:
                            //Pancasila-aradhana
                            FileReader PancasilaAradhanaRead = new FileReader("PancasilaAradhana.txt");
                            BufferedReader PancasilaAradhanaTxt = new BufferedReader(PancasilaAradhanaRead);
                            Scanner ReadPancasilaAradhana = new Scanner(PancasilaAradhanaTxt);
                            while(ReadPancasilaAradhana.hasNext()){
                                System.out.println(ReadPancasilaAradhana.nextLine());
                            }
                            break;
                        case 2:
                            //Uposathasila-aradhana
                            FileReader UposathasilaAradhanaRead = new FileReader("UposathasilaAradhana.txt");
                            BufferedReader UposathasilaAradhanaTxt = new BufferedReader(UposathasilaAradhanaRead);
                            Scanner ReadUposathasilaAradhana = new Scanner(UposathasilaAradhanaTxt);
                            while(ReadUposathasilaAradhana.hasNext()){
                                System.out.println(ReadUposathasilaAradhana.nextLine());
                            }
                            break;
                        case 3:
                            //Atthasila-aradhana
                            FileReader AtthasilaAradhanaRead = new FileReader("AtthasilaAradhana.txt");
                            BufferedReader AtthasilaAradhanaTxt = new BufferedReader(AtthasilaAradhanaRead);
                            Scanner ReadAtthasilaAradhana = new Scanner(AtthasilaAradhanaTxt);
                            while(ReadAtthasilaAradhana.hasNext()){
                                System.out.println(ReadAtthasilaAradhana.nextLine());
                            }
                            break;
                        case 4:
                            //Paritta-aradhana
                            FileReader ParittaAradhanaRead = new FileReader("ParittaAradhana.txt");
                            BufferedReader ParittaAradhanaTxt = new BufferedReader(ParittaAradhanaRead);
                            Scanner ReadParittaAradhana = new Scanner(ParittaAradhanaTxt);
                            while(ReadParittaAradhana.hasNext()){
                                System.out.println(ReadParittaAradhana.nextLine());
                            }
                            break;
                        case 5:
                            //Dhammadesana-aradhana
                            FileReader DhammadesanaAradhanaRead = new FileReader("DhammadesanaAradhana.txt");
                            BufferedReader DhammadesanaAradhanaTxt = new BufferedReader(DhammadesanaAradhanaRead);
                            Scanner ReadDhammadesanaAradhana = new Scanner(DhammadesanaAradhanaTxt);
                            while(ReadDhammadesanaAradhana.hasNext()){
                                System.out.println(ReadDhammadesanaAradhana.nextLine());
                            }
                            break;
                        case 6:
                            //Devata-aradhana
                            FileReader DevataAradhanaRead = new FileReader("DevataAradhana.txt");
                            BufferedReader DevataAradhanaTxt = new BufferedReader(DevataAradhanaRead);
                            Scanner ReadDevataAradhana = new Scanner(DevataAradhanaTxt);
                            while(ReadDevataAradhana.hasNext()){
                                System.out.println(ReadDevataAradhana.nextLine());
                            }
                            break;
                        case 7:
                            //Pancasila
                            FileReader PancasilaRead = new FileReader("Pancasila.txt");
                            BufferedReader PancasilaTxt = new BufferedReader(PancasilaRead);
                            Scanner ReadPancasila = new Scanner(PancasilaTxt);
                            while(ReadPancasila.hasNext()){
                                System.out.println(ReadPancasila.nextLine());
                            }
                            break;
                        case 8:
                            //Atthangasila
                            FileReader AtthangasilaRead = new FileReader("Atthangasila.txt");
                            BufferedReader AtthangasilaTxt = new BufferedReader(AtthangasilaRead);
                            Scanner ReadAtthangasila = new Scanner(AtthangasilaTxt);
                            while(ReadAtthangasila.hasNext()){
                                System.out.println(ReadAtthangasila.nextLine());
                            }
                            break;
                        case 9:
                            //Dasasila
                            FileReader DasasilaRead = new FileReader("Dasasila.txt");
                            BufferedReader DasasilaTxt = new BufferedReader(DasasilaRead);
                            Scanner ReadDasasila = new Scanner(DasasilaTxt);
                            while(ReadDasasila.hasNext()){
                                System.out.println(ReadDasasila.nextLine());
                            }
                            break;
                        case 10:
                            //catatan
                            FileReader Catatan2Read = new FileReader("Catatan2.txt");
                            BufferedReader Catatan2Txt = new BufferedReader(Catatan2Read);
                            Scanner ReadCatatan2 = new Scanner(Catatan2Txt);
                            while(ReadCatatan2.hasNext()){
                                System.out.println(ReadCatatan2.nextLine());
                            }
                            break;
                    }
                    pilihkah15 = GetYesOrNot("Apakah Anda Ingin Melanjutkan");
                }
                break;
                case 4:
                boolean isContinueKali = true;
                int Numberchoose;
                while(isContinueKali){
                    System.out.println("1. Devata-aradhana");
                    System.out.println("2. Pubbabhaganamakara");
                    System.out.println("3. Saranagamana Patha");
                    System.out.println("4. Namakarasiddhi Gatha");
                    System.out.println("5. Saccakiriya Gatha");
                    System.out.println("6. Mahakarunikonaathotiadi Gatha");
                    System.out.println("7. Namokaratthaka Gatha");
                    System.out.println("8. Mangala SUtta");
                    System.out.println("9. Ratana Sutta");
                    System.out.println("10. Karaniyametta Sutta");
                    System.out.println("11. Khandha Paritta");
                    System.out.println("12. Vattaka Paritta");
                    System.out.println("13. Buddhanussati");
                    System.out.println("14. Dhammanussati");
                    System.out.println("15. Sanghanussati");
                    System.out.println("16. Angulimala Paritta");
                    System.out.println("17. Bojjhanga Paritta");
                    System.out.println("18. Atanatiya Paritta");
                    System.out.println("19. Abhaya Paritta");
                    System.out.println("20. Dhajagga Paritta");
                    System.out.println("21. Mora Paritta");
                    System.out.println("22. Devata-uyyojana Gatha");
                    System.out.println("23. Sakkatvatiadi Gatha");
                    System.out.println("24. Mahajayamangala Gatha");
                    System.out.println("25. Buddhajayamangala Gatha");
                    System.out.println("26. Jaya Paritta");
                    System.out.println("27. Sabbarogatiadi Gatha");
                    System.out.println("28. Samannanumodana Gatha");
                    System.out.println("29. Aggappasada Sutta Gatha");
                    System.out.println("30. Bhojananumodana Gatha");
                    System.out.println("31. So Atthaladdhotiadi Gatha");
                    System.out.println("32. Culamangalacakkavala Gatha");
                    System.out.println("33. Ratanattayanubhavenatiadi Gatha");
                    System.out.println("34. Sumangala Gatha I");
                    System.out.println("35. Sumangala Gatha II");
                    System.out.println("36. Pattidana");
                    System.out.print("Pilihan Anda: ");
                    Numberchoose = terminalInput.nextInt();
                    switch(Numberchoose){
                        case 1:
                        //Devata-aradhana
                        FileReader DevataAradhanaRead = new FileReader("DevataAradhana.txt");
                            BufferedReader DevataAradhanaTxt = new BufferedReader(DevataAradhanaRead);
                            Scanner ReadDevataAradhana = new Scanner(DevataAradhanaTxt);
                            while(ReadDevataAradhana.hasNext()){
                                System.out.println(ReadDevataAradhana.nextLine());
                            }
                        break;
                        case 2:
                        //Pubbabhaganamakara
                        FileReader PubbabhaganamakaraRead = new FileReader("Pubbabhaganamakara.txt");
                                            BufferedReader PubbabhaganamakaraTxt = new BufferedReader(PubbabhaganamakaraRead);
                                            Scanner ReadPubbabhaganamakara = new Scanner(PubbabhaganamakaraTxt);
                                            while(ReadPubbabhaganamakara.hasNext()){
                                                System.out.println(ReadPubbabhaganamakara.nextLine());
                                            }
                        break;
                        case 3:
                        //Saranagamana Patha
                        FileReader SaranagamanaRead = new FileReader("Saranagamana.txt");
                            BufferedReader SaranagamanaTxt = new BufferedReader(SaranagamanaRead);
                            Scanner ReadSaranagamana = new Scanner(SaranagamanaTxt);
                            while(ReadSaranagamana.hasNext()){
                                System.out.println(ReadSaranagamana.nextLine());
                            }
                        break;
                        case 4:
                        //NamakarasiddhiGatha
                        FileReader NamakarasiddhiGathaRead = new FileReader("NamakarasiddhiGatha.txt");
                            BufferedReader NamakarasiddhiGathaTxt = new BufferedReader(NamakarasiddhiGathaRead);
                            Scanner ReadNamakarasiddhiGatha = new Scanner(NamakarasiddhiGathaTxt);
                            while(ReadNamakarasiddhiGatha.hasNext()){
                                System.out.println(ReadNamakarasiddhiGatha.nextLine());
                            }
                        break;
                        case 5:
                        //Saccakiriya Gatha
                        FileReader SaccakiriyaGathaRead = new FileReader("SaccakiriyaGatha.txt");
                            BufferedReader SaccakiriyaGathaTxt = new BufferedReader(SaccakiriyaGathaRead);
                            Scanner ReadSaccakiriyaGatha = new Scanner(SaccakiriyaGathaTxt);
                            while(ReadSaccakiriyaGatha.hasNext()){
                                System.out.println(ReadSaccakiriyaGatha.nextLine());
                            }
                            break;
                        case 6:
                        //Mahakarunikonathotiadi Gatha
                        FileReader MahakarunikonathotiadiGathaRead = new FileReader("MahakarunikonathotiadiGatha.txt");
                            BufferedReader MahakarunikonathotiadiGathaTxt = new BufferedReader(MahakarunikonathotiadiGathaRead);
                            Scanner ReadMahakarunikonathotiadiGatha = new Scanner(MahakarunikonathotiadiGathaTxt);
                            while(ReadMahakarunikonathotiadiGatha.hasNext()){
                                System.out.println(ReadMahakarunikonathotiadiGatha.nextLine());
                            }
                            break;
                        case 7:
                        //Namokaratthaka Gatha
                        FileReader NamokaratthakaGathaRead = new FileReader("NamokaratthakaGatha.txt");
                            BufferedReader NamokaratthakaGathaTxt = new BufferedReader(NamokaratthakaGathaRead);
                            Scanner ReadNamokaratthakaGatha = new Scanner(NamokaratthakaGathaTxt);
                            while(ReadNamokaratthakaGatha.hasNext()){
                                System.out.println(ReadNamokaratthakaGatha.nextLine());
                            }
                            break;
                        case 8:
                        //Mangala Sutta
                        FileReader MangalaSuttaRead = new FileReader("SaccakiriyaGatha.txt");
                            BufferedReader MangalaSuttaTxt = new BufferedReader(MangalaSuttaRead);
                            Scanner ReadMangalaSutta = new Scanner(MangalaSuttaTxt);
                            while(ReadMangalaSutta.hasNext()){
                                System.out.println(ReadMangalaSutta.nextLine());
                            }
                        break;
                        case 9:
                        //Ratana Sutta
                        FileReader RatanaSuttaRead = new FileReader("RatanaSutta.txt");
                                    BufferedReader RatanaSuttaTxt = new BufferedReader(RatanaSuttaRead);
                                    Scanner ReadRatanaSutta = new Scanner(RatanaSuttaTxt);
                                    while(ReadRatanaSutta.hasNext()){
                                        System.out.println(ReadRatanaSutta.nextLine());
                                    }
                        break;
                        case 10:
                        //Karaniyametta Sutta
                        FileReader KaraniyamettasuttaRead = new FileReader("SaccakiriyaGatha.txt");
                            BufferedReader KaraniyamettasuttaTxt = new BufferedReader(KaraniyamettasuttaRead);
                            Scanner ReadKaraniyamettasutta = new Scanner(KaraniyamettasuttaTxt);
                            while(ReadKaraniyamettasutta.hasNext()){
                                System.out.println(ReadKaraniyamettasutta.nextLine());
                            }
                        break;
                        case 11:
                        //Khandha Paritta
                        FileReader KhandhaParittaRead = new FileReader("KhandhaParitta.txt");
                                     BufferedReader KhandhaParittaTxt = new BufferedReader(KhandhaParittaRead);
                                     Scanner ReadKhandhaParitta = new Scanner(KhandhaParittaTxt);
                                     while(ReadKhandhaParitta.hasNext()){
                                     System.out.println(ReadKhandhaParitta.nextLine());
                                     }
                        break;
                        case 12:
                        //Vattaka Paritta
                        FileReader VattakaParittaRead = new FileReader("VattakaParitta.txt");
                                     BufferedReader VattakaParittaTxt = new BufferedReader(VattakaParittaRead);
                                     Scanner ReadVattakaParitta = new Scanner(VattakaParittaTxt);
                                     while(ReadVattakaParitta.hasNext()){
                                     System.out.println(ReadVattakaParitta.nextLine());
                                     }
                        break;
                        case 13:
                        //Buddhanussati
                        FileReader BuddhanussatiRead = new FileReader("Buddhanussati.txt");
                            BufferedReader BuddhanussatiTxt = new BufferedReader(BuddhanussatiRead);
                            Scanner ReadBuddhanussati = new Scanner(BuddhanussatiTxt);
                            while(ReadBuddhanussati.hasNext()){
                                System.out.println(ReadBuddhanussati.nextLine());
                            }
                        break;
                        case 14:
                        //Dhammanussati
                        FileReader DhammanussatiRead = new FileReader("Dhammanussati.txt");
                                    BufferedReader DhammanussatiTxt = new BufferedReader(DhammanussatiRead);
                                    Scanner ReadDhammanussati = new Scanner(DhammanussatiTxt);
                                    while(ReadDhammanussati.hasNext()){
                                    System.out.println(ReadDhammanussati.nextLine());
                                    }    
                        break;
                        case 15:
                        //Sanghanussati
                        FileReader SanghanussatiRead = new FileReader("Sanghanussati.txt");
                            BufferedReader SanghanussatiTxt = new BufferedReader(SanghanussatiRead);
                            Scanner ReadSanghanussati = new Scanner(SanghanussatiTxt);
                            while(ReadSanghanussati.hasNext()){
                                System.out.println(ReadSanghanussati.nextLine());
                            }
                        break;
                        case 16:
                        //Angulimala Paritta
                        FileReader AngulimalaParittaRead = new FileReader("AngulimalaParitta.txt");
                                    BufferedReader AngulimalaParittaTxt = new BufferedReader(AngulimalaParittaRead);
                                    Scanner ReadAngulimalaParitta = new Scanner(AngulimalaParittaTxt);
                                    while(ReadAngulimalaParitta.hasNext()){
                                        System.out.println(ReadAngulimalaParitta.nextLine());
                                    }
                        break;
                        case 17:
                        //Bojjhanga Paritta
                        FileReader BojjhangaParittaRead = new FileReader("BojjhangaParitta.txt");
                                    BufferedReader BojjhangaParittaTxt = new BufferedReader(BojjhangaParittaRead);
                                    Scanner ReadBojjhangaParitta = new Scanner(BojjhangaParittaTxt);
                                    while(ReadBojjhangaParitta.hasNext()){
                                    System.out.println(ReadBojjhangaParitta.nextLine());
                                    }
                        break;
                        case 18:
                        //Atanatiya Paritta
                        FileReader AtanatiyaParittaRead = new FileReader("AtanatiyaParitta.txt");
                                    BufferedReader AtanatiyaParittaTxt = new BufferedReader(AtanatiyaParittaRead);
                                    Scanner ReadAtanatiyaParitta = new Scanner(AtanatiyaParittaTxt);
                                    while(ReadAtanatiyaParitta.hasNext()){
                                    System.out.println(ReadAtanatiyaParitta.nextLine());
                                    }
                        break;
                        case 19:
                        //Abhaya Paritta
                        FileReader AbhayaParittaRead = new FileReader("Sanghanussati.txt");
                                    BufferedReader AbhayaParittaTxt = new BufferedReader(AbhayaParittaRead);
                                    Scanner ReadAbhayaParitta = new Scanner(AbhayaParittaTxt);
                                    while(ReadAbhayaParitta.hasNext()){
                                    System.out.println(ReadAbhayaParitta.nextLine());
                                    }
                        break;
                        case 20:
                        //Dhajagga Paritta
                        FileReader DhajaggaParittaRead = new FileReader("DhajaggaParitta.txt");
                        BufferedReader DhajaggaParittaTxt = new BufferedReader(DhajaggaParittaRead);
                        Scanner ReadDhajaggaParitta = new Scanner(DhajaggaParittaTxt);
                        while(ReadDhajaggaParitta.hasNext()){
                        System.out.println(ReadDhajaggaParitta.nextLine());
                        }
                        break;
                        case 21:
                        //Mora Paritta
                        FileReader MoraParittaRead = new FileReader("MoraParitta.txt");
                                    BufferedReader MoraParittaTxt = new BufferedReader(MoraParittaRead);
                                    Scanner ReadMoraParitta = new Scanner(MoraParittaTxt);
                                    while(ReadMoraParitta.hasNext()){
                                        System.out.println(ReadMoraParitta.nextLine());
                                    }
                        break;
                        case 22:
                        //Devata-uyyojana Gatha
                        FileReader DevatauyyojanaGathaRead = new FileReader("DevatauyyojanaGatha.txt");
                                    BufferedReader DevatauyyojanaGathaTxt = new BufferedReader(DevatauyyojanaGathaRead);
                                    Scanner ReadDevatauyyojanaGatha = new Scanner(DevatauyyojanaGathaTxt);
                                    while(ReadDevatauyyojanaGatha.hasNext()){
                                        System.out.println(ReadDevatauyyojanaGatha.nextLine());
                                    }
                        break;
                        case 23:
                        //Sakkatvatiadi Gatha
                        FileReader SakkatvatiadiGathaRead = new FileReader("SakkatvatiadiGatha.txt");
                                    BufferedReader SakkatvatiadiGathaTxt = new BufferedReader(SakkatvatiadiGathaRead);
                                    Scanner ReadSakkatvatiadiGatha = new Scanner(SakkatvatiadiGathaTxt);
                                    while(ReadSakkatvatiadiGatha.hasNext()){
                                    System.out.println(ReadSakkatvatiadiGatha.nextLine());
                                    }
                        break;
                        case 24:
                        //Mahajayamangala Gatha
                        FileReader MahajayamangalaGathaRead = new FileReader("MahajayamangalaGatha.txt");
                                     BufferedReader MahajayamangalaGathaTxt = new BufferedReader(MahajayamangalaGathaRead);
                                     Scanner ReadMahajayamangalaGatha = new Scanner(MahajayamangalaGathaTxt);
                                     while(ReadMahajayamangalaGatha.hasNext()){
                                     System.out.println(ReadMahajayamangalaGatha.nextLine());
                                     }
                        break;
                        case 25:
                        //Buddhajayamangala Gatha
                        FileReader BuddhajayamangalaGathaRead = new FileReader("BuddhajayamangalaGatha.txt");
                                     BufferedReader BuddhajayamangalaGathaTxt = new BufferedReader(BuddhajayamangalaGathaRead);
                                     Scanner ReadBuddhajayamangalaGatha = new Scanner(BuddhajayamangalaGathaTxt);
                                     while(ReadBuddhajayamangalaGatha.hasNext()){
                                     System.out.println(ReadBuddhajayamangalaGatha.nextLine());
                                     }
                        break;
                        case 26:
                        //Jaya Paritta
                        FileReader JayaParittaRead = new FileReader("JayaParitta.txt");
                                    BufferedReader JayaParittaTxt = new BufferedReader(JayaParittaRead);
                                    Scanner ReadJayaParitta = new Scanner(JayaParittaTxt);
                                    while(ReadJayaParitta.hasNext()){
                                    System.out.println(ReadJayaParitta.nextLine());
                                    }
                        break;
                        case 27:
                        //Sabbarogatiadi Gatha
                        FileReader SabbarogatiadiGathaRead = new FileReader("SabbarogatiadiGatha.txt");
                        BufferedReader SabbarogatiadiGathaTxt = new BufferedReader(SabbarogatiadiGathaRead);
                        Scanner ReadSabbarogatiadiGatha = new Scanner(SabbarogatiadiGathaTxt);
                        while(ReadSabbarogatiadiGatha.hasNext()){
                        System.out.println(ReadSabbarogatiadiGatha.nextLine());
                        }
                        break;
                        case 28:
                        //Samannanumodana Gatha
                        FileReader SamannanumodanaGathaRead = new FileReader("SamannanumodanaGatha.txt");
                        BufferedReader SamannanumodanaGathaTxt = new BufferedReader(SamannanumodanaGathaRead);
                        Scanner ReadSamannanumodanaGatha = new Scanner(SamannanumodanaGathaTxt);
                        while(ReadSamannanumodanaGatha.hasNext()){
                        System.out.println(ReadSamannanumodanaGatha.nextLine());
                        }
                        break;
                        case 29:
                        //Aggappasada Sutta Gatha
                        FileReader AggappasadaSuttaGathaRead = new FileReader("AggappasadaSuttaGatha.txt");
                        BufferedReader AggappasadaSuttaGathaTxt = new BufferedReader(AggappasadaSuttaGathaRead);
                        Scanner ReadAggappasadaSuttaGatha = new Scanner(AggappasadaSuttaGathaTxt);
                        while(ReadAggappasadaSuttaGatha.hasNext()){
                        System.out.println(ReadAggappasadaSuttaGatha.nextLine());
                        }
                        break;
                        case 30:
                        //Bhojananumodana Gatha
                        FileReader BhojananumodanaGathaRead = new FileReader("BhojananumodanaGatha.txt");
                        BufferedReader BhojananumodanaGathaTxt = new BufferedReader(BhojananumodanaGathaRead);
                        Scanner ReadBhojananumodanaGatha = new Scanner(BhojananumodanaGathaTxt);
                        while(ReadBhojananumodanaGatha.hasNext()){
                        System.out.println(ReadBhojananumodanaGatha.nextLine());
                        }
                        break;
                        case 31:
                        //So Atthaladdhotiadi Gatha
                        FileReader SoAttaladdhotiadiGathaRead = new FileReader("SoAttaladdhotiadiGatha.txt");
                                    BufferedReader SoAttaladdhotiadiGathaTxt = new BufferedReader(SoAttaladdhotiadiGathaRead);
                                    Scanner ReadSoAttaladdhotiadiGatha = new Scanner(SoAttaladdhotiadiGathaTxt);
                                    while(ReadSoAttaladdhotiadiGatha.hasNext()){
                                    System.out.println(ReadSoAttaladdhotiadiGatha.nextLine());
                                    }
                        break;
                        case 32:
                        //Culamangalacakkavala Gatha
                        FileReader CulamangalacakkavalaGathaRead = new FileReader("CulamangalacakkavalaGatha.txt");
                                    BufferedReader CulamangalacakkavalaGathaTxt = new BufferedReader(CulamangalacakkavalaGathaRead);
                                    Scanner ReadCulamangalacakkavalaGatha = new Scanner(CulamangalacakkavalaGathaTxt);
                                    while(ReadCulamangalacakkavalaGatha.hasNext()){
                                    System.out.println(ReadCulamangalacakkavalaGatha.nextLine());
                                    }
                        break;
                        case 33:
                        //Ratanattayanubhavenatiadi Gatha
                        FileReader RatanattayanubhavenatiadiGathaRead = new FileReader("RatanattayanubhavenatiadiGatha.txt");
                                    BufferedReader RatanattayanubhavenatiadiGathaTxt = new BufferedReader(RatanattayanubhavenatiadiGathaRead);
                                    Scanner ReadRatanattayanubhavenatiadiGatha = new Scanner(RatanattayanubhavenatiadiGathaTxt);
                                    while(ReadRatanattayanubhavenatiadiGatha.hasNext()){
                                    System.out.println(ReadRatanattayanubhavenatiadiGatha.nextLine());
                                    }
                        break;
                        case 34:
                        //Sumangala Gatha I
                        FileReader SumangalaGathaIRead = new FileReader("SumangalaGathaI.txt");
                                    BufferedReader SumangalaGathaITxt = new BufferedReader(SumangalaGathaIRead);
                                    Scanner ReadSumangalaGathaI = new Scanner(SumangalaGathaITxt);
                                    while(ReadSumangalaGathaI.hasNext()){
                                    System.out.println(ReadSumangalaGathaI.nextLine());
                                    }
                        break;
                        case 35:
                        //Sumangala Gatha II
                        FileReader SumangalaGathaIIRead = new FileReader("SumangalaGathaII.txt");
                                    BufferedReader SumangalaGathaIITxt = new BufferedReader(SumangalaGathaIIRead);
                                    Scanner ReadSumangalaGatha = new Scanner(SumangalaGathaIITxt);
                                    while(ReadSumangalaGatha.hasNext()){
                                    System.out.println(ReadSumangalaGatha.nextLine());
                                    }
                        break;
                        case 36:
                        //Pattidana
                        FileReader PattidanaRead = new FileReader("Pattidana.txt");
                        BufferedReader PattidanaTxt = new BufferedReader(PattidanaRead);
                        Scanner ReadPattidana = new Scanner(PattidanaTxt);
                        while(ReadPattidana.hasNext()){
                        System.out.println(ReadPattidana.nextLine());
                        }
                        break;
                    }
                    isContinueKali = GetYesOrNot("Apakah Anda Ingin Melanjutkan");
                }
                break;
                case 5:
                boolean isJalankan6 = true;
                    int chooseWhat6;
                    while(isJalankan6){
                    ClearScreen();
                    System.out.println("1. Pubbabhaganamakara");
                    System.out.println("2. Saranagamana Patha");
                    System.out.println("3. Pabbatopama Gatha");
                    System.out.println("4. Ariyadhana Gatha");
                    System.out.println("5. Dhammaniyama Sutta");
                    System.out.println("6. Bhaddekarattasutta");
                    System.out.println("7. Tilakkhanadi Gatha");
                    System.out.println("8. Bodhisutta Gatha");
                    System.out.println("9. Pamsukula Gatha");
                    System.out.println("10. Adiyasutta Gatha");
                    System.out.println("11. Catutirokudda Gatha");
                    System.out.println("12. Ettavatatiadipattidana");
                    System.out.print("Pilihan Anda : ");
                    chooseWhat6 = terminalInput.nextInt();
                    switch(chooseWhat6){
                        case 1:
                            //Pubbabhaganamakara
                            FileReader PubbabhaganamakaraRead = new FileReader("Pubbabhaganamakara.txt");
                            BufferedReader PubbabhaganamakaraTxt = new BufferedReader(PubbabhaganamakaraRead);
                            Scanner ReadPubbabhaganamakara = new Scanner(PubbabhaganamakaraTxt);
                            while(ReadPubbabhaganamakara.hasNext()){
                                System.out.println(ReadPubbabhaganamakara.nextLine());
                            }
                            break;
                        case 2:
                            //Saranagamana Patha
                            FileReader SaranagamanaRead = new FileReader("Saranagamana.txt");
                            BufferedReader SaranagamanaTxt = new BufferedReader(SaranagamanaRead);
                            Scanner ReadSaranagamana = new Scanner(SaranagamanaTxt);
                            while(ReadSaranagamana.hasNext()){
                                System.out.println(ReadSaranagamana.nextLine());
                            }
                            break;
                        case 3:
                            //PabbatopamaGatha
                            FileReader PabbatopamaGathaRead = new FileReader("PabbatopamaGatha.txt");
                                    BufferedReader PabbatopamaGathaTxt = new BufferedReader(PabbatopamaGathaRead);
                                    Scanner ReadPabbatopamaGatha = new Scanner(PabbatopamaGathaTxt);
                                    while(ReadPabbatopamaGatha.hasNext()){
                                    System.out.println(ReadPabbatopamaGatha.nextLine());
                                    }
                                break;
                        case 4:
                            //Ariayadhana Gatha
                            FileReader AriyadhanaGathaRead = new FileReader("AriyadhanaGatha.txt");
                            BufferedReader AriyadhanaGathaTxt = new BufferedReader(AriyadhanaGathaRead);
                            Scanner ReadAriyadhanaGatha = new Scanner(AriyadhanaGathaTxt);
                            while(ReadAriyadhanaGatha.hasNext()){
                            System.out.println(ReadAriyadhanaGatha.nextLine());
                            }
                            break;
                        case 5:
                            //Dhammaniyama Sutta
                            FileReader DhammaniyamaSuttaRead = new FileReader("DhammaniyamaSutta.txt");
                            BufferedReader DhammaniyamaSuttaTxt = new BufferedReader(DhammaniyamaSuttaRead);
                            Scanner ReadDhammaniyamaSutta = new Scanner(DhammaniyamaSuttaTxt);
                            while(ReadDhammaniyamaSutta.hasNext()){
                                System.out.println(ReadDhammaniyamaSutta.nextLine());
                            }
                            break;
                        case 6:
                            //Bhaddekarattasutta
                            FileReader BhaddekarattasuttaRead = new FileReader("Bhaddekarattasutta.txt");
                            BufferedReader BhaddekarattasuttaTxt = new BufferedReader(BhaddekarattasuttaRead);
                            Scanner ReadBhaddekarattasutta = new Scanner(BhaddekarattasuttaTxt);
                            while(ReadBhaddekarattasutta.hasNext()){
                                System.out.println(ReadBhaddekarattasutta.nextLine());
                            }
                            break;
                        case 7:
                            //Tilakkhanadi Gatha
                            FileReader TilakkhanadiGathaRead = new FileReader("TilakkhanadiGatha.txt");
                            BufferedReader TilakkhanadiGathaTxt = new BufferedReader(TilakkhanadiGathaRead);
                            Scanner ReadTilakkhanadiGatha = new Scanner(TilakkhanadiGathaTxt);
                            while(ReadTilakkhanadiGatha.hasNext()){
                                System.out.println(ReadTilakkhanadiGatha.nextLine());
                            }
                            break;
                        case 8:
                            //Bodhisutta Gatha
                            FileReader BodhisuttaGathaRead = new FileReader("BodhisuttaGatha.txt");
                            BufferedReader BodhisuttaGathaTxt = new BufferedReader(BodhisuttaGathaRead);
                            Scanner ReadBodhisuttaGatha = new Scanner(BodhisuttaGathaTxt);
                            while(ReadBodhisuttaGatha.hasNext()){
                                System.out.println(ReadBodhisuttaGatha.nextLine());
                            }
                            break;
                        case 9:
                            //Pamsukula Gatha
                            FileReader PamsukulaGathaRead = new FileReader("PamsukulaGatha.txt");
                                            BufferedReader PamsukulaGathaTxt = new BufferedReader(PamsukulaGathaRead);
                                            Scanner ReadPamsukulaGatha = new Scanner(PamsukulaGathaTxt);
                                            while(ReadPamsukulaGatha.hasNext()){
                                                System.out.println(ReadPamsukulaGatha.nextLine());
                                            }
                            break;  
                        case 10:
                            //Adiyasutta Gatha
                            FileReader AdiyasuttaGathaRead = new FileReader("AdiyasuttaGatha.txt");
                            BufferedReader AdiyasuttaGathaTxt = new BufferedReader(AdiyasuttaGathaRead);
                            Scanner ReadAdiyasuttaGatha = new Scanner(AdiyasuttaGathaTxt);
                            while(ReadAdiyasuttaGatha.hasNext()){
                                System.out.println(ReadAdiyasuttaGatha.nextLine());
                            }
                            break;
                        case 11:
                            //Catutirokudda Gatha
                            FileReader CatutirokuddaGathaRead = new FileReader("CatutirokuddaGatha.txt");
                            BufferedReader CatutirokuddaGathaTxt = new BufferedReader(CatutirokuddaGathaRead);
                            Scanner ReadCatutirokuddaGatha = new Scanner(CatutirokuddaGathaTxt);
                            while(ReadCatutirokuddaGatha.hasNext()){
                                System.out.println(ReadCatutirokuddaGatha.nextLine());
                            }
                            break;
                        case 12:
                            //Ettavatatiadipattidana
                            FileReader EttavatatiadipattidanaRead = new FileReader("Ettavatatiadipattidana.txt");
                                            BufferedReader EttavatatiadipattidanaTxt = new BufferedReader(EttavatatiadipattidanaRead);
                                            Scanner ReadEttavatatiadipattidana = new Scanner(EttavatatiadipattidanaTxt);
                                            while(ReadEttavatatiadipattidana.hasNext()){
                                            System.out.println(ReadEttavatatiadipattidana.nextLine());
                                            }
                            break;
                    }
                    isJalankan6 = GetYesOrNot("Apakah anda ingin melanjutkan");
                    }
                    break;
                    case 6:
                    boolean isContinuekah = true;
                    int isChooseWht;
                    while(isContinuekah){
                        System.out.println("1. Patha untuk Upacara Hari Asalha Puja");
                        System.out.println("2. Patha untuk Upacara Setiap Kesempatan");
                        System.out.println("3. Patha untuk Upacara Hari Magha Puja");
                        System.out.println("4. Patha untuk Upacara Hari Trisuci Waisak");
                        System.out.println("5. Patha untuk Upacara Hari Atthami Waisak");
                        System.out.println("6. Patha untuk Perayaan Kathina");
                        System.out.println("7. Patha untuk Renungan");
                        System.out.print("Pilihan Anda: ");
                        isChooseWht = terminalInput.nextInt();
                        switch(isChooseWht){
                            case 1:
                            FileReader DhammacakkappavattanaSuttaRead = new FileReader("DhammacakkappavattanaSutta.txt");
                            BufferedReader DhammacakkappavattanaSuttaTxt = new BufferedReader(DhammacakkappavattanaSuttaRead);
                            Scanner ReadDhammacakkappavattanaSutta = new Scanner(DhammacakkappavattanaSuttaTxt);
                            while(ReadDhammacakkappavattanaSutta.hasNext()){
                            System.out.println(ReadDhammacakkappavattanaSutta.nextLine());
                            }
                            break;
                            case 2:
                            boolean pilihkah7 = true;
                            int pilihKw7;
                            while(pilihkah7){
                                System.out.println("1. Anattalakkhana Sutta");
                                System.out.println("2. Adittapariyaya Sutta");
                                System.out.print("Pilihan Anda: ");
                                pilihKw7 = terminalInput.nextInt();
                                switch(pilihKw7){
                                    case 1:
                                    FileReader AnattalakkhanaSuttaRead = new FileReader("AnattalakkhanaSutta.txt");
                                    BufferedReader AnattalakkhanaSuttaTxt = new BufferedReader(AnattalakkhanaSuttaRead);
                                    Scanner ReadAnattalakkhanaSutta = new Scanner(AnattalakkhanaSuttaTxt);
                                    while(ReadAnattalakkhanaSutta.hasNext()){
                                        System.out.println(ReadAnattalakkhanaSutta.nextLine());
                                    }
                                        break;
                                    case 2:
                                    FileReader AdittapariyayaSuttaRead = new FileReader("AdittapariyayaSutta.txt");
                                    BufferedReader AdittapariyayaSuttaTxt = new BufferedReader(AdittapariyayaSuttaRead);
                                    Scanner ReadAdittapariyayaSutta = new Scanner(AdittapariyayaSuttaTxt);
                                    while(ReadAdittapariyayaSutta.hasNext()){
                                    System.out.println(ReadAdittapariyayaSutta.nextLine());
                                    }
                                    break;
                                }

                                pilihkah7 = GetYesOrNot("Apakah Anda Ingin Melanjutkan");
                            }
                                break;
                                case 3:
                                FileReader OvadapatimokkhadipathaRead = new FileReader("Ovadapatimokkhadipatha.txt");
                                BufferedReader OvadapatimokkhadipathaTxt = new BufferedReader(OvadapatimokkhadipathaRead);
                                Scanner ReadOvadapatimokkhadipatha = new Scanner(OvadapatimokkhadipathaTxt);
                                while(ReadOvadapatimokkhadipatha.hasNext()){
                                System.out.println(ReadOvadapatimokkhadipatha.nextLine());
                                }
                            break;
                            case 4:
                            boolean pilihkah8 = true;
                            int pilihKw8;
                            while(pilihkah8){
                                System.out.println("1. Bala Sutta");
                                System.out.println("2. Saraniyadhamma Sutta");
                                System.out.print("Pilihan Anda: ");
                                pilihKw8 = terminalInput.nextInt();
                                switch(pilihKw8){
                                    case 1:
                                    FileReader BalaSuttaRead = new FileReader("BalaSutta.txt");
                                    BufferedReader BalaSuttaTxt = new BufferedReader(BalaSuttaRead);
                                    Scanner ReadBalaSutta = new Scanner(BalaSuttaTxt);
                                    while(ReadBalaSutta.hasNext()){
                                        System.out.println(ReadBalaSutta.nextLine());
                                    }
                                        break;
                                    case 2:
                                    FileReader SaraniyadhammaSuttaRead = new FileReader("SaraniyadhammaSutta.txt");
                                    BufferedReader SaraniyadhammaSuttaTxt = new BufferedReader(SaraniyadhammaSuttaRead);
                                    Scanner ReadSaraniyadhammaSutta = new Scanner(SaraniyadhammaSuttaTxt);
                                    while(ReadSaraniyadhammaSutta.hasNext()){
                                    System.out.println(ReadSaraniyadhammaSutta.nextLine());
                                    }
                                    break;
                                }

                                pilihkah8 = GetYesOrNot("Apakah Anda Ingin Melanjutkan");
                            }
                            break;
                            case 5:
                            FileReader PabbatopamaGathaRead = new FileReader("PabbatopamaGatha.txt");
                                    BufferedReader PabbatopamaGathaTxt = new BufferedReader(PabbatopamaGathaRead);
                                    Scanner ReadPabbatopamaGatha = new Scanner(PabbatopamaGathaTxt);
                                    while(ReadPabbatopamaGatha.hasNext()){
                                    System.out.println(ReadPabbatopamaGatha.nextLine());
                                    }
                                    break;
                            case 6:
                            boolean pilihkah9 = true;
                            int pilihKw9;
                            while(pilihkah9){
                                System.out.println("1. Tirokudda Sutta");
                                System.out.println("2. Nidhikanda Sutta");
                                System.out.print("Pilihan Anda: ");
                                pilihKw9 = terminalInput.nextInt();
                                switch(pilihKw9){
                                    case 1:
                                    FileReader TirokuddaSuttaRead = new FileReader("TirokuddaSutta.txt");
                                    BufferedReader TirokuddaSuttaTxt = new BufferedReader(TirokuddaSuttaRead);
                                    Scanner ReadTirokuddaSutta = new Scanner(TirokuddaSuttaTxt);
                                    while(ReadTirokuddaSutta.hasNext()){
                                        System.out.println(ReadTirokuddaSutta.nextLine());
                                    }
                                        break;
                                    case 2:
                                    FileReader NidhikandaSuttaRead = new FileReader("NidhikandaSutta.txt");
                                    BufferedReader NidhikandaSuttaTxt = new BufferedReader(NidhikandaSuttaRead);
                                    Scanner ReadNidhikandaSutta = new Scanner(NidhikandaSuttaTxt);
                                    while(ReadNidhikandaSutta.hasNext()){
                                    System.out.println(ReadNidhikandaSutta.nextLine());
                                    }
                                    break;
                                }

                                pilihkah9 = GetYesOrNot("Apakah Anda Ingin Melanjutkan");
                            }
                            break;
                            case 7:
                            boolean pilihkah10 = true;
                            int pilihKw10;
                            while(pilihkah10){
                                System.out.println("1. Paccayapaccavekkhanapatha");
                                System.out.println("2. Vijaya Sutta");
                                System.out.print("Pilihan Anda: ");
                                pilihKw10 = terminalInput.nextInt();
                                switch(pilihKw10){
                                    case 1:
                                    FileReader PaccayapaccavekkhanapathaRead = new FileReader("Paccayapaccavekkhanapatha.txt");
                                    BufferedReader PaccayapaccavekkhanapathaTxt = new BufferedReader(PaccayapaccavekkhanapathaRead);
                                    Scanner ReadPaccayapaccavekkhanapatha = new Scanner(PaccayapaccavekkhanapathaTxt);
                                    while(ReadPaccayapaccavekkhanapatha.hasNext()){
                                        System.out.println(ReadPaccayapaccavekkhanapatha.nextLine());
                                    }
                                        break;
                                    case 2:
                                    FileReader VijayaSuttaRead = new FileReader("VijayaSutta.txt");
                                    BufferedReader VijayaSuttaTxt = new BufferedReader(VijayaSuttaRead);
                                    Scanner ReadVijayaSutta = new Scanner(VijayaSuttaTxt);
                                    while(ReadVijayaSutta.hasNext()){
                                    System.out.println(ReadVijayaSutta.nextLine());
                                    }
                                    break;
                                }

                                pilihkah10 = GetYesOrNot("Apakah Anda Ingin Melanjutkan");
                            }
                            break;
                        }
                    }
                    break;
                    case 7:
                    boolean isContinue1 = true;
                    int isChoose1;
                    while(isContinue1){
                        System.out.println("1. Kata Puja Hari Waisak - Atthami Waisak");
                        System.out.println("2. Kata Puja pada Hari Asadha");
                        System.out.println("3. Kata Puja pada Hari Magha");
                        System.out.print("Pilihan Anda : ");
                        isChoose1 = terminalInput.nextInt();
                        switch(isChoose1){
                            case 1:
                            boolean isContinue2 = true;
                            int isChoose2;
                            while(isContinue2){
                            System.out.println("1. Pubbabhaganamakara");
                            System.out.println("2. Visakhapunnamipuja Katha");
                            System.out.print("Pilihan Anda : ");
                            isChoose2 = terminalInput.nextInt();
                            switch(isChoose2){
                                case 1:
                                FileReader PubbabhaganamakaraRead = new FileReader("Pubbabhaganamakara.txt");
                                BufferedReader PubbabhaganamakaraTxt = new BufferedReader(PubbabhaganamakaraRead);
                                Scanner ReadPubbabhaganamakara = new Scanner(PubbabhaganamakaraTxt);
                                while(ReadPubbabhaganamakara.hasNext()){
                                System.out.println(ReadPubbabhaganamakara.nextLine());
                                }
                                break;
                                case 2:
                                FileReader VisakhapunnamipujaRead = new FileReader("Visakhapunnamipuja.txt");
                                BufferedReader VisakhapunnamipujaTxt = new BufferedReader(VisakhapunnamipujaRead);
                                Scanner ReadVisakhapunnamipuja = new Scanner(VisakhapunnamipujaTxt);
                                while(ReadVisakhapunnamipuja.hasNext()){
                                System.out.println(ReadVisakhapunnamipuja.nextLine());
                                }
                                break;
                            }
                            isContinue2 = GetYesOrNot("Apakah anda ingin melanjutkan");
                            }
                            break;
                            case 2:
                            boolean isContinue3 = true;
                            int isChoose3;
                            while(isContinue3){
                            System.out.println("1. Pubbabhaganamakara");
                            System.out.println("2. Asalhapunnamipuja Katha");
                            System.out.print("Pilihan Anda : ");
                            isChoose3 = terminalInput.nextInt();
                            switch(isChoose3){
                                case 1:
                                FileReader PubbabhaganamakaraRead = new FileReader("Pubbabhaganamakara.txt");
                                BufferedReader PubbabhaganamakaraTxt = new BufferedReader(PubbabhaganamakaraRead);
                                Scanner ReadPubbabhaganamakara = new Scanner(PubbabhaganamakaraTxt);
                                while(ReadPubbabhaganamakara.hasNext()){
                                System.out.println(ReadPubbabhaganamakara.nextLine());
                                }
                                break;
                                case 2:
                                FileReader AsalhapunnamipujaRead = new FileReader("Asalhapunnamipuja.txt");
                                BufferedReader AsalhapunnamipujaTxt = new BufferedReader(AsalhapunnamipujaRead);
                                Scanner ReadAsalhapunnamipuja = new Scanner(AsalhapunnamipujaTxt);
                                while(ReadAsalhapunnamipuja.hasNext()){
                                System.out.println(ReadAsalhapunnamipuja.nextLine());
                                }
                                break;
                            }
                            isContinue3 = GetYesOrNot("Apakah anda ingin melanjutkan");
                        }
                        break;
                        case 3:
                        boolean isContinue4 = true;
                            int isChoose4;
                            while(isContinue4){
                            System.out.println("1. Pubbabhaganamakara");
                            System.out.println("2. Maghapunnamipuja Katha");
                            System.out.print("Pilihan Anda : ");
                            isChoose4 = terminalInput.nextInt();
                            switch(isChoose4){
                                case 1:
                                FileReader PubbabhaganamakaraRead = new FileReader("Pubbabhaganamakara.txt");
                                BufferedReader PubbabhaganamakaraTxt = new BufferedReader(PubbabhaganamakaraRead);
                                Scanner ReadPubbabhaganamakara = new Scanner(PubbabhaganamakaraTxt);
                                while(ReadPubbabhaganamakara.hasNext()){
                                System.out.println(ReadPubbabhaganamakara.nextLine());
                                }
                                break;
                                case 2:
                                FileReader MaghapunnamipujaRead = new FileReader("Maghapunnamipuja.txt");
                                BufferedReader MaghapunnamipujaTxt = new BufferedReader(MaghapunnamipujaRead);
                                Scanner ReadMaghapunnamipuja = new Scanner(MaghapunnamipujaTxt);
                                while(ReadMaghapunnamipuja.hasNext()){
                                System.out.println(ReadMaghapunnamipuja.nextLine());
                                }
                                break;
                            }
                            isContinue4 = GetYesOrNot("Apakah anda ingin melanjutkan");
                        }
                        break;
                        }
                        isContinue1 = GetYesOrNot("Apakah anda ingin melanjutkan");
                    }
                    break;
                    case 8:
                    boolean isContinue5 = true;
                    int isChoose5;
                    while(isContinue5){
                        System.out.println("1. Kathinadana Katha");
                        System.out.println("2. Civaradussadana Katha");
                        System.out.println("3. Civaradana Katha");
                        System.out.println("4. Sanghadana Katha");
                        System.out.println("5. Matakasanghadana Katha");
                        System.out.println("6. Senasanadana Katha");
                        System.out.println("7. Pavaranapanna");
                        System.out.print("Pilihan anda: ");
                        isChoose5 = terminalInput.nextInt();
                        switch(isChoose5){
                            case 1:
                            FileReader KathinadanaKathaRead = new FileReader("KathinadanaKatha.txt");
                                BufferedReader KathinadanaKathaTxt = new BufferedReader(KathinadanaKathaRead);
                                Scanner ReadKathinadanaKatha = new Scanner(KathinadanaKathaTxt);
                                while(ReadKathinadanaKatha.hasNext()){
                                System.out.println(ReadKathinadanaKatha.nextLine());
                                }
                                break;
                            case 2:
                            FileReader CivaradussadanaKathaRead = new FileReader("CivaradussadanaKatha.txt");
                                BufferedReader CivaradussadanaKathaTxt = new BufferedReader(CivaradussadanaKathaRead);
                                Scanner ReadCivaradussadanaKatha = new Scanner(CivaradussadanaKathaTxt);
                                while(ReadCivaradussadanaKatha.hasNext()){
                                System.out.println(ReadCivaradussadanaKatha.nextLine());
                                }
                                break;
                            case 3:
                            FileReader CivaradanaKathaRead = new FileReader("CivaradanaKatha.txt");
                            BufferedReader CivaradanaKathaTxt = new BufferedReader(CivaradanaKathaRead);
                            Scanner ReadCivaradanaKatha = new Scanner(CivaradanaKathaTxt);
                            while(ReadCivaradanaKatha.hasNext()){
                            System.out.println(ReadCivaradanaKatha.nextLine());
                            }
                            break;
                            case 4:
                            FileReader SanghadanaKathaRead = new FileReader("SanghadanaKatha.txt");
                            BufferedReader SanghadanaKathaTxt = new BufferedReader(SanghadanaKathaRead);
                            Scanner ReadSanghadanaKatha = new Scanner(SanghadanaKathaTxt);
                            while(ReadSanghadanaKatha.hasNext()){
                            System.out.println(ReadSanghadanaKatha.nextLine());
                            }
                            break;
                            case 5:
                            FileReader MataSanghadanaKathaRead = new FileReader("MataSanghadanaKatha.txt");
                            BufferedReader MataSanghadanaKathaTxt = new BufferedReader(MataSanghadanaKathaRead);
                            Scanner ReadMataSanghadanaKatha = new Scanner(MataSanghadanaKathaTxt);
                            while(ReadMataSanghadanaKatha.hasNext()){
                            System.out.println(ReadMataSanghadanaKatha.nextLine());
                            }
                            break;
                            case 6:
                            FileReader SesanadanaKathaRead = new FileReader("SesanadanaKatha.txt");
                            BufferedReader SesanadanaKathaTxt = new BufferedReader(SesanadanaKathaRead);
                            Scanner ReadSesanadanaKatha = new Scanner(SesanadanaKathaTxt);
                            while(ReadSesanadanaKatha.hasNext()){
                            System.out.println(ReadSesanadanaKatha.nextLine());
                            }
                            break;
                            case 7:
                            FileReader PavaranapannaRead = new FileReader("Pavaranapanna.txt");
                            BufferedReader PavaranapannaTxt = new BufferedReader(PavaranapannaRead);
                            Scanner ReadPavaranapanna = new Scanner(PavaranapannaTxt);
                            while(ReadPavaranapanna.hasNext()){
                            System.out.println(ReadPavaranapanna.nextLine());
                            }
                            break;
                        }
                    }
            }
            isContinue = GetYesOrNot("Apakah anda ingin melanjutkan");
        }
            
    }

    private static boolean GetYesOrNot(String message){
        Scanner terminalInput = new Scanner(System.in);
        String PilihanUser;
        System.out.print(message + " [y/n] : ");
        PilihanUser = terminalInput.next();
        while(!PilihanUser.equalsIgnoreCase("y") && !PilihanUser.equalsIgnoreCase("n")){
            System.err.println("Pilihan anda bukan Y/N");
            System.out.print(message + " [y/n] : ");
            PilihanUser = terminalInput.next();
        }
        return PilihanUser.equalsIgnoreCase("y");
    }

    private static void ClearScreen(){
        try{
            if(System.getProperty("os.name").contains("Windows")){
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();    
            }else{
                System.out.println("\033\143");
            } 
        } catch(Exception e){
            System.err.println("Tidak Bisa Clear Screen!");
        }
    }
}
