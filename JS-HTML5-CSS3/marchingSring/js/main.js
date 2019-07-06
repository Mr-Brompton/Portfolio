function rotate(){
	var intervalID = window.setInterval(rotateString, 500);
}
	var str = "w3resource ";
var rotateString = function() {
	var l = str.length - 1;
	var b = str[l]
	var a = str.slice(0, l);
	str = b + a;
	document.getElementById("a").innerHTML = "<p>" + str +"</p>";
};