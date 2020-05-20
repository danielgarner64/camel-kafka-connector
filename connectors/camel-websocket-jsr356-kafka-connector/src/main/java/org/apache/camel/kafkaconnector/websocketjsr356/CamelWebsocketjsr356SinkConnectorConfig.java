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
package org.apache.camel.kafkaconnector.websocketjsr356;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelWebsocketjsr356SinkConnectorConfig
        extends
            CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_WEBSOCKETJSR356_PATH_URI_CONF = "camel.sink.path.uri";
    public static final String CAMEL_SINK_WEBSOCKETJSR356_PATH_URI_DOC = "If a schemeless URI path is provided, a ServerEndpoint is deployed under that path. Else if the URI is prefixed with the 'ws://' scheme, then a connection is established to the corresponding server";
    public static final String CAMEL_SINK_WEBSOCKETJSR356_PATH_URI_DEFAULT = null;
    public static final String CAMEL_SINK_WEBSOCKETJSR356_ENDPOINT_SESSION_COUNT_CONF = "camel.sink.endpoint.sessionCount";
    public static final String CAMEL_SINK_WEBSOCKETJSR356_ENDPOINT_SESSION_COUNT_DOC = "Used when the endpoint is in client mode to populate a pool of sessions";
    public static final Integer CAMEL_SINK_WEBSOCKETJSR356_ENDPOINT_SESSION_COUNT_DEFAULT = 1;
    public static final String CAMEL_SINK_WEBSOCKETJSR356_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_WEBSOCKETJSR356_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_WEBSOCKETJSR356_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_WEBSOCKETJSR356_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.sink.endpoint.basicPropertyBinding";
    public static final String CAMEL_SINK_WEBSOCKETJSR356_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_WEBSOCKETJSR356_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_WEBSOCKETJSR356_ENDPOINT_SYNCHRONOUS_CONF = "camel.sink.endpoint.synchronous";
    public static final String CAMEL_SINK_WEBSOCKETJSR356_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SINK_WEBSOCKETJSR356_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SINK_WEBSOCKETJSR356_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.websocket-jsr356.lazyStartProducer";
    public static final String CAMEL_SINK_WEBSOCKETJSR356_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_WEBSOCKETJSR356_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_WEBSOCKETJSR356_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.websocket-jsr356.basicPropertyBinding";
    public static final String CAMEL_SINK_WEBSOCKETJSR356_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_WEBSOCKETJSR356_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_WEBSOCKETJSR356_COMPONENT_SERVER_ENDPOINT_DEPLOYMENT_STRATEGY_CONF = "camel.component.websocket-jsr356.serverEndpointDeploymentStrategy";
    public static final String CAMEL_SINK_WEBSOCKETJSR356_COMPONENT_SERVER_ENDPOINT_DEPLOYMENT_STRATEGY_DOC = "To enable customization of how a WebSocket ServerEndpoint is configured and deployed. By default DefaultServerEndpointDeploymentStrategy is used.";
    public static final String CAMEL_SINK_WEBSOCKETJSR356_COMPONENT_SERVER_ENDPOINT_DEPLOYMENT_STRATEGY_DEFAULT = null;

    public CamelWebsocketjsr356SinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelWebsocketjsr356SinkConnectorConfig(
            Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_WEBSOCKETJSR356_PATH_URI_CONF, ConfigDef.Type.STRING, CAMEL_SINK_WEBSOCKETJSR356_PATH_URI_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_WEBSOCKETJSR356_PATH_URI_DOC);
        conf.define(CAMEL_SINK_WEBSOCKETJSR356_ENDPOINT_SESSION_COUNT_CONF, ConfigDef.Type.INT, CAMEL_SINK_WEBSOCKETJSR356_ENDPOINT_SESSION_COUNT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_WEBSOCKETJSR356_ENDPOINT_SESSION_COUNT_DOC);
        conf.define(CAMEL_SINK_WEBSOCKETJSR356_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_WEBSOCKETJSR356_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_WEBSOCKETJSR356_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_WEBSOCKETJSR356_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_WEBSOCKETJSR356_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_WEBSOCKETJSR356_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_WEBSOCKETJSR356_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_WEBSOCKETJSR356_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_WEBSOCKETJSR356_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SINK_WEBSOCKETJSR356_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_WEBSOCKETJSR356_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_WEBSOCKETJSR356_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_WEBSOCKETJSR356_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_WEBSOCKETJSR356_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_WEBSOCKETJSR356_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_WEBSOCKETJSR356_COMPONENT_SERVER_ENDPOINT_DEPLOYMENT_STRATEGY_CONF, ConfigDef.Type.STRING, CAMEL_SINK_WEBSOCKETJSR356_COMPONENT_SERVER_ENDPOINT_DEPLOYMENT_STRATEGY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_WEBSOCKETJSR356_COMPONENT_SERVER_ENDPOINT_DEPLOYMENT_STRATEGY_DOC);
        return conf;
    }
}