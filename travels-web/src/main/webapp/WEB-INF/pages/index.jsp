<%@ include file="/template/default/head.jsp"%>
<%@ include file="/template/default/script.jsp"%>
	<body>	
		<div class="container-fluid" id="travel-app">
			<section id="side-bar">	
				<div class="brand-con">
					<h3 class="brand-name">Travel APP</h3>
				</div>
				<div class="left-menu-bar">
					<%@ include file="/template/default/sidebar.jsp"%>
				</div>
			</section>
			<section id="main-container">
				<%@ include file="/template/default/topheader.jsp"%>
				<aside id="content-bar">
					<div class="brdcm-bar">						
						<span><?php echo $title; ?></span>
					</div>					
					<br/><br/><br/>
					<div class="app-content">
						<?php $this->load->view($main_content); ?>
					</div>
				</aside>
			</section>
		</div>
		
<%@ include file="/template/default/footer.jsp"%>