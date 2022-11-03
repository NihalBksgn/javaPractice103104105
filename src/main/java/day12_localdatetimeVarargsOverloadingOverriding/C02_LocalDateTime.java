package day12_localdatetimeVarargsOverloadingOverriding;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class C02_LocalDateTime {
    public static void main(String[] args) {
        /* Tom 29 Ekim 1923 tarihinden 45 yil 8 ay 5 gun sonra dogdu.
   Veli 15 Eylul 1993 tarihinden 24 yil 2 ay 11 gun sonra dogdu.
   Tom ve Veli'nin dogum tarihini hesaplayan kodu yazıniz.
   Tom ve Veli'nin dogum tarihlerinin aynı olup olmadığını kontrol eden kodu yazıniz.
 */

        LocalDate sabit = LocalDate.of(1923, Month.OCTOBER,29);
        LocalDate tom = sabit.plusYears(45).plusMonths(8).plusDays(5);
        LocalDate veli= sabit.plusYears(24).plusMonths(2).plusDays(11);

        String sonuc=  tom == veli ? ("dogum gunleri aynidir") : ("dogum gunleri ayni degildir");
        System.out.println(sonuc);


        //Iki saat dilimi arasindaki farki hesaplama

        //Japonya ile Alamnya arasindaki saat farkini hesaplatan kodu yaziniz

       LocalDateTime japan=  LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
       LocalDateTime germany= LocalDateTime.now(ZoneId.of("Europe/Berlin"));

       long fark = ChronoUnit.HOURS.between(germany,japan);
        System.out.println(fark);

        //Tarih 2022-20-31 ve saat 03:26:00pm oldugunda asagidaki kod ne yazdirir
        LocalTime time = LocalTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println(dtf.format(time.plusHours(2)));

        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("hh:mm");
        System.out.println(dtf2.format(time.minusHours(1)));

        DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("hh:mm:ss");
        System.out.println(dtf3.format(time.minusHours(1)));

        //gun ay yil olarak yazdirma
        LocalDate date= LocalDate.now();
        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("dd-MMMM-yy");
        System.out.println(dtf4.format(date));

        DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        System.out.println(dtf5.format(date));


        //Mevcut saat diliminden ileri geri gitme
        LocalTime saat = LocalTime.now();
        DateTimeFormatter dtf6 = DateTimeFormatter.ofPattern("hh:mm:ss");
        System.out.println(dtf6.format(saat.plusHours(2)));



    }
}
