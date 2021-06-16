package com.company.util;

public class MessageOutputUtil {

    public static void startMess(String table) {
        System.out.println("Старт записи в таблицу " + table + ".");
    }

    public static void finishMess(String table) {
        System.out.println("Запись в таблицу " + table + " завершена.");
    }

}
