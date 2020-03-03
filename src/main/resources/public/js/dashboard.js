/**
 * 
 */
$(document).ready(function() {
	$('.cut-over').click(function() {
		$.ajax({
	        url: "/api/cutover"+"?board_id="+$(this).val()
	    }).then(function(data) {
	    	console.log('cutover');
	    	location.reload();
	    });
    });
});

