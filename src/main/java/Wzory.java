public class Wzory {
    private double sinA;
    private double cosA;
    private double tanA;
    private double ctanA;

    private double sinB;
    private double cosB;
    private double tanB;
    private double ctanB;


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

    public double calSinA(int a, int c){
        sinA = a/c;
        return sinA;
    }//calculate Sinus

    public double calCosA(int a, int c){
        cosA = a/c;
        return cosA;
    }//calculate Sinus

    public double calTanA(int a, int c){
        tanA = a / c;
        return tanA;
    }//calculate Sinus

    public double calCtanA(int a, int c){
        ctanA = a / c;
        return ctanA;
    }//calculate Sinus

    public void giveInfo(){
        System.out.println("Sin A : " + sinA);
        System.out.println("Cos A : " + cosA);
    }
}

// to do
// poprawi\c funkcje z liceniem














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