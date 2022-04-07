package study.effectivejavastudy.chapter1.item1;

// 서비스 제공자 인터페이스
public interface HelloService {

    String hello();

    // 인터페이스에 선언하는 모든 것은 public이다.
    // 이러면 아예 인터페이스의 구현체 자체를 만들 필요가 없다!!
//    static HelloService of(String lang)
//    {
//        if(lang.equals("ko"))
//        {
//            return new KoreanHelloService();
//        }
//        else
//        {
//            return new EnglishHelloService();
//        }
//    }
}
