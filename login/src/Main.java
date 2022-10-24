import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     String userName, password, secim, newPw;

     Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı giriniz:");
        userName = input.nextLine();
        System.out.print("Parolanızı giriniz:");
        password = input.nextLine();

        if (userName.equals("egecan") && password.equals("egecan123")) {
            System.out.println("Başarıyla giriş yaptınız.");
        }else {
            System.out.println("Girdiğiniz bilgiler yanlış, şifrenizi sıfırlamak ister misiniz? y/n?");
            secim = input.nextLine();

            if (secim.equals("n")) {
                System.out.println("Tamam.");
            }else if (secim.equals("y")) {
                System.out.println("Yeni şifrenizi giriniz:");
                newPw = input.nextLine();
                if (newPw.equals("egecan123")){
                    System.out.println("Bir önceki şifre ile aynı, tekrar deneyiniz.");
                }else{
                    System.out.println("Yeni şifre başarıyla oluşturuldu.");
                }
                }
            }

        }


    }
