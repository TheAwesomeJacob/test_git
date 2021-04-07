package Groccery;

public class Apple  extends Fruit{
    private String appleType;

    public String getAppleType() {
        return appleType;
    }

    public void setAppleType(String appleType) {
        this.appleType = appleType;
    }

    Apple(int weight, String type, String appleType){
        super(weight, type);
        this.appleType = appleType;
    }
    public void printInfo(){
        super.printInfo();
        printApple();
    }
    public void printApple(){
        System.out.println("Typ jabłka: " + appleType);
    }
}
