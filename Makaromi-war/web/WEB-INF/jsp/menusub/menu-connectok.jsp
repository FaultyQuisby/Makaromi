<%-- 
    Document   : menu-connect
    Created on : 30 nov. 2016, 11:10:26
    Author     : cdi310
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
 <table border="0" width="250px">
            <thead>
            </thead>
            <tbody>
                <tr>
                    <td colspan="7"> 
                        <strong><img src="images/iconConnexion.jpg"  width="30"/>
                        Mon Compte 
                        </strong>
                    </td> 
                </tr>
                <tr>
                    <td align="center">Welcome</td>
                </tr>
                <tr>
                    <td align="center">${welcom}</td>
                </tr>
                <tr>
                    <td colspan="7" align="center" class="menuLogin"><a href="Maestro?section=login&action=moncompte"><em><strong>Mon compte</strong></em></a></td>
                </tr>

                <tr>  
                    <td colspan="7" align="center" class="menuLogin"> 
                        <a href="Maestro?section=login&action=deconnect"><em><strong>Déconnexion du compte</strong></em></a><br>
                    </td>   
                <tr>  
            </tbody>
        </table>
