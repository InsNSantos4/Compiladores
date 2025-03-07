public class RealValue extends Value{

    private double val;

    private static RealType type = new RealType();

    public RealValue(double val){
      setRealValue(val);
    }

   @Override
   public Type type(){
      return type;
    }

   @Override
   public void setRealValue(double val){
      this.val = val;
    }

   @Override
   public double realValue(){
      return val;
    }

   @Override
   public String toString(){
      return ""+val;
    }

}
