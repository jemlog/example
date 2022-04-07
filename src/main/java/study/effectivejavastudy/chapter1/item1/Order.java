package study.effectivejavastudy.chapter1.item1;

import java.util.Arrays;

public class Order {

    private boolean prime;

    private boolean urgent;

    private Product product;

    private OrderStatus orderStatus;

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

    public static void main(String[] args) {
        /*
        equals를 null에다가 쓰면 NPE 날 수 있다.
        ==으로 쓰는게 안전하다! 어차피 JVM 레벨에서 하나만 생성되는걸 보장!
        공부 과제 : ENUM을 키로 사용하는 MAP, ENUM만을 담고 있는 SET
        ENUMMAP, ENUMSET => 이걸 쓰는게 왜 빠를까??
         */
        // 모든 enum type을 알고있냐
        Arrays.stream(OrderStatus.values()).forEach(System.out::println);

    }



}
