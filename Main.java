package spell_checker;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import spell_checker.SpellChecker.TextEditor;

public class Main {

	public static void main(String[] args) {
		
			   ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
			    TextEditor tob=(TextEditor)ctx.getBean("texteditor");
			    tob.callSpellCheck();
			}


	}


