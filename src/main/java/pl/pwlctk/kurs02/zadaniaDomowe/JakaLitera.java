package pl.pwlctk.kurs02.zadaniaDomowe;

import java.util.Scanner;

public class JakaLitera {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text;
        do {
            System.out.print("Podaj literę: ");
            text = in.nextLine().toUpperCase();

            if (text.length() > 1)
                System.out.println("\nŹle, wprowadź tylko jedną literę!");
            else {
                char[] letterArray = text.toCharArray();
                char letter = letterArray[0];
                int letterNumber = (int) letter;
                //System.out.println("Kod litery: " + letterNumber);
                //ą ę ó też są rozpoznawane jako samogłoski
                //ż ź ć ś ł ń jako spółgłoski
                boolean isLetter = (letterNumber > 64 && letterNumber < 91) || (letterNumber == 260 || letterNumber == 280 || letterNumber == 211 || letterNumber == 377 || letterNumber == 379 || letterNumber == 346 || letterNumber == 262 || letterNumber == 321 || letterNumber == 323);
                boolean isVowel = letterNumber == 260 || letterNumber == 280 || letterNumber == 211 || letterNumber == 65 || letterNumber == 69 || letterNumber == 73 || letterNumber == 79 || letterNumber == 85 || letterNumber == 89;
                if (isLetter) {
                    if (isVowel) {
                        System.out.println("Wprowadzona litera: " + letter + " to samogłoska.");
                    } else {
                        System.out.println("Wprowadzona litera: " + letter + " to spółgłoska.");
                    }
                } else {
                    System.out.println("Nie wprowadziłeś litery!");
                }
            }
        } while (text.length() > 1);
    }
}

/*

switch(letter{
case 'a':
case 'i':
...

sout (samogłoska)
break;
default:
sout (spółgłoska)
break;
}

 */


// WAZNE!!!!!!!!!
/*if(costam){

    jesli w ifie chcemy zakonczyc dzialanie programu, to mozemy wpisać return (nie bedzie trzeba pisac else itd...)

    return;
        }*/











/*
Napisz program, który pobierze od użytkownika jedną !literę! alfabetu i wyświetli, czy litera jest samogłoską, czy spółgłoską.
Dopuszczalne litery (A-Z, a-z). Jeśli użytkownika poda liczbę, lub
string dłuższy niż 1, powinien dostać informację o błędzie.
 */