package SearchEngine;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.comparator.LastModifiedFileComparator;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeadCellsspacialDistributionCsvWriter_Amitesh {
    public static void main(String args[]) throws ParserConfigurationException, SAXException, IOException, TransformerException

    {
        final String RESULT_PATH = "D:\\Bio research\\Work space\\Cdynomics_Amitesh\\resultss\\";
        String name = "mature granule without desulfovibrio(20180124_1839)";
        String[] names = new String[1000000];
        List<String> outputLines = new ArrayList<String>();
        File lastResultDirectory = new File(RESULT_PATH + name + "\\agent_State\\");
        File[] files = lastResultDirectory.listFiles();
        Arrays.sort(files, LastModifiedFileComparator.LASTMODIFIED_COMPARATOR);

        for (int p = 0; p < files.length; p++) {
            names[p] = files[p].getPath();
        }

        for (int i = 0; i < files.length; i++) {
            if (names[i].contains(".xml")) {
                //outputLines.add(names[i] + "," + "Cellobiose" + "," + "Acetate" + "," + "Methane" + "," + "Lactate" + "," + "Ethanol" + "," + "Hydrogen" + "," + "Oleate");
                String[] splits = names[i].split("\\.");
                String filepath = names[i];
                // need to pass updated filepath each time in the new loop
                System.out.println(filepath);

                DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
                Document doc = docBuilder.parse(filepath);
                StreamResult result = new StreamResult(new File(filepath));
                // String muMax;
                NodeList company = doc.getElementsByTagName("species");
                int c1 = 0;
                int m1 = 0;
                int d1 = 0;
                int c2 = 0;
                int m2 = 0;
                int d2 = 0;
                int c3 = 0;
                int m3 = 0;
                int d3 = 0;
                int c4 = 0;
                int m4 = 0;
                int d4 = 0;
                int c5 = 0;
                int m5 = 0;
                int d5 = 0;
                int d6 = 0;
                int c6 = 0;
                int d7 = 0;
                int d8 = 0;
                int c7 = 0;
                int c8 = 0;
                int c21 = 0;
                int c22 = 0;
                int c23 = 0;
                int c24 = 0;
                int c25 = 0;
                int c26 = 0;
                int c27 = 0;
                int c28 = 0;
                int m21 = 0;
                int m22 = 0;
                int m23 = 0;
                int m24 = 0;
                int m25 = 0;
                int m26 = 0;
                int m27 = 0;
                int m28 = 0;
                int m11 = 0;
                int m12 = 0;
                int m13 = 0;
                int m14 = 0;
                int m15 = 0;
                int m16 = 0;
                int m17 = 0;
                int m18 = 0;
                int d21 = 0;
                int d22 = 0;
                int d23 = 0;
                int d24 = 0;
                int d25 = 0;
                int d26 = 0;
                int d27 = 0;
                int d28 = 0;
                int d11 = 0;
                int d12 = 0;
                int d13 = 0;
                int d14 = 0;
                int d15 = 0;
                int d16 = 0;
                int o1 = 0;
                int o2 = 0;
                int o3 = 0;
                int o4 = 0;
                int o5 = 0;
                int o6 = 0;
                int o7 = 0;
                int o8 = 0;

                for (int inner = 0; inner < company.getLength(); inner++) {

                    Node node = company.item(inner);
                    Element eElement = (Element) node;
                    System.out.println(eElement.getAttribute("name"));
                    if (eElement.getAttribute("name").contains("GDying")) {
                        String[] a1 = eElement.getTextContent().split(";");
                        for (int j = 0; j < a1.length - 1; j++) {
                            String[] a2 = a1[j].split(",");
                            String x = a2[10].trim();
                            String y = a2[11].trim();
                            String biomass = a2[5].trim();
                            double x1 = Double.valueOf(x);
                            double y1 = Double.valueOf(y);
                            double radius = 0;
                            radius = Math.sqrt((254 - x1) * (254 - x1) + (254 - y1) * (254 - y1));
                            radius = radius * 4;
                            //System.out.println(r);
                            if (radius > 0 && radius < 90) {
                                c1++;
                            }
                            if (radius > 90 && radius < 180) {
                                c2++;
                            }
                            if (radius > 180 && radius < 270) {
                                c3++;
                            }
                            if (radius > 270 && radius < 360) {
                                c4++;
                            }
                            if (radius > 360 && radius < 450) {
                                c5++;
                            }
                            if (radius > 450 && radius < 540) {
                                c6++;
                            }
                            if (radius > 540) {
                                c7++;
                            }
                            if (radius > 630) {
                                c8++;
                            }
                        }
                        System.out.println(c1);
                        System.out.println(c2);
                        System.out.println(c3);
                        System.out.println(c4);
                        System.out.println(c5);
                        System.out.println(c6);
                    }


                }
                outputLines.add("radius"+ ","+"Died cells");
                outputLines.add("0-90"+","+Integer.toString(c1));
                outputLines.add("90-180"+","+Integer.toString(c2));
                outputLines.add("180-270"+","+Integer.toString(c3));
                outputLines.add("270-360"+","+Integer.toString(c4));
                outputLines.add("360-450"+","+Integer.toString(c5));
                outputLines.add("450-540"+","+Integer.toString(c6));
                outputLines.add("540-630+"+","+Integer.toString(c7));
               // outputLines.add("630+"+","+Integer.toString(c8)+","+Integer.toString(c28)+","+Integer.toString(m18)+","+Integer.toString(m28)+","+Integer.toString(d8)+","+Integer.toString(d28)+","+Integer.toString(o8));
                FileUtils.writeLines(new File(RESULT_PATH + name + "\\SpacialDistributionDeadCellsData\\"+names[i].substring(86, names[i].length()-4)+".csv"), outputLines);
             //   System.out.println(names[i] + "," + "Cellobiose" + "," + "Acetate" + "," + "Methane" + "," + "Lactate" + "," + "Ethanol" + "," + "Hydrogen" + "," + "Oleate");
                outputLines.clear();
            }

        }
      //  FileUtils.writeLines(new File(RESULT_PATH + name + "\\SpacialDistribution.csv"), outputLines);
    }
}