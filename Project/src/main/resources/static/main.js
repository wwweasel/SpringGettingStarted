/**
 * 
 */

$(document).ready(function(){
	$("#postForm #JSBtn").on("click", function(event){// Pick the Modal and Button by id from the HTML and add a click event to the button
		event.preventDefault();
		postAjax();
	});
});

function postAjax(){
	var transport = { 
		name: $("#name").val()
	}
		
	$.ajax({
		type: "POST",
		contentType : "application/json",
		url: "/greet",//The Controller's request method
		data: JSON.stringify(transport),
		dataType : 'json',//
		success: function(receivedTransport){
			console.log( receivedTransport.base + receivedTransport.name +' !' );
			$('.namereceiver').text( receivedTransport.base + receivedTransport.name +' !' );
		},
		error: function(e){
			alert("error saving customer to backend!");
		}
	});
}

//function getAjax(){
//	$.ajax(){
//		type: "GET",
//		url: "/"
//	}
//}

