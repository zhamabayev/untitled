package JavaCore.HomeWork1;

public class Member {
    private String memberName;
    private int health;

    public Member(String memberName, int health) {
        this.memberName = memberName;
        this.health = health;
    }
    public String getMemberName() {
        return memberName;
    }
    public Integer getHealth() {
        return health;
    }
    void competition(Course course) {
        if (health < (course.getRunDistance() + course.getSwimDistance())) {
            System.out.println("Участник " + memberName + " не прошел дистанцию");
        } else {
            System.out.println("Участник " + memberName + " успешно прошел дистанцию");
        }
    }
    public String toString() {
        return  memberName;
    }

}