package malov.serg;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by Admin on 08.03.2017.
 */

/* Создать проект «Анкета». Сделать возможность ввода пользователем его имени, фамилии,
возраста и ответов на 2-3 вопроса. Данные должны отправляться на сервер, который в ответ
должен вернуть статистику по ответам в виде HTML документа.*/

public class AnketaServlet extends HttpServlet{

    static final int Question_1_Yes = 0;
    static final int Question_1_No = 1;
    static final int Question_1_Dont_know = 2;
    static final int Question_2_Yes = 3;
    static final int Question_2_No = 4;
    static final int Question_3_Yes = 5;
    static final int Question_3_No = 6;
    static final int Question_3_Dont_know = 7;

    static final String TEMPLATE = "<html><head><title>Count Answer</title></head>" +
            "<body><h1>%s</h1></body></html>";

    final int[] results = new int[8];

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        final String answer1 = request.getParameter("question1");
        final String answer2 = request.getParameter("question2");
        final String answer3 = request.getParameter("question3");

        final int answer_count1 = "yes".equals(answer1)?Question_1_Yes:("no".equals(answer1))?Question_1_No:Question_1_Dont_know;
        final int answer_count2 = "yes".equals(answer2)?Question_2_Yes:Question_2_No;
        final int answer_count3 = "yes".equals(answer3)?Question_3_Yes:("no".equals(answer1))?Question_3_No:Question_3_Dont_know;

        results[answer_count1]++;
        results[answer_count2]++;
        results[answer_count3]++;

        String res = "<p>Question - Do you like to fly? : yes = " + results[Question_1_Yes] + ", no = " + results[Question_1_No] +
                ", don't know = " + results[Question_1_Dont_know] + "</p>";
        res += "<p>Question - Do you like to work? : yes = " + results[Question_2_Yes] + ", no = " + results[Question_2_No] +
                 "</p>";
        res += "<p>Question - Do you like programming? : yes = " + results[Question_3_Yes] + ", no = " + results[Question_3_No] +
                ", don't know = " + results[Question_3_Dont_know] + "</p>";

        HttpSession session = request.getSession(true);
        session.setAttribute("answer", res);
        response.sendRedirect("answer.jsp");
        //response.getWriter().println(String.format(TEMPLATE, res));


    }
}
