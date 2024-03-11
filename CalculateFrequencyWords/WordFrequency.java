// 3. Вычислить частоту слов:
// Напишите программу, которая анализирует, сколько раз каждое
// слово встречается в файле. Подумайте об этом как о подсчете того,
// какие фрукты и овощи самые популярные на вашем пикнике!

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFrequency {
    public static void main(String[] args) {
        try {
            File file = new File("input.txt");
            Scanner scanner = new Scanner(file);

            Map<String, Integer> wordCount = new HashMap<>();
            while (scanner.hasNext()) {
                String word = scanner.next();
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
            System.out.println("Частота повторения слов:");
            for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
        }
    }
}
