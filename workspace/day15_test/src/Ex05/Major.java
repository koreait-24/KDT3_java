package Ex05;

public enum Major {
    COMPUTER_SCIENCE("컴퓨터공학"),
    CYBER_SECURITY("정보보안학"),
    ARTIFICIAL_INTELLIGENCE("인공지능학");

    final String koreanName;

    Major(String koreanName) {
        this.koreanName = koreanName;
    }

    String getKoreanName() {
        return koreanName;
    }
}