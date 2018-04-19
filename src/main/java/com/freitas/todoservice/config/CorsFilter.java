package com.freitas.todoservice.config;

import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.WebFilter;
import org.springframework.web.server.WebFilterChain;

import reactor.core.publisher.Mono;

public class CorsFilter implements WebFilter {

	@Override
	public Mono<Void> filter(ServerWebExchange server, WebFilterChain web) {
		server.getResponse().getHeaders().add("Access-Control-Allow-Origin", "*");
		server.getResponse().getHeaders().add("Access-Control-Allow-Methods", "*");
		server.getResponse().getHeaders().add("Access-Control-Allow-Headers", "Keep-Alive,User-Agent,X-Requested-With,If-Modified-Since,Cache-Control,Content-Type,Content-Range,Range");
		return web.filter(server);
	}

}
