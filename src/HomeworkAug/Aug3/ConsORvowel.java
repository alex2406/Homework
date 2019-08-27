package HomeworkAug.Aug3;

import java.util.Scanner;

public class ConsORvowel {
    public static void main(String[] args) {
        System.out.println("Input a letter");
        Scanner input = new Scanner(System.in);
        String let = String.valueOf(input.next());

        switch (let){
            case "a":  case "A":
            case "e":  case "E":
            case "i":  case "I":
            case "o":  case "O":
            case "u":  case "U":
                System.out.println("Your letter is a vowel");
                break;

            case "b":  case "B":
            case "c":  case "C":
            case "d":  case "D":
            case "f":  case "F":
            case "g":  case "G":
            case "h":  case "H":
            case "j":  case "J":
            case "k":  case "K":
            case "l":  case "L":
            case "m":  case "M":
            case "n":  case "N":
            case "p":  case "P":
            case "q":  case "Q":
            case "r":  case "R":
            case "s":  case "S":
            case "t":  case "T":
            case "v":  case "V":
            case "w":  case "W":
            case "x":  case "X":
            case "y":  case "Y":
            case "z":  case "Z":
                System.out.println("Your letter is a consonant");
                      break;
        }
    }
}
