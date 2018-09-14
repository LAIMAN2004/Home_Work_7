package org.istep.qa;

import java.util.Scanner;

public class HW_8_1 {
    public static void main(String[] args) {
        System.out.println("Введите название месяца");
        Scanner mes = new Scanner(System.in);
        String mnth = mes.nextLine();
        switch (mnth) {
            case "февраль": {
                System.out.println("28 дней");
                break;
            }
            case "апрель": {
            }
            case "июнь": {
            }
            case "сентябрь": {
            }
            case "ноябрь": {
                System.out.println("30 дней");
                break;
            }
            default: {
                System.out.println("31 день");
            }
        }
    }
}