package topics;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    //Configura os tópicos que vamos receber a mensagem
    @KafkaListener(
            topics = "prevTopic",
            groupId = "groupId"
    )
    void listener(String data){
        // print para ver se está recebendo a mensagem
        System.out.println("Listener recebido: " + data);

    }
}
