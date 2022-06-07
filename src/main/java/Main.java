import java.util.Locale;

public class Main {
    public static void main(String[] args) {
//        There are 2 options to create array:
//        int[] salaries = new int[5];
//        int[] salaries = {14, 18, 458, 11};
//        What we should do if we need to add 1 element more in array
//        Create "names" array
//        String[] names = {
//                "Petya",
//                "Sveta",
//                "Olya",
//                "Anya"
//        };
//
//        String newName = "Kolya";  // we want to add additional name "Kolya" in array
////        String[] tmp = new String[5];
//        String[] tmp = new String[names.length + 1];   // создаем новый массив tmp куда циклом поэлементно копируем изначальный массив, на месте последнего эдемента будет null
//        for (int i = 0; i < names.length; i++) {
//            tmp[i] = names[i];                // перезаписали массив
//            tmp[tmp.length - 1] = newName;    // записываем в значение 5ой ячейки наше новое имя, всего у нас 0,1,2,3,4 ячейки записаны сейчас с 0 по 3 вкл, запись необходимо сделать в 5ую
//        }
////        System.out.println(tmp.length);
//        names = tmp;
////        System.out.println(names[4]);
//// Теперь попробуем удалить элемент

        String[] names = {
                "Petya",
                "Sveta",
                "Olya",
                "Anya",
                "Kolya"
        };
        String removeName = "Olya";
        String[] tmp = new String[names.length - 1];
        int copyToIndex = 0;
        for (int i = 0; i < names.length; i++) {
//            if (names[i] == removeName) {
//
//            } else { tmp[copyToIndex] = names[i];
//                copyToIndex++;

            if (!names[i].equals(removeName)) {
                tmp[copyToIndex] = names[i];
                copyToIndex++;
            }
        }
        names = tmp;
    }
}
