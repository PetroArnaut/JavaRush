package com.javarush.test.level07.lesson06.task01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 5 различных строчек в списке
1. Создай список строк.
2. Добавь в него 5 различных строчек.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //for (int i = 0; i < 5; i++){
        //    list.add(reader.readLine());
        //}
        list.add("123");
        list.add("asdada");
        list.add("chfhgh");
        list.add("123");
        list.add("12787797431");

        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
