package action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LinkAction extends ActionSupport {
	public String index() {
		return "index";
	}

	public String welcome() {
		Map session = ActionContext.getContext().getSession();
		session.put("USER", "tan");
		return "welcome";
	}

}
