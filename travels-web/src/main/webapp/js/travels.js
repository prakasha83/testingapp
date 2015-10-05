function allLeadsTable() {
				var contPath = getContextPath();
				console.log("In travels.js file");
				$('#travelsTable').dataTable( {
				"bInfo" : false,
				"bLengthChange" : false,
				"sDom" : '<"top"lCp>rt<"bottom"i><"clear">',
				"pagingType": "full",
				"deferRender": true,
				"bSortCellsTop": true,
				"iDisplayLength": 10,
				stateSave: true,
				ajax: contPath+"/travels/all-travels",
				"columns": [
					        { data: 'id' },
					        { data: 'travelsName'},
					        { data: 'contactPerson'}
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

			var table = $('#travelsTable').DataTable();
			$( "#travelsTable" ).wrapAll("<div style='overflow-x:scroll;clear:both;width:100%' ></div>");
			new $.fn.dataTable.ColReorder(table);
			// color for table
			$( "#travelsTable_wrapper .top" ).append( "<span id='itsTxt' style='margin-top: 5px'>Travels List</span>" );

			// Reload every 5 min.
			leadReload = setInterval( function () {
				$('#travelsTable').DataTable().ajax.reload();
			}, 300000 );

}

function getContextPath() {
	   return window.location.pathname.substring(0, window.location.pathname.indexOf("/",2));
	}