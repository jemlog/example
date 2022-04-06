package study.effectivejavastudy.chapter1.item1;

public class Order {

    private boolean prime;

    private boolean urgent;

    private Product product;

    /*
    장점1 : 이름에 의미를 부여할 수 있다.
     */
    public static Order primeOrder(Product product)
    {
        Order order = new Order();
        order.prime = true;
        order.product = product;
        return order;
    }

    public static Order urgentOrder(Product product)
    {
        Order order = new Order();
        order.urgent = true;
        order.product = product;
        return order;
    }



}
