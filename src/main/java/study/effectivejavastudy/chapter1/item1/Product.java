package study.effectivejavastudy.chapter1.item1;

public class Product {

    public static void main(String[] args) {

        Settings settings1 = Settings.newInstance();
        Settings settings2 = Settings.newInstance();

        // 생성자로는 인스턴스의 생성을 컨트롤 할 수 없다.
        /*
        플라이웨이트 패턴 : 미리 만들어져있는 폰트들 중에서 가져옴
        자주 사용하는 값들을 캐싱해서 넣어놓고 원할때 꺼내와서 쓴다.

         */
        System.out.println(settings1);
        System.out.println(settings2);
        Boolean.valueOf(false);
    }



}
