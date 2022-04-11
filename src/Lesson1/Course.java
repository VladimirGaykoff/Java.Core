package Lesson1;

public class Course {

    private int cross;
    private int longJump;
    private int highJump;
    private int swimmingpool;

    public Course (int cross, int longJump, int highJump, int swimmingpool){
        this.cross = cross;
        this.longJump = longJump;
        this.highJump = highJump;
        this.swimmingpool = swimmingpool;
    }

    public  void doIt (Team x){
        int index = 0;
        int totalIndex = 0;
        int countPeople = 0;
        for (int i = 0; i < 4; i++){
            if (x.teamMember[i].getJumpLength() >= this.longJump) index++;
            if (x.teamMember[i].getJumpHigth() >= this.highJump) index++;
            if (x.teamMember[i].getMaxRunDistance() >= this.cross) index++;
            if (x.teamMember[i].getMaxSweemDistance() >= this.swimmingpool) index++;
            x.teamMember[i].setCountOfCompleate(index);
            totalIndex += index;
            if (index == 4) countPeople ++;
            index = 0;
        }
        x.setCountAllCompleate(totalIndex);
        x.setCountTeamMember(countPeople);
    }


}
