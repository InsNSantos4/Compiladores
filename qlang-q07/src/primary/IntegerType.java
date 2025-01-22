public class IntegerType extends QType {
    public IntegerType() {
        super("integer");
    }
  
    public boolean isNumeric() {
        return true;
    }
}
