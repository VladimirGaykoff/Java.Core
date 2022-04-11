package Lesson1;

public class Main {

    public static void main(String[] args) {

        // People man1 = new People("Вася", 315, 210,5000,400);

        Team team1 = new Team("Вымпел", 1);
        Team team2 = new Team("Ракета", 2);
        Course course = new Course(3000, 300, 200, 250);

        team1.getInfoTeam();
        team2.getInfoTeam();


        course.doIt(team1);
        team1.showResult();

        course.doIt(team2);
        team2.showResult();

        showTotalResult(team1, team2);



    }

    static public void showTotalResult(Team team1, Team team2){
        if (team1.getCountTeamMember() > team2.getCountTeamMember()) {
            System.out.println("По количеству членов команды, полностью завершивших все этапы испытания победила" +
                    " команда " + team1.getTeamName() + " с результатом " + team1.getCountTeamMember() + " - " + team2.getCountTeamMember());
        } else if (team1.getCountTeamMember() < team2.getCountTeamMember()) {
            System.out.println("По количеству членов команды, полностью завершивших все этапы испытания победила" +
                    " команда " + team2.getTeamName() + " с результатом " + team2.getCountTeamMember() + " - " + team1.getCountTeamMember());
        } else {
            System.out.println("По количеству членов команды, полностью завершивших все этапы испытания, ничья");
        }

        if (team1.getCountAllCompleate() > team2.getCountAllCompleate()) {
            System.out.println("По количеству завершенных этапов испытания победила команда " + team1.getTeamName() +
                    " с результатом " + team1.getCountAllCompleate() + " - " + team2.getCountAllCompleate());
        } else if (team1.getCountAllCompleate() < team2.getCountAllCompleate()) {
            System.out.println("По количеству завершенных этапов испытания победила команда " + team2.getTeamName() +
                    " с результатом " + team2.getCountAllCompleate() + " - " + team1.getCountAllCompleate());
        } else {
            System.out.println("По количеству завершенных этапов ничья");
        }
    }




}
