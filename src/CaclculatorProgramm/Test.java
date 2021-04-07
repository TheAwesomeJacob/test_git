package CaclculatorProgramm;

import CaclculatorProgramm.ConversionOfHour;
import CaclculatorProgramm.ConversionOfUnits;

public class Test {
    public static void main(String[] args){
        ConversionOfHour hour = new ConversionOfHour();
        ConversionOfUnits unit = new ConversionOfUnits();
        double a = 400;
        int b = 14;
        System.out.println(unit.centymetryNaMetry(a));
        System.out.println(unit.metryNaCentymetry(a));
        System.out.println(unit.metryNaMilimetry(a));
        System.out.println(unit.milimetryNaMetry(a));
        System.out.println(hour.godzinyNaMinuty(b));
        System.out.println(hour.minutyNaSekundy(b));
        System.out.println(hour.sekundyNaMilisekundy(b));
        b = hour.godzinyNaMinuty(b);
        b = hour.minutyNaSekundy(b);
        b = hour.sekundyNaMilisekundy(b);
        System.out.println(b);
    }
}
