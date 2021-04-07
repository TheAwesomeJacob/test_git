package CaclculatorProgramm;

public class Calculate {
    public static void main(String[] args){
        Calculator operation = new Calculator();
        double x = 4;
        double y = 2;
        double z = 10;
        System.out.println(operation.add(x,y));
        System.out.println(operation.add(x,y,z));
        System.out.println(operation.subtract(x,y));
        System.out.println(operation.subtract(x,y,z));
        System.out.println(operation.multiply(x,y));
        System.out.println(operation.divide(x,y));
    }
}
