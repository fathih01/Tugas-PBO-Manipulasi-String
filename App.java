import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        String username = "admin";
        String password = "123abc";
        String captcha = generateCaptcha();

        System.out.println("\nSelamat datang! Silakan login.");
        Scanner scanner = new Scanner(System.in);

        System.out.print("------------------------------");
        System.out.print("\nMasukkan username\t: ");
        String inputUsername = scanner.nextLine();
        System.out.print("Masukkan password\t: ");
        String inputPassword = scanner.nextLine();
        System.out.print("------------------------------");
        System.out.println("\nCAPTCHA\t\t\t: " + captcha);
        System.out.print("Masukkan CAPTCHA\t: ");
        String inputCaptcha = scanner.nextLine();
        scanner.close();
        System.out.print("------------------------------");

        if (checkCaptcha(inputCaptcha, captcha) && checkLogin(inputUsername, inputPassword, username, password)) {
            System.out.println("\nLogin berhasil!\n");
        } else {
            System.out.println("\nLogin gagal. Coba lagi.\n");
        }
    }

    public static boolean checkLogin(String inputUsername, String inputPassword, String username, String password) {
        return username.equals(inputUsername) && password.equals(inputPassword);
    }

    public static String generateCaptcha() {
        return "AaBbCc";
    }

    public static boolean checkCaptcha(String inputCaptcha, String captcha) {
        return captcha.equalsIgnoreCase(inputCaptcha);
    }
}