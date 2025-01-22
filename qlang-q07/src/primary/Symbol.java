public abstract class Symbol{
   
    protected final String name;
    protected final QType type;
    protected QValue value;
    protected boolean valueDefined;
    protected String varName;
    
    public Symbol(String name, QType type) {
        assert name != null;
        assert type != null;

        this.name = name;
        this.type = type;
    }

    public void setValue(QValue value) {
        assert value != null;

        this.value = value;
    }

    public String name(){
        return name;
    }

    public void setVarName(String varName) {
        assert varName != null;

        this.varName = varName;
    }

    public String varName(){
        return varName;
    }

    public QType type(){
        return type;
    }

    public void setValueDefined(){
        valueDefined = true;
    }

    public boolean valueDefined(){
        return valueDefined;
    }

    public QValue value(){
        assert valueDefined();

        return value;
    }

}

