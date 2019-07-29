initPage();

function initPage(){
	loadpictures(0,1);
	loadpictures(3,2);
	loadusers(0);
}

function loadpictures(batch,row){
	$.getJSON("/picshareapp/restservices/pictures?batch="+batch, function(data){
		$.each(data, function(i, picture){
			$("#photo1").append(
					 "<div class=\"w3-third w3-container w3-margin-bottom\">"+
				      "<a href=pictures/"+picture.id+".html><img src=imgs/pics/"+picture.id+".jpg alt=Sandwich style=width:100%;height:240px; class=w3-hover-opacity></a>"+
				      "<div style=height:100px !important; class=\"w3-container w3-white\">"+
				        "<p><b>"+picture.title+"</b></p>"+
				        "<p>"+picture.description+"</p>"+
				      "</div></div>"
);
		});

});
} 
function loadusers(batch){
	$.getJSON("/picshareapp/restservices/users?batch="+batch, function(data){
		$.each(data, function(i, user){
			$("#users").append(
					 "<div style=margin:16px;width:22%;float:left; class=\"w3-container w3-margin-bottom w3-margin-16\">"+
				      "<a href=users/"+user.id+".html><img src=imgs/users/"+user.id+".jpg alt=Sandwich style=width:100%; class=w3-hover-opacity></a>"+
				      "<div style=width:100%; class=\"w3-container w3-white\">"+
				        "<p><b>"+user.username+"</b></p>"+
				        "<p>"+user.description+"</p>"+
				      "</div></div>"
);
		});

});
}

$( "#picbutton1" ).click(function() {
	 $("#photo1").empty();
	 $("#photo2").empty();
	  loadpictures(0,1);
	  loadpictures(3,2);
	});
$( "#picbutton2" ).click(function() {
	 $("#photo1").empty();
	 $("#photo2").empty();
	  loadpictures(6,1);
	  loadpictures(9,2);
	});
$( "#picbutton3" ).click(function() {
	 $("#photo1").empty();
	 $("#photo2").empty();
	  loadpictures(12,1);
	  loadpictures(15,2);
	});
$( "#picbutton4" ).click(function() {
	 $("#photo1").empty();
	 $("#photo2").empty();
	  loadpictures(18,1);
	  loadpictures(21,2);
	});
$( "#userbutton1" ).click(function() {
	 $("#users").empty();
	 $("#users").empty();
	  loadusers(0);
	});
$( "#userbutton2" ).click(function() {
	 $("#users").empty();
	 $("#users").empty();
	  loadusers(4);
	});

// Script to open and close sidebar
function w3_open() {
    document.getElementById("mySidebar").style.display = "block";
    document.getElementById("myOverlay").style.display = "block";
}
 
function w3_close() {
    document.getElementById("mySidebar").style.display = "none";
    document.getElementById("myOverlay").style.display = "none";
}