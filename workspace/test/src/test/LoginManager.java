package test;

import java.util.HashMap;
import java.util.Map;

public class LoginManager {
    private Map<String, Member> members = new HashMap<>();

    public void addUser(Member member) {
        members.put(member.getUserId(), member);
    }

    public Member login(String userId) {
        if (members.containsKey(userId)) {
            System.out.println(userId + " 로그인 성공");
            return members.get(userId);
        } else {
            System.out.println("존재하지 않는 사용자입니다.");
            return null;
        }
    }
}
