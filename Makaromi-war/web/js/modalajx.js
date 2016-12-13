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


function loadModal() {
    var url = "IndexController?section=ModalController";
    console.log(url);
    var xhr = getXhr();
// On défini ce qu'on va faire quand on aura la réponse
//    xhr.onreadystatechange = function () {        
//// On ne fait quelque chose que si on a tout reçu et que le serveur est ok
//// alert( xhr.readyState +"/"+xhr.status);
//        if (xhr.readyState === 4 && xhr.status === 200) {
//            var texte = xhr.responseText;
//            var elem = document.getElementById("menuConnect");
//            elem.innerHTML = texte;
//        }
//    };
    console.log("ping");
    xhr.open("GET", url , true);
    console.log("pong");
    xhr.send(null);
}
