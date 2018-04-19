package com.freitas.todoservice.config;

import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.WebFilter;
import org.springframework.web.server.WebFilterChain;

import reactor.core.publisher.Mono;

public class CorsFilter implements WebFilter {

	@Override
	public Mono<Void> filter(ServerWebExchange server, WebFilterChain web) {
		server.getResponse().getHeaders().add("Access-Control-Allow-Origin", "*");
		return web.filter(server);
	}

}
