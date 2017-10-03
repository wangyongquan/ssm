package com.game.wyq.entityproxy;

import com.game.wyq.entity.BaseDbBean;

public abstract class IProxy {
	
	/**
	 * 获取下一层代理层
	 */
	public IProxy nextProxyLayer=null;

	abstract public <T extends BaseDbBean> int insert(T entity);
}
