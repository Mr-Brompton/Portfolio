//Set a variable containing the date
var currentTime = new Date();
//Access the date and set them as variables
var hours = currentTime.getHours();
var mins = currentTime.getMinutes();
var days = ["Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"];
//Add a prefixed "0" to single character minutes
if (mins < 10) {
	mins = "0" + mins;
};
var meridian = function() {
	if (hours > 11) {
		return "PM";
	}
	else{
		return "AM";
	}
}
//compile string
var str = "Today is " + days[currentTime.getDay()] + ". The current time is " + hours + ":" + mins  + " " + meridian();
//print string, remember that docWritte contains security issues.
document.write(str);