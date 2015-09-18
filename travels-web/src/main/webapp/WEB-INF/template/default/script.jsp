<script src="${pageContext.request.contextPath}/js/jquery.1.11.1.min.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery.form-validator.min.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery.form-validator-add.js"></script>
<!-- Fancy Scroll -->
<script src="${pageContext.request.contextPath}/js/jquery.slimscroll.js"></script>

<!-- Data Table -->
<script src="${pageContext.request.contextPath}/js/jquery.dataTables.js"></script>
<script src="${pageContext.request.contextPath}/js/dataTables.bootstrap.js"></script>
<script src="${pageContext.request.contextPath}/js/dataTables.fixedColumns.js"></script>
<script src="${pageContext.request.contextPath}/js/dataTables.colVis.js"></script>
<script src="${pageContext.request.contextPath}/js/dataTables.tableTools.js"></script>

<!-- Date Picker -->
<script src="${pageContext.request.contextPath}/js/jquery.plugin.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery.datepick.js"></script>

<!-- Chart -->
<script src="${pageContext.request.contextPath}/js/highcharts.js"></script>
<script src="${pageContext.request.contextPath}/js/jquery.highchartTable.js"></script>

<!-- Boostrap Select -->
<script src="${pageContext.request.contextPath}/js/bootstrap-select.js"></script>

<!-- Time Picker -->
<!--<script src="${pageContext.request.contextPath}/js/bootstrap-clockpicker.js"></script>-->
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.ui.core.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.ui.timepicker.js?v=0.3.3"></script>

<!-- Auto Complete -->
<script src="${pageContext.request.contextPath}/js/jquery.fcbkcomplete.js"></script>

<!-- Auto Complete From jQuery Website -->
<script src="${pageContext.request.contextPath}/js/jquery-ui.js"></script>

<script>
	var autocomp_opt;
	$(document).ready(function(){	

		autocomp_opt={
			source : "${pageContext.request.contextPath}/ta_ajax_call/get_autocity"+$(this).val(),
			minLength: 2
		};	
	
		$( ".auto_city" ).autocomplete(autocomp_opt);	
		
		//Timepicker
		// $('.timepicker').clockpicker({donetext : 'Done'});
		$('.timepicker').timepicker({
			showPeriod: true,
			showLeadingZero: true
		});
		
		//Bootstrap Select
		$('.live-search').attr('data-live-search', 'true');
		$('.selectpicker').selectpicker();
		
		//Date Picker
		$('.pickdate').datepick({dateFormat: 'dd-mm-yyyy'});
		 
		//Nave Bar Collapse When Page Load
		var docwid = $(document).width();
		if(docwid > 768){
			$('#travel-app').removeClass('move-collapsed');
		}else{
			$('#travel-app').addClass('move-collapsed');
		}
		
		//Nav Bar Functionality
		$('.nav-bar .ml1').click(function(){
			var pare = $(this).parent('li');	
			
			$('.nav-bar .opened .menu-sub-1').slideUp();
			if(pare.is('.opened')){
				pare.children('.menu-sub-1').slideUp('slide');
				pare.toggleClass('opened');
			}else{
				pare.children('.menu-sub-1').slideDown('slide');
				$('.nav-bar li').removeClass('opened');
				pare.addClass('opened');
			}	
		});	
		
		//Nav Bar Collapse When Resize
		$(window).resize(function(){
			var docwid = $(document).width();
			if(docwid > 768){
				$('#travel-app').removeClass('move-collapsed');
			}else{
				$('#travel-app').addClass('move-collapsed');
			}
		});
		
		//Get City By using State
		$('.getcity').change(function(){
			var thispar = $(this).closest('form');
			$.ajax({
				url : "${pageContext.request.contextPath}/ta_ajax_call/get_list_by_parent/"+$(this).val(),
				async : false,
				success : function(result){
					if(result != ""){
						thispar.find('.fromstate option').remove();
						$.each($.parseJSON(result), function (item, obj) {
							thispar.find('.fromstate').append('<option value="'+obj.title+'">'+obj.title+'</option>');
						});						
					}
				}
			});
		});
		
		//Line Chart - Don't Delete
		//$('table.highchart-line').highchartTable();
		
		//Validation
		$.validate({ignore: ':not(select:hidden, input:visible, textarea:visible)'/*,
			rules: { vehicle_feature: "required" },
			errorPlacement: function (error, element) {
				if ($(element).is('select')) {
					alert('1');
				}
			}*/
        });
		
		$('.clear-form').on('click', function(){
			$(this).closest('form').find('input[type="text"], select, textarea').val('');
			$(this).closest('form').find('.selectpicker li.selected a').trigger('click');
		});
		
		$('.clearalerts').on('click', function(){
			var val = parseInt($('.alertcount').text());
			if(val > 1){
				$('.alertcount').text( val - 1);
			}else{
				$('.alertcount').text( val - 1);
				$('#alertmodal .modal-body .noalerttext').text("No Alerts are available");
			}
		});
		
		/* Start Date and End Sate Validation */
		$('form').on('submit', function(){	
			var $j = 0;
			$('.datecom').each(function(){
				var s = $(this).find('.stdate');
				var e = $(this).find('.endate');
				
				if(s.is(':visible') && e.is(':visible')){
					var st = s.val().split('-');
					var newst = st[2] + '-' + st[1] + '-' + st[0];
					var end = e.val().split('-');
					var newend = end[2] + '-' + end[1] + '-' + end[0];
				}
				var startDate = new Date(newst);
				var endDate = new Date(newend);
				if (startDate > endDate) {
					$(this).find('.endate').addClass('dterror');	
					$j++;					
				}else{		
					$(this).find('.endate').removeClass('dterror');
				}
			});
			if($j > 0){
				return false;
			}else{
				return true;
			}
		});
		
		//Pop Over Label
		$('.list-row-edit, .list-row-close-trip, .list-row-trip-exp, .list-row-delete-tariffplan, list-row-delete-tariff, .list-row-payment, .list-row-print, .list-row-to-tripsheet, .list-row-vm').tooltip();		
		
		//Error Tool Tip
		$('.errorpop').tooltip();
		$('.errorpop').bind('keyup blur', function(){
			$(this).removeClass('errorpop');
		});
		
		//Popover
		$('.popovercall').popover();
		
		$(document).bind('keypress', function(event) {
			//alert(event.which);
			if( event.which === 84 && event.shiftKey ) {
				//window.location = 'add-tripsheet';
			}else if(event.which === 76 && event.shiftKey){
				//window.location = 'tripsheets-list';
			}
		});
	});
	
	$(function(){
		$('.left-menu-bar').slimScroll({
			height: '95%',
			start: $('.main-menu > li.active')
		});
		/*$('#main-container').slimScroll({
			height: '600px'
		});*/
	});
	
	function collapsedPage(){
		$('#travel-app').toggleClass('move-collapsed');
	} 
	
	function dumpdatabase(){
		$.ajax({
			url : '${pageContext.request.contextPath}/includes/ajax.php?dbdump=2',
			async : false,
			success : function(result){
				//alert(result);
			}
		});
	}
</script>

