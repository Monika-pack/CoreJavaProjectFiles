package texteditor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {

	
	//import spell_checker.SpellChecker.TextEditor;

	public static class Main {

		public static void main(String[] args) {
			
				   ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
				    TextEditor tob=(TextEditor)ctx.getBean("texteditor");
				    ((TextEditor) tob).Spellcheck();
				  
				}


		}


}


