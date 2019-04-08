# TestAssignment9

We had made a servlet page with login, that has the parameters of:
user,
password.

<p>
In jMeter we are sending a peremeter with a user and a password to our server and wait on a repond from server, if the password or user does not exists in this <a href="https://github.com/Hallur20/TestAssignment9/blob/master/login.csv">file</a> so we get a empty respond back, if the password and user exists we will get a true or false responds back.
</p>

To spare you the problem and time of trying get or make a server, we made a project online at:

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
