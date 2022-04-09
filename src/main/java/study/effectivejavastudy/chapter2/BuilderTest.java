package study.effectivejavastudy.chapter2;

public class BuilderTest {
    public static void main(String[] args) {
        NutritionFacts cocaCola = new NutritionFacts.Builder(240, 8).fat(10).build();
    }
}
