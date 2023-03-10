package com.test.FizzBuzz;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

import java.util.HashMap;
import java.util.Map;

public class Solution
{
    public static void main(String[] args) {

        HashMap<String, String> map = createMap();
        System.out.println("имен: " + getCountTheSameFirstName(map,"Ваня"));
        System.out.println("фамилий " + getCountTheSameLastName(map,"Гришко"));
    }

    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();

        map.put("Гришко","Лиза");
        map.put("Соме","Ваня");
        map.put("Иванов","Оля");
        map.put("ывак","Ваня");
        map.put("пывп","Лиза");
        map.put("ыврывпо","Ваня");
        map.put("ывпып","Оля");
        map.put("ывпывп","Ваня");
        map.put("ывпыпы","Лиза");
        map.put("чсчм","Ваня");

        return map;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        //напишите тут ваш код
        int res =0;
        for (Map.Entry<String, String> pair : map.entrySet()){
            String val  = pair.getValue();
            if(name.equals(val)){
                res++;
            }
        }
        return res;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {

        //напишите тут ваш код
        int res2 =0;
        for (Map.Entry<String, String> pair : map.entrySet()){
            String key  = pair.getKey();
            if(familiya.equals(key)){
                res2++;
            }
        }

        return res2;


    }
}
