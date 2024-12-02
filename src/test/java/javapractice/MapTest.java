package javapractice;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

public class MapTest {

    @Test
    void name() {
        List<String> nameList = List.of(
                "권상윤",
                "김민성",
                "추민영",
                "김성락",
                "황승혁",
                "문성희",
                "문인혁",
                "박현지",
                "윤찬영",
                "윤태우",
                "권상윤",
                "이채현",
                "황효진",
                "권상윤",
                "황승혁",
                "박현지",
                "이호연",
                "전지예",
                "정해준",
                "문인혁",
                "김성락",
                "추민영",
                "허재",
                "황승혁",
                "황효진"
        );
// 아래에 코드 추가
        HashMap<String, Integer> nameCountMap = new HashMap<>();
        for (String name : nameList)
            if (nameCountMap.containsKey(name)) {
                nameCountMap.put(name, nameCountMap.get(name) + 1);
            } else nameCountMap.put(name, 1);

        // 아래 테스트를 통과해야 합니다
        assertThat(nameCountMap).containsEntry("추민영", 2)
                .containsEntry("문성희", 1)
                .containsEntry("전지예", 1)
                .containsEntry("정해준", 1)
                .containsEntry("김성락", 2)
                .containsEntry("이호연", 1)
                .containsEntry("권상윤", 3)
                .containsEntry("황승혁", 3)
                .containsEntry("박현지", 2)
                .containsEntry("김민성", 1)
                .containsEntry("이채현", 1)
                .containsEntry("문인혁", 2)
                .containsEntry("황효진", 2)
                .containsEntry("윤찬영", 1)
                .containsEntry("윤태우", 1)
                .containsEntry("허재", 1);
    }

    @Test
    void intersection() {
        List<Integer> list1 = List.of(1, 2, 3, 4);
        List<Integer> list2 = List.of(2, 4, 5, 6);

        List<Integer> intersection = new ArrayList<>();

        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int num : list1) {
            map.put(num, true);
        }

        for (int num : list2) {
            if (map.containsKey(num)) {
                intersection.add(num);
            }
        }
        System.out.println("교집합: = " + intersection);
    }

    @Test
    void MapValue() {

        HashMap<String, List<String>> sity = new HashMap<>();

        sity.put("한국", List.of("제주", "강릉", "부여"));
        sity.put("미국", List.of("뉴욕", "LA", "디트로이트"));
        sity.put("독일", List.of("함부르크", "뮌헨", "프랑크푸르트"));

        for (String country : sity.keySet()) {
            System.out.println(country + sity.get(country));
        }
    }

    @Test
    void ProductList() {

        List<Map<String, String>> ProductList = new ArrayList<>();

        Map<String, String> Product1 = new HashMap<>();
        Product1.put("상품명", "칙촉");
        Product1.put("가격", "2000원");
        Product1.put("카테고리", "식품");
        ProductList.add(Product1);

        Map<String, String> Product2 = new HashMap<>();
        Product2.put("상품명", "세탁 건조 일체형 워시 콤보");
        Product2.put("가격", "400만원");
        Product2.put("카테고리", "가전");
        ProductList.add(Product2);

        Map<String, String> Product3 = new HashMap<>();
        Product3.put("상품명", "바나나우유");
        Product3.put("가격", "1700원");
        Product3.put("카테고리", "식품");
        ProductList.add(Product3);

        for (Map<String, String> Product : ProductList) {
            System.out.println("상품명: " + Product.get("상품명"));
            System.out.println("가격: " + Product.get("가격"));
            System.out.println("카테고리: " + Product.get("카테고리"));
        }

    }

    @Test
    void myContainsTest() {
        ArrayList<String> names = new ArrayList<>();
        names.add("박효신");
        names.add("이지은");
        names.add("하현우");

        boolean 하현우존재여부 = myContains(names, "하현우");
        boolean 잔나비존재여부 = myContains(names, "잔나비");

        assertThat(하현우존재여부).isTrue();
        assertThat(잔나비존재여부).isFalse();
    }

    public static boolean myContains(ArrayList<String> list, String target) {
        for (String item : list) {
            if (item.equals(target)) {
                return true;
            }
        }
        return false;
    }


    @Test
    void getCommonElementsTest() {
        List<Integer> firstList = List.of(1, 2, 3);
        List<Integer> secondList = List.of(2, 3, 4);

        List<Integer> commonElements = getCommonElements(firstList, secondList);

        assertThat(commonElements)
                .containsExactlyInAnyOrder(2, 3);
        System.out.println("공통요소 = " + commonElements);
    }

    public static List<Integer> getCommonElements(List<Integer> list1, List<Integer> list2) {
        List<Integer> commonElements = new ArrayList<>();

        for (Integer elements : list1) {
            if (list2.contains(elements)) {
                commonElements.add(elements);
            }
        }
        return commonElements;
    }



}