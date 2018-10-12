package com.thinkInJava.Test;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import static com.thinkInJava.Chapter6.Print.print;

public class GoodsItemIOAndAnalyze {
    public static void main(String[] args) {
        String parentURL = "C:\\Users\\admin\\Desktop\\5497MDM\\MDM文件";
        String childURL = "物资.xml";

//        String text = readTextFromFile(parentURL, childURL);

//        print(text);

        Map<String, List<String>> xmlKeyValueMap = goodsItemXMLAnalyse(parentURL, childURL);
        for (String key : xmlKeyValueMap.keySet()) {
            print(key + ": " + xmlKeyValueMap.get(key));
        }

    }

    /*
     * goodsItemXMLAnalyse 分析物料信息XML,返回属性和值的MAP
     *
     * @param [parentURL, childURL]
     * @return java.util.Map<java.lang.String,java.util.List<java.lang.String>>
     * @author zy
     * @date 3:04 PM 9/7/18
     */
    private static Map<String, List<String>> goodsItemXMLAnalyse(String parentURL, String childURL) {
        Map<String, List<String>> xmlKeyValueMap = new LinkedHashMap<>();
        try {
            SAXReader reader = new SAXReader();
            Document document = reader.read(new File(parentURL, childURL));
            goodsItemXMLAnalyse(document.getRootElement(), xmlKeyValueMap);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return xmlKeyValueMap;
    }

    private static void goodsItemXMLAnalyse(Element element, Map<String, List<String>> xmlKeyValueMap) {
        for (Iterator<Element> it = element.elementIterator(); it.hasNext(); ) {
            Element ele = it.next();
            if (ele.elementIterator().hasNext()) {
                goodsItemXMLAnalyse(ele, xmlKeyValueMap);
            } else {
                List<String> valueList;
                if (xmlKeyValueMap.containsKey(ele.getName())) {
                    valueList = xmlKeyValueMap.get(ele.getName());
                } else {
                    valueList = new LinkedList<>();
                }
                valueList.add(ele.getStringValue());
                xmlKeyValueMap.put(ele.getName(), valueList);
            }
        }
    }

    private static void treeWalk(String parentURL, String childURL) {
        try {
            SAXReader reader = new SAXReader();
            Document document = reader.read(new File(parentURL, childURL));
            treeWalk(document.getRootElement());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void treeWalk(Element element) {
        for (int i = 0; i < element.nodeCount(); i++) {
            Node node = element.node(i);
            if (node instanceof Element && node.getName() != null) {
                print(node.getName() + ": " + node.getStringValue());
                treeWalk((Element) node);
            }
        }
    }

    private static String readTextFromFile(String parentURL, String childURL) {
        File file = new File(parentURL, childURL);

        StringBuilder stringBuilder = new StringBuilder();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String s;
            while ((s = bufferedReader.readLine()) != null) {
                stringBuilder.append(s);
                stringBuilder.append("\n");
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return stringBuilder.toString();
    }
}
