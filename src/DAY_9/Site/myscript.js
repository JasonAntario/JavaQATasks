var gVar;

function hideValue(x){
gVar = x.value;
x.value="";
}

function setValue(x){
x.value=gVar;
}