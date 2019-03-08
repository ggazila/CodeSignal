import org.jetbrains.annotations.NotNull;

import java.io.*;
import java.util.*;

public class WriteAndSplit {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write a link");
        FileReader fr = new FileReader(scan.nextLine());
        FileWriter fw = new FileWriter("C:\\Users\\PC\\Desktop\\2.txt");
        Scanner sc = new Scanner(fr);
        String c = "";
        c = getString(sc, c);
        String[] d = getStrings(c);
        SortedSet<String> myList = getSortedSet(d);
        System.out.println(myList.toString());
        writeToFile(fw, myList);
        fw.close();
        fr.close();
    }

    private static void writeToFile(FileWriter fw, SortedSet<String> myList) throws IOException {

        for (Object o : myList) {
            fw.write( o + "\n");
        }
    }

    @NotNull
    private static String[] getStrings(String c) {
        return c.toLowerCase().replaceFirst("[']","").replaceAll("[#$@&^-_,.!?0-9]","").split(" | \n");
    }

    private static SortedSet<String> getSortedSet(String[] d) {
        SortedSet<String> myList = new TreeSet<>();
        Collections.addAll(myList, d);
        return myList;
    }

    private static String getString(Scanner sc, String c) {
        while (sc.hasNextLine()) {
            c += sc.nextLine();
        }
        return c;
    }
}