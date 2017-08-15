package com.lipop.util;

import java.io.FileOutputStream;
import java.io.IOException;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

public class DOM4J01 {
		public static void main(String[] args) {
			Document document = DocumentHelper.createDocument();
			Element studentElement = document.addElement("student");
			studentElement.addAttribute("id", "001");
			studentElement.addAttribute("aa", "xx");
			
			Element name = studentElement.addElement("name");
			name.setText("張三");
			
			Element age = studentElement.addElement("age");
			age.setText("18");
			
			Element sex = studentElement.addElement("sex");
			sex.setText("男");
			
			OutputFormat format = OutputFormat.createPrettyPrint();
			format.setEncoding("utf-8");
			try {
				XMLWriter writer = new XMLWriter(new FileOutputStream("src/Student4.xml"),format);
				writer.write(document);
				writer.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
}
