package javapractice;

public class Member {

    private String id;
    private String nickname;
    private int password;

    public Member(String id, String nickname, int password) {
        this.id = id;
        this.nickname = nickname;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public String getNickname() {
        return nickname;
    }

    public int getPassword() {
        return password;
    }
}
