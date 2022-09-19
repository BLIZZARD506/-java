package unit03;
import java.util.Random;
import java.util.Scanner;

class GuessNumber{
    int randomNumber;
    public int getRandomNumber() {
        return randomNumber;
    }

    public void setRandomNumber(int randomNumber) {
        this.randomNumber = randomNumber;
    }
    GuessNumber(){
        Random ran = new Random();
        setRandomNumber(ran.nextInt(10));
    }
}
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input a number between 0 and 10:");
        int guessNum = sc.nextInt();
        GuessNumber gus = new GuessNumber();
        while (true) {
            if(gus.getRandomNumber() == guessNum){
                System.out.println("correct! the number is:"+guessNum);
                break;
            } else if (gus.getRandomNumber() > guessNum) {
                System.out.println("wrong! guess bigger");
                guessNum = sc.nextInt();
            } else if (gus.getRandomNumber() < guessNum) {
                System.out.println("wrong! guess smaller");
                guessNum = sc.nextInt();
            }
        }
    }
}
