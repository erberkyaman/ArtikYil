import java.util.Scanner;
public class ArtikYil {
    public static void main(String[] args) {
        int year;

        Scanner input= new Scanner(System.in);

        System.out.print("Yıl Giriniz: ");
        year= input.nextInt();

        if ((year%4)==0){
            System.out.print(year+" Bir Artık Yıldır");

        }
        else{
            System.out.print(year+" Bir Artık Yıl Değildir");
        }
    }
}
