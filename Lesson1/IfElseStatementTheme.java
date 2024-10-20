package Lesson1;

import java.math.BigDecimal;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("Task number 1 - Перевод псевдокода на язык Java");
        boolean isMaleGender = false;
        int age = 20;
        if (!isMaleGender) {
            System.out.println("Male gender");
        } else {
            System.out.println("Female gender");
        }
        if (age > 18) {
            System.out.println("He(she) is adult");
        } else {
            System.out.println("He(she) is child");
        }
        float height = 1.0f;
        if (height < 1.8) {
            System.out.println("Height is less than 1.8");
        } else {
            System.out.println("Height is greater than 1.8");
        }
        String name = "Andrey";
        char firstLetterOfName = name.charAt(0);
        if (firstLetterOfName == 'M') {
            System.out.println("His name is Misha.");
        } else if (firstLetterOfName == 'I') {
            System.out.println("His name is Igor.");
        } else {
            System.out.println("Everything will be fine! ");
        }

        System.out.println("Task number 2 - Поиск большего числа");
        int first = 7;
        int second = 9;
        if (second > first) {
            System.out.println("Second is greater than first");
        } else {
            System.out.println("First and second are equal");
        }

        System.out.println("Task number 3- Проверка числа");
        int number = 0;
        if (number == 0) {
            System.out.println("Number is zero");
        } else {
            if (number > 0 && number % 2 == 0) {
                System.out.println(number + "- Number is even");
            } else if (number < 0 && number % 2 == 0) {
                System.out.println(number + "-Number is negative and even");
            } else if (number < 0 && number % 2 != 0) {
                System.out.println(number + "-Number is negative and odd");
            } else {
                System.out.println(number + "-Number is odd");
            }
        }

        System.out.println("Task number 4 - Поиск одинаковых цифр в числах");
        int fir = 111;
        int sec = 222;
        int count = 0;
        for (int i = 3; i > 0; i--) {
            int resFir = fir % 10;
            int resSec = sec % 10;
            if (resFir != resSec) {
                System.out.println("fir != sec");
                System.out.println("цифры разряда " + (i) + " не равны");
                count++;
            }
            if (count == 3) {
                System.out.println("Равных цифр нет!!! ");
                break;
            } else {
                if (resFir == resSec) {
                    System.out.println("цифры разряда " + (i) + " равны");
                }
            }
            fir /= 10;
            sec /= 10;
        }

        System.out.println("Task number 5 - Определение символа по его коду");
        char wort = '\u0057';
        if (Character.isLetter(wort)) {
            if (Character.isUpperCase(wort)) {
                System.out.println("This is the letter in uppercase:  " + "\'" + wort + "\'");
            } else {
                System.out.println("This is the letter in lowercase  " + "\'" + wort + "\'");
            }
        } else if (Character.isLetterOrDigit(wort)) {
            System.out.println("This is or a letter or a digit");
        } else {
            System.out.println("Neither is a letter nor a digit  " + "\'" + wort + "\'");
        }

        System.out.println("Task number 6 - Подсчет начисленных банком %");
        float amountOfMoney = 311123.59f;
        float precents;
        float totalAmount;
        System.out.println("Deposit amount: " + amountOfMoney);
        if (amountOfMoney < 100000f) {
            precents = amountOfMoney / 20;
            totalAmount = amountOfMoney + precents;
            System.out.println("Сумма начисленного процента: " + precents + "\n" + "Итоговая сумма: " + totalAmount);
        } else if (amountOfMoney >= 100000f && amountOfMoney <= 300000f) {
            precents = (amountOfMoney / 100) * 7;
            totalAmount = amountOfMoney + precents;
            System.out.println("Сумма начисленного процента: " + precents + "\n" + "Итоговая сумма: " + totalAmount);
        } else if (amountOfMoney > 300000f) {
            precents = amountOfMoney / 10;
            totalAmount = amountOfMoney + precents;
            System.out.println("Сумма начисленного процента: " + precents + "\n" + "Итоговая сумма: " + totalAmount);
        }

        System.out.println("Task number 7 - Определение оценки по предметам");
        int history = 59;
        int programming = 92;
        int gradeHistory = 0;
        int gradeProgramming = 0;
        if (history <= 60) {
            gradeHistory = 2;
        } else if (history > 60) {
            gradeHistory = 3;
        } else if (history > 73) {
            gradeHistory = 4;
        } else if (history > 91) {
            gradeHistory = 5;
        }
        if (programming <= 60) {
            gradeProgramming = 2;
        } else if (programming > 60) {
            gradeProgramming = 3;
        } else if (programming > 73) {
            gradeProgramming = 4;
        } else if (programming > 91) {
            gradeProgramming = 5;
        }
        float averageGrade = (float) (gradeProgramming + gradeHistory) / 2;
        float averagePrecent = (float) (history + programming) / 2;
        System.out.println("History: " + gradeHistory + "\n" + "Programming: " + gradeProgramming + "\n" + "Average grade: " + averageGrade + "\n" + "Average precent: " + averagePrecent);

        System.out.println("Task number 8 - Расчет годовой прибыли");
        float goodsAreSoldMonthly = 13025.233f;
        float premisesRentalMonthly = 5123.018f;
        float productionCostMonthly = 9001.729f;
        float profitForTheYear = (goodsAreSoldMonthly - (premisesRentalMonthly + productionCostMonthly)) * 12;
        if (profitForTheYear > 0) {
            System.out.println("Profit for the year is: " + "+" + profitForTheYear);
        } else {
            System.out.println("Profit for the year is: " + profitForTheYear);
        }

        System.out.println("Task number 9 - *");
        BigDecimal moneyOfAmount = new BigDecimal(311123.59);
        System.out.println("Deposit amount: " + moneyOfAmount.setScale(2, BigDecimal.ROUND_DOWN));
        if (moneyOfAmount.floatValue() < 100000f) {
            BigDecimal prec = moneyOfAmount.divide(new BigDecimal(20), 2, BigDecimal.ROUND_DOWN);
            BigDecimal amountTotal = moneyOfAmount.add(prec).setScale(2, BigDecimal.ROUND_DOWN);
            System.out.println("Сумма начисленного процента: " + prec + "\n" + "Итоговая сумма: " + amountTotal);
        } else if (moneyOfAmount.floatValue() >= 100000f && moneyOfAmount.floatValue() <= 300000f) {
            BigDecimal prec = moneyOfAmount.divide(new BigDecimal(100), 2, BigDecimal.ROUND_DOWN).multiply(new BigDecimal(7));
            BigDecimal amountTotal = moneyOfAmount.add(prec).setScale(2, BigDecimal.ROUND_DOWN);
            System.out.println("Сумма начисленного процента: " + prec + "\n" + "Итоговая сумма: " + amountTotal);
        } else if (moneyOfAmount.floatValue() > 300000f) {
            BigDecimal prec = moneyOfAmount.divide(new BigDecimal(10), 2, BigDecimal.ROUND_DOWN);
            BigDecimal amountTotal = moneyOfAmount.add(prec).setScale(2, BigDecimal.ROUND_DOWN);
            System.out.println("Сумма начисленного процента: " + prec + "\n" + "Итоговая сумма: " + amountTotal);
        }
    }
}












