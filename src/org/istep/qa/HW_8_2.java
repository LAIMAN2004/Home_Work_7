package org.istep.qa;
import java.util.Scanner;
public class HW_8_2 {
    public static void main(String[] args) {
        System.out.println("Введи количество дней");
        Scanner scanner = new Scanner(System.in);
        int mes = scanner.nextInt();
        switch (mes) {
            case 31: {
            }
            System.out.println("январь, март, май, июль, август, октябрь, декабрь");
            break;
            case 30: {
            }
            System.out.println("апрель, июнь, сентябрь, ноябрь, январь, март, май, июль, август, октябрь, декабрь");
            break;
            default: {
                System.out.println("январь, март, май, июль, август, октябрь, декабрь, апрель, июнь, сентябрь, ноябрь, февраль");

            }
        }


    }
}