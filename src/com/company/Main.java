package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> product = new ArrayList<String>();
        // добавим в список элементы
        product.add("Гречка");
        product.add("Макароны");
        product.add("Сыр");
        product.add("Колбаса");
        product.add("Хлеб");
        product.add("Молоко");
        product.add("Йогурт");
        product.add("Кефир");
        //Вывол списка
        for (String s : product)
            System.out.println(s + ", ");
    }
}