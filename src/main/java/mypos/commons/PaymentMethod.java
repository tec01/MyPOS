package mypos.commons;

public enum PaymentMethod {
    CASH("Cash"), CARD("Card");
    private String type;

    PaymentMethod(String value){
        this.type=value;
    }
    @Override
    public String toString() {
        return type;
    }
}
