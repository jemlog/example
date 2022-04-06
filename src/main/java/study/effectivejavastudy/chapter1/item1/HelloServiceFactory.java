package study.effectivejavastudy.chapter1.item1;

import java.util.Optional;
import java.util.ServiceLoader;

public class HelloServiceFactory {

    // 인터페이스로 반환한다 하고, 구현체를 반환할 수 있다.
    // 하위클래스를 반환할 수도 있다.
    // 4번째 장점 : 매개변수에 따라서 다른 구현체를 반환할 수 있다.
    // 자바 8 이전에는 static 메서드를 인터페이스에 선언 불가였지만, 8부터는 선언 할 수 있다.


    public static void main(String[] args) {

        /*
        지금 참조할 수 있는 classpath 내에 있는 HelloService의 구현체들을 가져옴
        인터페이스만 있으면 돼, 구현체 필요없음
        서비스 프로바이더 프레임워크의 자바 기본 구현체 -> ServiceLoader

         */
        ServiceLoader<HelloService> loader = ServiceLoader.load(HelloService.class);
        Optional<HelloService> helloServiceOptional = loader.findFirst();
        helloServiceOptional.ifPresent(h->{
            System.out.println(h.hello());
        });


    }
}
