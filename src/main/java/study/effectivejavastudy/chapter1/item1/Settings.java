package study.effectivejavastudy.chapter1.item1;

import java.util.ArrayList;
import java.util.List;

public class Settings {

    private boolean useAutoSteering;

    private boolean useABS;

    private Difficulty difficulty;

    // 생성자 자체를 private으로 외부 호출 불가능하게 만들어준다.
    // 상속을 허용하지 않게 만든다.
    // static 한 정적 팩토리 메서드도 제공하면서 public 생성자도 제공하는 경우가 있다.

    public Settings()
    {

    }

    /*
    of -> 매개변수들을 받아서 만들때
    getInstance,instance -> 기존에 만들어져있는거 가져올때
    newInstance, create -> 매번 정적 팩토리 메서드 안에서 만듦
    javadoc에서 명확히 알 수 있도록 하기 위해서!
    가장 좋은 방법은 문서화를 하기!
     */
    public Settings(boolean useAutoSteering, boolean useABS, Difficulty difficulty) {
        this.useAutoSteering = useAutoSteering;
        this.useABS = useABS;
        this.difficulty = difficulty;
    }

    /*
        장점2 : 객체 생성을 자신이 컨트롤하겠다!!!
        인스턴스를 매번 만들지, 한번만 만들지 통제할 필요가 있다.
        통제 불가 -> 어디서든 생성자를 사용해서 인스턴스를 만들 수 있다.
        인스턴스 통제를 위해서는 정적 팩토리 메서드를 사용해야 한다.
         */
    private static final Settings SETTINGS = new Settings();


    // 오로지 정적 팩토리 메서드를 통해서만 인스턴스를 얻을 수 있다.
    public static Settings newInstance()
    {
        return SETTINGS;
    }

    public static void main(String[] args) {
        // 둘 다 가능한 케이스
        List<String> list = new ArrayList<>();
        List.of("keesun","whiteship");
    }
}
