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

public class MaximumSoluteValue {

    private static final String RESULT_PATH = "D:\\Bio research\\Work space\\Cdynomics_Amitesh\\resultss\\";
    private static String separator = "    ";

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
            //System.out.println(""+"/n"+p);
        }
//Arrays.sort();
        //
//Collections.sort(names, LastModifiedFileComparator.LASTMODIFIED_COMPARATOR);
        List<Double> Acetate = new ArrayList<Double>();
        List<Double> Cellobiose = new ArrayList<Double>();
        List<Double> Ethanol = new ArrayList<Double>();
        List<Double> Lactate = new ArrayList<Double>();
        List<Double> Methane = new ArrayList<Double>();
        List<Double> Hydrogen = new ArrayList<Double>();
        List<Double> Oleate = new ArrayList<Double>();
        // if (files.length > 0) {
        /** The newest file comes first **/
        //
        for (int i = 0; i < files.length; i++) {
            if (names[i].contains(".txt")) {
                System.out.println(names[i]);
                String[] splits = names[i].split("\\.");
                //int hour = Integer.parseInt(splits[0].substring(splits[0].length() - 3, splits[0].length()));
                String filePath = RESULT_PATH + name + "\\SoluteConcentration\\xy-1\\" + names[i];

                List<String> lines = Files.readAllLines(Paths.get(names[i]));
                double sum = 0;
                for (int k = lines.size() - 1; k >= 0; k--) {
                    String[] digitStrings = lines.get(k).split(separator);
                    for (int j = 0; j < digitStrings.length; j++) {
                        System.out.println(digitStrings[j]);
                      /*  sum += Double.parseDouble(digitStrings[j]);*/
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
                if (names[i].contains("oleate")) {
                    Oleate.add(sum);
                }
            }
        }
        List<String> outputLines = new ArrayList<String>();
        outputLines.add("Hours" + "," + "Cellobiose" + "," + "Acetate" + "," + "Methane" + "," + "Lactate" + "," + "Ethanol" + "," + "Hydrogen" + "," + "Oleate");
        //System.out.println("here");
        for (int i = 0; i < Cellobiose.size(); i++) {
            //f2outputLines.add(i*24 + "," + Cellobiose.get(i) + ","+ Acetate.get(i) + "," + Methane.get(i)+ "," + Lactate.get(i)+ "," + Ethanol.get(i)+ ","+ Hydrogen.get(i)+ ","+ Oleate.get(i));
            outputLines.add(i * 24 + "," + Cellobiose.get(i) + "," + Acetate.get(i) + "," + Methane.get(i) + "," + Lactate.get(i) + "," + Ethanol.get(i) + "," + Hydrogen.get(i));
            System.out.println(outputLines.get(i));
        }
        FileUtils.writeLines(new File(RESULT_PATH + name + "\\SoluteConcentration\\Consolidated.csv"), outputLines);
    }
}

