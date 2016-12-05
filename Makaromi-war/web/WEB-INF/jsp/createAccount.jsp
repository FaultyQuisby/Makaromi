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
                        <input  name="first_name" placeholder="First Name" class="form-control"  type="text">
                    </div>
                </div>
            </div>

            <!-- Text input-->

            <div class="form-group">
                <label class="col-md-4 control-label" >Nom</label>
                <div class="col-md-6  inputGroupContainer">
                    <div class="input-group"> <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                        <input name="last_name" placeholder="Last Name" class="form-control"  type="text">
                    </div>
                </div>
            </div>


            <!-- Text input-->

            <div class="form-group">
                <label class="col-md-4 control-label">Téléphone #</label>
                <div class="col-md-6  inputGroupContainer">
                    <div class="input-group"> <span class="input-group-addon"><i class="glyphicon glyphicon-earphone"></i></span>
                        <input name="phone" placeholder="(845)555-1212" class="form-control" type="text">
                    </div>
                </div>
            </div>

            <!-- Text input-->

            <div class="form-group">
                <label class="col-md-4 control-label">Addresse</label>
                <div class="col-md-6  inputGroupContainer">
                    <div class="input-group"> <span class="input-group-addon"><i class="glyphicon glyphicon-home"></i></span>
                        <input name="address" placeholder="Address" class="form-control" type="text">
                    </div>
                </div>
            </div>

            <!-- Text input-->

            <div class="form-group">
                <label class="col-md-4 control-label">Ville</label>
                <div class="col-md-6  inputGroupContainer">
                    <div class="input-group"> <span class="input-group-addon"><i class="glyphicon glyphicon-home"></i></span>
                        <input name="city" placeholder="city" class="form-control"  type="text">
                    </div>
                </div>
            </div>


            <!-- Text input-->

            <div class="form-group">
                <label class="col-md-4 control-label">Code Postal</label>
                <div class="col-md-6  inputGroupContainer">
                    <div class="input-group"> <span class="input-group-addon"><i class="glyphicon glyphicon-home"></i></span>
                        <input name="zip" placeholder="Zip Code" class="form-control"  type="text">
                    </div>
                </div>
            </div>

            <!-- Text area -->

            <div class="form-group">
                <label class="col-md-4 control-label">Commentaire </label>
                <div class="col-md-6  inputGroupContainer">
                    <div class="input-group"> <span class="input-group-addon"><i class="glyphicon glyphicon-pencil"></i></span>
                        <textarea class="form-control" name="comment" placeholder="About "></textarea>
                    </div>
                </div>
            </div>


        </fieldset>
       	<legend> Information de compte </legend>
        <fieldset>
            <!-- Text input-->
            <div class="form-group">
                <label class="col-md-4 control-label">E-Mail</label>
                <div class="col-md-6  inputGroupContainer">
                    <div class="input-group"> <span class="input-group-addon"><i class="glyphicon glyphicon-envelope"></i></span>
                        <input name="email" placeholder="E-Mail Address" class="form-control"  type="text">
                    </div>
                </div>
            </div>


            <div class="form-group has-feedback">
                <label for="password"  class="col-md-4 control-label">
                    Mot de passe
                </label>
                <div class="col-md-6  inputGroupContainer">
                    <div class="input-group"> <span class="input-group-addon"><i class="glyphicon glyphicon-home"></i></span>
                        <input class="form-control" id="userPw" type="password" placeholder="password" 
                               name="password" data-minLength="5"
                               data-error="some error"
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
                        <input class="form-control {$borderColor}" id="userPw2" type="password" placeholder="Confirm password" 
                               name="confirmPassword" data-match="#confirmPassword" data-minLength="5"
                               data-match-error="some error 2"
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
                    <button type="submit" class="btn btn-warning" >Envoyer <span class="glyphicon glyphicon-send">
                    <!-- ajout rox --><input type="submit" name="DCreate" value="valider" /></span></button>
                </div>
            </div>

            <div>
                <!-- ajout rox --><a href="IndexController?section=CreateAccountController"><strong>Retour </strong><br/> </a>
            </div>       

            <div>
                <!-- ajout rox --><h4 align="center"><font color="red">${message}</font></h4>
            </div>
            
        </fieldset>
    </form>
</body>
</html>
