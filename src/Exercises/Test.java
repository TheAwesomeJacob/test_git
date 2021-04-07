package Exercises;

public class Test {
    public static void main(String[] args) {
        Tire tire = new Tire();
        ExhaustPart exhaustPart = new ExhaustPart();
        Part part = new Part();
        part.setId(1);
        part.setModel("Honda");
        part.setName("Szyba");
        part.setSeria("2012342");
        System.out.println(part.getId() + " " + part.getModel() + " " + part.getName() + " " + part.getSeria());
        tire.setId(2);
        tire.setModel("Opel zimowe");
        tire.setName("Zimowe 2012 nowe");
        tire.setSeria("123r212");
        tire.setSize(20);
        tire.setWidth(300);
        System.out.println(tire.getId() + " " + tire.getModel() + " " + tire.getName() + " " + tire.getSeria() + " " + tire.getSize() + " " + tire.getWidth());
    }

}
