package model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


/**
 * Created with IntelliJ IDEA.
 * User: slamplug
 * Date: 13/11/13
 * Time: 13:38
 * To change this template use File | Settings | File Templates.
 */
public class QuestionTest {
    @Test
    public void testQuestion1() {
        Question question = new Question();
        question.setAnswerA("answer A");
        assertEquals("QuestionID should be \"answer A\"", "answer A",
            question.getAnswerA());
    }
}
