package mypos.commons;

public enum ConditionalOperator {

    NONE,
    GREATER_EQUAL,
    SMALLER_EQUAL,
    EQUAL;

    public String getValue(){
      switch(this) {
          case NONE:
              return "";

          case GREATER_EQUAL:
              return ">=";

          case SMALLER_EQUAL:
              return "<=";

          case EQUAL:
              return "=";

          default:
              return null;
      }
    }

}
