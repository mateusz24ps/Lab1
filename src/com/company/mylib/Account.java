package com.company.mylib;

import org.apache.commons.lang3.StringUtils;

public class Account {
    private String name;
    public void setName(String name) {
        String[] tokens = StringUtils.split(name);
        for(int i = 0; i < tokens.length; i++)
            tokens[i] = StringUtils.capitalize(tokens[i]);
        this.name = StringUtils.join(tokens,' ');
    }

    public String getName() {
        return name;
    }

    public static String capitalize(String aStr)
    {
        String[] tokens = StringUtils.split(aStr);
        for(int i = 0; i < tokens.length; i++)
            tokens[i] = StringUtils.capitalize(tokens[i]);
        return StringUtils.join(tokens,' ');
    }
    public void setName(String name) {
        this.name = capitalize(name);
    }

    public static String translit (String arg){
        private static String ukrAlphabet = "абвгдеєжзиіїйклмнопрстуфхцчшщьюя";

        private static String translitRepl[] = {"a","b","v","g","d","e","je","zh","z","y","i","ji", "j",
                "k","l","m","n","o","p","r","s","t","u","f","h","c",
                "ch","sh","shh","'","ju","ja"};
        return arg;
    }


}
