package Classes;

public class SpecialClient extends Actor{
    private int idVIP;
    public SpecialClient(String name, int idVIP) {
        super(name);
        this.idVIP = idVIP;
    }

    public int getId() {
        return idVIP;
    }

    @Override
    public String getName() {
        return super.name;
    }

    public boolean isTakeOrder() {
      return super.isTakeOrder;
    }

    public boolean isMakeOrder() {
      return super.isMakeOrder;
    }
    /**
     * 
     */
    public boolean isReturnOrder(){
      return super.isReturnOrder;
    }

    public void setTakeOrder(boolean makeOder) {
      super.isMakeOrder = makeOder;
    }
    
    public void setMakeOrder(boolean pikUpOrder) {
      super.isTakeOrder = pikUpOrder;
    }

    /**
     * 
     * @param backOrder
     */
    public void setReturnOrder(boolean backOrder){
      super.isReturnOrder = backOrder;
    }

    public Actor getActor() {
      return this;
    }
}
