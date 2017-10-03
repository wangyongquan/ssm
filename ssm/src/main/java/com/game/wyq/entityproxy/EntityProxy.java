package com.game.wyq.entityproxy;

import com.game.wyq.entity.BaseDbBean;

public class EntityProxy extends IProxy {

	public final static IProxy OBJ = EntityProxy.buildProxyLayer();

	private static IProxy entityProxy = null;

	private static IProxy cacheProxy = null;

	private static IProxy dbProxy = null;

	@Override
	public <T extends BaseDbBean> int insert(T entity) {
		
		int dbInsert = entityProxy.insert(entity);
		return dbInsert;
	}

	private static IProxy buildProxyLayer() {
		cacheProxy = new CacheProxy();

		dbProxy = new DBProxy();

		cacheProxy.nextProxyLayer = dbProxy;
		
		return cacheProxy;
	}

}
