package com.game.wyq.entity;

import javax.persistence.Inheritance;
import javax.persistence.MappedSuperclass;
import javax.persistence.InheritanceType;

@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class BaseDbBean {

	/**
	 * 读取DB数据后事件
	 */
	public void readDbAfterEvent() {
	}

	/**
	 * 写DB数据前事件
	 */
	public void writeDbBeforeEvent() {
	}
}
