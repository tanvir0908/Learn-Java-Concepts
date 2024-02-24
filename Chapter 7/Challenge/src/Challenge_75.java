class WordConcatenate {
    public static void main(String[] args) {
        String[] myName = {"Tanvir", "Hasan", "Emon"};

        StringBuilder fullName = new StringBuilder();
        for (String name : myName) {
            fullName.append(name).append(" ");
        }
        System.out.println(fullName);
    }
}