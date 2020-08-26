package mypos.model;

public enum DiscountType {

    PERCENT("Percent"), CASH("Cash");
    private String type;

    DiscountType(String value){
        this.type=value;
    }
    @Override
    public String toString() {
        return type;
    }
}
