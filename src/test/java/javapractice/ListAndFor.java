package javapractice;

import org.junit.jupiter.api.Test;

import java.util.*;

public class ListAndFor {

    @Test
    void 리스트그리고반복문연습() {
        ArrayList<Integer> 시험점수List = new ArrayList<>();

        시험점수List.add(80);
        시험점수List.add(60);
        시험점수List.add(70);
        시험점수List.add(100);
        시험점수List.add(90);

        for (Integer 시험점수 : 시험점수List) {
            System.out.println("시험점수: " + 시험점수);
        }

        int 총점 = 0;
        for (int 점수 : 시험점수List) {
            총점 = 점수 + 총점;
        }

        System.out.println("총점: " + 총점);

        int 평균점수 = 총점 / 시험점수List.size();

        System.out.println("평균점수: " + 평균점수);
    }

    @Test
    void 맵테스트1() {
        HashMap<String, String> product1 = new HashMap<>();
        product1.put("상품명", "코멧 니트릴장갑 화이트");
        product1.put("상품가격", "6540");
        product1.put("카테고리", "주방용품");

        HashMap<String, String> product2 = new HashMap<>();
        product2.put("상품명", "라운드랩 1025 독도 로션, 400ml, 1개");
        product2.put("상품가격", "16,910");
        product2.put("카테고리", "뷰티");

        HashMap<String, String> product3 = new HashMap<>();
        product3.put("상품명", "삼양 불닭볶음면 큰컵 105g, 16개");
        product3.put("상품가격", "17,110");
        product3.put("카테고리", "식품");

        ArrayList<HashMap<String, String>> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);

    }

    @Test
    void 맵테스트2() {

        HashMap<String, String> totyo = new HashMap<>();
        totyo.put("지방", "간토");
        totyo.put("인구수", "14,177,173");
        totyo.put("상징도화", "왕벚나무");
        totyo.put("도지사", "고이케 유리코");
        totyo.put("기후", "온난습윤기후");

        HashMap<String, String> Osaka = new HashMap<>();
        Osaka.put("지방", "간사이");
        Osaka.put("인구수", "8,768,019");
        Osaka.put("상징도화", "매실꽃");
        Osaka.put("도지사", "요시무라 히로후미");
        Osaka.put("기후", "온난습윤기후");

        ArrayList<HashMap<String, String>> japancities = new ArrayList<>();
        japancities.add(totyo);
        japancities.add(Osaka);

    }

    @Test
    void 맵테스트3() {

        ArrayList<String> 한국도시들 = new ArrayList<>();
        한국도시들.add("제주");
        한국도시들.add("강릉");
        한국도시들.add("울산");

        ArrayList<String> 미국도시들 = new ArrayList<>();
        미국도시들.add("디트로이트");
        미국도시들.add("스프링필드");
        미국도시들.add("볼티모어");

        ArrayList<String> 독일도시들 = new ArrayList<>();
        독일도시들.add("프랑크푸르트");
        독일도시들.add("함부르크");
        독일도시들.add("브레멘");

        HashMap<String, ArrayList<String>> 세계도시들 = new HashMap();
        세계도시들.put("한국", 한국도시들);
        세계도시들.put("미국", 미국도시들);
        세계도시들.put("독일", 독일도시들);

        HashMap<String, String> 이모지 = new HashMap();

        이모지.put("한국", "🏢");
        이모지.put("미국", "🍔");
        이모지.put("독일", "🍻");

        for (Map.Entry<String, ArrayList<String>> 세계도시반복 : 세계도시들.entrySet()) {

            String 나라이름 = 세계도시반복.getKey();
            ArrayList<String> 도시들 = 세계도시반복.getValue();
            String 이모티콘 = 이모지.getOrDefault(나라이름, "");

//            String 이모티콘 = "";
//
//            if (나라이름.equals("한국")) {
//                이모티콘 = "🏢";
//            } else if (나라이름.equals("미국")) {
//                이모티콘 = "🍔";
//            }if (나라이름.equals("독일")) {
//                이모티콘 = "🍺";

            System.out.println(이모티콘 + ": " + 도시들);
        }
    }
}