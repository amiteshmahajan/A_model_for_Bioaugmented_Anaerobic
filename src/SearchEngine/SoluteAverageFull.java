package SearchEngine;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.comparator.LastModifiedFileComparator;

public class SoluteAverageFull {

    private static final String RESULT_PATH = "D:\\Bio research\\Work space\\Cdynomics_Amitesh\\resultss\\";
    private static String separator = " ";

    public static void main(String[] args) throws IOException {

        String name = "new2(20171217_1558)\\new2(20180204_2049)";

        consolidateSoluteConcentrations(name);
    }

    private static void consolidateSoluteConcentrations(String name) throws IOException {
        boolean vascular = false;
        String[] names = new String[1000000];
        File lastResultDirectory = new File(RESULT_PATH + name + "\\SoluteConcentration\\xy-1\\");
        File[] files = lastResultDirectory.listFiles();
        Arrays.sort(files, LastModifiedFileComparator.LASTMODIFIED_COMPARATOR);

        for (int p = 0; p < files.length; p++) {
            names[p] = files[p].getPath();
        }


//Arrays.sort();
//Collections.sort(names, LastModifiedFileComparator.LASTMODIFIED_COMPARATOR);
        List<Double> Acetate = new ArrayList<Double>();
        List<Double> Cellobiose = new ArrayList<Double>();
        List<Double> Ethanol = new ArrayList<Double>();
        List<Double> Lactate = new ArrayList<Double>();
        List<Double> Methane = new ArrayList<Double>();
        List<Double> Hydrogen = new ArrayList<Double>();
        // if (files.length > 0) {
        /** The newest file comes first **/
        //
        for (int i = 0; i < files.length; i++) {
            if (names[i].contains(".txt")) {
                String[] splits = names[i].split("\\.");
                int hour = Integer.parseInt(splits[0].substring(splits[0].length() - 3, splits[0].length()));
                //System.out.println(hour);
                String filePath = RESULT_PATH + name + "\\SoluteConcentration\\xy-1\\" + names[i];
                List<String> lines = Files.readAllLines(Paths.get(names[i]));

                double sum = 0;
                for (int k = lines.size() - 1; k >= 0; k--) {
                    String[] digitStrings = lines.get(k).split(separator);

                    int[] digits = new int[digitStrings.length];
                    for (int K=0;K<digits.length;K++){
                        String digit = lines.get(K);
                        digits[K]= Integer.parseInt(digit);
                    }
                    for (int j = 0; j < digits.length; j++) {
                        sum += digits[j];
                    }
                }
                if (names[i].contains("Cellobiose")) {
                    Cellobiose.add(sum);
                }

                if (names[i].contains("Acetate")) {
                    Acetate.add(sum);
                }
                if (names[i].contains("Methane")) {
                    Methane.add(sum);
                }
                if (names[i].contains("Lactate")) {
                    Lactate.add(sum);
                }
                if (names[i].contains("Ethanol")) {
                    Ethanol.add(sum);
                }
                if (names[i].contains("Hydrogen")) {
                    Hydrogen.add(sum);
                }
            }
        }
        List<String> outputLines = new ArrayList<String>();
        outputLines.add("Hours" + "," + "Cellobiose" + "," + "Acetate" + "," + "Methane" + "," + "Lactate" + "," + "Ethanol" + "," + "Hydrogen");
        for (int i = 0; i < Cellobiose.size(); i++) {
            outputLines.add(i * 5 + "," + Cellobiose.get(i) + "," + Acetate.get(i) + "," + Methane.get(i) + "," + Lactate.get(i) + "," + Ethanol.get(i) + "," + Hydrogen.get(i));
            System.out.println(outputLines.get(i));
        }
        FileUtils.writeLines(new File(RESULT_PATH + name + "\\SoluteConcentration\\Consolidated.txt"), outputLines);
    }
}

