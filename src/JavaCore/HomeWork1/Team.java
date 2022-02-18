package JavaCore.HomeWork1;

public class Team {
    private static String teamName;
    private Member[] members;

    public Team (String teamName, Member[] members) {
        this.teamName = teamName;
        this.members = members;
    }
    public static String getTeamName() {
        return teamName;
    }
    public Member[] getMembers() {
        return members;
    }

}
