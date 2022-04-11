package Lesson1;

public class Team {

    private String teamName;
    private int countAllCompleate;
    private int countTeamMember;

    People[] teamMember = new People[4];

    public Team (String teamName, int numberOfTeam){
        this.teamName = teamName;
        if (numberOfTeam == 1){
            teamMember[0] = new People("Вася", 315, 210,5000,400);
            teamMember[1] = new People("Петя", 360, 215,7000,200);
            teamMember[2] = new People("Коля", 330, 185,3000,800);
            teamMember[3] = new People("Женя", 290, 215,4500,600);
        }
        if (numberOfTeam == 2){
            teamMember[0] = new People("Игорь", 320, 230,3000,500);
            teamMember[1] = new People("Олег", 290, 190,10000,900);
            teamMember[2] = new People("Саня", 350, 200,6000,700);
            teamMember[3] = new People("Алеша", 280, 180,4000,300);
        }
    }

    public void getInfoTeam (){
        System.out.println("Командра " + teamName + " состоит из следующих участников: ");
        for (int i = 0; i < 4; i++){
            teamMember[i].getInfo();
        }
        System.out.println();
    }

    public void showResult (){
        System.out.println("Участники командры " + teamName + ", которые прошили все испытания");
        for (int i = 0; i < 4; i++){
            if (teamMember[i].getCountOfCompleate() == 4) teamMember[i].getInfo();

        }
        System.out.println();
    }

    public String getTeamName(){
        return this.teamName;
    }

    public void setCountAllCompleate (int count){
        this.countAllCompleate = count;
    }

    public int getCountAllCompleate(){
        return this.countAllCompleate;
    }

    public  void setCountTeamMember(int count){
        this.countTeamMember = count;
    }

    public int getCountTeamMember(){
        return this.countTeamMember;
    }


}
