package Lesson2;

public class Main {
    public static void main(String[] args) {

        int result = 0;

        String[][] allRightArray = {{"11","12","13","14"},{"21","22","23","24"},{"31","32","33","34"},{"41","42","43","44"}};
        String[][] overSizeArray = {{"11","12","13","14"},{"21","22","23","24","25"},{"31","32","33","34"},{"41","42","43","44"}};
        String[][] notOnlyNumberArray = {{"11","12","13","14"},{"21","22","23","24"},{"31","Hi","33","34"},{"41","42","43","44"}};

        System.out.println("Обработка коррекно заданного массива");
        try {
            result = 0;
            result = analyze(allRightArray);
        } catch(MyArraySizeException e){
            System.out.println(e.getMessage());
        } catch(MyArrayDataException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Результат суммирования элементов массива равна "+String.valueOf(result));
            System.out.println();
        }

        System.out.println("Обработка массива с лишним элементом");
        try {
            result = 0;
            result = analyze(overSizeArray);
        } catch(MyArraySizeException e){
            System.out.println(e.getMessage());
        } catch(MyArrayDataException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Результат суммирования элементов массива равна "+String.valueOf(result));
            System.out.println();
        }

        System.out.println("Обработка массива, один из элементов которого не является числом");
        try {
            result = 0;
            result = analyze(notOnlyNumberArray);
        } catch(MyArraySizeException e){
            System.out.println(e.getMessage());
        } catch(MyArrayDataException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Результат суммирования элементов массива равна "+String.valueOf(result));
            System.out.println();
        }
    }

    public static int analyze(String[][] array) throws MyArraySizeException, MyArrayDataException {

        int summ = 0;
        int value = 0;
        int row = 0;
        int cell = 0;

        if(array.length != 4 || array[0].length != 4 || array[1].length != 4 || array[2].length != 4 || array[3].length != 4) {
            throw new MyArraySizeException();
        }

        for(int i = 0; i < 4; i++){
            row = i + 1;
            for(int c = 0; c < 4; c++){
                cell = c + 1;
                try{
                    value = Integer.parseInt(array[i][c]);
                    summ += value;
                } catch (IllegalArgumentException e){
                    String message = "в "+String.valueOf(row)+" ряду, "+String.valueOf(cell)+" ячейке";
                    throw new MyArrayDataException(message);
                }
            }
        }
        return summ;
    }
}
