package com.game.wyq.action;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;

import org.eclipse.persistence.jpa.JpaHelper;
import org.eclipse.persistence.tools.schemaframework.SchemaManager;

import com.game.wyq.config.ResourceManager;
import com.game.wyq.dao.CommDao;

public class InitServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) {
		ResourceManager.me().init(config);
		// 初始化数据库dao
		CommDao.OBJ.initDbConfig();
	}

}
