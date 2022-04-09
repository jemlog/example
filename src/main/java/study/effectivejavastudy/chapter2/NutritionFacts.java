package study.effectivejavastudy.chapter2;

/**
 * 만약 생성자나 정적 팩토리 메서드의 매개변수가 4개 이상 넘어간다면 애초에 Builder 패턴을 생각해보자.
 */
public class NutritionFacts {

    /*
    public : 모두가 접근 가능
    default : 같은 패키지 내에서만 접근 가능
    private : 해당 클래스 내에서만 접근 가능
    protected : 상속받은 곳에서만 사용 가능
    final -> 1. 클래스에 final 상속 불가
             2. 변수에 final 무조건 초기화, 값 변경 불가
             3. 메서드에 final 오버라이딩 금지
     */
    private final int servingSize;
    private final int servings;
    private int fat;

    public static class Builder{

        private final int servingSize;
        private final int servings;

        private int fat = 0;

        /*
        필수적인 필드는 Builder 생성자에 넣어준다.
         */
        public Builder(int servingSize,int servings)
        {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        /*
        부가적인 요소는 메소드 체이닝 형태로 넣어준다.
         */
        public Builder fat(int val)
        {
            fat = val;
            // 필드 초기화 후 자기자신 반환 this는 Builder를 가리킨다.
            // 클래스 내 메서드에서 this를 호출하면 클래스 자신을 반환!
            return this;
        }

        /*
        마무리는 build 메서드로 진행
        Builder를 가지고 실제 NutritionFacts를 만들어낸다.
         */
        public NutritionFacts build()
        {
            return new NutritionFacts(this);
        }
    }

    /*
    실제 NutritionFacts가 만들어지는 생성자
     */
    private NutritionFacts(Builder builder)
    {
        this.servingSize = builder.servingSize;
        this.servings = builder.servings;
        this.fat = builder.fat;
    }
}
