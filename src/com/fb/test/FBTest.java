package com.fb.test;

import java.util.Calendar;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.fb.beans.Meeting;

public class FBTest {

	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/fb/common/application-context.xml"));
		/*Meeting meeting = factory.getBean("meeting", Meeting.class);
		System.out.println(meeting);*/
		Calendar c1 = factory.getBean("calendar", Calendar.class);
		Calendar c2 = factory.getBean("calendar", Calendar.class);
		System.out.println("C1==C2: "+(c1==c2));
		
	}

}
