/**
 * 
 */
$(document).ready(function() {
    $.ajax({
        url: "/api/greeting"
    }).then(function(data) {
       $('.greeting-id').append(data);
    });
});


$(document).ready(function() {
    $.ajax({
        url: "/api/greeting2"
    }).then(function(data) {
       $('.greeting-content').append(data);
    });
});