package practice;

import java.io.*;
import java.util.*;

public class TopNWords {
    public static void main(String[] args) throws IOException {

        String fileName = "src/input.txt";
        int N = 2;
        Map<String, Integer> wordCountMap = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    word = word.toLowerCase();
                    wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                }
            }
        }

        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            int i;
            for (i = 0; i < sortedList.size(); i++) {
                if (sortedList.get(i).getValue() < entry.getValue()) {
                    break;
                }
            }
            sortedList.add(i, entry);
        }

        for (int i = 0; i < N && i < sortedList.size(); i++) {
            System.out.println(sortedList.get(i).getKey() + ": " + sortedList.get(i).getValue());
        }
    }
}