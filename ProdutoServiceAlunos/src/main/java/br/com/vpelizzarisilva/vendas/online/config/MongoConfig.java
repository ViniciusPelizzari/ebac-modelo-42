/**
 * 
 */
package br.com.vpelizzarisilva.vendas.online.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * @author Vinícius Pelizzari
 *
 */
@Configuration
@EnableMongoRepositories(basePackages = "br.com.rpires.vendas.online.repository")
public class MongoConfig {

}
