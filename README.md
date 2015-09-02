#Development Environments Application

##Bojana Skarich

###August 22nd 2015

###Description

This app takes 3 user inputs: Operating System (OS), Operating System Version (OS Version), and Notes. After they are submitted to the database, the inputs are displayed on a second page. The technologies used in this app are the Java language, the Struts2 web framework, MySQL for the database, and Maven to manage other dependencies. Additional dependencies are listed below.

###Technologies Used:

* Java SE 8
* Maven
* Struts2
* MySQL
* MYSQL Connector/J driver
* JDBC 
* Apache Tomcat Server



###Database Info:

Database name: devenviron
Username: bojana
Password: bojana

Database commands:

1. CREATE DATABASE devenviron;
2. USE devenviron;
3. CREATE TABLE environments (name VARCHAR (255));
4. ALTER TABLE environments ADD id serial PRIMARY KEY;
5. ALTER TABLE environments ADD version text;
6. ALTER TABLE environments ADD notes text;
7. ALTER TABLE environments ADD os_notes text;
8. INSERT INTO environments (name, version, os_notes) VALUES ('Mac OS', '10.10', 'My favorite');
9. INSERT INTO environments (name, version, os_notes) VALUES ('Linux', 'Mint', 'Never tried this one');

       
###The MIT License (MIT)

Copyright (c) 2015 Bojana Skarich

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.