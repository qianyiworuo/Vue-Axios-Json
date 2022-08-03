package com.wd.axios;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

@WebServlet("/axiosTest.do")
public class AxiosServletTest01 extends HttpServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String uname = req.getParameter("uname");
        String pwd = req.getParameter("pwd");
        System.out.println("uname:"+uname+"pwd:"+pwd);
        res.setCharacterEncoding("UTF-8");
        res.setContentType("text/html;charset=utf-8");
        res.getWriter().write(uname+"_"+pwd);
    }
}
