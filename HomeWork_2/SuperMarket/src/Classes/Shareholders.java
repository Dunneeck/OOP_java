package Classes;

public class Shareholders extends Actor {

  private int idShareholder;
  public static int numberOfShareholders; // не хватает времени и мозгов чтобы сделать
                                          // ограницение по аукционерам, но примерно представлю как надо
                                          // при создании аукционера отнимать от переменной 1 и когда будет 0
                                          // то создавать не акционера, а ordinary

  /**
   * @param name name client
   * @param idShareholder id client
   */
  public Shareholders(String name, int idShareholder) {
    super(name);
    this.idShareholder = idShareholder;
  }

  public int getId() {
    return idShareholder;
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
   * return product
   * @return if true => back product
   */
  public boolean isReturnOrder() {
    return super.isReturnOrder;
  }

  public void setTakeOrder(boolean makeOder) {
    super.isMakeOrder = makeOder;
  }

  public void setMakeOrder(boolean pikUpOrder) {
    super.isTakeOrder = pikUpOrder;
  }

  /**
   * return product
   * @param backOrder true => back product
   */
  public void setReturnOrder(boolean backOrder) {
    super.isReturnOrder = backOrder;
  }


  public Actor getActor() {
    return this;
  }

}
