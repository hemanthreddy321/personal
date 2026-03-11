package interview;

public class FindDuplicateStringCharacter {

    public static void main(String[] args) {
        String s = "hackerearth";
        char[] character = s.toCharArray();
        boolean isNotDupliacte = false;

        for (int i = 0; i<s.length(); i++) {
            boolean isDupliacte = false;

            for (int j = i+1; j<s.length(); j++) {
                if(character[i] == character[j]) {
                    isDupliacte = true;
                    break;
                }
            }
            if (isDupliacte) {
                System.out.print(character[i]);
                isNotDupliacte = true;
            }
            if (!isNotDupliacte) {
                System.out.println("No duplicates are found");
            }
        }
    }
}
