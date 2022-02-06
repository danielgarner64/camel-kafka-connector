/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.kafkaconnector.googlepubsub;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelGooglepubsubSinkConnectorConfig
        extends
            CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_GOOGLEPUBSUB_PATH_PROJECT_ID_CONF = "camel.sink.path.projectId";
    public static final String CAMEL_SINK_GOOGLEPUBSUB_PATH_PROJECT_ID_DOC = "The Google Cloud PubSub Project Id";
    public static final String CAMEL_SINK_GOOGLEPUBSUB_PATH_PROJECT_ID_DEFAULT = null;
    public static final String CAMEL_SINK_GOOGLEPUBSUB_PATH_DESTINATION_NAME_CONF = "camel.sink.path.destinationName";
    public static final String CAMEL_SINK_GOOGLEPUBSUB_PATH_DESTINATION_NAME_DOC = "The Destination Name. For the consumer this will be the subscription name, while for the producer this will be the topic name.";
    public static final String CAMEL_SINK_GOOGLEPUBSUB_PATH_DESTINATION_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_LOGGER_ID_CONF = "camel.sink.endpoint.loggerId";
    public static final String CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_LOGGER_ID_DOC = "Logger ID to use when a match to the parent route required";
    public static final String CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_LOGGER_ID_DEFAULT = null;
    public static final String CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_SERVICE_ACCOUNT_KEY_CONF = "camel.sink.endpoint.serviceAccountKey";
    public static final String CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_SERVICE_ACCOUNT_KEY_DOC = "The Service account key that can be used as credentials for the PubSub publisher/subscriber. It can be loaded by default from classpath, but you can prefix with classpath:, file:, or http: to load the resource from different systems.";
    public static final String CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_SERVICE_ACCOUNT_KEY_DEFAULT = null;
    public static final String CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_MESSAGE_ORDERING_ENABLED_CONF = "camel.sink.endpoint.messageOrderingEnabled";
    public static final String CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_MESSAGE_ORDERING_ENABLED_DOC = "Should message ordering be enabled";
    public static final Boolean CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_MESSAGE_ORDERING_ENABLED_DEFAULT = false;
    public static final String CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_PUBSUB_ENDPOINT_CONF = "camel.sink.endpoint.pubsubEndpoint";
    public static final String CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_PUBSUB_ENDPOINT_DOC = "Pub/Sub endpoint to use. Required when using message ordering, and ensures that messages are received in order even when multiple publishers are used";
    public static final String CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_PUBSUB_ENDPOINT_DEFAULT = null;
    public static final String CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_SERIALIZER_CONF = "camel.sink.endpoint.serializer";
    public static final String CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_SERIALIZER_DOC = "A custom GooglePubsubSerializer to use for serializing message payloads in the producer";
    public static final String CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_SERIALIZER_DEFAULT = null;
    public static final String CAMEL_SINK_GOOGLEPUBSUB_COMPONENT_ENDPOINT_CONF = "camel.component.google-pubsub.endpoint";
    public static final String CAMEL_SINK_GOOGLEPUBSUB_COMPONENT_ENDPOINT_DOC = "Endpoint to use with local Pub/Sub emulator.";
    public static final String CAMEL_SINK_GOOGLEPUBSUB_COMPONENT_ENDPOINT_DEFAULT = null;
    public static final String CAMEL_SINK_GOOGLEPUBSUB_COMPONENT_SERVICE_ACCOUNT_KEY_CONF = "camel.component.google-pubsub.serviceAccountKey";
    public static final String CAMEL_SINK_GOOGLEPUBSUB_COMPONENT_SERVICE_ACCOUNT_KEY_DOC = "The Service account key that can be used as credentials for the PubSub publisher/subscriber. It can be loaded by default from classpath, but you can prefix with classpath:, file:, or http: to load the resource from different systems.";
    public static final String CAMEL_SINK_GOOGLEPUBSUB_COMPONENT_SERVICE_ACCOUNT_KEY_DEFAULT = null;
    public static final String CAMEL_SINK_GOOGLEPUBSUB_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.google-pubsub.lazyStartProducer";
    public static final String CAMEL_SINK_GOOGLEPUBSUB_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_GOOGLEPUBSUB_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_GOOGLEPUBSUB_COMPONENT_PUBLISHER_CACHE_SIZE_CONF = "camel.component.google-pubsub.publisherCacheSize";
    public static final String CAMEL_SINK_GOOGLEPUBSUB_COMPONENT_PUBLISHER_CACHE_SIZE_DOC = "Maximum number of producers to cache. This could be increased if you have producers for lots of different topics.";
    public static final Integer CAMEL_SINK_GOOGLEPUBSUB_COMPONENT_PUBLISHER_CACHE_SIZE_DEFAULT = null;
    public static final String CAMEL_SINK_GOOGLEPUBSUB_COMPONENT_PUBLISHER_CACHE_TIMEOUT_CONF = "camel.component.google-pubsub.publisherCacheTimeout";
    public static final String CAMEL_SINK_GOOGLEPUBSUB_COMPONENT_PUBLISHER_CACHE_TIMEOUT_DOC = "How many milliseconds should each producer stay alive in the cache.";
    public static final Integer CAMEL_SINK_GOOGLEPUBSUB_COMPONENT_PUBLISHER_CACHE_TIMEOUT_DEFAULT = null;
    public static final String CAMEL_SINK_GOOGLEPUBSUB_COMPONENT_AUTOWIRED_ENABLED_CONF = "camel.component.google-pubsub.autowiredEnabled";
    public static final String CAMEL_SINK_GOOGLEPUBSUB_COMPONENT_AUTOWIRED_ENABLED_DOC = "Whether autowiring is enabled. This is used for automatic autowiring options (the option must be marked as autowired) by looking up in the registry to find if there is a single instance of matching type, which then gets configured on the component. This can be used for automatic configuring JDBC data sources, JMS connection factories, AWS Clients, etc.";
    public static final Boolean CAMEL_SINK_GOOGLEPUBSUB_COMPONENT_AUTOWIRED_ENABLED_DEFAULT = true;
    public static final String CAMEL_SINK_GOOGLEPUBSUB_COMPONENT_PUBLISHER_TERMINATION_TIMEOUT_CONF = "camel.component.google-pubsub.publisherTerminationTimeout";
    public static final String CAMEL_SINK_GOOGLEPUBSUB_COMPONENT_PUBLISHER_TERMINATION_TIMEOUT_DOC = "How many milliseconds should a producer be allowed to terminate.";
    public static final Integer CAMEL_SINK_GOOGLEPUBSUB_COMPONENT_PUBLISHER_TERMINATION_TIMEOUT_DEFAULT = null;

    public CamelGooglepubsubSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelGooglepubsubSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_GOOGLEPUBSUB_PATH_PROJECT_ID_CONF, ConfigDef.Type.STRING, CAMEL_SINK_GOOGLEPUBSUB_PATH_PROJECT_ID_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_GOOGLEPUBSUB_PATH_PROJECT_ID_DOC);
        conf.define(CAMEL_SINK_GOOGLEPUBSUB_PATH_DESTINATION_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_GOOGLEPUBSUB_PATH_DESTINATION_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_GOOGLEPUBSUB_PATH_DESTINATION_NAME_DOC);
        conf.define(CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_LOGGER_ID_CONF, ConfigDef.Type.STRING, CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_LOGGER_ID_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_LOGGER_ID_DOC);
        conf.define(CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_SERVICE_ACCOUNT_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_SERVICE_ACCOUNT_KEY_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_SERVICE_ACCOUNT_KEY_DOC);
        conf.define(CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_MESSAGE_ORDERING_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_MESSAGE_ORDERING_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_MESSAGE_ORDERING_ENABLED_DOC);
        conf.define(CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_PUBSUB_ENDPOINT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_PUBSUB_ENDPOINT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_PUBSUB_ENDPOINT_DOC);
        conf.define(CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_SERIALIZER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_SERIALIZER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_GOOGLEPUBSUB_ENDPOINT_SERIALIZER_DOC);
        conf.define(CAMEL_SINK_GOOGLEPUBSUB_COMPONENT_ENDPOINT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_GOOGLEPUBSUB_COMPONENT_ENDPOINT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_GOOGLEPUBSUB_COMPONENT_ENDPOINT_DOC);
        conf.define(CAMEL_SINK_GOOGLEPUBSUB_COMPONENT_SERVICE_ACCOUNT_KEY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_GOOGLEPUBSUB_COMPONENT_SERVICE_ACCOUNT_KEY_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_GOOGLEPUBSUB_COMPONENT_SERVICE_ACCOUNT_KEY_DOC);
        conf.define(CAMEL_SINK_GOOGLEPUBSUB_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_GOOGLEPUBSUB_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_GOOGLEPUBSUB_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_GOOGLEPUBSUB_COMPONENT_PUBLISHER_CACHE_SIZE_CONF, ConfigDef.Type.INT, CAMEL_SINK_GOOGLEPUBSUB_COMPONENT_PUBLISHER_CACHE_SIZE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_GOOGLEPUBSUB_COMPONENT_PUBLISHER_CACHE_SIZE_DOC);
        conf.define(CAMEL_SINK_GOOGLEPUBSUB_COMPONENT_PUBLISHER_CACHE_TIMEOUT_CONF, ConfigDef.Type.INT, CAMEL_SINK_GOOGLEPUBSUB_COMPONENT_PUBLISHER_CACHE_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_GOOGLEPUBSUB_COMPONENT_PUBLISHER_CACHE_TIMEOUT_DOC);
        conf.define(CAMEL_SINK_GOOGLEPUBSUB_COMPONENT_AUTOWIRED_ENABLED_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_GOOGLEPUBSUB_COMPONENT_AUTOWIRED_ENABLED_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_GOOGLEPUBSUB_COMPONENT_AUTOWIRED_ENABLED_DOC);
        conf.define(CAMEL_SINK_GOOGLEPUBSUB_COMPONENT_PUBLISHER_TERMINATION_TIMEOUT_CONF, ConfigDef.Type.INT, CAMEL_SINK_GOOGLEPUBSUB_COMPONENT_PUBLISHER_TERMINATION_TIMEOUT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_GOOGLEPUBSUB_COMPONENT_PUBLISHER_TERMINATION_TIMEOUT_DOC);
        return conf;
    }
}