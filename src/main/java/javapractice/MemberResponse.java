package javapractice;

public class MemberResponse {

    private String loginId;  // 로그인 아이디
    private String username; // 별명

    // 생성자
    public MemberResponse(String loginId, String username) {
        this.loginId = loginId;
        this.username = username;
    }

    // Getter
    public String getLoginId() {
        return loginId;
    }

    public String getUsername() {
        return username;
    }
}
