# amazon-kinesis-utility
A standalone utility to produce messages to Kinesis Data Stream

**CLI Command to put one record**

aws kinesis put-record --stream-name MyKDataStream --partition-key partition-1 --data "Hello, Kinesis" --region ap-south-1
