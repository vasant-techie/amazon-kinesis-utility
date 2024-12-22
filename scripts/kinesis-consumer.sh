#!/bin/bash

STREAM_NAME="MyKDataStream"
SHARD_ID="shardId-000000000000"
REGION="ap-south-1"

# Get the initial shard iterator
SHARD_ITERATOR=$(aws kinesis get-shard-iterator \
    --stream-name $STREAM_NAME \
    --shard-id $SHARD_ID \
    --shard-iterator-type LATEST \
    --region $REGION \
    --query 'ShardIterator' --output text)

# Loop to fetch records
while [ "$SHARD_ITERATOR" != "null" ]; do
    RESPONSE=$(aws kinesis get-records --shard-iterator $SHARD_ITERATOR --region $REGION)
    SHARD_ITERATOR=$(echo $RESPONSE | jq -r '.NextShardIterator')
    echo $RESPONSE | jq -r '.Records[].Data' | base64 --decode
    sleep 1
done