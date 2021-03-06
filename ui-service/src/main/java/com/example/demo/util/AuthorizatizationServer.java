package com.example.demo.util;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriTemplate;

import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@NoArgsConstructor
@Data
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "auth-server")
public class AuthorizatizationServer {

	private String baseUri;
	private UriTemplate exit;
}
