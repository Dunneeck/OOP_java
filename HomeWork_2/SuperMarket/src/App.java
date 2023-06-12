import Classes.Market;
import Classes.OrdinaryClient;
import Classes.Shareholders;
import Classes.SpecialClient;
import Classes.TaxService;
import Interfaces.iActorBehaviour;

public class App {
    public static void main(String[] args) throws Exception {
        Market market = new Market();
        iActorBehaviour client1 = new OrdinaryClient("(OrdinaryClient)  Boris");
        iActorBehaviour client2 = new SpecialClient("(SpecialClient)        Prezident", 1);
        iActorBehaviour client4 = new Shareholders("(Shareholders)              Petya", 3);
        

        market.acceptToMarket(client1);
        client1.setReturnOrder(true);

        market.acceptToMarket(client2);
        client2.setReturnOrder(false);

        market.acceptToMarket(client4);
        client4.setReturnOrder(true);


        
        // market.acceptToMarket(new TaxService());
        
        market.update();
    }
}
