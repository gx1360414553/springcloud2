package com.qf.springcloud_zuul_10000.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * zuul过滤器
 * 如果请求没有携带一个token参数,这任何请求都不能通过
 */
@Component
public class MyZuulFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        //数字越大优先级越高
        return 100;
    }

    @Override
    public boolean shouldFilter() {
        //跟根据请求是test1还是test2判断是否过滤 true 过滤 false不过滤
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        //过滤器的具体逻辑
        HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
        String requestURI = request.getRequestURI();
        System.out.println("发送过来的请求:" + requestURI);
        String token = request.getParameter("token");
        if (token == null || !token.equals("admin")){
            //让zuul将response操作权限放开
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
