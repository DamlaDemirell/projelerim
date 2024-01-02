import java.util.Scanner;

public class resitlik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Doğum tarihiniz (Yıl) : ");
        int dogumTarihi = input.nextInt();
        int yas;
        yas = 2024 - dogumTarihi;

        if(yas>=18)
        {
            System.out.println("Reşitsiniz.");
        } else if (yas <18)
        {
            System.out.println("Reşit değilsiniz.");
        }
    }
}
