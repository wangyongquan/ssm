package com.game.wyq.entityproxy;

import com.game.wyq.entity.BaseDbBean;

public class CacheProxy extends IProxy {

	@Override
	public <T extends BaseDbBean> int insert(T entity) {
		// 调用下层操作数据
		int saveOk = this.nextProxyLayer.insert(entity);
		return saveOk;
	}

}
