package vectorWithCmdLines;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Vector;

public class charMain {
	public static void main(String[] args) {

		if (args.length != 2) {
            System.out.println("Usage: java vectorWithCmdLines.charMain <inputFile> <outputFile>");
            return;
        }

        String inputFile = args[0];
        String outputFile = args[1];

        List<CharFreq> vector = new Vector<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {

            String line;
            while ((line = reader.readLine()) != null) {

                for (int i = 0; i < line.length(); i++) {
                    char c = line.charAt(i);
                    characterFreqUpdate(vector, c);
                }

                characterFreqUpdate(vector, '\n');
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            for (CharFreq charFreq : vector) {
                writer.write(charFreq.getCharacter() + "(" + (int) charFreq.getCharacter() + ")\t" + charFreq.getFrequency() + "\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void characterFreqUpdate(List<CharFreq> vector, char c) {

        boolean found = false;

        for (CharFreq charFreq : vector) {

            if (charFreq.getCharacter() == c) {
                charFreq.increment();
                found = true;
                break;
            }
        }

        if (!found) {
        	CharFreq newCf = new CharFreq(c);
            newCf.increment();
            vector.add(newCf);
        }
    }
}
