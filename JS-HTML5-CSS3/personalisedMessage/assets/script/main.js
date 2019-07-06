/*
* Personalised HTML Message in JavaScript
* Matthew Brompton
* 
** REQUESTED UPDATES
*
** REPORTED BUGS
*
** WORKING ON
*
** DONE
* Add null exception handling
*/

//Get button and message elements from index.html
var startButton = document.querySelector('.myButton');
var message = document.querySelector('.message');


//asks for (and saves to local hard-drive) a user name and displays it onscreen with a welcome message
function setUserName() {
  var myName = prompt('Please enter your name.');
  localStorage.setItem('name', myName);
  if(myName != null){
	  message.textContent = 'Welcome ' + myName + '!';
  }
  else{
	  message.textContent = 'Welcome.'
  }
}

//checks local hard-drive for username. If the username exists  - displays welcome back message, if it does not - runs the set username function.
if(!localStorage.getItem('name')||localStorage.getItem('name') === 'null') {
  setUserName();
} else {
  var storedName = localStorage.getItem('name');
  message.textContent = 'Hi ' + storedName + '! It\'s nice to see you again :)';
}
//
startButton.onclick = function() {
  setUserName();
}