/**
 * 
 */
$(document).ready(function() {
	$('.cut-over').click(function() {
		// Get user_name
		var user_name = $('input[name=user_name]').val()
		// Get button value
		var board_id = $(this).val()
		// Get TD values within button
		var $row = jQuery(this).closest('tr');
	    var $columns = $row.find('td');
	    // Create a custom form
	    $form = $("<form></form>");
	    $form.attr('action', 'status');
	    $form.attr('method', 'post');
	    $form.append('<input type="input" name="user_name" value="'+user_name+'">');
	    $form.append('<input type="input" name="board_id" value="'+board_id+'">');
	    var counter = 0;
	    $.each($columns, function() {               // Visits every single <td> element
	        //console.log($(this).text());        // Prints out the text within the <td>
	    	switch(counter){
	    	case 0:
	    		$form.append('<input type="input" name="no" value="'+$(this).text()+'">');
	    		break;
	    	case 1:
	    		$form.append('<input type="input" name="ghost_host" value="'+$(this).text()+'">');
	    		break;
	    	case 2:
	    		$form.append('<input type="input" name="table_schema" value="'+$(this).text()+'">');
	    		break;
	    	case 3:
	    		$form.append('<input type="input" name="table_definition" value="'+$(this).text()+'">');
	    		break;
	    	case 4:
	    		$form.append('<input type="input" name="statement" value="'+$(this).text()+'">');
	    		break;
	    	case 5:
	    		$form.append('<input type="input" name="start_time" value="'+$(this).text()+'">');
	    		break;
	    	case 6:
	    		$form.append('<input type="input" name="user_id" value="'+$(this).text()+'">');
	    		break;
	    	}
	    	counter++;
	    });
	    $('body').append($form);
	    // Submit
	    $form.submit();
	    
		/*
		$.ajax({
	        url: "/api/cutover"+"?board_id="+$(this).val()
	    }).then(function(data) {
	    	console.log('cutover');
	    	location.reload();
	    });
	    */
		
    });
});

