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
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BiomassGrowthAnalysis_Amitesh {
    public static void main(String args[]) throws ParserConfigurationException, SAXException, IOException, TransformerException

    {
        String RESULT_FILE_NAME = "new2(20171224_1754)";   // Enter the simulation name here
        String filepath = null;
        String RESULT_PATH = "D:\\Bio research\\Work space\\Cdynomics_Amitesh\\resultss\\";
        String FILEPATH = RESULT_PATH + RESULT_FILE_NAME + "\\agent_Sum";
        File dir = new File(RESULT_PATH + RESULT_FILE_NAME + "/graphs");

        List<String> Methanogen1 = new ArrayList<String>();
        List<String> Methanogen2 = new ArrayList<String>();
        List<String> Clostridium2 = new ArrayList<String>();
        List<String> Clostridium1 = new ArrayList<String>();
        List<String> Desulfovibrio = new ArrayList<String>();
        List<String> Oleatedegrader = new ArrayList<String>();

        File folder = new File(FILEPATH);
        File[] listOfFiles = folder.listFiles();
        Arrays.sort(listOfFiles, LastModifiedFileComparator.LASTMODIFIED_COMPARATOR);
        for (File file : listOfFiles) {
            if (file.isFile()) {
                filepath = FILEPATH + "\\" + file.getName();

                DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
                Document doc = docBuilder.parse(filepath);

                TransformerFactory transformerFactory = TransformerFactory.newInstance();
                Transformer transformer = null;
                try {
                    transformer = transformerFactory.newTransformer();
                } catch (TransformerConfigurationException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                StreamResult result = new StreamResult(new File(filepath));

                NodeList company = doc.getElementsByTagName("species");
                boolean bulk = false, in = false, pulse = false;
                String ac = null;
                String m = null;
                String d = null;
                for (int i = 0; i < company.getLength(); i++) {

                    Node node = company.item(i);
                    Element eElement = (Element) node;

                    if (eElement.getAttribute("name").equals("Desulfovibrio")) {
                        String[] a1 = eElement.getTextContent().split(",");
                        m = a1[1];
                        Desulfovibrio.add(m);
                    }
                    if (eElement.getAttribute("name").equals("Methanogen1")) {
                        String[] a1 = eElement.getTextContent().split(",");
                        m = a1[1];
                        Methanogen1.add(m);
                    }
                    if (eElement.getAttribute("name").equals("Methanogen2")) {
                        String[] a1 = eElement.getTextContent().split(",");
                        m = a1[1];
                        Methanogen2.add(m);
                    }
                    if (eElement.getAttribute("name").equals("Clostridium1")) {
                        String[] a1 = eElement.getTextContent().split(",");
                        m = a1[1];
                        Clostridium1.add(m);
                    }
                    if (eElement.getAttribute("name").equals("Clostridium2")) {
                        String[] a1 = eElement.getTextContent().split(",");
                        m = a1[1];
                        Clostridium2.add(m);
                    }

                    if (eElement.getAttribute("name").equals("Desulfovibrio2")) {

                        String[] a1 = eElement.getTextContent().split(",");
                        m = a1[1];
                        Oleatedegrader.add(m);
                    }
                }
            }
        }

        // code to write arraylists into a file
        // you need to list all the species that are found in agent_Sum file. The program will throw an exception if you mention any arraylistby the name of a species that does not exist in the agent_Sum file.
        List<String> outputLines = new ArrayList<String>();
        System.out.println("Size = " + Clostridium1.size());
        outputLines.add("Hours" + "," + "Methanogen1" + "," + "Methanogen2" + "," + "Clostridium1" + "," + "Clostridium2" + "," + "Desulfovibrio" + "," + "Desulfovibrio2");
        for (int i = 0; i < Clostridium1.size(); i++) {
           outputLines.add(i * 24 + "," + Methanogen1.get(i) + "," + Methanogen2.get(i) + "," + Clostridium1.get(i) + "," + Clostridium2.get(i)+ "," + Desulfovibrio.get(i));
          //  outputLines.add(i*24 + "," + Methanogen1.get(i) + "," + Methanogen2.get(i) + "," + Clostridium1.get(i) + "," + Clostridium2.get(i) + "," + Desulfovibrio.get(i)+ "," + Oleatedegrader.get(i));
            System.out.println(outputLines.get(i));
        }
        FileUtils.writeLines(new File(RESULT_PATH + RESULT_FILE_NAME + "\\graphs\\SpeciesBiomass.csv"), outputLines);
        System.out.println("The result file is saved at : "+ RESULT_PATH+RESULT_FILE_NAME+"\\graphs");
    }
}