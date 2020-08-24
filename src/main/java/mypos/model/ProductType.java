package mypos.model;

public enum ProductType {

    E("Elaborated"), M("Modified"), R("Resale");

    private String type;
    
    ProductType(String value) {
        this.type=value;
    }
    
    
    @Override
    public String toString() {
        return type;
    }
}
