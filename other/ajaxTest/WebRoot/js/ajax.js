/**
 * 
 */
jQuery(document).ready(function(){
   $('#ajax').click(function(event){ 
   
   event.preventDefault();
   alert("Ivan");
   var url = "ajaxTest/ajaxTest";
   var data = {
		   "qq": 1150689758, 
		   "password": 123456 
   };
   var result = $.myAjax.post(url,data);
   if(result != false){
	   $('#result').html(result.msg);
   }
   else{
	   alert("ERROR：获取数据失败");
   }
    	
	});
   
   });