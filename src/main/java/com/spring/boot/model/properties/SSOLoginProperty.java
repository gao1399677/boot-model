package com.spring.boot.model.properties;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.HotReload;
import org.aeonbits.owner.Config.Sources;

/**
 * <p>Title: SSOLoginProperty </p>
 * <p>Description: 系统配置 </p>
 * Date: 2017年7月13日 上午10:03:12
 * @author loulvlin@hiynn.com
 * @version 1.0 </p> 
 * Significant Modify：
 * Date               Author           Content
 * ==========================================================
 * 2017年7月13日         loulvlin         创建文件,实现基本功能
 * 
 * ==========================================================
 */
@HotReload
@Sources({ "classpath:ssoClient.properties" })
public interface SSOLoginProperty extends Config {

	@Key("localLogoutUrl")
    String getLocalLogoutUrl();
}
