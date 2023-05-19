public enum Carte {
    VISA("VISA"),
    MAESTRO("MAESTRO"),
    MASTERCARD("MASTERCARD");

    private String type;

    Carte(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
