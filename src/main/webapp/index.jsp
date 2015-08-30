<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="utf-8">
	<title>Development Environments</title>
	<meta name="description" content="">
  <!-- Mobile-friendly viewport -->
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
   <!-- Style sheet link -->
	<link href="css/main.css" rel="stylesheet" media="all">
</head>
<body>
<h1>Welcome to my app!</h1>

<h3>What kind of development environment do you use? Enter your answer below</h3>

    <!-- Add action name and post method here after configuring the same in struts.xml -->
  <form action="devenviron">
    Operating System:<br>
    <input type="text" name="opsystem">
    <br>
    Operating System Version:<br>
    <input type="text" name="opsystemvers">
    <br>
    Notes:<br>
    <input type="text" name="notes">
    <br><br>
      <input type="submit" value="Submit">
  </form>
</body>
</html>
