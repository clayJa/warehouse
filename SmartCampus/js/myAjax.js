(function($) {
	$.myAjax = {
		post: function(url, param) {
			var URL = url + "?timeStamp=" + new Date().getTime();
			var dataResult;
			$.ajax({
				url: URL,
				data: param,
				dataType: "json",
				type: "POST",
				async:false,
				success: function(data) {
					if (data.result == "true") {
						dataResult = data;
					} else {
						dataResult = false;
					}
				},
				error: function(jqXHR) {
					alert("ERROR:" + jqXHR.status);
				},

			});
			return dataResult;
		}
	};
})(jQuery);