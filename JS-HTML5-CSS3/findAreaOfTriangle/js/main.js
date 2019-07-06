//Find the area of a triangle
var answer = 0;
//start function
var triangleArea = function(){
	var h = document.getElementById("h").value;
	var b = document.getElementById("b").value;
	answer = b*h/2;
	document.getElementById("result").innerHTML = "<p>The area of the triangle is " + answer + "</p>";
	return false;
};

//using side lengths math.sqrt()

window.areaFromLength = function() {
  var x = 0;
  var d = parseInt(document.getElementById("d").value);
  var e = parseInt(document.getElementById("e").value);
  var f = parseInt(document.getElementById("f").value);
  x = (d + e + f)/2;
  var answer = Math.sqrt(x * ((x - d) * (x - e) * (x - f)));
  document.getElementById("result").innerHTML = "<p>The area of the triangle is " + answer + "</p>";
  return false;
};