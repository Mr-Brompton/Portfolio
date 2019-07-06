window.firstSunday = function() {
	var pos = [];
	var l = pos.length;
	var newArray = [];
	
		for (var year = 2014; year <= 2050; year++){
			var d = new Date(year, 0, 1);
			if ( d.getDay() === 0 ){
				pos.push(" " + year);
			};
		};

	document.getElementById("result").innerHTML = "<p> New Years day is a Sunday in " + pos[0] + "," + pos[1] + "," +  pos[2] + "," + pos[3] + " and" + pos[4] + ".</p>";
			return false;

};