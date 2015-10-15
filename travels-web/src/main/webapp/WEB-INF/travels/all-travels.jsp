<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/security/tags" prefix="sec"%>


<script type="text/javascript" src="${pageContext.request.contextPath}/newresources/js/travels.js"></script>
	<body>	
		<div class="container-fluid" id="travel-app">
			<div class="content" width="70%">
				<aside id="content-bar">
					<div class="brdcm-bar">						
						<span><td width="32%" class="labelField">Welcome, <sec:authentication property="details.email" /></td></span>
					</div>					
					<br/><br/><br/>
					<div class="app-content">
						<table class="display orderRes responsive no-wrap newTab" id="travelsTable">
							<thead>
								<th>ID</th>
								<th>Travels Name</th>
								<th>Contact Person</th>
							</thead>
						</table>
						</div>
				</aside>
			</section>
		</div>
		<SCRIPT type="text/javascript">
			$(document).ready(function() {
				allTravelsTable();
			});
		</SCRIPT>