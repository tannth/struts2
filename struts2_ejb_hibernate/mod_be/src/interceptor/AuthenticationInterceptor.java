package interceptor;

import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.Interceptor;

import entites.Account;

public class AuthenticationInterceptor implements Interceptor {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void init() {
		// TODO Auto-generated method stub

	}

	@Override
	public String intercept(ActionInvocation actionInvocation) throws Exception {
		Map<String, Object> session = actionInvocation.getInvocationContext()
				.getSession();
		Account account = (Account) session.get("account");

		if (account == null) {

			return ActionSupport.LOGIN;
		}
		return actionInvocation.invoke();
	}

}
