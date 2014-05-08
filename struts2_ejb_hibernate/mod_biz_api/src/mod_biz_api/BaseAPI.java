package mod_biz_api;

import java.util.List;

public interface BaseAPI<T> {
	public int insert();

	public boolean delete();

	public T findByID(String id);

	public T findByUserName(String username);

	public boolean update();

	/* public RowSet selectAccountsRS(); */

	public List<T> findAll();
}
