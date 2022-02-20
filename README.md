# apache-kafka-producer-demo

c:/kafka>

Zookeeper Starter:
          .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

Kafka Starter:
       .\bin\windows\kafka-server-start.bat .\config\server.properties

KafKaTopic
        .\bin\windows\kafka-topics.bat --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic test

Kafka Topic List:
         .\bin\windows\kafka-topics.bat --list --bootstrap-server localhost:9092

Kafka Console producer:
           .\bin\windows\kafka-console-producer.bat --broker-list localhost:9092 --topic test

Kafka Console Consumer:
          .\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic test --from-beginning
