package com.lipop.util;

import java.util.Iterator;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class DOM4J02 {
		public static void main(String[] args) throws DocumentException {
			/*SAXReader saxReader = new SAXReader();
			Document document = saxReader.read("src/student4.xml");
			Element rootElement = document.getRootElement();
			Iterator iter = rootElement.elementIterator();
			while (iter.hasNext()) {
				Element studentElement = (Element)iter.next();
				System.out.println("學號："+studentElement.attributeValue("id"));
				System.out.println("姓名："+studentElement.elementText("name"));
				System.out.println("年齡："+studentElement.elementText("age"));
				System.out.println("性別："+studentElement.elementText("sex"));
			}*/
			
			SAXReader saxReader=new SAXReader();
			Document document=saxReader.read("src/student4.xml");
			Element studentElement=document.getRootElement();
			System.out.println("学号："+studentElement.attributeValue("id"));
			System.out.println("姓名："+studentElement.elementText("name"));
			System.out.println("性别："+studentElement.elementText("sex"));
			System.out.println("年龄："+studentElement.elementText("age"));
			System.out.println("=========");
		}
}
