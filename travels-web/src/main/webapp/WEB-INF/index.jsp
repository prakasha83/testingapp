<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/security/tags" prefix="sec"%>

<%@ include file="template/default/head.jsp"%>
<%@ include file="template/default/script.jsp"%>
	<body>	
		<div class="container-fluid" id="travel-app">
			<section id="side-bar">	
				<div class="brand-con">
					<h3 class="brand-name">Travel APP</h3>
				</div>
				<div class="left-menu-bar">
					<%@ include file="template/default/sidebar.jsp"%>
				</div>
			</section>
			<section id="main-container">
				<%@ include file="template/default/topheader.jsp"%>
				<aside id="content-bar">
					<div class="brdcm-bar">						
						<span>TEST</span>
					</div>					
					<br/><br/><br/>
					<div class="app-content">
						
					</div>
				</aside>
			</section>
		</div>
		
<%@ include file="template/default/footer.jsp"%>