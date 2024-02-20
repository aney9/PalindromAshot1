import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        boolean palindrom = true;
        while (palindrom) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите строку: ");
            String slovo = sc.nextLine();
            slovo = slovo.replaceAll("\\s", "");
            slovo = slovo.toLowerCase();
            char[] letters = slovo.toCharArray();
            char[] p = new char[letters.length];
            System.arraycopy(letters, 0, p, 0, letters.length);
            for (int i = 1; i <= letters.length / 2; i++) {
                if (p[i] != p[letters.length - i - 1]) {
                    System.out.println("Это не палиндром");
                    palindrom = false;
                    System.out.println(slovo);
                    break;
                } else {
                    System.out.println("Это палиндром");
                    System.out.println(slovo);
                    break;
                }
            }
        }
    }
}