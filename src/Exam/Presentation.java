package Exam;

public class Presentation {
    public String printInformation(String x, String y) {
        if (y == null) {
            return "Witaj " + x;
        } else if (x == null) {
            return "Dzień dobry panie/pani " + y;
        } else if (x!=null && y!=null){
            return "Witaj " + x + " " + y;
        }
        else {
            return "Witaj nieznajomy";
        }

    }
}
