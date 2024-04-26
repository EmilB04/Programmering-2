package models;

public class Video_3_2 {
    static int totalNumberOfVideoes = 0;

    public Video() {
        totalNumberOfVideoes ++;
    }

    public static void printTotalNumberOfVideoes() {
        System.out.println("The total number of videoes creates is" + totalNumberOfVideoes);
    }


}
