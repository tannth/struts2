package action;

import java.util.List;

import util.DBOperators;

import com.opensymphony.xwork2.ActionSupport;

import dto.AccountDTO;

public class SearchLikeAction extends ActionSupport {
	private String nameSearch;
	private List<AccountDTO> list;

	public SearchLikeAction() {
		// TODO Auto-generated constructor stub
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

	@Override
	public String execute() throws Exception {
		list = DBOperators.searchByLastName(nameSearch);

		return DBOperators.SUCCESS;
	}
}
