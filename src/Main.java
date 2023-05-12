import java.security.KeyStore;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, minValue = 0, maxValue = 0, N;
        boolean firstComp = true;

        // Kullanıcıdan kaç değer karşılaştırmak istediği bilgisi alınır
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç değer karşılaştırmak istiyorsunuz: ");
        N = input.nextInt();

        // karşılaştırmak istediği değğer sayısı kadar çalışacak for döngüsü açılır
        for (int i = 1; i <= N; i++) {
            System.out.print(i + ". Sayıyı Giriniz: ");
            number = input.nextInt();
            // eğer döngünün ilk çalışması ise min ve max değere sayının kendisi atanır
            if (firstComp) {
                maxValue = number;
                minValue = number;
                firstComp = false;
                // eğer döngünün ilk çalışması değilse, yeni sayı, min ve max değerler ile karşılaştırılır
            } else {
                // yeni sayı min değerden küçükse min değere yeni sayı ataanır
                if (number < minValue) {
                    minValue = number;
                } else if (number > maxValue) {
                    maxValue = number;
                }
            }


        }
        System.out.println("En Büyük Sayı: " + maxValue);
        System.out.println("En Küçük Sayı: " + minValue);

    }

}
