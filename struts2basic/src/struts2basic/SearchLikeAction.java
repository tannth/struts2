package struts2basic;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class SearchLikeAction extends ActionSupport {
	private final String SUCCESS = "success";

	private String nameSearch;
	private List<AccountDTO> list;

	@Override
	public String execute() throws Exception {
		list = DBOperation.searchLikeLastName(nameSearch);
		return SUCCESS;
	}

	public String getNameSearch() {
		return nameSearch;
	}

	public void setNameSearch(String nameSearch) {
		this.nameSearch = nameSearch;
	}

	public List<AccountDTO> getList() {
		return list;
	}

	public void setList(List<AccountDTO> list) {
		this.list = list;
	}

}
