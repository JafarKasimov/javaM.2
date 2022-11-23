package com.company;

public class Main {

    public static void main(String[] args) {


        Two objectA = new Two(22, "s1", "e1", null, ColorOfGus.WHITE);
        objectA.print();
        objectA.print(("nem"));

        System.out.println(objectA.getHp() + " " + objectA.getFour() + " " + objectA.getFive() + " " + objectA.getColorOfGus());

        Three objectB = new Three(23, "s2", "e2", null, ColorOfGus.WHITE);
        objectB.print();
        objectB.print(("fff"));

        System.out.println(objectB.getHp() + " " + objectB.getFour() + " " + objectB.getFive() + " " + objectB.getColorOfGus());

        Three objectC = new Three(24, "s3", "e3", null, ColorOfGus.WHITE);
        objectC.print();
        objectC.print(("aaa"));

        System.out.println(objectC.getHp() + " " + objectC.getFour() + " " + objectC.getFive() + " " + objectC.getColorOfGus());
    }

    //        b)  Создать иерархию из 3х классов (1й -> 2й -> 3й уровень иерархии),
//        последний 3й класс сделать не наследуемым
//        c)  Все поля классов должны быть приватными,
//        одно из полей должно быть сложного типа созданного вами же (4й класс),
//        одно из полей сделать сложного типа (enum)
//        d)  В классах не должно быть setter-ов, только getter-ы и конструкторы
//        e)  Добавить перегруженные методы (2-3 шт.) в класс 2-го
//        уровня иерархии, один из них сделать неперезаписываемым
//         В классе 3-го уровня перезаписать один из методов родителя
//
//         В главном классе (main.Main) Создать объект класса 2-го уровня
//        (objectA) и 2 объекта класса 3-го уровня
//        (objectB, objectC), также распечатать все свойства объектов
//        и вызвать перегруженные методы через каждый из экземпляров ваших объектов.
}
