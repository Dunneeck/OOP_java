package Classes;

public class OrdinaryClient extends Actor {

    public OrdinaryClient(String name) {
      super(name);
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
