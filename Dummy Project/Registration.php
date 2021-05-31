<!DOCTYPE html>
<html>
   <head>
      <link rel="stylesheet" type="text/css" href="formCSS.css"/>
   </head>


   <table border="1">
      <caption style="text-align:left;font-size:25px;color:steelblue"><u><strong>Registration Page:</strong></u></caption>

      <tr>
         <td colspan="6">
            <h1><strong>Create A New Account</strong></h1>
            <form class="form" action="action.php">
               <table class="ftable" border="1">
                  <tr>
                     <td><label for="fname">Full Name</label></td>
                     <td><input type="text" id="fname" name="fname"></td>
                  </tr>
                  <tr>
                     <td><label for="uname">User Name</label></td>
                     <td><input type="text" id="uname" name="uname" pattern="[a-zA-Z]+" minlength="4" maxlength="10" required></td>
                  </tr>
                  <tr>
                     <td><label for="uage">Age</label></td>
                     <td><input type="number" id="uage" name="uage" min="15" max="60" required></td>
                  </tr>
                  <tr>
                     <td><label for="femail">Email</label></td>
                     <td><input type="text" id="femail" name="femail"  pattern=".+@.+\.com" required></td>
                  </tr>
                  <tr>
                     <td><label for="fpass">Password</label></td>
                     <td><input type="password" id="fpass" name="fpass" required></td>
                  </tr>
                  <tr>
                     <td><label for="fCpass">Mobile</label></td>
                     <td><input type="tel" id="fmobile" name="fmobile" pattern="^\d{11}$" required></td>
                  </tr>
                  <tr>
                     <td><label for="gender">Gender</label></td>
                     <td>
                        <input type="radio" name="gender" value="male">Male
                        <input type="radio" name="gender" value="female">Female
                     </td>
                  </tr>
                  <tr>
                     <td colspan="2"><input type="checkbox" id="must_check" name="must_check" value="must_check" required> Must check the box</td>
                  </tr>
                  <tr>
                     <td colspan="2" style="text-align:center"><input type="submit" id="fsubmit" name="fsubmit" value="Sign Up"></td>
                  </tr>
               </table>
            </form>
         </td>
      </tr>
      <tr>
         <td colspan="6">
            <p class="bottom" style="text-align:center;"><strong>Copyright © 2018, by Anonymous</strong></p>
         </td>
      </tr>
   </table>
</html>