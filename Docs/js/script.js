var temarioAccionado = false;
var diccionarioAccionado = false;

function convocar(htmlElement) {
  htmlElement.style.display == "block"
    ? (htmlElement.style.display = "none")
    : (htmlElement.style.display = "block");
}

function convocarTemario(htmlElement){
  if (diccionarioAccionado){
    convocar(document.getElementById("diccionario"));
    diccionarioAccionado = !diccionarioAccionado;
  }
  convocar(htmlElement);
  temarioAccionado = !temarioAccionado ;  
}

function convocarDiccionario(htmlElement){
  if (temarioAccionado){
    convocar(document.getElementById("temario"));
    temarioAccionado = !temarioAccionado ;
  }
  convocar(htmlElement);
  diccionarioAccionado = !diccionarioAccionado;
}

