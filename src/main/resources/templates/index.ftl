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
    <title>appe</title>
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
    <button id="eliminaD">elimina dipendente</button>
    <button id="cambia">stato</button>
    <button id="findall">vedi</button>
    <button id="findFiscal">vedi da codice fiscale</button>
    <button id="veditutto">vedi tutto</button>
     <button id="findFiscalcont">vedi contratto da codice fiscale</button>



	<script type="text/javascript">  

  
   
let dipendente={};  

function dip(){
dipendente.nome=$("#name").val()
dipendente.cognome=$("#surname").val(),
dipendente.luogoNascita=$("#birth_place").val(),
dipendente.codiceFiscale="codiceDelDipendente"//$("#fiscal_code").val(),
dipendente.residenza=$("#residence").val(),
dipendente.indirizzo=$("#address").val(),
dipendente.email=$("#email").val()
dipendente.numCellulare=$("#cell_phone").val()
dipendente.telCasa=$("#home_telephone").val()
dipendente.sesso=$("#sex").val()
dipendente. dataNascita=new Date();
dipendente.stato=1;










}


       contratto={
        codiceFiscale:dipendente.codiceFiscale,
        tipo:"stage",
        oreContratto:40,
        dataAssunzione:new Date(),
        dataScadenzaContratto:new Date(),
        retribuzione:800.0,
        ruolo_id:1,
       }
     
       profilo={
        userName:"user",
        password:"User1000",
        codiceFiscale:dipendente.codiceFiscale,
       }
 $(document).ready(function () {

	 
	
	$(document).on('click', "#add", function () {
      dip()
	   

console.log(dipendente)
	
	$.ajax({//
        type: 'POST',
        url: '/dipendente/nuovo',
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
  	$(document).on('click', "#add", function () {

	$.ajax({//
        type: 'POST',
        url: '/contratto/nuovo',
        contentType: "application/json",
        data:  JSON.stringify(contratto),
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
		$(document).on('click', "#add", function () {
      
	   

console.log(profilo)
	
	$.ajax({//
        type: 'POST',
        url: '/profilo/nuovo',
        contentType: "application/json",
        data:  JSON.stringify(profilo),
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

$(document).on('click', "#findFiscalcont", function (){
	$.ajax({//
        type: 'POST',
        url: '/contratto/vedi',
        data:{codice:"codiceDelDipendente",},
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



	$(document).on('click', "#elimina", function (){
	$.ajax({//
        type: 'POST',
        url: '/profilo/elimina',
        data:{codice:"codiceDelDipendente",},
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
  	$(document).on('click', "#eliminaD", function (){
	$.ajax({//
        type: 'DELETE',
        url: '/dipendente/elimina',
        data:{codice:"codiceDelDipendente",},
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
        url: '/dipendente/vedi',
        data:{codice:"codiceDelDipendente",},
       asynch: false,
       
         success: function(text) {
            console.log("dip" ,text)
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
        url: '/dipendente/vedi/tutti',
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