package org.paul.security;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Slf4j
public class CustomLoginSuccessHandler implements AuthenticationSuccessHandler {

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        List<String> roleNames = new ArrayList<>();
        authentication.getAuthorities().forEach(
                authority -> {
                    roleNames.add(authority.getAuthority());
                }
        );

        if (roleNames.contains("ROLE_ADMIN")) {
            response.sendRedirect("/sample/admin");
            return ;
        }

        if (roleNames.contains("ROLE_MEMBER")) {
            response.sendRedirect("/sample/member");
            return ;
        }

        response.sendRedirect("/");
    }
}
