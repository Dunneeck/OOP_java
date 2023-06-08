package Domen;

public class Drinks extends Product {
        private int volume;
    
        /**
         * Create a product for VM
         *
         * @param productId       id product
         * @param productName
         * @param productCategory
         * @param price
         * @throws Exception
         */
        public Drinks(int productId, String productName, String productCategory, double price, int volume) throws Exception {
            super(productId, productName, productCategory, price);
            this.volume = volume;
        }

        public int getVolume() {
            return volume;
        }
        /**
         * сеттер с проверкой 
        */
        public void setVolume(int volume) {
            if (volume <= 0) {
                throw new IllegalStateException(String.format("Объём указан некорректно!", volume));
            }
            this.volume = volume;
        }

        @Override
        public String toString()
        {
            return "Product{" +
            "name='" + super.getProductName() + '\'' +
            "category='" + super.getProductCategory() + '\'' +
            ", cost=" + super.getPrice() +
            ", volume=" + volume +
            '}';
        }
    }
