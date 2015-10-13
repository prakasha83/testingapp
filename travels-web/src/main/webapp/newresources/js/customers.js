function allCustomersTable() {
				var contPath = getContextPath();
				$('#customersTable').dataTable( {
				"bInfo" : false,
				"bLengthChange" : false,
				"sDom" : '<"top"lCp>rt<"bottom"i><"clear">',
				"pagingType": "full",
				"deferRender": true,
				"bSortCellsTop": true,
				"iDisplayLength": 10,
				ajax: contPath+"/customer/all-customers",
				"columns": [
					        { data: 'id' },
					        { data: 'customerName'},
					        { data: 'contactNo'}
					    ],
				"language": {
						"lengthMenu": "<span class='perpage'>Per Page</span>_MENU_</span>",
						"paginate": {
							"first": " ",
						    "next": " ",
						    "last": " ",
						    "previous": " ",
						}},
				"order": [[ 1, "desc" ]]
			} );

			var table = $('#customersTable').DataTable();
			$( "#customersTable" ).wrapAll("<div style='overflow-x:scroll;clear:both;width:100%' ></div>");
			// color for table
				var createBtnTxt = '<form action="${pageContext.request.contextPath}/adminstrative/create.html" style="float:right;">'+
	    					'<a href=""><input type="submit" value="Create" class="btnImage"></input></a>'+
	    				'</form>' ;
			$( "#customersTable_wrapper .top" ).append( "<span id='itsTxt' style='margin-top: 5px'>Travels List" + createBtnTxt + "</span>" );


}

function getContextPath() {
	   return window.location.pathname.substring(0, window.location.pathname.indexOf("/",2));
	}