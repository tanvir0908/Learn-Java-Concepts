class DiceRoll {

    int roll() {
        int randomNumber = (int) Math.ceil(Math.random() * 6);
        return randomNumber;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Dice Roll game");
        DiceRoll newDice = new DiceRoll();
        int randomNumber = newDice.roll();
        System.out.println("Dice result is: " + randomNumber);
    }
}