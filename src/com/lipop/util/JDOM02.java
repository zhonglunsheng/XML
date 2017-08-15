package com.lipop.util;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;

public class JDOM02 {
		public static void main(String[] args)throws Exception{
			SAXBuilder builder = new SAXBuilder();
			Document doc = builder.build("src/Student.xml");
			Element student = doc.getRootElement();
			String id = student.getAttributeValue("id");
			System.out.println(id);
			String name = student.getChildText("name");
			String age = student.getChildText("age");
			String sex = student.getChildText("sex");
			System.out.println("姓名："+name+" 年齡："+age+" 性別："+sex);
			}
			
}
