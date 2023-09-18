import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
//        Thread thread = new Thread();
        System.out.println("Ramazan pidesi kuyruğuna hoş geldiniz....");
        Queue<String> pide_kuyrugu = new LinkedList<>();
        pide_kuyrugu.offer("Murat");
        pide_kuyrugu.offer("Hasan");
        pide_kuyrugu.offer("Can");
        pide_kuyrugu.offer("Ayşe");
        pide_kuyrugu.offer("Merve");
        pide_kuyrugu.offer("Ezgi");
        pide_kuyrugu.offer("Gizem");
        pide_kuyrugu.offer("Mehmet");
        pide_kuyrugu.offer("Oğuz");
        pide_kuyrugu.offer("Azer");
        int pide_sayisi= 1 + random.nextInt(10);
        System.out.println("Pideler Çıkıyor");
        System.out.println("Çıkan Pide Sayısı: "+pide_sayisi);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        while (pide_sayisi!=0){
            System.out.println(pide_kuyrugu.poll()+" pideyi aldı...");
            pide_sayisi-=1;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }



        }
        System.out.println("Pide kalmadı");


    }
}