public class FractionValue extends QValue {
	 private int num;
	 private int den;

    private static FractionType type = new FractionType();


    public FractionValue(int n, int d){
      setFractionValue(n,d); 
    }

    @Override
    public QType type(){
        return type;
    }

    @Override
    public void setFractionValue(int n, int d){
        this.num = n;
        this.den = d;
    }

    @Override
    public double fractionValue(){
        return (double)this.num/this.den;
    }

    @Override
    public String toString(){
        return ""+num+"/"+den+"";
    }

    public int getNum() {
      return num;
    }

    public void setNum(int num) {
      this.num = num;
    }

    public int getDen() {
      return den;
    }

    public void setDen(int den) {
      this.den = den;
    }

    public static FractionType getType() {
      return type;
    }

    public static void setType(FractionType type) {
      FractionValue.type = type;
    }


}
