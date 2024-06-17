package ITER.Sem2.minorProject;

class Member{
    private final int MemberID;
    private final String LastName;
    private final String FirstName;
    private final int Handicap;
    private final char Gender;
    private final String Team;
    private final String MemberType;
    private final int Coach;
    private final long Phone;
    private final Date JoinDate;

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
        System.out.println("Member ID: " + MemberID + "\t\tLast Name: " + LastName + "\t\t\tFirst Name: " + FirstName + "\t\tHandicap: " + ((Handicap == -1)? null:Handicap) + "\tGender: " + Gender + "\tTeam: " + ((Team.equals("-1"))? null:Team) + "\t\t\tMember Type: " + MemberType + "\t\tCoach: " +((Coach == -1)? null:Coach) + "\tPhone: " + Phone + "\tJoin Date: " + JoinDate.getDay() + " " + JoinDate.getMonth() + " " + JoinDate.getYear() + "\n");
    }


}
class Date{
    private final int day;
    private final String month;
    private final int year;

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

        memberFilter.joinDate(new Date(7, "APRIL", 9), members);
        memberFilter.seniorHandicapScore(members);
        memberFilter.seniorFemaleTeamB(members);
    }
    public static void initialiseMembers(){
         members = new Member[]{
                 new Member(118, "McKenzie", "Melissa", 30, 'F', "-1", "Junior", 153, 963270, new Date(28, "MAY", 5)),
                 new Member(138, "Stone", "Michael", 30, 'M', "-1", "Senior", -1, 983223, new Date(31, "MAY", 9)),
         };
    }

}
