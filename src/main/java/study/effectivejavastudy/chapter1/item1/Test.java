package study.effectivejavastudy.chapter1.item1;

/**
 * 1. 자바8버전부터 인터페이스에 정적 메서드를 추가할 수 있게 되었다.
 * - static 메서드는 인스턴스를 만들고나서는 사용 불가
 * - default 메서드는 인터페이스 자체로는 사용 불가, 인스턴스를 만들어야 한다.
 * - 인터페이스에 메서드를 정의할때는 기본적으로 public 적용된다.
 * - 자바9버전 부터는 private도 가능해졌다.
 * - 그러나, private이 허용된건 정적 메서드만 가능!, 정적 필드와 정적 정적 멤버 클래스는 여전히 public만 허용
 */
public interface Test {

    // 기본적으로 public으로 들어가니 빼도 된다.
    public static void run()
    {
        System.out.println("run");
        stop();
    }

    private static void stop()
    {
        System.out.println("stop");
    }

    public default void run2()
    {
        System.out.println("run2");
    }


}
