var vapix = require("vapix");
var cv = require("opencv");


var camera = new vapix.Camera({
	address: "192.168.2.5",
	port: 80,
	username: "root",
	password: "root"
});

var mjpg = camera.createVideoStream({
	resolution: "640x480",
	compression: 25,
	fps: 10
});


var low = [180, 80, 100];
var high = [225, 135, 135];

var setlow = [140, 243, 240];
var sethigh = [246, 255, 255]; 

var GREEN = [0, 255, 0];
var RED = [0, 0, 255];

var done = false;

// from oculus.js detection.js 
function isInside(bigger, smaller) {

        var smaller_topRight = smaller.x + smaller.width;
        var bigger_topRight = bigger.x + bigger.width;

        if ( (bigger.x < smaller.x) && (bigger_topRight > smaller_topRight) ) {
                return true;
        }

        return false;
}


// from oculus.js detection.js 
function isInsideAny(current, all) {
        for (var i = 0; i < all.size(); i++) {
                if (isInside(all.boundingRect(i), current)) {
                        return true;
                }
        }

        return false;
}


mjpg.on("data", function(data) {
	cv.readImage(data, function(err, im) {
		var out = new cv.Matrix(im.height(), im.width());
		im.convertHSVscale();
		im.inRange([160, 60, 100], [240, 170, 255]);
		im.save("./im.jpg");	
		im.canny(0, 100);	
		im.dilate(2);
		contours = im.findContours();
		var br;
		for (i = 0; i < contours.size(); i++) {
			if (contours.area(i) > 2000) {
				br = contours.boundingRect(i);
				console.log(br);
			//	isInsideAny(br, contours);
				out.drawContour(contours, i, GREEN, 1);
				out.rectangle([br.x, br.y], [br.x + br.width, br.y + br.height], RED);
			}
		}

		out.save("./countours.jpg");
		done = !done;
		//var icanny = im.copy();
		//icanny.canny(0, 100);
		//icanny.dilate(2);
		//var contours = im.findContours();	

		//im.houghLinesP();

	//	im.convertGrayscale();
	//	im.save("./grayscale.jpg");

	//	im.canny(5, 300);
	//	im.save("./canny.jpg");
//		im.houghLinesP();
	});
});
