package servletdemo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ResInfo {
	//保存session id
	private String sessionId;
	//保存用户名
	private String uname;
	//保存用户IP
	private String ip;
	//保存访问的页面
	private String page;
	//保存页面停留的时间
	private String mills;
	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	public String getMills() {
		return mills;
	}
	public void setMills(long mills) {
		//从1970年1月1日的累计毫秒数转换成可读时间 yyyy-mm-dd hh:mm:ss
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date dt = new Date(mills);
		this.mills = df.format(dt);
	}

	public ResInfo() {
	}
	public ResInfo(String sessionId, String uname, String ip, String page, long mills) {
		this.sessionId = sessionId;
		this.uname = uname;
		this.ip = ip;
		this.page = page;
		setMills(mills);
	}
	
}
