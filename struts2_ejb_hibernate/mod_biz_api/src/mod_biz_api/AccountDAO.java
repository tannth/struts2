package mod_biz_api;


public interface AccountDAO<T> extends BaseAPI {
	public T checkLogin(String username, String password);
}
