import java.util.Random;
import java.util.ArrayList;

public class PuzzleJava {
    private Random randMachine = new Random();
    public int[] getTenRolls(){
        int[] myArray = new int[10];
        for (int i=0; i<myArray.length; i++){
            int random = randMachine.nextInt(18)+2;
            myArray[i] = random;
        }
        return myArray;
    }
    public char getRandomLetter(){
        char[] charArray = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int random = randMachine.nextInt(26);
        return charArray[random];
    }
    public String generatePassword(){
        String password = "";
        for (int i=0; i<8; i++){
            password += getRandomLetter();
        }
        return password;
    }
    public String[] getNewPasswordSet(int l){
        String[] password = new String[l];
        for (int i=0; i<l; i++){
            password[i] = generatePassword();
        }
        return password;
    }
}
