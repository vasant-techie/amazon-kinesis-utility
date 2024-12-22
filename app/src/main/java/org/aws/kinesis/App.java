package org.aws.kinesis;

import org.aws.kinesis.producer.Producer;

public class App {
    public static void main(String[] args) {
        System.out.println("Amazon Kinesis App!");
        // Send data to the stream
        String streamName = "My1stKinesisDataStream";
        String partitionKey = "2";
        String data = "வணக்கம்";
        Producer.produce(streamName, partitionKey, data);
    }
}
