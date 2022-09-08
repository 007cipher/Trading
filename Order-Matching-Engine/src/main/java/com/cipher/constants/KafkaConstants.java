package com.cipher.constants;

public interface KafkaConstants {

    String BOOTSTRAP_SERVER = "127.0.0.1:9092";
    String GROUP_ID = "matchingEngine";

    /**
     * Kafka topics
     */
    String ORDER_CONSUMER = "order";
    String PROCESSED_ORDER_PRODUCER = "processedOrder";
    String TRADE_PRODUCER = "trade";
}
