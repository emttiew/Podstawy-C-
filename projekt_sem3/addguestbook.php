<form id="form1" name="form1" method="post" action="guestbook.php">
<?php
$host="localhost"; // Host name 
$username="s18182"; // username
$password="Mat.Wozn"; // hasło
$db_name="s18182"; // nazwa bazy danych 
$tbl_name="guestbook"; // Nazwa tabelki

// Połącznie z bazą danych
mysql_connect("$host", "$username", "$password")or die("Blad podczas proby polaczenia z baza danych "); 
mysql_select_db("$db_name")or die("Blad podczas wyboru bazy danych");

$datetime=date("y-m-d h:i:s"); 
$name = $_POST['name'];
$email = $_POST['email'];
$comment = $_POST['comment'];

if( (!empty($name)) || (!empty($email)) || (!empty($comment)) )
$sql="INSERT INTO $tbl_name(name, email, comment, datetime)VALUES('$name', '$email', '$comment', '$datetime')";
else
	echo "Błąd, pola nie mogą być puste";
	echo "<br />";


$result=mysql_query($sql);

//sprawdzenie czy zapytanie jest prawidlowe 
if($result){
echo "Dodano wpis";
echo "<BR>";

// link do dotychczasowych wpisow
echo "<a href='viewguestbook.php'>Dotychczasowe wpisy</a>";
}

else {
echo "Blad, nie dodano wpisu";
echo "<br />";
echo "<a href='guestbook.php'>Wróć do formularza</a>";
}

mysql_close();
?>
</form>