package utils;

import static java.lang.Integer.MAX_VALUE;

public class GetRandom {

    public static String random(){

        String rus = "абвгдеёжзийклмнопрстуфхцчъыьэюя";
        String eng = "abcdefghijklmnopqrstuvwxyz";
        String dig = "0123456789 !@#$%^&*()_+=-|<>./,";
        String pl = "aąbсćdеęfghijklłmnńoóprsśtuwyzźż";
        String de = "ÄäÖöÜü";
        String sum = rus + rus.toUpperCase() + eng + eng.toUpperCase() + dig + pl + pl.toUpperCase() + de;

        int randomSize = (int) (Math.random() * 215);
        String random = "";
        String randomPart;

        for (long i = 0; i <= randomSize; i++){
            int randomForChar = (int) (Math.random() * randomSize);
            randomPart = String.valueOf(sum.charAt(randomForChar));
            random = random.concat(randomPart);
        }
        return random;
    }
}
