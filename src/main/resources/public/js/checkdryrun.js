/**
 * 
 */
$(document).ready(function() {
    $.ajax({
        url: "/api/checkdisk"
    }).then(function(data) {
       $('.mysql-space').append(data);
    });
});


$(document).ready(function() {
    $.ajax({
        url: "/api/checkdefinition"
    }).then(function(data) {
       $('.mysql-table-definition').append(data);
    });
});