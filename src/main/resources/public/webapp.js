$(document).ready(function() {
    $.ajax({
        url: "http://localhost:7070/username"
    }).then(function(data, status, jqxhr) {
       $('.user-name').append(data);
       console.log(jqxhr);
    });
});