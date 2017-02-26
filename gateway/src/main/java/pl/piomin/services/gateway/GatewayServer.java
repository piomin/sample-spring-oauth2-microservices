package pl.piomin.services.gateway;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.session.jdbc.config.annotation.web.http.EnableJdbcHttpSession;

@SpringBootApplication
@EnableZuulProxy
@EnableOAuth2Sso
@EnableDiscoveryClient
@EnableJdbcHttpSession
public class GatewayServer {

	public static void main(String[] args) {
		SpringApplication.run(GatewayServer.class, args);
	}

	@Bean
	public DataSource dataSource() {
		return DataSourceBuilder.create().url("jdbc:mysql://192.168.99.100:33306/default?useSSL=false")
				.username("default").password("default").driverClassName("com.mysql.jdbc.Driver").build();
	}
}
