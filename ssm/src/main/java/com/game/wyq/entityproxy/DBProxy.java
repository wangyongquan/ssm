package com.game.wyq.entityproxy;

import com.game.wyq.dao.CommDao;
import com.game.wyq.entity.BaseDbBean;

public class DBProxy extends IProxy {

	@Override
	public <T extends BaseDbBean> int insert(T entity) {
		boolean isOk = CommDao.OBJ.save(entity);
		return isOk ? 1 : 0;
	}

}
