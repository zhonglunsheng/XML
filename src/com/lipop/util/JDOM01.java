package com.lipop.util;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.XMLOutputter;



public class JDOM01 {
		public static void main(String[] args) {
			
			Element student = new Element("student");
			Attribute id = new Attribute("id", "001");
			Attribute aa = new Attribute("aa", "xx");
			student.setAttribute(id);
			student.setAttribute(aa);
			
			Element name = new Element("name");
			name.setText("张三");
			student.addContent(name);
			
			Element age = new Element("age");
			age.setText("20");
			student.addContent(age);
			
			Element sex = new Element("sex");
			sex.setText("男");
			student.addContent(sex);
			
			Document doc=new Document(student);
			XMLOutputter out = new XMLOutputter();
			out.setFormat(out.getFormat().setEncoding("utf-8"));
			try {
				out.output(doc, new FileOutputStream("src/Student3.xml"));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
}
