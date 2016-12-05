function getXhr() {
    var xhr = null;
    if (window.XMLHttpRequest) // Firefox et autres
        xhr = new XMLHttpRequest();
    else if (window.ActiveXObject) { // Internet Explorer
        try {
            xhr = new ActiveXObject("Msxml2.XMLHTTP");
        } catch (e) {
            xhr = new ActiveXObject("Microsoft.XMLHTTP");
        }
    }
    else { // XMLHttpRequest non supporté par le navigateur
        alert("Votre navigateur ne supporte pas les objets XMLHTTPRequest...");
        xhr = false;
    }
    return xhr;
}

function modifierDiv01() {
   
    var monlogin = document.getElementById("login");
    var monpassword = document.getElementById("password");
    
    alert(monlogin.value+"/"+monpassword.value);
    var url = "IndexController?section=MenuConnectGest&action=connect&login="+monlogin.value+"&password="+monpassword.value;
    
    var xhr = getXhr();
// On défini ce qu'on va faire quand on aura la réponse
    xhr.onreadystatechange = function () {        
// On ne fait quelque chose que si on a tout reçu et que le serveur est ok
// alert( xhr.readyState +"/"+xhr.status);
        if (xhr.readyState == 4 && xhr.status == 200) {
            var texte = xhr.responseText;
            var elem = document.getElementById("menuConnect");
            elem.innerHTML = texte;
        }
    }
    xhr.open("GET", url , true);
    xhr.send(null);
}

function decoDiv01() {
    var url = "IndexController?section=MenuConnectGest&action=deconnect";
    var xhr = getXhr();
// On défini ce qu'on va faire quand on aura la réponse
    xhr.onreadystatechange = function () {        
// On ne fait quelque chose que si on a tout reçu et que le serveur est ok
// alert( xhr.readyState +"/"+xhr.status);
        if (xhr.readyState == 4 && xhr.status == 200) {
            var texte = xhr.responseText;
            var elem = document.getElementById("menuConnect");
            elem.innerHTML = texte;
        }
    }
    xhr.open("GET", url , true);
    xhr.send(null);
}