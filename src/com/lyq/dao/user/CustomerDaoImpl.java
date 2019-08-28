package com.lyq.dao.user;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lyq.dao.DaoSupport;
import com.lyq.model.user.Customer;

@Repository("customerDao")
@Transactional
public class CustomerDaoImpl extends DaoSupport<Customer> implements CustomerDao {
	/* (non-Javadoc)
	 * @see com.lyq.dao.user.CustomerDao#login(java.lang.String, java.lang.String)
	 * 登录验证
	 */
	@Override
	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
	public Customer login(String username, String password) {
		if (username != null && password != null) {
			String where = "where username=? and password=?";
			Object[] queryParams = { username, password };
			List<Customer> list = find(-1, -1, where, queryParams).getList();
			if (list != null && list.size() > 0) {
				return list.get(0);
			}
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see com.lyq.dao.user.CustomerDao#isUnique(java.lang.String)
	 * 验证用户名是否唯一
	 */
	@SuppressWarnings("unchecked")
	@Override
	@Transactional(propagation = Propagation.NOT_SUPPORTED, readOnly = true)
	public boolean isUnique(String username) {
		Query query = getSession().createQuery("from Customer where username = ?");
		query.setString(0, username); // 为username绑定参数值
		List list = query.list();
		if (list != null && list.size() > 0) {
			return false;
		}
		return true;
	}
}
