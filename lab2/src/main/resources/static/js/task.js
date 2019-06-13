/**
 * 
 */
$(document).ready(function() {	
	$('#btn').click(function(){
		var n = $("#sid").val();
		$.ajax({
	        url: "http://localhost:8080/task/"+n
	    }).then(function(data) {
	    	$("#msg").text(data.article);
	    	$("#num").text("主题"+data.id);
	    });
	});   
	
});