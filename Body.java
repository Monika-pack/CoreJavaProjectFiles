package Human;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body {

	private static ApplicationContext ctx;

	public static void main(String[] args) {
		ctx = new ClassPathXmlApplicationContext("spring.xml");
		Human hob=(Human)ctx.getBean("humanobject");
		
				hob.func();

	}

}
