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

           <div class="form-group">
                <label class="col-md-4 control-label" >Date de Naissance</label>
                <div class="col-md-6  inputGroupContainer">
                    <div class="input-group"> <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                    <div class="well">
			  <div class="input-append date" id="dp3" data-date="12-02-2012" data-date-format="dd-mm-yyyy">
				<input class="span2" size="16" type="text" value="12-02-2012" readonly="">
				<span class="add-on"><i class="icon-th"></i></span>
                               
			  </div>
                        <span class="add-on"><i class="icon-th"></i></span>
                    </div>
                </div>
            </div> 
            
<div class="datepicker datepicker-dropdown dropdown-menu" style="display: block; top: 493px; left: 403px;">
<div class="datepicker-days" style="display: block;">
<table class=" table-condensed"><thead><tr><th class="prev" style="visibility: visible;">
<i class="icon-arrow-left"></i></th><th colspan="5" class="switch">February 2012</th>
            <th class="next" style="visibility: visible;"><i class="icon-arrow-right"></i></th>
        </tr>
        <tr>
            <th class="dow">Su</th>
            <th class="dow">Mo</th>
            <th class="dow">Tu</th>
            <th class="dow">We</th>
            <th class="dow">Th</th>
            <th class="dow">Fr</th>
            <th class="dow">Sa</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td class="day old">29</td>
            <td class="day old">30</td>
            <td class="day old">31</td>
            <td class="day">1</td>
            <td class="day">2</td>
            <td class="day">3</td>
            <td class="day">4</td>
        </tr>
        <tr><td class="day">5</td>
            <td class="day">6</td>
            <td class="day">7</td>
            <td class="day">8</td>
            <td class="day">9</td>
            <td class="day">10</td>
            <td class="day">11</td>
        </tr>
        <tr>
           <td class="day active">12</td>
           <td class="day">13</td>
           <td class="day">14</td>
           <td class="day">15</td>
           <td class="day">16</td>
           <td class="day">17</td>
           <td class="day">18</td>
        </tr>
        <tr>
            <td class="day">19</td>
            <td class="day">20</td>
            <td class="day">21</td>
            <td class="day">22</td>
            <td class="day">23</td>
            <td class="day">24</td>
            <td class="day">25</td>
        </tr>
        <tr>
            <td class="day">26</td>
            <td class="day">27</td>
            <td class="day">28</td>
            <td class="day">29</td>
            <td class="day new">1</td>
            <td class="day new">2</td>
            <td class="day new">3</td>
        </tr>
        <tr>
            <td class="day new">4</td>
            <td class="day new">5</td>
            <td class="day new">6</td>
            <td class="day new">7</td>
            <td class="day new">8</td>
            <td class="day new">9</td>
            <td class="day new">10</td>
        </tr>
    </tbody>
    <tfoot>
        <tr>
            <th colspan="7" class="today" style="display: none;">Today</th>
        </tr>
    </tfoot>
</table>
</div>
    <div class="datepicker-months" style="display: none;">
        <table class="table-condensed">
            <thead>
                <tr>
                    <th class="prev" style="visibility: visible;">
                        <i class="icon-arrow-left"></i></th>
                    <th colspan="5" class="switch">2012</th>
                    <th class="next" style="visibility: visible;">
                        <i class="icon-arrow-right"></i></th></tr>
            </thead><tbody><tr><td colspan="7">
                        <span class="month">Jan</span>
                        <span class="month active">Feb</span>
                        <span class="month">Mar</span>
                        <span class="month">Apr</span>
                        <span class="month">May</span>
                        <span class="month">Jun</span>
                        <span class="month">Jul</span>
                        <span class="month">Aug</span>
                        <span class="month">Sep</span>
                        <span class="month">Oct</span>
                        <span class="month">Nov</span>
                        <span class="month">Dec</span>
                    </td>
                </tr>
            </tbody>
            <tfoot>
                <tr>
                    <th colspan="7" class="today" style="display: none;">Today</th>
                </tr></tfoot></table></div><div class="datepicker-years" style="display: none;">
                    <table class="table-condensed"><thead><tr><th class="prev" style="visibility: visible;">
                                    <i class="icon-arrow-left"></i></th>
                                <th colspan="5" class="switch">2010-2019</th>
                                <th class="next" style="visibility: visible;">
                                    <i class="icon-arrow-right"></i></th></tr>
                        </thead><tbody><tr><td colspan="7"><span class="year old">2009</span>
                                    <span class="year">2010</span><span class="year">2011</span>
                                    <span class="year active">2012</span>
                                    <span class="year">2013</span>
                                    <span class="year">2014</span>
                                    <span class="year">2015</span>
                                    <span class="year">2016</span>
                                    <span class="year">2017</span>
                                    <span class="year">2018</span>
                                    <span class="year">2019</span>
                                    <span class="year old">2020</span>
                                </td>
                            </tr>
                        </tbody>
                        <tfoot>
                            <tr>
                                <th colspan="7" class="today" style="display: none;">Today</th>
                            </tr></tfoot></table></div></div>
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
