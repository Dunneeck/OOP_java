package Domen;

public class HotDrinks extends Drinks{
    private int temperature;

    /**
     * наследование от Drinks9
     * @param productId
     * @param productName
     * @param productCategory
     * @param price
     * @param volume
     * @param temperature
     * @throws Exception
     */
        public HotDrinks(int productId, String productName, String productCategory, double price, int volume, int temperature) throws Exception {
            super(productId, productName, productCategory, price, volume);
            this.temperature = temperature;
        }

        public int getTemperature() {
            return temperature;
        }
    
        public void setTemperature(int temperature) {
            this.temperature = temperature;
        }
        
        @Override
        public String toString()
        {
            return "Product{" +
            "name='" + super.getProductName() + '\'' +
            "category='" + super.getProductCategory() + '\'' +
            ", cost=" + super.getPrice() + '\'' +
            ", volume=" + super.getVolume() + '\'' +
            ", temperature=" + temperature +
            '}';
        }
}
