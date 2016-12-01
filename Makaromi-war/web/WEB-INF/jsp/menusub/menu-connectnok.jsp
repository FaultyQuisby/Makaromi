<%-- 
    Document   : menu-connectnok
    Created on : 30 nov. 2016, 11:11:08
    Author     : cdi310
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<script type="text/javascript">
    function go() {
        // alert( "go 1");
        modifierDiv01('IndexController?section=MenuConnectGest');
        // modifierDiv01('IndexController?section=MenuConnectAff');
        //alert( "go 2");
    }
</script>


<form method="POST" action="IndexController">
            <input type="hidden" name="section" value="MenuConnect" />

            <table border="0"  width="250px">
                <thead>
                </thead>
                <tbody>
                     <tr>
                     <td colspan="7" align="center" class="Titre"> 
                         <img src="images/iconConnexion.jpg"  width="30"/><strong>Mon Compte</strong> 
                     </td> 
                     </tr>
                    <tr>
                        <td class="SousTitre"> Login :</td>
                        <td><input type="text" name="login" value="" required/></td>
                    </tr>
                    <tr>
                        <td class="SousTitre"> Mot de passe :</td>
                        <td><input type="password" name="password" required /></td>
                    </tr>
                    <tr>
                        <td colspan="7" align="center"> 
                            <input type="submit" name="DConnect" value="Ok" />
                            <a href="" onclick="go();return false;">connecter</a>
                        </td>

                    </tr>
                    <tr>  
                        <td colspan="7" align="center"> 
                            <font color="red">${msg}<br> </font>
                        </td>   
                    <tr>
                       <tr>  
                        <td colspan="7" align="center" class="menuTitre"> 
                            <img src="images/iconNouvelleConnexion.jpg"  width="30"/><a href="Maestro?section=login&action=create"><strong>Création de compte</strong></a>
                        </td>   
                    <tr>  
                </tbody>
            </table>

        </form>
