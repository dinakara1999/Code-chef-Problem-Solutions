public class Duplicate {

    public static void main(String[] args) {
        String input = "goodddd";
        int count = countTwiceRepeatedCharacters(input);
        System.out.println("Total characters repeated exactly twice: " + count);
    }

    public static int countTwiceRepeatedCharacters(String input) {
        int[] characterCount = new int[256]; // Assuming ASCII character set

        for (char ch : input.toCharArray()) {
            characterCount[ch]++;
        }

        int twiceRepeatedCount = 0;
        for (int count : characterCount) {
            if (count == 2) {
                twiceRepeatedCount++;
            }
        }

        return twiceRepeatedCount;
    }
}
