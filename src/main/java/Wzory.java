public class Wzory {
    private double sinA;

    private double sinB;

    private double angle1;
    private double angle2;

    private double a;
    private double b;
    private double c;

    final double Pi = Math.PI;

    public double getA(){return a;}

    public void setA(double val){a = val;}

    public double getB(){return b;}

    public void setB(double val){b = val;}

    public double getC(){return c;}

    public void setC(double val){c = val;}

    public double getSinA(){
        return sinA;
    }

    public void setSinA(int a){
        sinA = a;
    }

    public double getSinB(){
        return sinB;
    }

    public void setSinB(int b){
        sinA = b;
    }

    public double getAngle1() {
        return angle1;
    }

    public void setAngle1(double angle1A) {
        this.angle1 = angle1;
    }

    public double getAngle2() {
        return angle2;
    }

    public void setAngle2(double angle2A) {
        this.angle2 = angle2;
    }

    public double calSinA(){
        sinA = a / c;
        return sinA;
    }//calculate Sinus

    public double calSinB(){
        sinB = b / c;
        return sinB;
    }//calculate Sinus

    public void calculateAngles(){
        calSinA();
        calSinB();
    }

    public void giveInfo(){
        System.out.println("A : " + a);
        System.out.println("B : " + b);
        System.out.println("C : " + c);

        System.out.println("Sin A :  " + sinA);

        System.out.println("");

        System.out.println("Sin B :  " + sinB);
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

    public double calculatePitagoras(double a, double b){
        double c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        return c;
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