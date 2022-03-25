import java.util.Scanner;
class Main{
  public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
    System.out.println("podaj promień pierwszego koła r1");
    double r1 = scan.nextInt();
       System.out.println("podaj promień drugiego koła r2");
    double r2 = scan.nextInt();
    double a = 3.14;
    double wynik1 = r1*r1*a;
    double wynik2 = r2*r2*a;
    double wynik3 = wynik1 + wynik2;
    System.out.println("pole koła pierwszego wynosi: " +  wynik1);
    System.out.println("pole koła drugiego wynosi: " +  wynik2);
    System.out.println("suma pól koł wynosi : " +  wynik3);
  }
}