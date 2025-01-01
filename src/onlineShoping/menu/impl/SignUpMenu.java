package onlineShoping.menu.impl;

import onlineShoping.configs.ApplicationContext;
import onlineShoping.menu.Menu;
import onlineShoping.services.UserManagementService;
import onlineShoping.services.impl.DefaultUserManagementService;

public class SignUpMenu implements Menu {

	private UserManagementService userManagementService;
	private ApplicationContext context;

	{
		userManagementService = DefaultUserManagementService.getInstance();
		context = ApplicationContext.getInstance();
	}

	@Override
	public void start() {
		// <write your code here>
	}

	@Override
	public void printMenuHeader() {
		// <write your code here>	
	}

}
