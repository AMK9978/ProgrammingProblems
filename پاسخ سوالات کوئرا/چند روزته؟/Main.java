<?php
//$_POST['date'] = "2011-10-12";
 
if(isset($_POST['date']) && !empty($_POST['date']))
{
  $date = explode("-", $_POST['date']);
  if ($date[0]==date("Y") && $date[1]==date("m") && $date[2]==date("d"))
    echo 0;
  elseif($date[0]<date("Y"))
    echo "gone";
  elseif ($date[0]==date("Y") && $date[1]<date("m"))
    echo "gone";
  elseif($date[0]==date("Y") && $date[1]==date("m") && $date[2]<date("d"))
    echo "gone";
  else {
      $mytime = new DateTime($_POST['date']);
      $now = new DateTime(date("Y") . "-" . date("m") . "-" . date("d"));
      $difference = $mytime->diff($now);
      echo $difference->days;
    }
}
 
?>