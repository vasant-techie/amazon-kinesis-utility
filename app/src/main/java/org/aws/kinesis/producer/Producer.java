package org.aws.kinesis.producer;

import software.amazon.kinesis.producer.KinesisProducer;
import software.amazon.kinesis.producer.KinesisProducerConfiguration;

import java.nio.ByteBuffer;

public class Producer {
    public static void produce(String streamName, String partitionKey, String data) {

        KinesisProducerConfiguration config = new KinesisProducerConfiguration().setLogLevel("trace").setRegion("ap-south-1");

        KinesisProducer producer = new KinesisProducer(config);

        System.out.println("Adding record..");
        producer.addUserRecord(streamName, partitionKey, ByteBuffer.wrap(data.getBytes()));

        // Clean up
        producer.flushSync();
        producer.destroy();

        System.out.println("Completed!");
    }
}