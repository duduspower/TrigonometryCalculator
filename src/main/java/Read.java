import java.util.Scanner;

public class Read {

    private double number;

    public double getIn() {
        Scanner in = new Scanner(System.in);

        do{
            do {
                System.out.println("Podaj liczbę : ");
                number = in.nextDouble();

                if(number == 0){
                    System.out.println("Podaj liczbę inną niż 0!");
                }

                if(number < 0){
                    System.out.println("Podaj liczbę dodatnią!");
                }
                System.out.println(" ");
            }while (number < 0);
        }while(number == 0);
        return number;
    }

    public boolean daSie(double a, double b, double c){
        boolean bool = false;
        if(a + b > c && c + b > a && c + a > b){
            bool = true;
        }
        else{
            System.out.println("Z podanych boków nie da się zbudować trójkąta!");
            System.out.println("Podaj dane ponownie!\n\n\n");
        }
        return bool;
    }

    public void info(){
        System.out.println("Podaj w kolejności (x,y,b,c,d,e) : ");

    }
}
