function isArmstrongNumber() {
	var value = document.getElementById("input").value;
	var input = isNaN(value);
	if (!input) {
		var number = value;
		var sum = 0;
		var temp = 0;
		while (value != 0) {
			temp = value % 10;
			sum += temp * temp * temp;
			value = Math.floor(value / 10);
		}
		if (number == sum) {
			console.log("The given number is Armstrong number.")
		} else {
			console.log("The given number is not Armstrong.");
		}
	} else {
		alert("Please Enter valid input.");
	}

}