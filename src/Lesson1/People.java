package Lesson1;

public class People {

    private  String name;
    private int jumpLength;
    private int jumpHigth;
    private int maxRunDistance;
    private int maxSweemDistance;
    private  int countOfCompleate = 0;

    public People (String name, int jumpLength, int jumpHigth, int maxRunDistance, int maxSweemDistance){
        this.name = name;
        this.jumpLength = jumpLength;
        this.jumpHigth = jumpHigth;
        this.maxRunDistance = maxRunDistance;
        this.maxSweemDistance = maxSweemDistance;
    }

    public void getInfo (){
        System.out.println("Имя: " + this.name);
        System.out.println("Характеристики члена команды. Прыжок в длину: " + this.jumpLength + "см, прыжок в высоту "
                + this.jumpHigth + "см, максимальная дистанция бега " + this.maxRunDistance + "м, максимальная дистация заплылва" +
                this.maxSweemDistance + "м.");
    }

    public int getJumpLength(){
        return this.jumpLength;
    }

    public int getJumpHigth(){
        return this.jumpHigth;
    }

    public int getMaxRunDistance(){
        return this.maxRunDistance;
    }

    public int getMaxSweemDistance(){
        return this.maxSweemDistance;
    }

    public void setCountOfCompleate (int x){
        this.countOfCompleate = x;
    }

    public int getCountOfCompleate (){
        return countOfCompleate;
    }
}
