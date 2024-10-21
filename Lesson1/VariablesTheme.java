package Lesson1;

public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера");
        byte numberProcessorCores = 6;
        short socketsPerProcessor = 1;
        int logicalProcessors = 6;
        long numberOperatingSystemBits = 64;
        float rom = 8.00f;
        double baseSpeed = 2.38;
        char hardDrive = 'C';
        boolean isHardDriveEnabled = true;
        System.out.println("Колличество ядер процессора - " + numberProcessorCores + "\n" + "Сокеты - " +
                socketsPerProcessor + "\n" + "Логические процесооры - " + logicalProcessors + "\n" +
                "Колличество разрядов операционной ситемы - " + numberOperatingSystemBits + "\n" +
                "Оперативная память - " + rom + "\n" + "Базовая скорость центрального процессора - " +
                baseSpeed + "\n" + "Жёсткий диск - " + hardDrive + "\n" + "Жёсткий диск включен? - " +
                isHardDriveEnabled);

        System.out.println("2. Расчет стоимости товара со скидкой");
        float costPenWithoutDiscount = 105.5f;
        float costBookWithoutDiscount = 235.83f;
        float discountOfPenOfBook = ((costPenWithoutDiscount + costBookWithoutDiscount) / 100) * 11;
        float costPenBookWithDiscount = (costPenWithoutDiscount + costBookWithoutDiscount) - discountOfPenOfBook;
        System.out.println("Стоимость товаров без скидки = " + (costPenWithoutDiscount + costBookWithoutDiscount) +
                "\n" + "Сумма скидки = " + discountOfPenOfBook + "\n" + "Стоимость товаров со скидкой = " +
                costPenBookWithDiscount);

        System.out.println("3. Вывод слова JAVA");
        System.out.println("   J     a  V     V  a");
        System.out.println("   J    a a  V   V  a a");
        System.out.println("J  J   aaaaa  V V  aaaaa");
        System.out.println(" JJ  a      a  V  a     a");

        System.out.println("4. Вывод min и max значений целых числовых типов");
        byte first = 127;
        System.out.println("Первоначальное значение first = " + first);
        first++;
        System.out.println("После инкремента на единицу first = " + first);
        first--;
        System.out.println("После декремента на единицу first = " + first);
        short second = 32767;
        System.out.println("Первоначальное значение second = " + second);
        second++;
        System.out.println("После инкремента на единицу second = " + second);
        second--;
        System.out.println("После декремента на единицу second = " + second);
        int third = 2147483647;
        System.out.println("Первоначальное значение third = " + third);
        third++;
        System.out.println("После инкремента на единицу third = " + third);
        third--;
        System.out.println("После декремента на единицу third= " + third);
        long fourth = 9223372036854775807L;
        System.out.println("Первоначальное значение fourth = " + fourth);
        fourth++;
        System.out.println("После инкремента на единицу fourth = " + fourth);
        fourth--;
        System.out.println("После декремента на единицу fourth = " + fourth);

        System.out.println("5. Перестановка значений переменных");
        int two = 2;
        int five = 5;
        System.out.println(two + "\n" + five);
        System.out.println("С помощью третьей переменной");
        int tmp;
        tmp = two;
        two = five;
        five = tmp;
        System.out.println(two + "\n" + five);
        System.out.println("С помощью арифметических операций");
        five += 3;
        two -= 3;
        System.out.println(two + "\n" + five);
        System.out.println("С помощью побитовой операции ^");
        two ^= five;
        five ^= two;
        two ^= five;
        System.out.println(two + "\n" + five);

        System.out.println("6. Вывод символов и их кодов");
        char thirtySix = '$';
        char fortyTwo = '*';
        char sixtyFour = '@';
        char hundredTwentyFour = '\\';
        char hundredTwentySix = '~';
        System.out.println("Code thirty six = " + thirtySix + "\n" + "Code forty two =  " + fortyTwo + "\n" +
                "Code sixty four =  " + sixtyFour + "\n" + "Code hundred twenty four = " + hundredTwentyFour + "\n" +
                "Code hundred twentySix = " + hundredTwentySix);

        System.out.println("7.Вывод в консоль ASCII-арт Дюка");
        int fir = 47;
        int sec = 92;
        int thi = 40;
        int four = 41;
        int fifth = 95;
        char a = (char) fir;
        char b = (char) sec;
        char f = (char) thi;
        char g = (char) four;
        char h = (char) fifth;
        System.out.println(" " + " " + " " + " " + a + " " + b);
        System.out.println(" " + " " + " " + a + " " + " " + " " + b);
        System.out.println(" " + " " + a + h + f + " " + g + " " + b);
        System.out.println(" " + a + " " + " " + " " + " " + " " + " " + " " + b);
        System.out.println(a + "" + h + h + h + h + a + " " + b + h + h + b);

        System.out.println("8.Манипуляции с сотнями, десятками и единицами числа");
        int num = 123;
        int hundreds = num / 100;
        int tens = (num % 100) / 10;
        int units = num % 10;
        System.out.println("Число 123 содержит: " + "\n" + " сотен - " + hundreds + "\n" + " десятков -" +
                tens + "\n" + " единиц - " + units + "\n" + " Сумма разрядов = " + (hundreds + tens + units) + "\n" +
                " Произведение разрядов = " + (hundreds * tens * units));

        System.out.println("9.Перевод секунд в часы, минуты и секунды");
        int time = 86399;
        int hours = time / 3600;
        int minutes = time % 3600 / 60;
        int seconds = time % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}
