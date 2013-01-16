package cn.zx.jerrymouse.test02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletInputStream;
import javax.servlet.ServletRequest;

public class Request implements ServletRequest {
	private InputStream inputStream;
	private String uri;

	public Request(InputStream inputStream) {
		this.inputStream = inputStream;
	}

	public void parse() {
		StringBuffer request = new StringBuffer(2048);
		int i;
		byte[] buffer = new byte[2048];
		try {
			i = inputStream.read(buffer);
		} catch (IOException e) {
			e.printStackTrace();
			i = -1;
		}
		for (int j = 0; j < i; j++) {
			request.append((char) buffer[j]);
		}
		System.out.print(request.toString());
		uri = parseUri(request.toString());
	}

	private String parseUri(String requestString) {
		int index1 = requestString.indexOf(' ');
		int index2;
		if (index1 != -1) {
			index2 = requestString.indexOf(' ', index1 + 1);
			if (index2 > index1) {
				return requestString.substring(index1 + 1, index2);
			}
		}
		return null;
	}

	public String getUri() {
		return uri;
	}

	@Override
	public Object getAttribute(String arg0) {
		return null;
	}

	@Override
	public Enumeration getAttributeNames() {
		return null;
	}

	@Override
	public String getCharacterEncoding() {
		return null;
	}

	@Override
	public int getContentLength() {
		return 0;
	}

	@Override
	public String getContentType() {
		return null;
	}

	@Override
	public ServletInputStream getInputStream() throws IOException {
		return null;
	}

	@Override
	public String getLocalAddr() {
		return null;
	}

	@Override
	public String getLocalName() {
		return null;
	}

	@Override
	public int getLocalPort() {
		return 0;
	}

	@Override
	public Locale getLocale() {
		return null;
	}

	@Override
	public Enumeration getLocales() {
		return null;
	}

	@Override
	public String getParameter(String arg0) {
		return null;
	}

	@Override
	public Map getParameterMap() {
		return null;
	}

	@Override
	public Enumeration getParameterNames() {
		return null;
	}

	@Override
	public String[] getParameterValues(String arg0) {
		return null;
	}

	@Override
	public String getProtocol() {
		return null;
	}

	@Override
	public BufferedReader getReader() throws IOException {
		return null;
	}

	@Override
	public String getRealPath(String arg0) {
		return null;
	}

	@Override
	public String getRemoteAddr() {
		return null;
	}

	@Override
	public String getRemoteHost() {
		return null;
	}

	@Override
	public int getRemotePort() {
		return 0;
	}

	@Override
	public RequestDispatcher getRequestDispatcher(String arg0) {
		return null;
	}

	@Override
	public String getScheme() {
		return null;
	}

	@Override
	public String getServerName() {
		return null;
	}

	@Override
	public int getServerPort() {
		return 0;
	}

	@Override
	public boolean isSecure() {
		return false;
	}

	@Override
	public void removeAttribute(String arg0) {
	}

	@Override
	public void setAttribute(String arg0, Object arg1) {
	}

	@Override
	public void setCharacterEncoding(String arg0) throws UnsupportedEncodingException {
	}
}