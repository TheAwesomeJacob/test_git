package Kolejka;
public enum Priority {
    LOW("Niski"), MODERATE("Średni"), HIGH("Wysoki");

    private final String decrypt;

    private Priority(String decrypt) {
        this.decrypt = decrypt;
    }

    public String getDecrypt() {
        return decrypt;
    }

}
