package Lesson2;

public class MyArraySizeException extends RuntimeException{

    public MyArraySizeException() {
        super("Размер массива не корректный!");
    }
}
