package com.wd.axios;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.wd.pojo.User;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.BufferedReader;
import java.io.IOException;

@WebServlet("/axiosTest02.do")
public class AxiosServletTest02 extends HttpServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        StringBuffer stringBuffer = new StringBuffer();
        BufferedReader reader = req.getReader();
        String str = null;

        while ((str = reader.readLine()) != null){
            StringBuffer buffer = stringBuffer.append(str);
        }
        str = stringBuffer.toString();
        //将str转化成User对象，使用GSON工具
        Gson gson = new GsonBuilder().create();
        User user = gson.fromJson(str, User.class);
        System.out.println(user);
        //将Java 对象即实体类对象用toJson()方法转化成JSON数据
        String json = gson.toJson(user);
        res.setCharacterEncoding("UTF-8");
        res.setContentType("application/json;charset=UTF-8");
        res.getWriter().write(json);

    }
}
