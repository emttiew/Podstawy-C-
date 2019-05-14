<table width="400" border="1" align="center" cellpadding="3" cellspacing="0">
<tr>
<td><strong>Dotychczasowe wpisy | <a href="guestbook.php">Nowy wpis</a> </strong></td>
</tr>
</table> 
<br>

<?php

$host="localhost"; // Host name 
$username="s18182"; // username
$password="Mat.Wozn"; // hasło
$db_name="s18182"; // nazwa bazy danych 
$tbl_name="guestbook"; // Nazwa tabelki

// Połącznie z bazą danych
mysql_connect("$host", "$username", "$password")or die("Blad podczas proby polaczenia z baza danych"); 
mysql_select_db("$db_name")or die("Blad podczas wyboru bazy danych");

$sql="SELECT * FROM $tbl_name";
$result=mysql_query($sql);

while($rows=mysql_fetch_array($result)){
?>

<table width="400" border="1" align="center" cellpadding="0" cellspacing="1" bgcolor="#CCCCCC">
<tr>
<td><table width="400" border="0" cellpadding="3" cellspacing="1" bgcolor="#FFFFFF">
<tr>
<td>ID</td>
<td>:</td>
<td><?php echo $rows['id']; ?></td>
</tr>
<tr>
<td width="117">Imie</td>
<td width="14">:</td>
<td width="357"><?php echo $rows['name']; ?></td>
</tr>
<tr>
<td>Email</td>
<td>:</td>
<td><?php echo $rows['email']; ?></td>
</tr>
<tr>
<td valign="top">Komentarz</td>
<td valign="top">:</td>
<td><?php echo $rows['comment']; ?></td>
</tr>
<tr> 
<td valign="top">Data </td>
<td valign="top">:</td>
<td><?php echo $rows['datetime']; ?></td>
</tr>
</table></td>
</tr>
</table>

<?php
}
mysql_close(); 
?>