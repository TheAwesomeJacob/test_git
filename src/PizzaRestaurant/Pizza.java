package PizzaRestaurant;

enum Pizza {
    MARGHERITA("Margherita","sos pomidorowy", "ser"),
    CAPRICIOSA("Capriciosa","sos pomidorowy", "ser", "pieczarki"),
    PROSCIUTTO("Prosciutto","sos pomidorowy", "ser", "szynka");
    private final String sosPomidorowy;
    private final String ser;
    private String dodatek;
    private final String name;

    private Pizza(String name, String sosPomidorowy, String ser) {
        this.sosPomidorowy = sosPomidorowy;
        this.ser = ser;
        this.name = name;
    }
    private Pizza (String name, String sosPomidorowy, String ser, String dodatek) {
        this(name, sosPomidorowy, ser);
        this.dodatek = dodatek;

    }

    public String getSosPomidorowy() {
        return sosPomidorowy;
    }

    public String getSer() {
        return ser;
    }

    public String getDodatek() {
        return dodatek;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        if(dodatek != null) {
            return
                    "baza ='" + sosPomidorowy + '\'' +
                    ", druga baza ='" + ser + '\'' +
                    ", dodatek ='" + dodatek + '\'';
        }
        else{
            return
                    "baza ='" + sosPomidorowy + '\'' +
                    ", druga baza ='" + ser + '\'';
        }
    }
    public static Pizza fromName(String description) {
        Pizza[] values = values();
        for (Pizza name : values) {
            if (name.getName().equals(description))
                return name;
        }
        return null;
    }
}
