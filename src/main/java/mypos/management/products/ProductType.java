package mypos.management.products;

public enum ProductType {

    E("Elaborated"), MODIFIED("Modified"), RESALE("Resale");

    private String type;
    
    ProductType(String value) {
        this.type=value;
    }
    
    
    @Override
    public String toString() {
        return type;
    }
}
