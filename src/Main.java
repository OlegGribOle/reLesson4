//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String strArray1[][] = {
                {"10", "20", "30", "40"},
                {"10", "20", "30", "40"},
                {"10", "20", "30", "40"},
                {"10", "20", "30", "40"}
        };
        String strArray2[][] = {
                {"10", "20", "30", "40"},
                {"10", "20", "30", "40"},
                {"10", "20", "30", "40"}
        };
        String strArray3[][] = {
                {"10", "20", "30", "40"},
                {"10", "20", "30", "40","50"},
                {"10", "20", "30", "40"},
                {"10", "20", "30", "40"}
        };
        String strArray4[][] = {
                {"10", "20", "30", "40"},
                {"10", "20", "30"},
                {"10", "20", "30", "40"},
                {"10", "20", "30", "40"}
        };
        String strArray5[][] = {
                {"10", "20", "30", "40"},
                {"10", "20", "30", "40"},
                {"10", "20", "30", "40"},
                {"10", "2g0", "30", "40"}
        };
        //Размер массива 4х4
        try {Logic.checkArray(strArray1);
        System.out.println("Размер массива корректный: 4 на 4.");
    } catch (MyArraySizeException myArraySizeException) {
        System.out.println(myArraySizeException.getMessage());
    }
        System.out.println();
        //Размер массива 3х4
        try {Logic.checkArray(strArray2);
            System.out.println("Размер массива корректный: 4 на 4.");
        } catch (MyArraySizeException myArraySizeException) {
            System.out.println(myArraySizeException.getMessage());
        }
        System.out.println();
        //Одна из строк длиннее, чем 4
        try {Logic.checkArray(strArray3);
            System.out.println("Размер массива корректный: 4 на 4.");
        } catch (MyArraySizeException myArraySizeException) {
            System.out.println(myArraySizeException.getMessage());
        }
        System.out.println();
        //Одна из строк короче, чем 4
        try {Logic.checkArray(strArray4);
            System.out.println("Размер массива корректный: 4 на 4.");
        } catch (MyArraySizeException myArraySizeException) {
            System.out.println(myArraySizeException.getMessage());
        }
        System.out.println();
        //Подсчет суммы массива
        try {
            int sum = Logic.sumArray(strArray1);
            System.out.println("Сумма элементов: " + sum);
        } catch (MyArrayDataException myArrayDataException) {
            System.out.println(myArrayDataException.getMessage());
        }
        System.out.println();
        //Элемент массива не число
        try {
            int sum = Logic.sumArray(strArray5);
            System.out.println("Сумма элементов: " + sum);
        } catch (MyArrayDataException myArrayDataException) {
            System.out.println(myArrayDataException.getMessage());
        }
    }
}