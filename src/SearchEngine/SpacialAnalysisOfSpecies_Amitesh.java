package SearchEngine;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;

import org.apache.commons.io.comparator.LastModifiedFileComparator;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class SpacialAnalysisOfSpecies_Amitesh {
    public static void main(String args[]) throws ParserConfigurationException, SAXException, IOException, TransformerException

    {

        String filepath = "D:\\Bio research\\Work space\\Cdynomics_Amitesh\\resultss\\new2(20171224_1754)\\agent_State\\agent_State(1500).xml";


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
        int c21 = 0;
        int c22 = 0;
        int c23 = 0;
        int c24 = 0;
        int c25 = 0;
        int c26 = 0;
        int m21 = 0;
        int m22 = 0;
        int m23 = 0;
        int m24 = 0;
        int m25 = 0;
        int m26 = 0;
        int m11 = 0;
        int m12 = 0;
        int m13 = 0;
        int m14 = 0;
        int m15 = 0;
        int m16 = 0;
        int d21 = 0;
        int d22 = 0;
        int d23 = 0;
        int d24 = 0;
        int d25 = 0;
        int d26 = 0;
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

        for (int i = 0; i < company.getLength(); i++) {

            Node node = company.item(i);
            Element eElement = (Element) node;
            System.out.println(".........>>.........>>." + eElement.getAttribute("name"));


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
                    if (radius > 450) {
                        c6++;
                    }
                }

                System.out.println(c1);
                System.out.println(c2);
                System.out.println(c3);
                System.out.println(c4);
                System.out.println(c5);
                System.out.println(c6);


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
                    if (radius > 450) {
                        c26++;
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
                    if (radius > 450) {
                        m26++;
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
                    if (radius > 450) {
                        m16++;
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
                    if (radius > 450) {
                        d6++;
                    }
                }

                System.out.println(d1);
                System.out.println(d2);
                System.out.println(d3);
                System.out.println(d4);
                System.out.println(d5);
                System.out.println(d6);
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
                    if (radius > 450) {
                        o6++;
                    }
                }

                System.out.println(o1);
                System.out.println(o2);
                System.out.println(o3);
                System.out.println(o4);
                System.out.println(o5);
                System.out.println(o6);
            }
            System.out.println("____________________________________________");
            System.out.println("____________________________________________");
        }


    }


}

