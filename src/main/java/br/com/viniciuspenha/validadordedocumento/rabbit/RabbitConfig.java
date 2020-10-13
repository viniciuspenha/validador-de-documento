package br.com.viniciuspenha.validadordedocumento.rabbit;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.amqp.core.Queue;

@Configuration
public class RabbitConfig {

    @Value("${validacao.queue}")
    private String validacaoQueue;

    @Bean
    public Queue queue() {
        return new Queue(validacaoQueue, true);
    }
}