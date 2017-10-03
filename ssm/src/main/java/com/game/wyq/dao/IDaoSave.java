package com.game.wyq.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public interface IDaoSave {

	default boolean save(Object entityObj) {

		// 如果参数对象为空,则直接退出!
		if (entityObj == null) {
			return false;
		}

		// 获取实体管理器
		EntityManager em = CommDao.OBJ.getEntityManager();
		// 如果实体管理器为空,则直接退出!
		if (em == null) {
			return false;
		}

		EntityTransaction tranx = null;
		try {
			((BaseDbBean) entityObj).writeDbBeforeEvent();
			// 获取数据库事务
			tranx = em.getTransaction();
			// 开始事务过程
			if (!tranx.isActive()) {
				tranx.begin();
			}
			// 保存实体
			em.persist(entityObj);
			// 提交事务
			tranx.commit();
		} catch (Exception ex) {
			if (tranx != null) {
				tranx.rollback();
			}
			return false;
		} finally {
			if (tranx != null && tranx.isActive()) {
				tranx.commit();
			}
			em.close();
		}
		return true;

	}
}
