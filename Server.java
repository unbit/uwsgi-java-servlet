import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import java.io.*;

/*

This a prototype of servlet container.
This must be ported to jni

*/

class uWSGIRequest implements HttpServletRequest {

	public Object getAttribute(String name) {
		return null;
	}

	public Enumeration getAttributeNames() {
		return null;
	}

	public String getCharacterEncoding() {
		return "utf-8";
	}

	public void setCharacterEncoding(String env) {
	}

	public String getParameter(String name) {
		return null;
	}

	public Enumeration getParameterNames() {
		return null;
	}

	public String[] getParameterValues(String name) {
		return null;
	}

	public int  getContentLength() {
		return 0;
	}

	public String  getContentType() {
		return "text/plain";
	}

	
	public ServletInputStream getInputStream() {
		return null;
	}	
	

	public Map getParameterMap() {
		return null;
	}

	public String getProtocol() {
		return "HTTP/1.0";
	}

	public String getScheme() {
		return "http";
	}

	public String getServerName() {
		return "quantal64.local";
	}

	public int getServerPort() {
		return 80;
	}

	public BufferedReader getReader() {
		return null;
	}

	public String getRemoteAddr() {
		return "127.0.0.1";
	}

	public String getRemoteHost() {
		return "localhost";
	}

	public void setAttribute(String name, Object o) {
	}

	public void removeAttribute(String name) {
	}

	public Locale getLocale() {
		return null;
	}

	public Enumeration getLocales() {
		return null;
	}

	public boolean isSecure() {
		return false;
	}

	public RequestDispatcher getRequestDispatcher(String path) {
		return null;
	}

	public String getRealPath(String path) {
		return "/tmp";
	}

	public int getRemotePort() {
		return 1717;
	}

	public String getLocalName() {
		return "localhost";
	}

	public String getLocalAddr() {
		return "127.0.0.1";
	}

	public int getLocalPort() {
		return 80;
	}

	public String getAuthType() {
		return null;
	}

	public Cookie[]  getCookies() {
		return null;
	}

	public long getDateHeader(String name) {
		return -1;
	}

	public String getHeader(String name) {
		return null;
	}
	
	public Enumeration getHeaders(String name) {
		return null;
	}

	public Enumeration getHeaderNames() {
		return null;
	}

	public int getIntHeader(String name) {
		return -1;
	}

	public String getMethod() {
		return "GET";
	}

	public String getPathInfo() {
		return "";
	}

	public String getPathTranslated() {
		return null;
	}

	public String getContextPath() {
		return "";
	}

	public String getQueryString() {
		return "r=17";
	}

	public String getRemoteUser() {
		return "kratos";
	}

	public boolean isUserInRole(String role) {
		return false;
	}

	public java.security.Principal getUserPrincipal() {
		return null;
	}

	public String getRequestedSessionId() {
		return null;
	}

	public String getRequestURI() {
		return "/foobar";
	}

	public StringBuffer getRequestURL() {
		//return "http://quantal64.local/roberta?r=17";
		return null;
	}

	public String getServletPath() {
		return "/foobar";
	}

	public HttpSession getSession(boolean create) {
		return null;
	}
	
	public HttpSession getSession() {
		return null;
	}

	public boolean isRequestedSessionIdFromURL() {
		return false;
	}

	public boolean isRequestedSessionIdFromUrl() {
		return false;
	}

	public boolean isRequestedSessionIdFromCookie() {
		return false;
	}

	public boolean isRequestedSessionIdValid() {
		return false;
	}

}

class uWSGIResponse implements HttpServletResponse {

	public void addCookie(Cookie cookie) {
	}

	public boolean containsHeader(String name) {
		return false;
	}

	public String encodeURL(String url) {
		return url;
	}

	public String encodeRedirectURL(String url) {
		return url;
	}

	public String encodeUrl(String url) {
                return url;
        }

	public String encodeRedirectUrl(String url) {
                return url;
        }

	public void sendError(int sc, String msg) {
	}

	public void sendError(int sc) {
	}

	public void sendRedirect(String location) {
	}

	public void setDateHeader(String name, long date) {
	}

	public void addDateHeader(String name, long date) {
	}

	public void setHeader(String name, String value) {
	}

	public void addHeader(String name, String value) {
	}

	public void setIntHeader(String name, int value) {
	}

	public void addIntHeader(String name, int value) {
	}

	public void setStatus(int sc) {
	}

	public void setStatus(int sc, String sm) {
	}

	public void flushBuffer() {
	}

	public void resetBuffer() {
	}

	public boolean isCommitted() {
		return true;
	}

	public void reset() {
	}

	public void setLocale(Locale loc) {
	}

	public Locale getLocale() {
		return null;	
	}

	public int getBufferSize() {
		return 4096;
	}

	public void setBufferSize(int size) {
	}

	public void setContentType(String type) {
	}

	public void setContentLength(int len) {
	}

	public void setCharacterEncoding(String charset) {
	}

	public PrintWriter getWriter() {
		return null;
	}

	public ServletOutputStream getOutputStream() {
		return null;
	}

	public String getContentType() {
		return "text/plain";
	}

	public String getCharacterEncoding() {
		return "utf-8";
	}
}


class Server {
	public static void main(String[] args) throws ServletException,IOException {
		System.out.println("Hello World!");
		Foo f = new Foo();
		uWSGIRequest req = new uWSGIRequest();
		uWSGIResponse res = new uWSGIResponse();
		f.doGet(req, res);
	}
}

