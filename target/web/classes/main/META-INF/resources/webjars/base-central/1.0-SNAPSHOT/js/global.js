function profileServicesOtherShowHide(field) {
	//console.log("field.value = " + field.value.toUpperCase());
	if (field.value.toUpperCase() == "OTHER") {
		document.getElementById("otherService").style.display = "block";
	} else {
		document.getElementById("otherService").style.display = "none";
	}
}

function isLoggedIn() {
	var returnValue = "";
	var email = '<%= Session["email"] %>';
	// var email = '<%= session.getAttribute("email") %>';
	console.log("email = " + email);
	window.alert("email = " + email);
	if (email != null || email != "") {
		returnValue = "true";
	} else {
		returnValue = "false";
	}
	console.log("isLoggedOn() = " + returnValue);
	window.alert("isLoggedOn() = " + returnValue);
	return returnValue;
}

function deleteUser(userkey) {
	// var email = document.getElementById("email").value;

	// alert("In delete user - email = " + email);

	window.location.href = '/deleteuser/' + userkey;
}

function deleteIntake(key) {
	window.location.href = '/deleteintake/' + key;
}

function deleteProfile(name) {
	window.location.href = '/deleteprofile/' + name;
}

function openSave() {
	document.execCommand("saveas", false, "");
}

function joinServices() {
	var checkboxField = document.getElementsByName("selectServices");
	var checkedValues = [];
	for (var i = 0, n = checkboxField.length; i < n; i++) {
		if (checkboxField[i].checked) {
			checkedValues.push(checkboxField[i].value);
		}
	}
	var finalValues = checkedValues.join(",");
	//var servicesField = document.createElement("services");
	//servicesField.setAttribute("type", "hidden");
	console.log("finalValues = " + finalValues);
	document.getElementById("services").value = finalValues;
	window.location.href = "/saveprofile?services=" + finalValues;
}

function filterSearch(fieldName, filterType) {
	// Get selected service...
	var e = document.getElementById(fieldName);
	var fieldValue = e.options[e.selectedIndex].value;
	console.log(fieldName + " Field Value = " + fieldValue);
	window.location.href = "/filtersearch?type=" + filterType + "&value=" + fieldValue;	
}

function getByRequestStatus() {
	// Get selected service...
	var e = document.getElementById("selectFirstField");
	var fieldValue = e.options[e.selectedIndex].value;
	console.log("value 1 = " + fieldValue);
	window.location.href = "/filterintake?type=reqstatus&value=" + fieldValue;	
}

function getByAgency() {
	// Get profiles by county...
	var e = document.getElementById("selectSecondField");
	var fieldValue = e.options[e.selectedIndex].value;
	console.log("value 2 = " + fieldValue);
	window.location.href = "/filterintake?type=agency&value=" + fieldValue;	
}

function getLookupByType() {
	// Get profiles by county...
	var e = document.getElementById("selectFirstField");
	var fieldValue = e.options[e.selectedIndex].value;
	console.log("value 1 = " + fieldValue);
	window.location.href = "/filterlookups?type=type&value=" + fieldValue;	
}

function searchProjects() {
	var e = document.getElementById("searchText");
	var fieldValue = e.value;
	if (fieldValue != "") {
		console.log("value 1 = " + fieldValue);
		window.location.href = "/mainsearch/" + fieldValue;	
	}
}
