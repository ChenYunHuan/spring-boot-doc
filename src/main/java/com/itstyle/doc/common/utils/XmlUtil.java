package com.itstyle.doc.common.utils;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @date 2020/9/21
 * @author chenyunhuan
 */
public class XmlUtil {

    /**
     * @authot chen.yunhuan
     * @date 2020/8/18
     * @desc解析xml值
     * @param xmlStr
     */
    public static Map<String, String> parseXml(String xmlStr, String...args) throws DocumentException {
        Map<String, String> resultMap = new HashMap<String, String>();
        Document document = DocumentHelper.parseText(xmlStr);
        Element childElement = document.getRootElement();
        if (null != childElement) {
            for (String arg : args) {
                childElement = childElement.element(arg);
            }
            Iterator<Element> iter = childElement.elementIterator();
            Element next = null;
            while (iter.hasNext()) {
                next = iter.next();
                String qName = next.getQName().getName();
                String text = next.getText();
                resultMap.put(qName, text);
            }
        }
        return resultMap;
    }
}
