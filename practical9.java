class ShareMarket {
    private int availableShare = 200;
     void buyShares(String buyers, int quantity) {
        System.out.println(buyers + " wants to buy " + quantity + " shares");
       
        if (quantity <= availableShare) {
            System.out.println("Order processing for " + buyers);
           
       
            availableShare = availableShare - quantity;
           
            System.out.println(buyers + " successfully bought " + quantity + " shares");
            System.out.println("Available Shares: " + availableShare);
        } else {
            System.out.println("System Failed: Not enough shares for " + buyers);
        }
    }
}

class Buyer extends Thread {
    private ShareMarket market;
    private int quantity;

    public Buyer(ShareMarket market, String name, int quantity) {
        super(name);
        this.market = market;
        this.quantity = quantity;
    }
    @Override
    public void run() {
        market.buyShares(getName(), quantity);
    }
}
public class practical9 {
    public static void main(String[] args) {
        ShareMarket market = new ShareMarket();
       
        Buyer b1 = new Buyer(market, "Buyer 1", 100);
        Buyer b2 = new Buyer(market, "Buyer 2", 75);
        b1.start();
        b2.start();
    }
}