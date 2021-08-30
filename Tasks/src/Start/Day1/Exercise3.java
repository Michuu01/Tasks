package Start.Day1;

public class Exercise3 {
    public static void main(String[] args) {
        exercise3();
    }


    //Napisz program, który zamieni samogłoski w podanym zdaniu na podaną przez
    //Ciebie liczbę zmiennoprzecinkową.
    private static void exercise3() {
        String a = "a";
        String a2 = "ą";
        String e = "e";
        String e2 = "ę";
        String i = "i";
        String o = "o";
        String o2 = "ó";
        String u = "u";
        String y = "y";

        String BigA = "A";
        String BigA2 = "Ą";
        String BigE = "E";
        String BigE2 = "Ę";
        String BigI = "I";
        String BigO = "O";
        String BigO2 = "Ó";
        String BigU = "U";
        String BigY = "Y";

        double d = 123.4;
        String replaced = " _ " + d + " _ " ;
        String sentence = "To jesst zdanie które będzie zmienione";

        String replace = sentence.replaceAll(a, replaced);
        replace = replace.replaceAll(a2, replaced);
        replace = replace.replaceAll(e, replaced);
        replace = replace.replaceAll(e2, replaced);
        replace = replace.replaceAll(i, replaced);
        replace = replace.replaceAll(o, replaced);
        replace = replace.replaceAll(o2, replaced);
        replace = replace.replaceAll(u, replaced);
        replace = replace.replaceAll(y, replaced);
        replace = replace.replaceAll(BigA, replaced);
        replace = replace.replaceAll(BigA2, replaced);
        replace = replace.replaceAll(BigO, replaced);
        replace = replace.replaceAll(BigE, replaced);
        replace = replace.replaceAll(BigU, replaced);
        replace = replace.replaceAll(BigE2, replaced);
        replace = replace.replaceAll(BigI, replaced);
        replace = replace.replaceAll(BigY, replaced);
        replace = replace.replaceAll(BigO2, replaced);

        System.out.println(sentence);
        System.out.println(replace);
    }
}
