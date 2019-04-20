package com.qf.springcloud_zuul_10000.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@Component
public class MyZuulFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 100;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
        String token = request.getParameter("token");
        if (token == null || !token.equals("admin")){
            RequestContext.getCurrentContext().setSendZuulResponse(false);

            HttpServletResponse response = RequestContext.getCurrentContext().getResponse();
            response.setContentType("text/html; charset=utf-8");

            try {
                PrintWriter writer = response.getWriter();
                writer.print("token令牌无效，请联系管理员！！");
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return null;
    }
}
