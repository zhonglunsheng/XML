package com.lipop.util;

import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.lipop.model.Student;


public class SAX02 extends DefaultHandler{
	List<Student> studentList = null;
	Student student = null;
	String flag;
	@Override
	public void startDocument() throws SAXException {
		System.out.println("读取开始");
		studentList = new ArrayList<Student>();
	}

	@Override
	public void endDocument() throws SAXException {
		System.out.println("读取结束");
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		if ("student".equals(qName)) {
			student = new Student();
			student.setId(attributes.getValue(0));
		}
		flag=qName;
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if ("student".equals(qName)) {
			studentList.add(student);
		}
		flag=null;
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		String content = new String(ch, start, length);
		if ("name".equals(flag)) {
			student.setName(content);
		}else if ("age".equals(flag)) {
			student.setAge(content);
		}else if ("sex".equals(flag)) {
			student.setSex(content);
		}
	}
	
	public static void main(String[] args)throws Exception {
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser parser = factory.newSAXParser();
		SAX02 sax02 = new SAX02();
		parser.parse("src/Student.xml", sax02);
		for(Student s:sax02.studentList){
			System.out.println(s);
		}
	}

}
