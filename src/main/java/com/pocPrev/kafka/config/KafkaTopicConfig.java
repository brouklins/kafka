package com.pocPrev.kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Value("${prev.topic2}")
    private String prevTopic;

    //configuração do topico
    @Bean
    public NewTopic prevTopic() {
        return TopicBuilder.name("prevTopic")
                .build();
    }

    @Bean
    public NewTopic topicE() {
        return TopicBuilder.name(prevTopic)
                .build();
    }
}
