package SearchEngine;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.comparator.LastModifiedFileComparator;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class spacialDistributionCsvWriter_Amitesh {
    public static void main(String args[]) throws ParserConfigurationException, SAXException, IOException, TransformerException

    {
        final String RESULT_PATH = "D:\\Bio research\\Work space\\Cdynomics_Amitesh\\resultss\\";
        String name = "mature granule without desulfovibrio(20180124_1839)\\2.3(20180125_1830)";
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
                int de1 = 0;
                int de2 = 0;
                int de3 = 0;
                int de4 = 0;
                int de5 = 0;
                int de6 = 0;
                int de7 = 0;
                int de8 = 0;


                for (int inner = 0; inner < company.getLength(); inner++) {

                    Node node = company.item(inner);
                    Element eElement = (Element) node;
                    System.out.println(eElement.getAttribute("name"));
                    if (eElement.getAttribute("name").equals("Clostridium1")) {
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
                                de1++;
                            }
                            if (radius > 90 && radius < 180) {
                                de2++;
                            }
                            if (radius > 180 && radius < 270) {
                                de3++;
                            }
                            if (radius > 270 && radius < 360) {
                                de4++;
                            }
                            if (radius > 360 && radius < 450) {
                                de5++;
                            }
                            if (radius > 450 && radius < 540) {
                                de6++;
                            }
                            if (radius > 540) {
                                de7++;
                            }
                            if (radius > 630) {
                                de8++;
                            }
                        }
                        System.out.println(de1);
                        System.out.println(de2);
                        System.out.println(de3);
                        System.out.println(de4);
                        System.out.println(de5);
                        System.out.println(de6);
                    }
                    if (eElement.getAttribute("name").equals("Clostridium2")) {

                        String[] a1 = eElement.getTextContent().split(";");
                        for (int j = 0; j < a1.length - 1; j++) {
                            String[] a2 = a1[j].split(",");
                            String x = a2[10].trim();
                            String y = a2[11].trim();
                            String biomass = a2[5].trim();
                            //String z=a2[12].trim();
                            //System.out.println(x+":"+y+":"+z);
                            double x1 = Double.valueOf(x);
                            double y1 = Double.valueOf(y);
                            double radius = 0;
                            //System.out.println(biomass);
                /*	if(x1<500 && y1>500)
					{*/

                            radius = Math.sqrt((254 - x1) * (254 - x1) + (254 - y1) * (254 - y1));
                            radius = radius * 4;
                            //System.out.println(r);
                            if (radius > 0 && radius < 90) {
                                c21++;
                            }
                            if (radius > 90 && radius < 180) {
                                c22++;
                            }
                            if (radius > 180 && radius < 270) {
                                c23++;
                            }
                            if (radius > 270 && radius < 360) {
                                c24++;
                            }
                            if (radius > 360 && radius < 450) {
                                c25++;
                            }
                            if (radius > 450 && radius < 540) {
                                c26++;
                            }
                            if (radius > 540) {
                                c27++;
                            }
                            if (radius > 630) {
                                c28++;
                            }
                        }

                        System.out.println(c21);
                        System.out.println(c22);
                        System.out.println(c23);
                        System.out.println(c24);
                        System.out.println(c25);
                        System.out.println(c26);
                    }
                    if (eElement.getAttribute("name").equals("Methanogen2")) {

                        String[] a1 = eElement.getTextContent().split(";");
                        for (int j = 0; j < a1.length - 1; j++) {
                            String[] a2 = a1[j].split(",");
                            String x = a2[10].trim();
                            String y = a2[11].trim();
                            String biomass = a2[5].trim();
                            //String z=a2[12].trim();
                            //System.out.println(x+":"+y+":"+z);
                            double x1 = Double.valueOf(x);
                            double y1 = Double.valueOf(y);
                            double radius = 0;
                            //System.out.println(biomass);
				/*	if(x1<500 && y1>500)
					{*/

                            radius = Math.sqrt((254 - x1) * (254 - x1) + (254 - y1) * (254 - y1));
                            radius = radius * 4;
                            //System.out.println(r);
                            if (radius > 0 && radius < 90) {
                                m21++;
                            }
                            if (radius > 90 && radius < 180) {
                                m22++;
                            }
                            if (radius > 180 && radius < 270) {
                                m23++;
                            }
                            if (radius > 270 && radius < 360) {
                                m24++;
                            }
                            if (radius > 360 && radius < 450) {
                                m25++;
                            }
                            if (radius > 450 && radius < 540) {
                                m26++;
                            }
                            if (radius > 540 ) {
                                m27++;
                            }
                            if (radius > 630) {
                                m28++;
                            }
                        }

                        System.out.println(m21);
                        System.out.println(m22);
                        System.out.println(m23);
                        System.out.println(m24);
                        System.out.println(m25);
                        System.out.println(m26);


                    }
                    if (eElement.getAttribute("name").equals("Methanogen1")) {

                        String[] a1 = eElement.getTextContent().split(";");
                        for (int j = 0; j < a1.length - 1; j++) {
                            String[] a2 = a1[j].split(",");
                            String x = a2[10].trim();
                            String y = a2[11].trim();
                            String biomass = a2[5].trim();
                            //String z=a2[12].trim();
                            //System.out.println(x+":"+y+":"+z);
                            double x1 = Double.valueOf(x);
                            double y1 = Double.valueOf(y);
                            double radius = 0;
                            //System.out.println(biomass);
				/*	if(x1<500 && y1>500)
					{*/

                            radius = Math.sqrt((254 - x1) * (254 - x1) + (254 - y1) * (254 - y1));
                            radius = radius * 4;
                            //System.out.println(r);
                            if (radius > 0 && radius < 90) {
                                m11++;
                            }
                            if (radius > 90 && radius < 180) {
                                m12++;
                            }
                            if (radius > 180 && radius < 270) {
                                m13++;
                            }
                            if (radius > 270 && radius < 360) {
                                m14++;
                            }
                            if (radius > 360 && radius < 450) {
                                m15++;
                            }
                            if (radius > 450 && radius < 540) {
                                m16++;
                            }
                            if (radius > 540) {
                                m17++;
                            }
                            if (radius > 630) {
                                m18++;
                            }
                        }

                        System.out.println(m11);
                        System.out.println(m12);
                        System.out.println(m13);
                        System.out.println(m14);
                        System.out.println(m15);
                        System.out.println(m16);
                    }

                    if (eElement.getAttribute("name").equals("Desulfovibrio")) {

                        String[] a1 = eElement.getTextContent().split(";");
                        for (int j = 0; j < a1.length - 1; j++) {
                            String[] a2 = a1[j].split(",");
                            String x = a2[10].trim();
                            String y = a2[11].trim();
                            String biomass = a2[5].trim();
                            //String z=a2[12].trim();
                            //System.out.println(x+":"+y+":"+z);
                            double x1 = Double.valueOf(x);
                            double y1 = Double.valueOf(y);
                            double radius = 0;
                            //System.out.println(biomass);
				/*	if(x1<500 && y1>500)
					{*/

                            radius = Math.sqrt((254 - x1) * (254 - x1) + (254 - y1) * (254 - y1));
                            radius = radius * 4;
                            //System.out.println(r);
                            if (radius > 0 && radius < 90) {
                                d1++;
                            }
                            if (radius > 90 && radius < 180) {
                                d2++;
                            }
                            if (radius > 180 && radius < 270) {
                                d3++;
                            }
                            if (radius > 270 && radius < 360) {
                                d4++;
                            }
                            if (radius > 360 && radius < 450) {
                                d5++;
                            }
                            if (radius > 450 && radius < 540) {
                                d6++;
                            }
                            if (radius > 540) {
                                d7++;
                            }
                            if (radius > 630) {
                                d8++;
                            }
                        }

                        System.out.println(d1);
                        System.out.println(d2);
                        System.out.println(d3);
                        System.out.println(d4);
                        System.out.println(d5);
                        System.out.println(d6);
                    }

                    if (eElement.getAttribute("name").equals("Desulfovibrio2")) {

                        String[] a1 = eElement.getTextContent().split(";");
                        for (int j = 0; j < a1.length - 1; j++) {
                            String[] a2 = a1[j].split(",");
                            String x = a2[10].trim();
                            String y = a2[11].trim();
                            String biomass = a2[5].trim();
                            //String z=a2[12].trim();
                            //System.out.println(x+":"+y+":"+z);
                            double x1 = Double.valueOf(x);
                            double y1 = Double.valueOf(y);
                            double radius = 0;
                            //System.out.println(biomass);
				/*	if(x1<500 && y1>500)
					{*/

                            radius = Math.sqrt((254 - x1) * (254 - x1) + (254 - y1) * (254 - y1));
                            radius = radius * 4;
                            //System.out.println(r);
                            if (radius > 0 && radius < 90) {
                                d21++;
                            }
                            if (radius > 90 && radius < 180) {
                                d22++;
                            }
                            if (radius > 180 && radius < 270) {
                                d23++;
                            }
                            if (radius > 270 && radius < 360) {
                                d24++;
                            }
                            if (radius > 360 && radius < 450) {
                                d25++;
                            }
                            if (radius > 450 && radius < 540) {
                                d26++;
                            }
                            if (radius > 540 ) {
                                d27++;
                            }
                            if (radius > 630) {
                                d28++;
                            }
                        }

                        System.out.println(d21);
                        System.out.println(d22);
                        System.out.println(d23);
                        System.out.println(d24);
                        System.out.println(d25);
                        System.out.println(d26);
                    }

                    if (eElement.getAttribute("name").equals("OleateDegrader")) {

                        String[] a1 = eElement.getTextContent().split(";");
                        for (int j = 0; j < a1.length - 1; j++) {
                            String[] a2 = a1[j].split(",");
                            String x = a2[10].trim();
                            String y = a2[11].trim();
                            String biomass = a2[5].trim();
                            //String z=a2[12].trim();
                            //System.out.println(x+":"+y+":"+z);
                            double x1 = Double.valueOf(x);
                            double y1 = Double.valueOf(y);
                            double radius = 0;
                            //System.out.println(biomass);
				/*	if(x1<500 && y1>500)
					{*/

                            radius = Math.sqrt((254 - x1) * (254 - x1) + (254 - y1) * (254 - y1));
                            radius = radius * 4;
                            //System.out.println(r);
                            if (radius > 0 && radius < 90) {
                                o1++;
                            }
                            if (radius > 90 && radius < 180) {
                                o2++;
                            }
                            if (radius > 180 && radius < 270) {
                                o3++;
                            }
                            if (radius > 270 && radius < 360) {
                                o4++;
                            }
                            if (radius > 360 && radius < 450) {
                                o5++;
                            }
                            if (radius > 450 && radius <540) {
                                o6++;
                            }
                            if (radius > 540 ) {
                                o7++;
                            }
                            if (radius > 630) {
                                o8++;
                            }
                        }

                        System.out.println(o1);
                        System.out.println(o2);
                        System.out.println(o3);
                        System.out.println(o4);
                        System.out.println(o5);
                        System.out.println(o6);
                    }

                }
                outputLines.add("radius"+ ","+"Clostridium1" +","+"Clostridium2" +","+"Methanogen1" +","+"Methanogen2" +","+"Desulfovibrio" +","+"Desulfovibrio2" +","+"OleateDegrader"+","+"Dead cells");
                outputLines.add("0-90"+","+Integer.toString(c1)+","+Integer.toString(c21)+","+Integer.toString(m11)+","+Integer.toString(m21)+","+Integer.toString(d1)+","+Integer.toString(d21)+","+Integer.toString(o1)+","+Integer.toString(de1));
                outputLines.add("90-180"+","+Integer.toString(c2)+","+Integer.toString(c22)+","+Integer.toString(m12)+","+Integer.toString(m22)+","+Integer.toString(d2)+","+Integer.toString(d22)+","+Integer.toString(o2)+","+Integer.toString(de2));
                outputLines.add("180-270"+","+Integer.toString(c3)+","+Integer.toString(c23)+","+Integer.toString(m13)+","+Integer.toString(m23)+","+Integer.toString(d3)+","+Integer.toString(d23)+","+Integer.toString(o3)+","+Integer.toString(de3));
                outputLines.add("270-360"+","+Integer.toString(c4)+","+Integer.toString(c24)+","+Integer.toString(m14)+","+Integer.toString(m24)+","+Integer.toString(d4)+","+Integer.toString(d24)+","+Integer.toString(o4)+","+Integer.toString(de4));
                outputLines.add("360-450"+","+Integer.toString(c5)+","+Integer.toString(c25)+","+Integer.toString(m15)+","+Integer.toString(m25)+","+Integer.toString(d5)+","+Integer.toString(d25)+","+Integer.toString(o5)+","+Integer.toString(de5));
                outputLines.add("450-540"+","+Integer.toString(c6)+","+Integer.toString(c26)+","+Integer.toString(m16)+","+Integer.toString(m26)+","+Integer.toString(d6)+","+Integer.toString(d26)+","+Integer.toString(o6)+","+Integer.toString(de6));
                outputLines.add("540-630+"+","+Integer.toString(c7)+","+Integer.toString(c27)+","+Integer.toString(m17)+","+Integer.toString(m27)+","+Integer.toString(d7)+","+Integer.toString(d27)+","+Integer.toString(o7)+","+Integer.toString(de7));
               // outputLines.add("630+"+","+Integer.toString(c8)+","+Integer.toString(c28)+","+Integer.toString(m18)+","+Integer.toString(m28)+","+Integer.toString(d8)+","+Integer.toString(d28)+","+Integer.toString(o8));
                FileUtils.writeLines(new File(RESULT_PATH + name + "\\SpacialDistributionData\\"+names[i].substring(86, names[i].length()-4)+".csv"), outputLines);
             //   System.out.println(names[i] + "," + "Cellobiose" + "," + "Acetate" + "," + "Methane" + "," + "Lactate" + "," + "Ethanol" + "," + "Hydrogen" + "," + "Oleate");
                outputLines.clear();
            }

        }
      //  FileUtils.writeLines(new File(RESULT_PATH + name + "\\SpacialDistribution.csv"), outputLines);
    }
}