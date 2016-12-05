<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Makaromi - Online Ticketing</title>
        <script src="js/vendor/jquery-1.11.2.min.js" type="text/javascript"></script>
        <script src="js/vendor/bootstrap.min.js" type="text/javascript"></script>
        <link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
        <link rel="stylesheet" href="css/home.css" type="text/css">
    </head>
    <body>

        <c:url var="url" value="IndexController?section=MenuMainController" />
        <c:import url="${url}"  />

        <section> 
            <form method="POST" action="IndexController">
                <input type="hidden" name="section" value="CreateAccountController" />

                <table>
                    <thead>
                        <tr align="center" width="120">
                            <td colspan="4" align ="center"  width="1000"  height='120' ><img src="images/iconNouvelleConnexion.jpg"  width="120"/><h1>Créer mon compte</h1></td>
                        </tr>
                    <th align ="center">Login</th>
                    <th align ="center">Adresse</th>
                    </tr>
                    </thead>
                    <tbody>
                        <tr ALIGN=right>
                            <td> Login : <input type="text" name="login" value="" required/><br></td>
                            <td> rue : <input type="text" name="adresseRue" value=""  required/><br></td>
                            <td width="60"><br/></td>
                        </tr>
                        <tr ALIGN=right>
                            <td> Mot de passe : <input type="password" name="pwd" value="" required /><br></td>
                            <td> ville: <input type="text" name="ville" value="" required /><br></td>
                            <td width="60"><br/></td>
                        </tr>
                        <tr ALIGN=right>
                            <td> Civilite : <input type="text" name="civilite" value="" /><br></td>
                            <td> Code Postale: <input type="text" name="codePostale" value="" required/><br></td>
                            <td width="60"><br/></td>
                        </tr>
                        <tr ALIGN=right>
                            <td> Nom : <input type="text" name="nom" value="" required /><br></td>
                            <td> Mail:<input type="text" name="mail" value="" /><br></td>
                            <td width="60"><br/></td>
                        </tr>
                        <tr ALIGN=right>
                            <td>Prenom : <input type="text" name="prenom" value="" required/><br></td>
                            <td> Telephone:<input type="text" name="telephone" value=""/><br></td>
                            <td width="60"><br/></td>
                        </tr>
                    <td>
                    <tr ALIGN=Center>
                        <td colspan="7" align="center">
                            <input type="submit" name="DCreate" value="valider" />
                        </td>
                    </tr>
                    <tr>
                        <td colspan="7" align="center">
                            <a href="IndexController?section=CreateAccountController"><strong>Retour </strong><br/> 
                               </a>       
                        </td>
                    </tr>
                    </tbody>  
                </table>
                <h4 align="center"><font color="red">${message}</font></h4>
            </form>
        </section>
    </body>
</html>

