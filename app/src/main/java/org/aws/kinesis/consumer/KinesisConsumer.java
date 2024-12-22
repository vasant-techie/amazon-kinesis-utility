package org.aws.kinesis.consumer;

import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import software.amazon.kinesis.common.*;
import software.amazon.kinesis.processor.*;
import software.amazon.kinesis.coordinator.*;
import software.amazon.kinesis.lifecycle.*;
import software.amazon.kinesis.retrieval.*;

public class KinesisConsumer {
    /*
    public static void main(String[] args) {
        KinesisClientLibConfiguration config = new KinesisClientLibConfiguration(
                "ApplicationName",
                "StreamName",
                new DefaultAWSCredentialsProviderChain(),
                "WorkerId");

        config.withRegionName("us-east-1");

        Worker worker = new Worker.Builder()
                .recordProcessorFactory(() -> new RecordProcessor())
                .config(config)
                .build();

        worker.run();
    }

    static class RecordProcessor implements ShardRecordProcessor {
        @Override
        public void initialize(InitializationInput initializationInput) {}

        @Override
        public void processRecords(ProcessRecordsInput processRecordsInput) {
            processRecordsInput.records().forEach(record -> {
                System.out.println(new String(record.data().array()));
            });
        }

        @Override
        public void shutdown(ShutdownInput shutdownInput) {}
    }

     */
}