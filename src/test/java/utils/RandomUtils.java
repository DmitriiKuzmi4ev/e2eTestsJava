package utils;

import org.openqa.selenium.bidi.log.Log;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomUtils {
    public static int getRandomInt(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public static <T> T getRandomElementFromList(List<T> list) {
        return list.get(getRandomInt(0, list.size() - 1));
    }

    public static String getRandomCyrillicString(int lenght) {
        String SALTCHARS =
                "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ1234567890";
        StringBuilder result = new StringBuilder();
        Random rnd = new Random();
        while (result.length() < lenght) {
            int index = (int) (rnd.nextFloat()) * SALTCHARS.length();
            result.append(SALTCHARS.charAt(index));
        }
        return result.toString();
    }

    public static String getRandomString(int lenght) {
        String SALTCHARS =
                "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder result = new StringBuilder();
        Random rnd = new Random();
        while (result.length() < lenght) {
            int index = (int) (rnd.nextFloat()) * SALTCHARS.length();
            result.append(SALTCHARS.charAt(index));
        }
        return result.toString();
    }

    public static String getRandomPhoneOrINN() {
        return getRandomLong(11111111111L, 999999999999L) + "";
    }

    public static Long getRandomLong(Long min, Long max) {
        return ThreadLocalRandom.current().nextLong(min, max);
    }



}
