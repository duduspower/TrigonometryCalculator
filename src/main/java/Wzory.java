public class Wzory {
    private double sinA;
    private double cosA;
    private double tanA;
    private double ctanA;

    private double sinB;
    private double cosB;
    private double tanB;
    private double ctanB;

    private double angle1A;
    private double angle2A;

    private double angle1B;
    private double angle2B;

    private double x;
    private double y;

    private double a;
    private double b;
    private double c;
    private double d;
    private double e;


    final double Pi = Math.PI;

    public double getA(){return a;}

    public void setA(double val){a = val;}

    public double getB(){return b;}

    public void setB(double val){b = val;}

    public double getC(){return c;}

    public void setC(double val){c = val;}

    public double getD(){return d;}

    public void setD(double val){d = val;}

    public double getE(){return e;}

    public void setE(double val){e = val;}

    public double getX(){return x;}

    public void setX(double val){x = val;}

    public double getY(){return y;}

    public void setY(double val){y = val;}

    public double getSinA(){
        return sinA;
    }

    public void setSinA(int a){
        sinA = a;
    }

    public double getCosA(){
        return cosA;
    }

    public void setCosA(int a){
        cosA = a;
    }

    public double getTanA(){
        return tanA;
    }

    public void setTanA(int a){
        tanA = a;
    }

    public double getCtanA(){
        return ctanA;
    }

    public void setCtanA(int a){
        ctanA = a;
    }

    public double getAngle1A() {
        return angle1A;
    }

    public void setAngle1A(double angle1A) {
        this.angle1A = angle1A;
    }

    public double getAngle2A() {
        return angle2A;
    }

    public void setAngle2A(double angle2A) {
        this.angle2A = angle2A;
    }

    public double getAngle1B() {
        return angle1B;
    }

    public void setAngle1B(double angle1B) {
        this.angle1B = angle1B;
    }

    public double getAngle2B() {
        return angle2B;
    }

    public void setAngle2B(double angle2B) {
        this.angle2B = angle2B;
    }

    public double calSinA(){
        sinA = a / c;
        return sinA;
    }//calculate Sinus

    public double calCosA(){
        cosA = b / c;
        return cosA;
    }

    public double calTanA() {
        tanA = a / b;
        return tanA;
    }

    public double calCtanA(){
        ctanA = b / a;
        return ctanA;
    }

    public double calSinB(){
        sinB = b / c;
        return sinB;
    }//calculate Sinus

    public double calCosB(){
        cosB = a / c;
        return cosB;
    }

    public double calTanB() {
        tanB = b / a;
        return tanB;
    }

    public double calCtanB(){
        ctanB = a / b;
        return ctanB;
    }

    public void calculateAngles(){
        calSinA();
        calSinB();
        calCosA();
        calCosB();
        calTanA();
        calTanB();
        calCtanA();
        calCtanB();
    }

    public void calculateA(){
        calSinA();
        calCosA();
        calTanA();
        calCtanA();
    }

    public void calculateB(){
        calSinB();
        calCosB();
        calTanB();
        calCtanB();
    }

    public void calculateSide(){
    }

    public void giveInfo(){
        System.out.println("A : " + a);
        System.out.println("B : " + b);
        System.out.println("C : " + c);

        System.out.println("Sin A :  " + sinA);
        System.out.println("Cos A :  " + cosA);
        System.out.println("Tag A :  " + tanA);
        System.out.println("Ctag A : " + ctanA);

        System.out.println("");

        System.out.println("Sin B :  " + sinB);
        System.out.println("Cos B :  " + cosB);
        System.out.println("Tag B :  " + tanB);
        System.out.println("Ctag B : " + ctanB);

    }

    public void giveAngle(){
        System.out.println("Angle A : " + sinToDegrees(sinA));
        System.out.println("Angle B : " + sinToDegrees(sinB));
    }

    public double convertToDegrees(double rad){
        double val = rad * 180 / Pi;
        return val;
    }

    public double aSin(double sin){
        return Math.asin(sin);
    }

    public double sinToDegrees(double sin){
        sin = aSin(sin);
        sin = convertToDegrees(sin);

        return sin;
    }

    public double aTan(double tan){
        return Math.atan(tan);
    }

    public double calculatePitagorasA(double b, double c){
        a = Math.sqrt(Math.pow(c,2) - Math.pow(b,2));
        return a;
    }

    public double calculatePitagorasB(double a, double c){
        b = Math.sqrt(Math.pow(c,2) - Math.pow(a,2));
        return b;
    }

    public double calculatePitagorasC(double a, double b){
        double c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        return c;
    }

    public double calculateArm1(double arm){ // do napisania żeby obliczało kąt kolejnych stage
        return arm;
    }

    public double calculateArm2(double arm){
        return arm;
    }

    public double calculateArm3(double arm){
        return arm;
    }

    public void calculateArm(){ // oblicza całość ramienia! To znaczy jeszcze nie :(

        double angle1 = 0;
        double angle2 = 0;
        double angle3 = 0;

        a = calculatePitagorasA(b,c);
        System.out.println("A : " + a);

        calSinA();
        calSinB();

        sinA = sinToDegrees(sinA);
        sinB = sinToDegrees(sinB);

        System.out.println("Trójkąt 1 : ");
        System.out.println("Angle 1 : " + sinA);
        System.out.println("Angle 2 : " + sinB);

        angle1 = sinA;
        angle2 = sinB + 90; // angle 2 + kąt prosty

        // trójkąt 1 policzony

        b = calculatePitagorasB(a,d);

        calSinA();
        calSinB();

        sinA = sinToDegrees(sinA);
        sinB = sinToDegrees(sinB);

        System.out.println("Trójkąt 2 : ");
        System.out.println("Angle 1 : " + sinA);
        System.out.println("Angle 2 : " + sinB);
        // trójkąt 2 policzony


        a = y - a;
        //c = calculatePitagorasC(a,b);

        calSinA();
        calSinB();

        sinA = sinToDegrees(sinA);
        sinB = sinToDegrees(sinB);

        System.out.println("Trójkąt 2 : ");
        System.out.println("Angle 1 : " + sinA);
        System.out.println("Angle 2 : " + sinB);

        angle3 = 90 + sinB;

        // trójkąt 3 policzony


        //Arm calculations
        System.out.println("Arm angles : ");
        System.out.println("Angle 1 : " + angle1);
        System.out.println("Angle 2 : " + angle2);
        System.out.println("Angle 3 : " + angle3);
    }
}

// to do
// poprawić funkcje z liczeniem














/*
                                B  B
                              / |
                 c     /        |
                 /              | a
           /                    |
  A  A /________________________| C
                    b

      sinA  = a/c
      cosA  = b/c
      tanA  = a/b
      ctanA = b/a

      sinB  = b/c
      cosB  = a/c
      tanB  = b/a
      ctanB = a/b

 */