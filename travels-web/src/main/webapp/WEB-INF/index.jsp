<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/security/tags" prefix="sec"%>

<%@ include file="template/known/head.jsp"%>
<%@ include file="template/known/script.jsp"%>
	<body>	
		<div class="container-fluid" id="travel-app">
			<div class="navigation" width="30%">
				<div class="brand-con">
					<h3 class="brand-name">Travel APP</h3>
				</div>
				<div class="left-menu-bar">
					<%@ include file="template/known/navigationMenu.jsp"%>
				</div>
			</div>
			<div class="content" width="70%">
				<%@ include file="template/known/topheader.jsp"%>
				<aside id="content-bar">
					<div class="brdcm-bar">						
						<span><td width="32%" class="labelField">Welcome, <sec:authentication property="details.email" /></td></span>
					</div>					
					<br/><br/><br/>
					<div class="app-content">

					</div>
				</aside>
			</div>
		</div>
		
<%@ include file="template/default/footer.jsp"%>