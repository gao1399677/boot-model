package com.spring.boot.util;

/**
 * <p>Title: RestURIConstants </p>
 * <p>Description: TODO </p>
 * Date: 2017年7月19日 下午2:28:43
 * @author loulvlin@hiynn.com
 * @version 1.0 </p> 
 * Significant Modify：
 * Date               Author           Content
 * ==========================================================
 * 2017年7月19日         loulvlin         创建文件,实现基本功能
 * 
 * ==========================================================
 */
public final class RestURIConstants {
	
	/**
	 * <p>Title: LangChaoRestURIConstants </p>
	 * <p>Description: Constructor </p>  
	 */
	private RestURIConstants() {
	}

	/*获取当前用户*/
	public static final String USER = "/user";
	/*在渝、出渝手机排行 搜索*/
	public static final String INYU_SEARCH = "main/search/{state}/{type}/{text}";


}
