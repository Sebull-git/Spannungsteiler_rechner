import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte" +
                " Widerstand eingeben (R): ");
        double R = scanner.nextDouble();
        double Rg; //Gesammtwiderstand
        System.out.println("Bitte Eingangsspannung eingeben (u1) : ");
        double u1 = scanner.nextDouble(); //Eingansspannung
        double u2; //Ausgangsspannung
        double Rparallel;
        System.out.println("Bitte Belastungswiderstand eingeben (RL): ");
        double RL = scanner.nextDouble();

        System.out.println("|---x----------U2---|");
        for (double x = 0; x <= 1; x+= 0.1) {

            Rparallel = R *x*RL / (R*x+RL);
            u2 = Rparallel  / (Rparallel +(1-x) * R )*u1;

            System.out.println(String.format("|%8.1f | %8.4f|", x,u2));

        }

        System.out.println("---------------------");

    }
        
    }
    

