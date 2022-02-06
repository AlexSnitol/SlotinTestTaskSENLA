package task3;

import java.util.Scanner;

public class Main
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String str;

        System.out.println("TASK 3");
        System.out.println();

        System.out.println("enter any russian string: ");
        System.out.print("> ");
        str = sc.nextLine();

        Vowels obj1 = new Vowels(str);

        System.out.println();
        System.out.println("opt 1: подсчитывать количество гласных в словах");
        System.out.println("result:");
        System.out.println(obj1.countVowels(str));

        System.out.println();
        System.out.println("opt 2: выводить слова отсортированным списком по количеству гласных (сначала те, у которых больше гласных)");
        System.out.println("result:");
        obj1.printSortByCountVowelsInWord();
        System.out.println();

        System.out.println();
        System.out.println("opt 3: делать первую гласную букву в слове заглавной");
        obj1.setFirstVowelInWordUppercase();
        System.out.println("result:");
        System.out.println(obj1.getStr());
    }
}
