package com.spring.boot.util;

import com.google.gson.Gson;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * <p>Title: LangChaoConstants </p>
 * <p>Description: 项目常量类 </p>
 * Date: 2017年7月13日 下午1:29:32
 *
 * @author loulvlin@hiynn.com
 * @version 1.0 </p>
 * Significant Modify：
 * Date               Author           Content
 * ==========================================================
 * 2017年7月13日         loulvlin         创建文件,实现基本功能
 * <p>
 * ==========================================================
 */
public final class Constants {


	/**
	 * <p>Title: LangChaoConstants </p>
	 * <p>Description: Constructor </p>
	 */
	private Constants() {
	}

	public static final String STATE_IN = "in";
	public static final String STATE_OUT = "out";
	public static final Gson COMM_GSON = new Gson();

	/**
	 * <p>Title: getPageInfo </p>
	 * <p>Description: 获取分页返回信息 </p>
	 *
	 * @param params
	 * @return
	 */
	public static Map<String, Object> getPageInfo(Map<String, Object> params) {
		Map<String, Object> userInfo = new LinkedHashMap<>();

		int totalPage = 0;
		int allRows = (int) params.get("totalCount");
		int pageSize = (int) params.get("pageSize");
		if (allRows % pageSize > 0) {
			totalPage = allRows / pageSize + 1;
		} else if (allRows % pageSize == 0) {
			totalPage = allRows / pageSize;
		}
		userInfo.put("totalPage", totalPage);
		userInfo.put("totalCount", allRows);
		userInfo.put("currentPage", params.get("currentPage"));
		return userInfo;
	}


	/**
	 * <p>Title: getCurrentTimeSeconds </p>
	 * <p>Description: 用于前端实时获取后端服务器的时间，精确到分钟 </p>
	 *
	 * @return
	 */
	public static String getCurrentTimeSeconds() {
		Calendar now = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmm");
		return sdf.format(now.getTime());
	}

}
