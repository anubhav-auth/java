package ITER.Sem2.Assignment2.assignemnt;

abstract class Marks{
    double markICP;
    double markDSA;
    double percentage;

    abstract void getPercentage();
}

class CSE extends Marks{
    double algoDesign;

    @Override
    void getPercentage() {
        super.percentage = (super.markDSA + super.markICP + this.algoDesign)/300 * 100;
        System.out.println(super.percentage);
    }
}
class NonCSE extends Marks{
    double enggMechanics;

    @Override
    void getPercentage() {
        super.percentage = (super.markDSA + super.markICP + this.enggMechanics)/300 * 100;
        System.out.println(super.percentage);
    }
}



public class Q6 {
    public static void main(String[] args) {
        CSE cse = new CSE();
        NonCSE nonCSE = new NonCSE();

        cse.algoDesign = 90;
        cse.markICP = 89;
        cse.markDSA = 88;

        nonCSE.enggMechanics = 90;
        nonCSE.markICP = 89;
        nonCSE.markDSA = 88;

        cse.getPercentage();
        nonCSE.getPercentage();

    }


}
