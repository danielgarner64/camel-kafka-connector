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
package org.apache.camel.kafkaconnector.telegram;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelTelegramSinkConnectorConfig
        extends
            CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_TELEGRAM_PATH_TYPE_CONF = "camel.sink.path.type";
    public static final String CAMEL_SINK_TELEGRAM_PATH_TYPE_DOC = "The endpoint type. Currently, only the 'bots' type is supported. One of: [bots]";
    public static final String CAMEL_SINK_TELEGRAM_PATH_TYPE_DEFAULT = null;
    public static final String CAMEL_SINK_TELEGRAM_ENDPOINT_CHAT_ID_CONF = "camel.sink.endpoint.chatId";
    public static final String CAMEL_SINK_TELEGRAM_ENDPOINT_CHAT_ID_DOC = "The identifier of the chat that will receive the produced messages. Chat ids can be first obtained from incoming messages (eg. when a telegram user starts a conversation with a bot, its client sends automatically a '/start' message containing the chat id). It is an optional parameter, as the chat id can be set dynamically for each outgoing message (using body or headers).";
    public static final String CAMEL_SINK_TELEGRAM_ENDPOINT_CHAT_ID_DEFAULT = null;
    public static final String CAMEL_SINK_TELEGRAM_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_TELEGRAM_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_TELEGRAM_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_TELEGRAM_ENDPOINT_BASE_URI_CONF = "camel.sink.endpoint.baseUri";
    public static final String CAMEL_SINK_TELEGRAM_ENDPOINT_BASE_URI_DOC = "Can be used to set an alternative base URI, e.g. when you want to test the component against a mock Telegram API";
    public static final String CAMEL_SINK_TELEGRAM_ENDPOINT_BASE_URI_DEFAULT = null;
    public static final String CAMEL_SINK_TELEGRAM_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.sink.endpoint.basicPropertyBinding";
    public static final String CAMEL_SINK_TELEGRAM_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_TELEGRAM_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_TELEGRAM_ENDPOINT_BUFFER_SIZE_CONF = "camel.sink.endpoint.bufferSize";
    public static final String CAMEL_SINK_TELEGRAM_ENDPOINT_BUFFER_SIZE_DOC = "The initial in-memory buffer size used when transferring data between Camel and AHC Client.";
    public static final Integer CAMEL_SINK_TELEGRAM_ENDPOINT_BUFFER_SIZE_DEFAULT = 4096;
    public static final String CAMEL_SINK_TELEGRAM_ENDPOINT_CLIENT_CONFIG_CONF = "camel.sink.endpoint.clientConfig";
    public static final String CAMEL_SINK_TELEGRAM_ENDPOINT_CLIENT_CONFIG_DOC = "To configure the AsyncHttpClient to use a custom com.ning.http.client.AsyncHttpClientConfig instance.";
    public static final String CAMEL_SINK_TELEGRAM_ENDPOINT_CLIENT_CONFIG_DEFAULT = null;
    public static final String CAMEL_SINK_TELEGRAM_ENDPOINT_SYNCHRONOUS_CONF = "camel.sink.endpoint.synchronous";
    public static final String CAMEL_SINK_TELEGRAM_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SINK_TELEGRAM_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SINK_TELEGRAM_ENDPOINT_PROXY_HOST_CONF = "camel.sink.endpoint.proxyHost";
    public static final String CAMEL_SINK_TELEGRAM_ENDPOINT_PROXY_HOST_DOC = "HTTP proxy host which could be used when sending out the message.";
    public static final String CAMEL_SINK_TELEGRAM_ENDPOINT_PROXY_HOST_DEFAULT = null;
    public static final String CAMEL_SINK_TELEGRAM_ENDPOINT_PROXY_PORT_CONF = "camel.sink.endpoint.proxyPort";
    public static final String CAMEL_SINK_TELEGRAM_ENDPOINT_PROXY_PORT_DOC = "HTTP proxy port which could be used when sending out the message.";
    public static final String CAMEL_SINK_TELEGRAM_ENDPOINT_PROXY_PORT_DEFAULT = null;
    public static final String CAMEL_SINK_TELEGRAM_ENDPOINT_AUTHORIZATION_TOKEN_CONF = "camel.sink.endpoint.authorizationToken";
    public static final String CAMEL_SINK_TELEGRAM_ENDPOINT_AUTHORIZATION_TOKEN_DOC = "The authorization token for using the bot (ask the BotFather)";
    public static final String CAMEL_SINK_TELEGRAM_ENDPOINT_AUTHORIZATION_TOKEN_DEFAULT = null;
    public static final String CAMEL_SINK_TELEGRAM_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.telegram.lazyStartProducer";
    public static final String CAMEL_SINK_TELEGRAM_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_TELEGRAM_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_TELEGRAM_COMPONENT_BASE_URI_CONF = "camel.component.telegram.baseUri";
    public static final String CAMEL_SINK_TELEGRAM_COMPONENT_BASE_URI_DOC = "Can be used to set an alternative base URI, e.g. when you want to test the component against a mock Telegram API";
    public static final String CAMEL_SINK_TELEGRAM_COMPONENT_BASE_URI_DEFAULT = "https://api.telegram.org";
    public static final String CAMEL_SINK_TELEGRAM_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.telegram.basicPropertyBinding";
    public static final String CAMEL_SINK_TELEGRAM_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_TELEGRAM_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_TELEGRAM_COMPONENT_CLIENT_CONF = "camel.component.telegram.client";
    public static final String CAMEL_SINK_TELEGRAM_COMPONENT_CLIENT_DOC = "To use a custom AsyncHttpClient";
    public static final String CAMEL_SINK_TELEGRAM_COMPONENT_CLIENT_DEFAULT = null;
    public static final String CAMEL_SINK_TELEGRAM_COMPONENT_CLIENT_CONFIG_CONF = "camel.component.telegram.clientConfig";
    public static final String CAMEL_SINK_TELEGRAM_COMPONENT_CLIENT_CONFIG_DOC = "To configure the AsyncHttpClient to use a custom com.ning.http.client.AsyncHttpClientConfig instance.";
    public static final String CAMEL_SINK_TELEGRAM_COMPONENT_CLIENT_CONFIG_DEFAULT = null;
    public static final String CAMEL_SINK_TELEGRAM_COMPONENT_AUTHORIZATION_TOKEN_CONF = "camel.component.telegram.authorizationToken";
    public static final String CAMEL_SINK_TELEGRAM_COMPONENT_AUTHORIZATION_TOKEN_DOC = "The default Telegram authorization token to be used when the information is not provided in the endpoints.";
    public static final String CAMEL_SINK_TELEGRAM_COMPONENT_AUTHORIZATION_TOKEN_DEFAULT = null;

    public CamelTelegramSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelTelegramSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_TELEGRAM_PATH_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_TELEGRAM_PATH_TYPE_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_TELEGRAM_PATH_TYPE_DOC);
        conf.define(CAMEL_SINK_TELEGRAM_ENDPOINT_CHAT_ID_CONF, ConfigDef.Type.STRING, CAMEL_SINK_TELEGRAM_ENDPOINT_CHAT_ID_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_TELEGRAM_ENDPOINT_CHAT_ID_DOC);
        conf.define(CAMEL_SINK_TELEGRAM_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_TELEGRAM_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_TELEGRAM_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_TELEGRAM_ENDPOINT_BASE_URI_CONF, ConfigDef.Type.STRING, CAMEL_SINK_TELEGRAM_ENDPOINT_BASE_URI_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_TELEGRAM_ENDPOINT_BASE_URI_DOC);
        conf.define(CAMEL_SINK_TELEGRAM_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_TELEGRAM_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_TELEGRAM_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_TELEGRAM_ENDPOINT_BUFFER_SIZE_CONF, ConfigDef.Type.INT, CAMEL_SINK_TELEGRAM_ENDPOINT_BUFFER_SIZE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_TELEGRAM_ENDPOINT_BUFFER_SIZE_DOC);
        conf.define(CAMEL_SINK_TELEGRAM_ENDPOINT_CLIENT_CONFIG_CONF, ConfigDef.Type.STRING, CAMEL_SINK_TELEGRAM_ENDPOINT_CLIENT_CONFIG_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_TELEGRAM_ENDPOINT_CLIENT_CONFIG_DOC);
        conf.define(CAMEL_SINK_TELEGRAM_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_TELEGRAM_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_TELEGRAM_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SINK_TELEGRAM_ENDPOINT_PROXY_HOST_CONF, ConfigDef.Type.STRING, CAMEL_SINK_TELEGRAM_ENDPOINT_PROXY_HOST_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_TELEGRAM_ENDPOINT_PROXY_HOST_DOC);
        conf.define(CAMEL_SINK_TELEGRAM_ENDPOINT_PROXY_PORT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_TELEGRAM_ENDPOINT_PROXY_PORT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_TELEGRAM_ENDPOINT_PROXY_PORT_DOC);
        conf.define(CAMEL_SINK_TELEGRAM_ENDPOINT_AUTHORIZATION_TOKEN_CONF, ConfigDef.Type.STRING, CAMEL_SINK_TELEGRAM_ENDPOINT_AUTHORIZATION_TOKEN_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_TELEGRAM_ENDPOINT_AUTHORIZATION_TOKEN_DOC);
        conf.define(CAMEL_SINK_TELEGRAM_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_TELEGRAM_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_TELEGRAM_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_TELEGRAM_COMPONENT_BASE_URI_CONF, ConfigDef.Type.STRING, CAMEL_SINK_TELEGRAM_COMPONENT_BASE_URI_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_TELEGRAM_COMPONENT_BASE_URI_DOC);
        conf.define(CAMEL_SINK_TELEGRAM_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_TELEGRAM_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_TELEGRAM_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_TELEGRAM_COMPONENT_CLIENT_CONF, ConfigDef.Type.STRING, CAMEL_SINK_TELEGRAM_COMPONENT_CLIENT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_TELEGRAM_COMPONENT_CLIENT_DOC);
        conf.define(CAMEL_SINK_TELEGRAM_COMPONENT_CLIENT_CONFIG_CONF, ConfigDef.Type.STRING, CAMEL_SINK_TELEGRAM_COMPONENT_CLIENT_CONFIG_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_TELEGRAM_COMPONENT_CLIENT_CONFIG_DOC);
        conf.define(CAMEL_SINK_TELEGRAM_COMPONENT_AUTHORIZATION_TOKEN_CONF, ConfigDef.Type.STRING, CAMEL_SINK_TELEGRAM_COMPONENT_AUTHORIZATION_TOKEN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_TELEGRAM_COMPONENT_AUTHORIZATION_TOKEN_DOC);
        return conf;
    }
}