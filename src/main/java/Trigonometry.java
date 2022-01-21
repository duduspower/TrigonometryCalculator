public class Trigonometry {
    public static void main(String[] args) {
        Wzory wzory = new Wzory();
        Read read = new Read();

        double x;
        double y;

        double a;
        double b;
        double c;
        double d;
        double e;

        do {
            a = read.getIn();
            b = read.getIn();
            c = read.getIn();
        }while(read.daSie(a,b,c) == false);       //Pobranie danych do obliczenia kątów

        wzory.setA(a);
        wzory.setB(b);
        wzory.setC(c);

//        x = read.getIn();
//        y = read.getIn();
//
//        b = read.getIn(); // b do policzenia
//        c = read.getIn();
//        d = read.getIn();
//        e = read.getIn();
//
//        wzory.setB(b);
//        wzory.setC(c);// pominięcie b bo jest nieznane
//        wzory.setD(d);
//        wzory.setE(e);
//        wzory.setX(x);
//        wzory.setY(y);

        wzory.giveInfo();
        //wzory.calculateArm();

    }
}

