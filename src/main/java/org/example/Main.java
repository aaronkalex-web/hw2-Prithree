package org.example;
import java.util.Scanner;
import java.util.Random;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static String sonnet = "Shall I compare thee to a summer’s day? " +
            "Thou art more lovely and more temperate: \n" +
            "Rough winds do shake the darling buds of May, \n" +
            "And summer’s lease hath all too short a date; \n" +
            "Sometime too hot the eye of heaven shines, \n" +
            "And often is his gold complexion dimm’d; \n" +
            "And every fair from fair sometime declines, \n" +
            "By chance or nature’s changing course untrimm'd; \n" +
            "But thy eternal summer shall not fade, \n" +
            "Nor lose possession of that fair thou ow’st; \n" +
            "Nor shall death brag thou wander’st in his shade, \n" +
            "When in eternal lines to time thou grow’st: \n" +
            "So long as men can breathe or eyes can see, \n" +
            "So long lives this, and this gives life to thee. \n";
    public static void main(String[] args) {
        int correct = 0;
        int wrong = 0;
        Scanner scanner = new Scanner(System.in);
        String[] sonnetArr = convert();

        while (correct != 3 && wrong != 3) {
            Random rand = new Random();
            int random = rand.nextInt(sonnetArr.length);
            for (int i = 0; i<random; i++) {
                System.out.print(sonnetArr[i] + " ");
            }
            System.out.print("_____ ");
            System.out.println("Please type the next word");
            String word = scanner.next();
            if (word.equals(sonnetArr[random])) {
                System.out.println("Right!");
                correct ++;
            }
            else {
                System.out.println("Wrong!");
                wrong++;
            }
        }


    }

    public static String[] convert(){
        String[] convert = new String[114];
        int convertIndex = 0;
        int start = 0;
        int end = 0;
        for (int i = 0; i < sonnet.length(); i++) {
            if (sonnet.charAt(i) == ' ') {
                convert[convertIndex] = sonnet.substring(start, end);
                convertIndex++;
                start = end + 1;
                end = i + 1;
            }
            else{
                end++;
            }
        }
        return convert;
    }
}