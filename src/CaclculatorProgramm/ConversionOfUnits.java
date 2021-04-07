package CaclculatorProgramm;

public class ConversionOfUnits {
    double metryNaCentymetry(double x){
        return x*=100;
    }
    double metryNaMilimetry(double x){
        return x*=1000;
    }
    double centymetryNaMetry(double x){
        return x/=100;
    }
    double milimetryNaMetry(double x){
        return x/=1000;
    }
}
