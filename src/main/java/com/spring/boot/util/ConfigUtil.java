package com.spring.boot.util;

import com.spring.boot.model.properties.SSOLoginProperty;
import com.spring.boot.model.properties.ServerProperty;
import org.aeonbits.owner.ConfigCache;

/**
 * <p>Title: ConfigUtil </p>
 * <p>Description: 获取系统配置 </p>
 * Date: 2017年7月13日 上午10:02:53
 * @author loulvlin@hiynn.com
 * @version 1.0 </p> 
 * Significant Modify：
 * Date               Author           Content
 * ==========================================================
 * 2017年7月13日         loulvlin         创建文件,实现基本功能
 * 
 * ==========================================================
 */
public final class ConfigUtil {
	/**
	 * <p>Title: ConfigUtil </p>
	 * <p>Description: Constructor </p>
	 */
	private ConfigUtil() {
	}
	/**
	 * 
	 * <p>Title: getServerConf </p>
	 * <p>Description: 获取系统配置单例 </p>
	 * @return
	 */
	public static ServerProperty getServerConf (){
		return ConfigCache.getOrCreate(ServerProperty.class);
	}

	public static SSOLoginProperty getLoginConfig() {
		return ConfigCache.getOrCreate(SSOLoginProperty.class);
	}
	
}
