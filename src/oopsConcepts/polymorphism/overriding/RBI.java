package oopsConcepts.polymorphism.overriding;

public class RBI {
    int rateOfInterest(){
        return 5;
    }
}
class HDFC extends RBI{

    int rateOfInterest() {
        return 6;
    }
}
class ICICI extends RBI{
    int rateOfInterest() {
        return 7;
    }
}
class Canara extends RBI{
    int rateOfInterest() {
        return 8;
    }
}

class OverRiding {
    public static void main(String[] args) {
        HDFC h = new HDFC();
        ICICI i = new ICICI();
        Canara c = new Canara();
        System.out.println("ROI of HDFC: " + h.rateOfInterest());
        System.out.println("ROI of ICICI: " + i.rateOfInterest());
        System.out.println("ROI of Canara: " + c.rateOfInterest());
    }
}
