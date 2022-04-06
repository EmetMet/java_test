package ru.pack.java.testing;

public class PrintLn
{
    public static void main(String[] args)
    {
        LanguageSucks("Java");
        LanguageSucks("Kotlin");
        LanguageSucks("Python");
        LanguageSucks("C");

        Square s = new Square(5);
        Rectangle r = new Rectangle(4, 6);
//        s.l = 5;
//        double l = 5;
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());
//         r.a = 4;
//         r.b = 6;
        System.out.println("Площадь прямоугольника со стороной " + r.a + " и " + r.b + " = " + r.area());
    }

    public static void LanguageSucks(String language)
    {
        System.out.println(language + " sucks" + "!");
    }

//    public static double area(Square s)
//    {
//        return s.l * s.l;
//    }

//    public static double area(Rectangle r)
//    {
//        return r.a * r.b;
//    }

}
