var LoadingScreen=new function(){
	this.show=function(target){
		try{
			if(!target){
				target=window;
			}
			if(!target.disabled_arr){
				target.disabled_arr=new Array();
			}else if(target.disabled_arr.length>0){
				return true;
			}

			var myWidth = 0, myHeight = 0;
			if( typeof( window.innerWidth ) == 'number' ) {
				//Non-IE
				myWidth = window.innerWidth;
				myHeight = window.innerHeight;
			} else if( document.documentElement && ( document.documentElement.clientWidth || document.documentElement.clientHeight ) ) {
				//IE 6+ in 'standards compliant mode'
				myWidth = document.documentElement.clientWidth;
				myHeight = document.documentElement.clientHeight;
			} else if( document.body && ( document.body.clientWidth || document.body.clientHeight ) ) {
				//IE 4 compatible
				myWidth = document.body.clientWidth;
				myHeight = document.body.clientHeight;
			}

			var scrOfX = 0, scrOfY = 0;

			scrOfY = document.documentElement.scrollHeight;
			scrOfX = document.documentElement.scrollWidth;
			
			target.document.getElementById("loaderContainer").width=scrOfX>myWidth?scrOfX:myWidth;
			target.document.getElementById("loaderContainer").height=scrOfY>myHeight?scrOfY:myHeight;
			
			target.document.getElementById("loaderContainer").style.display="";

			var select_arr=target.document.getElementsByTagName("select");
			for(var i=0;i<select_arr.length;i++){
				if(select_arr[i].disabled){
					continue;
				}
				select_arr[i].disabled=true;
				disabled_arr.push(select_arr[i]);
			}

			var iframe_elements = target.document.getElementsByTagName("IFRAME");

			for(var i=0;i<iframe_elements.length;i++){
				var iselect_elements=iframe_elements[i].contentWindow.document.getElementsByTagName("select");

				for(var j=0;j<iselect_elements.length;j++){
					if(iselect_elements[j].disabled){
						continue;
					}
					iselect_elements[j].disabled=true;
					disabled_arr.push(iselect_elements[j]);
				}
			}
		}catch(e){
			return false;
		}
		return true;
	};

	this.hide=function(target){
		try{
			if(!target){
				target=window;
			}
			target.document.getElementById("loaderContainer").style.display="none";
			if(target.disabled_arr){
				while(disabled_arr.length>0){
					var select=disabled_arr.pop();select.disabled=false;
				}
			}
		}catch(e){
			return false;
		}
		return true;
	};
}


function initLink() {
	var aElements = document.getElementsByTagName("A");

	for (var i=0;i<aElements.length; i++) {
		if (aElements[i].onclick!=null)
		{
			aElements[i].onfocus = function(e) {
			var evt=window.event || e;
			var targ; 
		        if(evt.srcElement != null) 
		        { 
		            targ= evt.srcElement; //IE 
		        } 
		        else 
		        { 
		            targ= evt.target; //FF 
		        }
			if (typeof(targ.href)!="undefined") {
					if (targ.href.toLowerCase().indexOf("javascript")>-1 ||
						targ.parentElement.toString().toLowerCase().indexOf("javascript")>-1) {
						disableCaptureEvent();
						targ.blur();
					} else {
						enableCaptureEvent();
					}
				} else {
					enableCaptureEvent();
				}
			}
		} else {
			aElements[i].onclick = function(e) {
			var evt=window.event || e;
			var targ; 
		        if(evt.srcElement != null) 
		        { 
		            targ= evt.srcElement; //IE 
		        } 
		        else 
		        { 
		            targ= evt.target; //FF 
		        }
				if (typeof(targ.href)!="undefined") {
					if (targ.href.toLowerCase().indexOf("javascript")>-1 ||
						targ.parentElement.toString().toLowerCase().indexOf("javascript")>-1) {
						disableCaptureEvent();
						targ.blur();
					} else {
						enableCaptureEvent();
					}
				} else {
					enableCaptureEvent();
				}
			}
		}
	}

	var spanElements = document.getElementsByTagName("SPAN");

	for (var i=0;i<spanElements.length; i++) {
		if (spanElements[i].onclick!=null)
		{
			spanElements[i].onmouseenter = function(e) {
				enableCaptureEvent();
			}
		}
	}
}

/*
function initLink() {
	var aElements = document.getElementsByTagName("A");

	for (var i=0;i<aElements.length; i++) {
		if (aElements[i].onselectstart==null)
		{		
			if (aElements[i].onclick!=null)
			{
				aElements[i].onselectstart = aElements[i].onclick;
			}

			aElements[i].onclick = function(e) {
				if (typeof(event.srcElement.href)!="undefined" || 
					typeof(event.srcElement.parentElement)!="undefined"
				) {
					if ((typeof(event.srcElement.href)!="undefined" && event.srcElement.href.toLowerCase().indexOf("javascript")>-1) ||
						(typeof(event.srcElement.parentElement)!="undefined" && event.srcElement.parentElement.toString().toLowerCase().indexOf("javascript")>-1) ||
						(typeof(event.srcElement.parentElement.href)!="undefined" && event.srcElement.parentElement.href.toLowerCase().indexOf("javascript")>-1)
					) {					
						disableCaptureEvent();
						if (event.srcElement.onselectstart!=null)
							event.srcElement.fireEvent("onselectstart");
						else
						if (event.srcElement.parentElement.onselectstart!=null)
							event.srcElement.parentElement.fireEvent("onselectstart");
						event.srcElement.blur();
					} else {
						enableCaptureEvent();
					}
				} else {
					enableCaptureEvent();
				}
			}
		}
	}

	var spanElements = document.getElementsByTagName("SPAN");

	for (var i=0;i<spanElements.length; i++) {
		if (spanElements[i].onclick!=null)
		{
			spanElements[i].onmouseenter = function(e) {
				enableCaptureEvent();
			}
		}
	}
}
*/