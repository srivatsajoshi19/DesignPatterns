package facade;

public class OrderMain {

        public void placeOrder(){
            Product product = new Product();
            Payment payment = new Payment();
            Bill bill = new Bill();

            product.getInformation();
            bill.generateBill();
            payment.payOnline();
        }

    public static void main(String[] args) {
        OrderMain order = new OrderMain();
        order.placeOrder();
    }

}
