<%-- 
    Document   : createAccountBis
    Created on : 5 déc. 2016, 14:29:18
    Author     : CDI316
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <c:url var="url" value="IndexController?section=MenuMainController" />
    <c:import url="${url}"  /> 
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Création de compte</title>
    <script src="js/vendor/jquery-1.11.2.min.js" type="text/javascript"></script>
    <script src="js/vendor/bootstrap.min.js" type="text/javascript"></script>
    <link rel="stylesheet" href="css/createAccount.css" type="text/css">
    <link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
    <link rel="stylesheet" href="css/home.css" type="text/css">
</head>

<body>


    <form method="POST"class="form-horizontal" action="IndexController" method="post"  id="reg_form">
        <input type="hidden" name="section" value="CreateAccountController" />
        <fieldset>

            <!-- Form Name -->
            <legend> Création de compte </legend>

            <!-- Text input-->

            <div class="form-group">
                <label class="col-md-4 control-label">Prénom</label>
                <div class="col-md-6  inputGroupContainer">
                    <div class="input-group"> <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                        <input  name="prenom" placeholder="Prenom" class="form-control"  type="text">
                    </div>
                </div>
            </div>

            <!-- Text input-->

            <div class="form-group">
                <label class="col-md-4 control-label" >Nom</label>
                <div class="col-md-6  inputGroupContainer">
                    <div class="input-group"> <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                        <input name="nom" placeholder="Nom" class="form-control"  type="text">
                    </div>
                </div>
            </div>

            <!-- Text input-->

            <div class="form-group">
                <label class="col-md-4 control-label" >Date de Naissance</label>   
                <div class="col-md-6  inputGroupContainer">
                    <div class="input-group">                                           
                        <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                        <div class="well">
                            <div class="input-append date" id="dp3" data-date="12-02-2012" data-date-format="dd-mm-yyyy">
                                <input class="span2" size="16" type="text" value="12-02-2012" readonly="">
                                <span class="add-on"><i class="glyphicon glyphicon-th"></i></span>
                            </div>                         
                        </div>
                    </div>
                </div>
            </div>


            <!-- Text input-->

            <div class="form-group">
                <label class="col-md-4 control-label">Téléphone </label>
                <div class="col-md-6  inputGroupContainer">
                    <div class="input-group"> <span class="input-group-addon"><i class="glyphicon glyphicon-earphone"></i></span>
                        <input name="telephone" placeholder="0669532696" class="form-control" type="text">
                    </div>
                </div>
            </div>
            <!-- Text input-->

            <div class="form-group">
                <label class="col-md-4 control-label">Adresse</label>
                <div class="col-md-6  inputGroupContainer">
                    <div class="input-group"> <span class="input-group-addon"><i class="glyphicon glyphicon-home"></i></span>
                        <input name="adresse" placeholder="Adresse" class="form-control" type="text">
                    </div>
                </div>
            </div>

            <!-- Text input-->

            <div class="form-group">
                <label class="col-md-4 control-label">Ville</label>
                <div class="col-md-6  inputGroupContainer">
                    <div class="input-group"> <span class="input-group-addon"><i class="glyphicon glyphicon-home"></i></span>
                        <input name="ville" placeholder="Ville" class="form-control"  type="text">
                    </div>
                </div>
            </div>


            <!-- Text input-->

            <div class="form-group">
                <label class="col-md-4 control-label">Code Postal</label>
                <div class="col-md-6  inputGroupContainer">
                    <div class="input-group"> <span class="input-group-addon"><i class="glyphicon glyphicon-home"></i></span>
                        <input name="code-postal" placeholder="Code postal" class="form-control"  type="text">
                    </div>
                </div>
            </div>

            <!-- Text area -->

            <div class="form-group">
                <label class="col-md-4 control-label">Commentaire </label>
                <div class="col-md-6  inputGroupContainer">
                    <div class="input-group"> <span class="input-group-addon"><i class="glyphicon glyphicon-pencil"></i></span>
                        <textarea class="form-control" name="commentaire" placeholder="Commentaire"></textarea>
                    </div>
                </div>
            </div>


        </fieldset>

        <!-- Form name 2-->
        <legend> Information de compte </legend>
        <fieldset>
            <!-- Text input-->
            <div class="form-group">
                <label class="col-md-4 control-label">E-Mail</label>
                <div class="col-md-6  inputGroupContainer">
                    <div class="input-group"> <span class="input-group-addon"><i class="glyphicon glyphicon-envelope"></i></span>
                        <input name="login" placeholder="E-mail" class="form-control"  type="text">
                    </div>
                </div>
            </div>


            <div class="form-group has-feedback">
                <label for="password"  class="col-md-4 control-label">
                    Mot de passe
                </label>
                <div class="col-md-6  inputGroupContainer">
                    <div class="input-group"> <span class="input-group-addon"><i class="glyphicon glyphicon-home"></i></span>
                        <input class="form-control" id="userPw" type="motdepasse" placeholder="Mot de passe" 
                               name="pwd" data-minLength="5"
                               data-error="Erreur"
                               required/>
                        <span class="glyphicon form-control-feedback"></span>
                        <span class="help-block with-errors"></span>
                    </div>
                </div>
            </div>

            <div class="form-group has-feedback">
                <label for="confirmPassword"  class="col-md-4 control-label">
                    Confirmez le mot de passe
                </label>
                <div class="col-md-6  inputGroupContainer">
                    <div class="input-group"> <span class="input-group-addon"><i class="glyphicon glyphicon-home"></i></span>
                        <input class="form-control {$borderColor}" id="userPw2" type="password" placeholder="Confirmez le mot de passe" 
                               name="confirmPassword" data-match="#confirmPassword" data-minLength="5"
                               data-match-error="Erreur de correspondance"
                               required/>
                        <span class="glyphicon form-control-feedback"></span>
                        <span class="help-block with-errors"></span>
                    </div>
                </div>
            </div>


            <!-- Button -->
            <div class="form-group">
                <label class="col-md-4 control-label"></label>
                <div class="col-md-4">
                    <button type="submit" name="DCreate" class="btn btn-warning" >Envoyer <span class="glyphicon glyphicon-send">
                            </div>
                            </div>


                            <div class="form-group">
                                <label class="col-md-4 control-label"></label>
                                <div class="col-md-4">
                                    <button type="submit" name="retour" class="btn btn-warning" href="IndexController?section=home.jsp">
                                        Retour 
                                        <span class="glyphicon glyphicon-arrow-left"></span></button>
                                </div>


                                <div>
                                    <!-- ajout rox --><h4 align="center"><font color="red">${message}</font></h4>
                                </div>

                                </fieldset>
                                </form>
                                </body>
                                </html>
