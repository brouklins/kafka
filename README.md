Instalar o kafka local
https://www.apache.org/dyn/closer.cgi?path=/kafka/3.2.0/kafka_2.13-3.2.0.tgz

Necessário Java8+ instalado

Configurar o zookeeper, rodar esse comando no terminal no diretorio do kafka

bin/zookeeper-server-start.sh config/zookeeper.properties

No windows: .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

Criando um Kafka broker (producer)

bin/kafka-server-start.sh config/server.properties

No windows: .\bin\windows\kafka-server-start.bat .\config\server.properties

Criando um tópico consumer (leitor de eventos), lembrando que o nome do tópico no comando deve ser do tópico que queremos consumir a mensagem (producer)

bin/kafka-console-consumer.sh --topic prevTopic --from-beginning --bootstrap-server localhost:9092

No windows: .\bin\windows\kafka-console-consumer.bat --topic prevTopic --from-beginning --bootstrap-server localhost:9092


