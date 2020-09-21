package com.yefeng.commondata.bo;

/**
 * @description:
 * @author: wangliying
 * @create: 2018-06-15
 **/
public class ResultBO<T> extends SimpleResultBO {

	/**
	 * 装载数据
	 */
	public T data;

	/**
	 * 默认构造器
	 */
	public ResultBO() {

	}

	/**
	 * @param code
	 * @param message
	 */
	public ResultBO(int code, String message) {
		this.code = code;
		this.message = message;
	}

	public ResultBO(int code, String message, T data) {
		this.code = code;
		this.message = message;
		this.data = data;
	}

	/**
	 * @param success 是否成功
	 * @param message 消息
	 * @param data    数据
	 */
	public ResultBO(boolean success, String message, T data) {
		this.success = success;
		this.message = message;
		this.data = data;
		if (success) {
			this.code = 1;
		}
	}

	public ResultBO(boolean success, String message, T data, int code) {
		this.success = success;
		this.message = message;
		this.data = data;
		this.code = code;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
