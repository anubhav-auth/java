package ITER.Sem2.minorProject;

import javax.swing.plaf.synth.SynthOptionPaneUI;

class Member{
    private int MemberID;
    private String LastName;
    private String FirstName;
    private int Handicap;
    private char Gender;
    private String Team;
    private String MemberType;
    private int Coach;
    private long Phone;
    private Date JoinDate;

    public Member(int memberID, String lastName, String firstName, int handicap, char gender, String team, String memberType, int coach, long phone, Date joinDate) {
        MemberID = memberID;
        LastName = lastName;
        FirstName = firstName;
        Handicap = handicap;
        Gender = gender;
        Team = team;
        MemberType = memberType;
        Coach = coach;
        Phone = phone;
        JoinDate = joinDate;
    }

    public int getMemberID() {
        return MemberID;
    }

    public String getLastName() {
        return LastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public int getHandicap() {
        return Handicap;
    }

    public char getGender() {
        return Gender;
    }

    public String getTeam() {
        return Team;
    }

    public String getMemberType() {
        return MemberType;
    }

    public int getCoach() {
        return Coach;
    }

    public long getPhone() {
        return Phone;
    }

    public Date getJoinDate() {
        return JoinDate;
    }

    public void display(){
        System.out.println("Member ID: " + MemberID + "\nLast Name: " + LastName + "\nFirst Name: " + FirstName + "\nHandicap: " + ((Handicap == -1)? null:Handicap) + "\nGender: " + Gender + "\nTeam: " + ((Team.equals("-1"))? null:Team) + "\nMember Type: " + MemberType + "\nCoach: " +((Coach == -1)? null:Coach) + "\nPhone: " + Phone + "\nJoin Date: " + JoinDate.getDay() + " " + JoinDate.getMonth() + " " + JoinDate.getYear() + "\n");

        System.out.println();
    }


}
class Date{
    private int day;
    private String month;
    private int year;

    public Date(int day, String month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
}

class Filter{
    static int monthcalc(String str){
        int monthNo = 0;
        switch (str){
            case "JANUARY" -> {
                monthNo = 1;
            }
            case "FEBRUARY" -> {
                monthNo = 2;
            }
            case "MARCH" -> {
                monthNo = 3;
            }
            case "APRIL" -> {
                monthNo = 4;
            }
            case "MAY" -> {
                monthNo = 5;
            }
            case "JUNE" -> {
                monthNo = 6;
            }
            case "JULY" -> {
                monthNo = 7;
            }
            case "AUGUST" -> {
                monthNo = 8;
            }
            case "SEPTEMBER" -> {
                monthNo = 9;
            }
            case "OCTOBER" -> {
                monthNo = 10;
            }
            case "NOVEMBER" -> {
                monthNo = 11;
            }
            case "DECEMBER" -> {
                monthNo = 12;
            }
        }
        return monthNo;
    }
    void joinDate(Date date, Member[] arr){
        System.out.println("Filtered Members based on Join Date: Before " + date.getDay() + "-" + date.getMonth() + "-" + date.getYear() + "\n");
        Date date2;
        for (Member member : arr){
            date2 = member.getJoinDate();

            if (date2.getYear() <= date.getYear()){
                if (date2.getYear() == date.getYear()){
                    if (monthcalc(date2.getMonth()) <= monthcalc(date.getMonth())){

                        if (monthcalc(date2.getMonth()) == monthcalc(date.getMonth())){
                            if (date2.getDay() < date.getDay()){
                                member.display();
                            }
                        }else {
                            member.display();
                        }
                    }
                }else {
                    member.display();
                }

            }
        }
    }

    void seniorHandicapScore(Member[] arr){
        System.out.println("Filtered Senior Members with Handicap Score less than 12: \n");
        for (Member member: arr){
            if (member.getMemberType().equals("Senior")){
                if (member.getHandicap() < 12 && member.getHandicap() > -1){
                    member.display();
                }
            }
        }
    }

    void seniorFemaleTeamB(Member[] arr){
        System.out.println("Filtered Senior Female Members in Team B: \n");
        for (Member member: arr){
            if (member.getTeam().endsWith("B")){
                if (member.getGender() == 'F'){
                    if (member.getMemberType().equals("Senior")){
                        member.display();
                    }
                }
            }
        }

    }
}
public class GolfClubDB {
    static Member[] members;
    public static void main(String[] args) {
        initialiseMembers();
        Filter memberFilter = new Filter();
//        memberFilter.joinDate(new Date(7, "APRIL", 9), members);
//        memberFilter.seniorHandicapScore(members);
        memberFilter.seniorFemaleTeamB(members);
    }
    public static void initialiseMembers(){
         members = new Member[]{
                 new Member(118, "McKenzie", "Melissa", 30, 'F', "-1", "Junior", 153, 963270, new Date(28, "MAY", 5)),
                 new Member(138, "Stone", "Michael", 30, 'M', "-1", "Senior", -1, 983223, new Date(31, "MAY", 9)),
                 new Member(153, "Nolan", "Brenda", 11, 'F', "TeamB", "Senior", -1, 442649, new Date(12, "AUGUST", 6)),
                 new Member(176, "Branch", "Helen", -1, 'F', "-1", "Social", -1, 589419, new Date(6, "DECEMBER", 11)),
                 new Member(178, "Beck", "Sarah", -1, 'F', "-1", "Social", -1, 226596, new Date(24, "JANUARY", 10)),
                 new Member(228, "Burton", "Sandra", 26, 'F', "-1", "Junior", 153, 244493, new Date(9, "JULY", 13)),
                 new Member(235, "Cooper", "William", 14, 'M', "TeamB", "Senior", 153, 722954, new Date(5, "MARCH", 8)),
                 new Member(239, "Spence", "Thomas", 10, 'M', "-1", "Senior", -1, 697720, new Date(22, "JUNE", 6)),
                 new Member(258, "Olson", "Barbara", 16, 'F', "-1", "Senior", -1, 370186, new Date(29, "JULY", 13)),
                 new Member(286, "Pollard", "Robert", 19, 'M', "TeamB", "Junior", 235, 617681, new Date(13, "AUGUST", 13)),
                 new Member(290, "Sexton", "Thomas", 26, 'M', "-1", "Senior", 235, 268936, new Date(28, "JULY", 8)),
                 new Member(323, "Wilcox", "Daniel", 3, 'M', "TeamA", "Senior", -1, 665393, new Date(18, "MAY", 9)),
                 new Member(331, "Schmidt", "Thomas", 25, 'M', "-1", "Senior", 153, 867492, new Date(7, "APRIL", 9)),
                 new Member(332, "Bridges", "Deborah", 12, 'F', "-1", "Senior", 235, 279087, new Date(23, "MARCH", 7)),
                 new Member(339, "Young", "Betty", 21, 'F', "TeamB", "Senior", -1, 507813, new Date(17, "APRIL", 9)),
                 new Member(414, "Gilmore", "Jane", 5, 'F', "TeamA", "Junior", 153, 459558, new Date(30, "MAY", 7)),
                 new Member(415, "Taylor", "William", 7, 'M', "TeamA", "Senior", 235, 137353, new Date(27, "NOVEMBER", 7)),
                 new Member(461, "Reed", "Robert", 3, 'M', "TeamA", "Senior", 235, 994664, new Date(5, "AUGUST", 5)),
                 new Member(469, "Willis", "Carolyn", 29, 'F', "-1", "Junior", -1, 688378, new Date(14, "JANUARY", 11)),
                 new Member(487, "Kent", "Susan", -1, 'F', "-1", "Social", -1, 707217, new Date(7, "OCTOBER", 10))
         };
    }

}
