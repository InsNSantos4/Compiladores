public abstract class QType
{
	protected final String name;
   protected QType(String name) {
      assert name != null;
      this.name = name;
   }

   public String name() {
      return name;
   }

   public boolean isNumeric() {
      return false;
   }

   @Override
   public String toString()
   {
      return name;
   }
}


