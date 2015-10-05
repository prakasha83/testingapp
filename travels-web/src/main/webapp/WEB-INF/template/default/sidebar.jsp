<nav class="nav-bar">
	<ul class="main-menu">
		<!-- 
		<li class="${activeMenu.dashboard}">
			<a href="${pageContext.request.contextPath}/dashboard" class="${activeMenu.dashboard}" title="Dashboard"><span class="fa fa-home menu-icon"></span> <span class="menu-text">Dashboard</span></a>
		</li>
		
		<li class="menu-divider"></li>
		
		<c:if test="${menu.customer == 'Y'}">
		<li class="${activeMenu.customer}">
			<a href="${pageContext.request.contextPath}/customer/view/individual" class="${activeMenu.customer}" title="Customers"><span class="fa fa-users menu-icon"></span> <span class="menu-text">Customers</span></a>
		</li>
		<li class="menu-divider"></li>
		</c:if>
		
		<c:if test="${menu.driver == 'Y'}">
		<li class="${activeMenu.driver}">
			<a href="${pageContext.request.contextPath}/driver/view/" class="${activeMenu.driver}" title="Drivers"><span class="fa fa-wheelchair menu-icon"></span> <span class="menu-text">Drivers</span></a>
		</li>
		</c:if>
				
		<c:if test="${menu.employee == 'Y'}">
		<li class="${activeMenu.employee}">
			<a href="${pageContext.request.contextPath}/employee/view/" class="${activeMenu.employee}" title="Employees"><span class="fa fa-users menu-icon"></span> <span class="menu-text">Employees</span></a>
		</li>
		</c:if>
		
		<c:if test="${menu.advanceSalary == 'Y'}">
		<li class="${activeMenu.advanceSalary}">
			<a href="${pageContext.request.contextPath}/advance_salary/view/" class="${activeMenu.advanceSalary}" title="Drivers"><span class="fa fa-money menu-icon"></span> <span class="menu-text">Advance Salary</span></a>
		</li>
		</c:if>
		
		<c:if test="${menu.salesCustomer == 'Y'}">
		<li class="${activeMenu.salesCustomer}">
			<a href="${pageContext.request.contextPath}/sales_customer/view/" class="${activeMenu.salesCustomer}" title="Sales Customers"><span class="fa fa-users menu-icon"></span> <span class="menu-text">Party/Customers</span></a>
		</li>
		</c:if>
		
		<c:if test="${menu.agent == 'Y'}">
		<li class="menu-divider"></li>
		<li class="${activeMenu.agent}">
			<a href="${pageContext.request.contextPath}/agent/view/" class="${activeMenu.agent}" title="Agents"><span class="fa fa-users menu-icon"></span> <span class="menu-text">Agents</span></a>
		</li>
		</c:if>
		
		<li class="menu-divider"></li>
		<c:if test="${menu.vehicle == 'Y'}">
		<li class="${activeMenu.vehicle}">
			<a href="${pageContext.request.contextPath}/vehicles/view/own/" class="${activeMenu.vehicle}" title="Vehicles"><span class="fa fa-automobile menu-icon"></span> <span class="menu-text">Vehicles</span></a>
		</li>
		</c:if>
		
		<c:if test="${menu.vehicleMaintenance == 'Y'}">
		<li class="${activeMenu.vehicleMaintenance}">
			<a href="${pageContext.request.contextPath}/vehicle_maintenance/manage/0" class="${activeMenu.vehicleMaintenance}" title="Vehicle Maintenance"><span class="fa fa-cog menu-icon"></span> <span class="menu-text">Vehicle Maintenance</span></a>
		</li>
		</c:if>
		
		<c:if test="${menu.tariff == 'Y'}">
		<li class="${activeMenu.tariff}">
			<a href="${pageContext.request.contextPath}/tariff/view/plan" class="${activeMenu.tariff}" title="Tariff"><span class="fa fa-book menu-icon"></span> <span class="menu-text">Tariff</span></a>
		</li>
		</c:if>
		<li class="menu-divider"></li>
		
		<c:if test="${menu.booking == 'Y'}">
		<li class="${activeMenu.booking}">
			<a href="${pageContext.request.contextPath}/bookings" class="${activeMenu.booking}" title="Booking"><span class="fa fa-ticket menu-icon"></span> <span class="menu-text">Booking</span></a>
		</li>
		</c:if>
		
		<c:if test="${menu.tripSheet == 'Y'}">
		<li class="${activeMenu.tripSheet}">
			<a href="${pageContext.request.contextPath}/tripsheets/view" class="${activeMenu.tripSheet}" title="Trip Sheets"><span class="fa fa-calendar menu-icon"></span> <span class="menu-text">Trip Sheets</span></a>
		</li>
		</c:if>
		
		<c:if test="${menu.invoice == 'Y'}">
		<li class="${activeMenu.invoice}">
			<a href="${pageContext.request.contextPath}/invoice" class="${activeMenu.invoice}"><span class="fa fa-file menu-icon"></span> <span class="menu-text">Invoice</span></a>
		</li>
		</c:if>
		
		<c:if test="${menu.payment == 'Y'}">
		<li class="${activeMenu.payment}">
			<a href="${pageContext.request.contextPath}/payment/view" class="${activeMenu.payment}"><span class="fa fa-file menu-icon"></span> <span class="menu-text">Payment</span></a>
		</li>
		</c:if>
		
		<c:if test="${menu.route == 'Y'}">
		<li class="${activeMenu.route}">
			<a href="${pageContext.request.contextPath}/route" class="${activeMenu.route}"><span class="fa fa-map-marker menu-icon"></span> <span class="menu-text">Route</span></a>
		</li>
		</c:if>
		<li class="menu-divider"></li>
		
		<c:if test="${menu.expense == 'Y'}">
		<li class="${activeMenu.expense}">
			<a href="${pageContext.request.contextPath}/expense-list" class="${activeMenu.expense}" title="Expenses"><span class="fa fa-inr menu-icon"></span> <span class="menu-text">Expenses</span></a>
		</li>
		</c:if>
		
		<c:if test="${menu.bankAccount == 'Y'}">
		<li class="${activeMenu.bankAccount}">
			<a href="${pageContext.request.contextPath}/bank_account/view" class="${activeMenu.bankAccount}" title="Bank Account"><span class="fa fa-inr menu-icon"></span> <span class="menu-text">Bank Account</span></a>
		</li>
		</c:if>
		
		<c:if test="${menu.accountReceipt == 'Y'}">
		<li class="${activeMenu.accountReceipt}">
			<a href="${pageContext.request.contextPath}/account_receipt/view" class="${activeMenu.accountReceipt}" title="Account Receipt"><span class="fa fa-inr menu-icon"></span> <span class="menu-text">Account Receipt</span></a>
		</li>
		</c:if>
		
		<c:if test="${menu.accountDept == 'Y'}">
		<li class="${activeMenu.accountDept}">
			<a href="${pageContext.request.contextPath}/account_debit/view" class="${activeMenu.accountDept}" title="Account Debit"><span class="fa fa-inr menu-icon"></span> <span class="menu-text">Account Debit</span></a>
		</li>
		</c:if>
		
		<c:if test="${menu.report == 'Y'}">
		<li class="${activeMenu.report}">
			<a href="${pageContext.request.contextPath}/reports" class="${activeMenu.report}" title="Reports"><span class="fa fa-line-chart menu-icon"></span> <span class="menu-text">Reports</span></a>
		</li>
		</c:if>
		<li class="menu-divider"></li>
		
		<c:if test="${menu.list == 'Y'}">
		<li class="${activeMenu.list}">
			<a href="${pageContext.request.contextPath}/lists/create" class="${activeMenu.list}" title="Lists"><span class="fa fa-list menu-icon"></span> <span class="menu-text">Lists</span></a>
		</li>
		</c:if>
		
		<c:if test="${menu.user == 'Y'}">
		<li class="${activeMenu.user}">
			<a href="${pageContext.request.contextPath}/users/view" class="${activeMenu.user}" title="User Management"><span class="fa fa-user menu-icon"></span> <span class="menu-text">User Management</span></a>
		</li>	
		<li class="${activeMenu.role}">
			<a href="${pageContext.request.contextPath}/role-list" class="${activeMenu.role}" title="User Management"><span class="fa fa-unlock-alt menu-icon"></span> <span class="menu-text">Role Management</span></a>
		</li>	
		</c:if>
		<li class="menu-divider"></li>
		-->
		<c:if test="${menu.travels == 'Y'}">
		<li class="${activeMenu.travels}">
			<a href="${pageContext.request.contextPath}/travels" class="${activeMenu.travels}" title="Travels"><span class="fa fa-users menu-icon"></span> <span class="menu-text">Travels</span></a>
		</li>
		<li class="menu-divider"></li>	
		</c:if>	
	</ul>
</nav>