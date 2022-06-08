package com.pocPrev.kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    //configuração do topico
    @Bean
    public NewTopic prevTopic() {
        return TopicBuilder.name("prevTopic")
                .build();
    }

    @Bean
    public NewTopic prevTopic2() {
        return TopicBuilder.name("prevTopic2")
                .build();
    }
}
