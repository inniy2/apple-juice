/**
 * 
 */
$(document).ready(function() {
    $.ajax({
        url: "/api/checkdisk"
    }).then(function(data) {
       $('.mysql-space').append(data);
    });
    
    $.ajax({
        url: "/api/checkdefinition"
    }).then(function(data) {
       $('.mysql-table-definition').append(data);
    });
    
    $('#submitButton').click(function() {
    	var user_name = $('#user_name').val();
    	$.ajax({
            url: "/api/execute"+"?"+"user_name="+user_name
        }).then(function(data) {
        });
    });
    
});

