/**
 * 
 */
$(document).ready(function() {
	$('.status').click(function() {
		var grpc_port = '9090';
		$.ajax({
	        url: "/api/ghostcommand?" +
	                "ghost_host=localhost&" +
	        		"grpc_port=" + grpc_port + "&" +
	        		"table_definition=test&" +
	        		"table_definition=test_tabl1&" +
	        		"ghost_command=status"
	    }).then(function(data) {
	    	console.log(data);
	    	$('#ghostStatus').val(data);
	    });
    });
});

