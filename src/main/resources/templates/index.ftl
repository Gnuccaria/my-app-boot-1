<!DOCTYPE html>
<html lang="it">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://cdn.datatables.net/1.12.1/js/jquery.dataTables.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <title>Controller</title>
</head>
<body>
  <h1>Titolo di prova</h1>




  <input type=text id="name" placeholder="name"/>
  </div>
    <div>
  <input type=text id="surname" placeholder="surname"/>
  </div>
    <div>
  <input type=text id="birth_place" placeholder="birth_place"/>
  </div>
    <div>
  <input type=text id="fiscal_code" placeholder="fiscal_code"/>
  </div> 
  <input type=text id="residence" placeholder="residence"/>
  </div>
   <div>
  <input type=text id="address" placeholder="address"/>
  </div>
    <div>
  <input type=text id="email" placeholder="email"/>
  </div>
    <div>
  <input type=text id="cell_phone" placeholder="cell_phone"/>
  </div>
    <div>
  <input type=text id="home_telephone" placeholder="home_telephone"/>
  </div> 
  <div>
  <input type=text id="sex" placeholder="sex"/>
  </div> 
   <div>
  <input type=text id="birth_date" placeholder="birth_date"/>
  </div> 
 
  

    <button id="add">aggiungi</button>
    <button id="elimina">elimina</button>
    <button id="cambia">stato</button>
    <button id="findall">vedi</button>
    <button id="findFiscal">vedi da codice fiscale</button>
    <button id="veditutto">vedi tutto</button>




	<script type="text/javascript">  


   dipendente={
       name:"abcd", //$("#name").val(),
       surname:"abcd", //$("#surname").val(),
       birthPlace:"abcd", //$("#birth_place").val(),
       fiscalCode:"abcd" ,//$("#fiscal_code").val(),
       residence:"abcd" ,//$("#residence").val(), 
       address:"abcd" ,//$("#address").val(),
       email:"abcd" ,//$("#email").val(),
       cellPhone:"abcd", //$("#cell_phone").val(),
       homeTelephone:"abcd", //$("#home_telephone").val(),
       sex:"abcd", //$("#sex").val(), 
       birthDate:new Date() ,//$("#birth_date").val()//deve essere in formato data
       state:1 
       }

 $(document).ready(function () {

	 
	
	$(document).on('click', "#add", function () {
       
	   

console.log(dipendente)
	
	$.ajax({//
        type: 'POST',
        url: '/nuovo',
        contentType: "application/json",
        data:  JSON.stringify(dipendente),
      asynch: false,
      
       
         success: function(text) {
            console.log(text);
        },
        error: function (jqXHR) {
            console.log(jqXHR);
        } 
    });//

	//location.reload();
	});
	
	$(document).on('click', "#elimina", function (){
	$.ajax({//
        type: 'POST',
        url: '/elimina',
        data:{fiscal:"abcd",},
      asynch: false,
       
         success: function(text) {
            console.log(text);
        },
        error: function (jqXHR) {
            console.log(jqXHR);
        } 
    });//
	//location.reload();
  })

$(document).on('click', "#cambia", function (){
	$.ajax({//
        type: 'POST',
        url: '/state',
        data:{state:"abcd",},
      
       
         success: function(text) {
            console.log(text);
        },
        error: function (jqXHR) {
            console.log(jqXHR);
        } 
    });//
	//location.reload();
  })
let fiscal;
$(document).on('click', "#findFiscal", function (){
	$.ajax({//
        type: 'POST',
        url: '/seleziona/codicefiscale',
        data:{fiscal_code:"abcd",},
       asynch: false,
       
         success: function(text) {
            console.log(text)
           fiscal=text;
        },
        error: function (jqXHR) {
            console.log(jqXHR);
        } 
    });//
	//location.reload();
  })

 	console.log(fiscal)
$(document).on("click", "#veditutto",function(){

	$.ajax({//
        type: 'POST',
        url: '/veditutti',
        contentType: "application/json",
        data:{},
      asynch: false,
      
       
         success: function(text) {
            console.log(text);
        },
        error: function (jqXHR) {
            console.log(jqXHR);
        } 
    });//
})

})




</script>
</body>

</html>