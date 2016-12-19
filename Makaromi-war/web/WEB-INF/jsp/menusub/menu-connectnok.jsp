<%--
    Document   : menu-connectnok
    Created on : 30 nov. 2016, 11:11:08
    Author     : cdi310
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<form id="form1" method="POST" action="">
    <input type="hidden" name="section" value="MenuConnect" />
    <div class="container-fluid">
        <div class="row" id="top-row">

        </div>
        <div class="row sous_titre">
            <span class="login">Login :</span> <input type="text" id="login" name="login" value="" required/>
        </div>
        <div class="row sous_titre">
            <span class="password">Password :</span> <input type="password" id="password" name="password" required />
        </div>
        <div class="row connect_button">
            <input class="btn btn-primary" id="leBouttonOK" type="submit" name="DConnect" value="Ok" />
            <a href="IndexController" onclick="modifierDiv01();return false"><font color="white">ok</font></a>
        </div>
        <div class="row error_msg">
            <font color="red">${msg}<br> </font>
        </div>
        <div class="row accountCr_button">
            <a id="creationCompte"href="IndexController?section=CreateAccountController"><strong>Création de compte</strong></a>
        </div>
    </div>

</form>
      


      
