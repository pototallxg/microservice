package com.yefeng.commondata.bo;

/**
 * @description:
 * @author: wangliying
 * @create: 2018-06-15
 **/
public class SimpleResultBO {
	/**
	 * 是否成功
	 */
	protected boolean success = false;

	/**
	 * 返回信息
	 */
	protected String message;

	/**
	 * 错误代码
	 */
	protected int code;

	/**
	 * 默认构造器
	 */
	public SimpleResultBO() {

	}

	/**
	 * @param success 是否成功
	 * @param message 返回的消息
	 */
	public SimpleResultBO(boolean success, int code, String message) {
		this.success = success;
		this.message = message;
		this.code = code;
	}

	/**
	 * @param success 是否成功
	 * @param message 返回的消息
	 */
	public SimpleResultBO(boolean success, String message) {
		this.success = success;
		this.message = message;
	}

	/**
	 * @param success 是否成功
	 */
	public SimpleResultBO(boolean success) {
		this.success = success;
		this.message = "操作成功";
	}

	/**
	 * @param code
	 * @param message
	 */
	public SimpleResultBO(int code, String message) {
		this.code = code;
		this.message = message;
	}

	public boolean getSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
}
