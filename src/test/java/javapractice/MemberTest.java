package javapractice;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MemberTest {

    @Test
    void name() {
        Member member = new Member(
                "kim",
                "kimmy",
                123454);


        MemberResponse memberResponse = new MemberResponse(
                member.getId(),
                member.getNickname());
    }

    @Test
    void mberListtToMem() {
        // DB에서 가져온 여러 Member 객체들
        List<Member> memberList = List.of(
                new Member("kim", "kimmy", 123454),
                new Member("lee", "leemoon", 567890),
                new Member("park", "parkstar", 987654)
        );

        List<MemberResponse> memberResponseList = new ArrayList<>();

        // fori 템플릿을 사용하여 리스트 순회
        for (int i = 0; i < memberList.size(); i++) {
            Member member = memberList.get(i);
            // Member 객체에서 데이터를 가져와 MemberResponse 객체로 변환하여 리스트에 추가
            memberResponseList.add(new MemberResponse(member.getId(), member.getNickname()));
        }

        List<MemberResponse> memberResponseList_2 = new ArrayList<>();

        // foti 템플릿을 사용하여 리스트를 순회하면서 별명이 비어 있는 객체만 필터링
        for (Member member : memberList) {
            if (member.getNickname().isEmpty()) {
                memberResponseList_2.add(new MemberResponse(member.getId(), member.getNickname()));
            }
        }




    }
}
