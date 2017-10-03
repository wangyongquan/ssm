package com.game.wyq.config;

import java.io.File;
import java.text.MessageFormat;

import javax.servlet.ServletConfig;

import org.nutz.ioc.impl.PropertiesProxy;
import org.nutz.lang.Files;

public class ResourceManager {

	public static volatile ResourceManager _init;

	private PropertiesProxy propertiesProxy = new PropertiesProxy();

	public static ResourceManager me() {

		if (_init == null) {
			synchronized (ResourceManager.class) {
				if (_init == null) {
					_init = new ResourceManager();
				}
			}
		}
		return _init;
	}

	public void init(ServletConfig config) {

		File appFile = Files.findFile("deploy.properties");
		String path = appFile.getPath();
		propertiesProxy.setPaths(path);
	}

	public String getDBname() {
		return propertiesProxy.get("dbUser", "root");
	}

	public String getDBpassword() {
		return propertiesProxy.get("dbPassword", "root");
	}

	public String getjdbcUrl() {
		String jdbcUrl = propertiesProxy.get("jdbcUrl", "reasd");
		return MessageFormat.format(jdbcUrl, propertiesProxy.get("databaseName", "ssm_game"));
	}

}
