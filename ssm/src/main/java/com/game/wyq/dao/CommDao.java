package com.game.wyq.dao;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.eclipse.persistence.jpa.JpaHelper;
import org.eclipse.persistence.tools.schemaframework.SchemaManager;

import com.game.wyq.config.ResourceManager;

public class CommDao implements IDaoSave {

	public static CommDao OBJ = new CommDao();

	/** 实体管理器工厂 */
	private EntityManagerFactory _emf = null;

	public EntityManager getEntityManager() {
		return _emf.createEntityManager();
	}

	public void initDbConfig() {
		// 设置jdbc配置项
		Map<String, String> properties = new HashMap<String, String>();
		// String
		// jdbcUrl=MessageFormat.format(appConfigBean.getJdbcUrl(),appConfigBean.getDatabaseName());
		properties.put("javax.persistence.jdbc.url", ResourceManager.me().getjdbcUrl());
		properties.put("javax.persistence.jdbc.user", ResourceManager.me().getDBname());
		properties.put("javax.persistence.jdbc.password", ResourceManager.me().getDBpassword());
		properties.put("eclipselink.jdbc.exclusive-connection.mode", "Transactional");
		properties.put("eclipselink.jdbc.exclusive-connection.is-lazy", "false");

		// 设置实体管理器工厂
		putEMFAndCreateTables(Persistence.createEntityManagerFactory("game_db", properties));

	}

	private CommDao putEMFAndCreateTables(EntityManagerFactory value) {

		if (this._emf != null) {
			// throw new Error("重复设置实体管理器工厂");
			return this;
		}

		this._emf = value;
		SchemaManager schemaManager = new SchemaManager(JpaHelper.getDatabaseSession(this._emf));
		schemaManager.extendDefaultTables(true);
		return this;

	}

}
