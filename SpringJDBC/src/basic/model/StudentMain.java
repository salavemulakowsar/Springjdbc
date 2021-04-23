package basic.model;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import basic.dao.StudentDao;
import basic.dao.StudentDaoImpl;
import basic.model.Student;
public class StudentMain {

	public static void main(String[] args) {
      // ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
     // StudentDao studentDao = (StudentDao)context.getBean("studentDao");
       StudentDao studentDao = new  StudentDaoImpl();
       Student myStudent1 = new Student(3,"sweety","ce","25478");
       Student myStudent2 = new Student(4,"pinky","me","3578");
       studentDao.insert(myStudent2);
	//studentDao.delRecordById(3);
      //studentDao.delRecordByName("pinky",4);
	}


private static void insertStudent(StudentDao studentDao) 
{
	Student myStudent= new Student(3,"sweety","ce","25478");
	Student myStudent2 = new Student(4,"pinky","me","3578"); 
	studentDao.insert(myStudent2); 
	}
}

