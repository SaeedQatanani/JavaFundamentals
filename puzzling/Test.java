public class Test {
    public static void main(String[] args) {
        PuzzleJava generator = new PuzzleJava();
        int[] randomRolls = generator.getTenRolls();
        System.out.println("Your ten rolls are:");
        for (int i=0; i<randomRolls.length; i++){
            System.out.println(randomRolls[i]);
        }
        char randomChar = generator.getRandomLetter();
        System.out.println("Your random letter is: " + randomChar);
        System.out.println(generator.generatePassword());
        for (String word : generator.getNewPasswordSet(3)){
            System.out.print(word + " ");
        }
    }
}
