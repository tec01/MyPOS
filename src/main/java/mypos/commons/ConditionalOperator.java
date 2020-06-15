package mypos.commons;

public enum ConditionalOperator {

    NONE(""),
    GREATER_EQUAL(">="),
    SMALLER_EQUAL("<="),
    EQUAL("=");
    private String operator;

    ConditionalOperator(String operator) {
        this.operator = operator;
    }
    
    @Override
    public String toString() {
        return operator;
    }
}
