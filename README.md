# TestAssignment9

What we have done here is we have made a servlet page, that has the parameters of:
user,
password.

In jMeter we are also sending a checker for if the extra parameter form the excel file contains true or false.

to spare you the problem of trying to make the project work, we have put the project online at:

http://hallur.dk/TestAssignment9/

the post request page is:

http://hallur.dk/TestAssignment9/Login

we have included the jmx file (ASSIGNMENT9.jmx) if you wish to test it in jmeter or blazerunner

you can check the parameters of the users in this csv file: <a href="https://github.com/Hallur20/TestAssignment9/blob/master/login.csv">link</a>


<p>image below shows the user hallur and the password 123 which returns "that was true"</p>
<img src="https://github.com/Hallur20/TestAssignment9/blob/master/Allowed.PNG"/>
<p>image below shows the user jens and the password 999 which returns "that was false"</p>
<img src="https://github.com/Hallur20/TestAssignment9/blob/master/NotAllowed.PNG"/>
<p>the overall result in a table format</p>
<img src="https://github.com/Hallur20/TestAssignment9/blob/master/tableLog.PNG"/>
<p>running the script in blazemeter with 50 users from singapore</p>
<img src="https://github.com/Hallur20/TestAssignment9/blob/master/blazeMeterTest.png"/>
