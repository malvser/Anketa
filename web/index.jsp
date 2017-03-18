
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Анкета</title>
  </head>
  <body>
  <form action="/anketa" method="POST">
    <p><b>Enter your details:</b></p>
    Name:     <input type="text" name="name"><br>
    Surname: <input type="text" name="surname"><br>
    Age: <input type="text" name="age"><br>
      <p><b>Do you like to fly?</b></p>
      <p> <input type="radio" name="question1" value="yes">yes<Br>
          <input type="radio" name="question1" value="no">no<Br>
          <input type="radio" name="question1" value="don't know">I do not know, I have not tried :)</p>
      <p><b>Do you like to work?</b></p>
      <p> <input type="radio" name="question2" value="yes">yes<Br>
          <input type="radio" name="question2" value="no">no<Br>
      <p><b>Do you like programming?</b></p>
      <p> <input type="radio" name="question3" value="yes">yes<Br>
          <input type="radio" name="question3" value="no">no<Br>
          <input type="radio" name="question3" value="don't know">Did not understand yet :)</p>
      <p><input type="submit"></p>
  </form>

  </body>
</html>
