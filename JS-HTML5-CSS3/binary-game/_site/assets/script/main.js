/*
*Start page animations
* uses set interval
*/

function myMove() {
    var elem = document.getElementById("animate");
    var startIntro = document.getElementById("startIntro")
    var pos = 0;
    var id = setInterval(frame, 5);
    function frame() {
        if (pos === -550) {
            clearInterval(id);
            
        } else {
            pos--;
            elem.style.top = pos + 'px';
            //elem.style.left = pos + 'px';
        }
    }
} 

myMove();