package ajaxTest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ajaxTest extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public ajaxTest() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		 System.out.println("POST 请求 正在处理...");
         /*获取数据*/
         String qq = request.getParameter("qq"); 
	        String password = request.getParameter("password");
	        System.out.println("得到数据：QQ："+qq+"  password:"+password);
	        
	        /*返回数据*/
	        response.setCharacterEncoding("UTF-8");
	        response.setContentType("application/json; charset=utf-8");
	        String jsonStr = "{\"msg\":\"failed\",\"result\":\"false\"}";
	        PrintWriter out = null;
	        if(qq.equals("1150689758")){
	        	if(password.equals("123456")) {
	        		jsonStr = "{\"msg\":\"success!welcome\",\"result\":\"true\"}";
	        	}
	        }
	        try {
	            out = response.getWriter();
	            out.write(jsonStr);
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            if (out != null) {
	                out.close();
	            }
	        }
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
