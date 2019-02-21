package studentinfo;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 */
public class StudentTest extends TestCase {

    @Test
    public void testCreate() {
        //改进：代码中出现了重复的代码：两次“Jane Doe”，两次“Joe Blow”,所以引入一个字符串常量来存储
        //避免需要修改时得处处修改，减少了工作量
        final  String FIRST_STUDENT_NAME="Jane Doe";
        Student firstStudent = new Student(FIRST_STUDENT_NAME);
        //去除不必要的局部变量
//        String studentName = student.getName();
        assertEquals(FIRST_STUDENT_NAME,firstStudent.getName());

        final String SECOND_STUDETN_NAME="Joe Blow";
        Student secondStudent = new Student(SECOND_STUDETN_NAME);
        //去除不必要的局部变量，直接使用对象进行查询。因为无助于对方法的理解
//        String secondStudentName = secondStudent.getName();
        assertEquals(SECOND_STUDETN_NAME,secondStudent.getName());
    }
}
