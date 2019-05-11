import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Alice {

    public static void main(String[] args) throws IOException {

        List<String> lines = Files.readAllLines(Paths.get("src/alice30.txt"));
        System.out.println(lines.size());
        Set<String> set = new HashSet<>();

        for (String line : lines) {
            //line = line.replaceAll("[!,.:;'@][]0-9]","");
            line = line.replaceAll("\\p{Punct}|\\digit","");

            String[] tokens = line.split(" +");
            for (String s : tokens
                 ) {
                if(!s.isEmpty())
                set.add(s.toLowerCase());
//                System.out.print(s + "|");
            }
        }

        System.out.println(set.size());

        Map<Character, Integer> chars = new TreeMap<>(); 

        for (String word : set
             ) {
            char currentFirstChar = word.charAt(0);
            if (chars.containsKey(currentFirstChar)){
                chars.put(currentFirstChar,chars.get(currentFirstChar)+1);
            } else
            chars.put(currentFirstChar,1);
        }
    }
}
