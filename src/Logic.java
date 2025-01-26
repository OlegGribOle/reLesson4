public class Logic {

    public static void checkArray(String[][] array) throws MyArraySizeException {
        if (array.length != 4) {
            throw new MyArraySizeException("Количество строк должно быть равно 4.");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException("Количество столбцов в строке " + (i+1) + " должно быть равно 4.");
            }
        }
    }

    public static int sumArray(String[][] array) throws MyArrayDataException {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    int number = Integer.parseInt(array[i][j]);
                    sum += number;
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Ошибка преобразования в ячейке [" + (i+1) + "][" + j + "]: '" + array[i][j] + "' не " +
                            "является числом.");
                }
            }
        }

        return sum;
    }
}















