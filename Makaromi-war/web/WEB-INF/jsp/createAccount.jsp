<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html id="createAccount">
    <c:url var="url" value="IndexController?section=MenuMainController" />
    <c:import url="${url}"  />

    <body>


        <form method="POST"class="form-horizontal" action="IndexController" method="post"  id="reg_form">
            <input type="hidden" name="section" value="CreateAccountController" />
            <fieldset>

                <!-- Form Name -->
                <legend> Création de compte </legend>



                <!-- Text input-->

                <div class="form-group">
                    <label class="col-md-4 control-label">Civilité</label>
                    <div class="col-md-6  inputGroupContainer">
                        <div class="input-group"><span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                            <div class="form-inline">
                                <div> <!--faire un espace--><label class="col-md-1 control-label"></label></div>
                                <div class="radio">
                                    <label><input name="civilite"  type="radio" name="optradio">Madame</label>
                                </div>
                                <div class="radio">
                                    <label><input name="civilite"  type="radio" name="optradio">Monsieur</label>
                                </div>
                            </div>
                        </div>                
                        <div><br></div>
                    </div>


                    <!-- Text input-->
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
                                <div class='input-group date' id='datetimepicker2'>
                                    <input name="naissance" type='text' class="form-control" />
                                    <span class="input-group-addon">
                                        <span class="glyphicon glyphicon-calendar"></span>
                                    </span>
                                </div>
                            </div>
                        </div>
                    </div>
                    <script type="text/javascript">
                        $(function () {
                            $('#datetimepicker2').datetimepicker({
                                format: 'L',
                                locale: 'fr'
                            });
                        });
                    </script>

                    <!-- Text input-->
                    <div class="form-group">
                        <label class="col-md-4 control-label">E-Mail</label>
                        <div class="col-md-6  inputGroupContainer">
                            <div class="input-group"> <span class="input-group-addon"><i class="glyphicon glyphicon-envelope"></i></span>
                                <input name="email" placeholder="E-mail" class="form-control"  type="text">
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
                        <label class="col-md-4 control-label">Code Postal</label>
                        <div class="col-md-6  inputGroupContainer">
                            <div class="input-group"> <span class="input-group-addon"><i class="glyphicon glyphicon-home"></i></span>
                                <input name="codePostal" placeholder="Code postal" class="form-control"  type="text">
                            </div>
                        </div>
                    </div>

            </fieldset>
            <!-- Text input-->

            <div class="form-group">
                <label class="col-md-4 control-label">Ville</label>
                <div class="col-md-6  inputGroupContainer">
                    <div class="input-group"> <span class="input-group-addon"><i class="glyphicon glyphicon-home"></i></span>
                        <input name="ville" placeholder="Ville" class="form-control"  type="text">
                    </div>
                </div>
            </div>

            <!-- Form name 2-->
            <legend> Information de compte </legend>
            <fieldset>

                <!-- Text input-->
                <div class="form-group">
                    <label class="col-md-4 control-label">Login</label>
                    <div class="col-md-6  inputGroupContainer">
                        <div class="input-group"> <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                            <input name="login" placeholder="Login" class="form-control"  type="text">
                        </div>
                    </div>
                </div>

                <div class="form-group has-feedback">
                    <label for="password"  class="col-md-4 control-label">
                        Mot de passe
                    </label>
                    <div class="col-md-6  inputGroupContainer">
                        <div class="input-group"> <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                            <input class="form-control" id="userPw" type="motdepasse" placeholder="Mot de passe"
                                   name="pwd" data-minLength="5"
                                   data-error="Erreur"
                                   required/>
                            <!--<span class="glyphicon form-control-feedback"></span>-->
                            <!--<span class="help-block with-errors"></span>-->
                        </div>
                    </div>
                </div>

                <div class="form-group has-feedback">
                    <label for="confirmPassword"  class="col-md-4 control-label">
                        Confirmez le mot de passe
                    </label>
                    <div class="col-md-6  inputGroupContainer">
                        <div class="input-group"> <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                            <input class="form-control {$borderColor}" id="userPw2" type="password" placeholder="Confirmez le mot de passe"
                                   name="confirmPassword" data-match="#confirmPassword" data-minLength="5"
                                   data-match-error="Erreur de correspondance"
                                   required/>
                            <!--<span class="glyphicon form-control-feedback"></span>-->
                            <!--<span class="help-block with-errors"></span>-->
                        </div>
                    </div>
                </div>


                <!-- Button -->
                <div class="form-group" >
                    <label class="col-md-4 control-label"></label>
                    <div class="col-md-4">
                        <button id="validateButton" type="submit" name="DCreate" class="btn btn-warning" >
                            Envoyer <span class="glyphicon glyphicon-send">
                        </button>
                    </div>
                </div>


                <div class="form-group">
                    <label class="col-md-4 control-label"></label>
                    <div class="col-md-4">
                        <button id="returnButton" type="submit" name="retour" class="btn btn-warning" href="IndexController?section=home.jsp">
                            Retour <span class="glyphicon glyphicon-arrow-left"></span>
                        </button>
                    </div>

                </div>


                <div>
                    <h4 align="center"><font color="red">${message}</font></h4>
                </div>

            </fieldset>
        </form>
    </body>
</html>

