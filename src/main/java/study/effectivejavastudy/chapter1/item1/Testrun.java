package study.effectivejavastudy.chapter1.item1;

import java.util.EnumSet;

public class Testrun {
    public static void main(String[] args) {
        // static 메서드는 인터페이스에만 바로 사용 가능
        Test.run();

        Test testImpl = new TestImpl();

        // default 메서드는 인스턴스에만 사용 가능
        testImpl.run2();
    }
}
