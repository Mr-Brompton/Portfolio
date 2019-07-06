
window.Maths = function(){
	var c = document.getElementById("c").value;
	var a = parseInt(document.getElementById("a").value);
	var b = parseInt(document.getElementById("b").value);
	result = "0";
		if (c === "divide"){
			result = a / b;
		}
		else {
			result = a * b;
		};
	
	document.getElementById("result").innerHTML = "<p>" + a + " " + c + " " + b + " = " + result + "</p>";
return false;
};