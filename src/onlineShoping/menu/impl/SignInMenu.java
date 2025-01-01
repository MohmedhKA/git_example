package onlineShoping.menu.impl;

import onlineShoping.configs.ApplicationContext;
import onlineShoping.menu.Menu;
import onlineShoping.services.UserManagementService;
import onlineShoping.services.impl.DefaultUserManagementService;

public class SignInMenu implements Menu {

	private ApplicationContext context;
	private UserManagementService userManagementService;

	{
		context = ApplicationContext.getInstance();
		userManagementService = DefaultUserManagementService.getInstance();
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
