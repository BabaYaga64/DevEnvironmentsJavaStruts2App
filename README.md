#Development Environments Application

##Bojana Skarich

###August 22nd 2015

###Description

This app takes 3 user inputs: Operating System (0S), Operating System Version (OS Version), and Notes. After they are submitted to the database, the inputs are displayed on a second page. The technologies used in this app are the Java language, the Mvthe Struts2 web framework, and MySQL for the database.

###Technologies Used:

* Java SE 8
* Maven
* Struts2
* MySQL
* MYSQL Connector/J driver
* Sql2o



###Database Info:

Database name: devenviron
Username: bojana
Password: bojana

Database commands:

CREATE DATABASE devenviron;
USE devenviron;
CREATE TABLE environments (name VARCHAR (255));
ALTER TABLE environments ADD id serial PRIMARY KEY;
CREATE TABLE attributes (environ_id INT, version VARCHAR (255), notes VARCHAR (255));
ALTER TABLE attributes ADD id serial PRIMARY KEY;


###Setup Instructions

    1. Clone GitHub repository.


###The MIT License (MIT)

Copyright (c) 2015 Bojana Skarich

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.