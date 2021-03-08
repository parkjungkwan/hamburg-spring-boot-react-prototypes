package com.example.demo.sec.util;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

public class CustomAuthTokenProvider implements AuthTokenProvider{
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	 
	@Value("${auth.jwtSecret}")
    private String jwtSecret;
	@Value("${auth.jwtExpirationMs}")
	private int jwtExpirationMs;
	@Override
	public String parseTokenString(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public AuthToken issue(Long userNo) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Long getTokenOwnerNo(String token) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean validateToken(String token) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
