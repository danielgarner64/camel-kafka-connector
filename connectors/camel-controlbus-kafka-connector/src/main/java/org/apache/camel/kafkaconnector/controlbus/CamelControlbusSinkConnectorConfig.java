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
package org.apache.camel.kafkaconnector.controlbus;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelControlbusSinkConnectorConfig
        extends
            CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_CONTROLBUS_PATH_COMMAND_CONF = "camel.sink.path.command";
    public static final String CAMEL_SINK_CONTROLBUS_PATH_COMMAND_DOC = "Command can be either route or language One of: [route] [language]";
    public static final String CAMEL_SINK_CONTROLBUS_PATH_COMMAND_DEFAULT = null;
    public static final String CAMEL_SINK_CONTROLBUS_PATH_LANGUAGE_CONF = "camel.sink.path.language";
    public static final String CAMEL_SINK_CONTROLBUS_PATH_LANGUAGE_DOC = "Allows you to specify the name of a Language to use for evaluating the message body. If there is any result from the evaluation, then the result is put in the message body. One of: [bean] [constant] [el] [exchangeProperty] [file] [groovy] [header] [jsonpath] [mvel] [ognl] [ref] [simple] [spel] [sql] [terser] [tokenize] [xpath] [xquery] [xtokenize]";
    public static final String CAMEL_SINK_CONTROLBUS_PATH_LANGUAGE_DEFAULT = null;
    public static final String CAMEL_SINK_CONTROLBUS_ENDPOINT_ACTION_CONF = "camel.sink.endpoint.action";
    public static final String CAMEL_SINK_CONTROLBUS_ENDPOINT_ACTION_DOC = "To denote an action that can be either: start, stop, or status. To either start or stop a route, or to get the status of the route as output in the message body. You can use suspend and resume from Camel 2.11.1 onwards to either suspend or resume a route. And from Camel 2.11.1 onwards you can use stats to get performance statics returned in XML format; the routeId option can be used to define which route to get the performance stats for, if routeId is not defined, then you get statistics for the entire CamelContext. The restart action will restart the route. One of: [start] [stop] [suspend] [resume] [restart] [status] [stats]";
    public static final String CAMEL_SINK_CONTROLBUS_ENDPOINT_ACTION_DEFAULT = null;
    public static final String CAMEL_SINK_CONTROLBUS_ENDPOINT_ASYNC_CONF = "camel.sink.endpoint.async";
    public static final String CAMEL_SINK_CONTROLBUS_ENDPOINT_ASYNC_DOC = "Whether to execute the control bus task asynchronously. Important: If this option is enabled, then any result from the task is not set on the Exchange. This is only possible if executing tasks synchronously.";
    public static final Boolean CAMEL_SINK_CONTROLBUS_ENDPOINT_ASYNC_DEFAULT = false;
    public static final String CAMEL_SINK_CONTROLBUS_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_CONTROLBUS_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_CONTROLBUS_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_CONTROLBUS_ENDPOINT_LOGGING_LEVEL_CONF = "camel.sink.endpoint.loggingLevel";
    public static final String CAMEL_SINK_CONTROLBUS_ENDPOINT_LOGGING_LEVEL_DOC = "Logging level used for logging when task is done, or if any exceptions occurred during processing the task. One of: [TRACE] [DEBUG] [INFO] [WARN] [ERROR] [OFF]";
    public static final String CAMEL_SINK_CONTROLBUS_ENDPOINT_LOGGING_LEVEL_DEFAULT = "INFO";
    public static final String CAMEL_SINK_CONTROLBUS_ENDPOINT_RESTART_DELAY_CONF = "camel.sink.endpoint.restartDelay";
    public static final String CAMEL_SINK_CONTROLBUS_ENDPOINT_RESTART_DELAY_DOC = "The delay in millis to use when restarting a route.";
    public static final Integer CAMEL_SINK_CONTROLBUS_ENDPOINT_RESTART_DELAY_DEFAULT = 1000;
    public static final String CAMEL_SINK_CONTROLBUS_ENDPOINT_ROUTE_ID_CONF = "camel.sink.endpoint.routeId";
    public static final String CAMEL_SINK_CONTROLBUS_ENDPOINT_ROUTE_ID_DOC = "To specify a route by its id. The special keyword current indicates the current route.";
    public static final String CAMEL_SINK_CONTROLBUS_ENDPOINT_ROUTE_ID_DEFAULT = null;
    public static final String CAMEL_SINK_CONTROLBUS_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.sink.endpoint.basicPropertyBinding";
    public static final String CAMEL_SINK_CONTROLBUS_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_CONTROLBUS_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_CONTROLBUS_ENDPOINT_SYNCHRONOUS_CONF = "camel.sink.endpoint.synchronous";
    public static final String CAMEL_SINK_CONTROLBUS_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SINK_CONTROLBUS_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SINK_CONTROLBUS_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.controlbus.lazyStartProducer";
    public static final String CAMEL_SINK_CONTROLBUS_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_CONTROLBUS_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_CONTROLBUS_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.controlbus.basicPropertyBinding";
    public static final String CAMEL_SINK_CONTROLBUS_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_CONTROLBUS_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;

    public CamelControlbusSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelControlbusSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_CONTROLBUS_PATH_COMMAND_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CONTROLBUS_PATH_COMMAND_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_CONTROLBUS_PATH_COMMAND_DOC);
        conf.define(CAMEL_SINK_CONTROLBUS_PATH_LANGUAGE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CONTROLBUS_PATH_LANGUAGE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CONTROLBUS_PATH_LANGUAGE_DOC);
        conf.define(CAMEL_SINK_CONTROLBUS_ENDPOINT_ACTION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CONTROLBUS_ENDPOINT_ACTION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CONTROLBUS_ENDPOINT_ACTION_DOC);
        conf.define(CAMEL_SINK_CONTROLBUS_ENDPOINT_ASYNC_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_CONTROLBUS_ENDPOINT_ASYNC_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CONTROLBUS_ENDPOINT_ASYNC_DOC);
        conf.define(CAMEL_SINK_CONTROLBUS_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_CONTROLBUS_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CONTROLBUS_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_CONTROLBUS_ENDPOINT_LOGGING_LEVEL_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CONTROLBUS_ENDPOINT_LOGGING_LEVEL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CONTROLBUS_ENDPOINT_LOGGING_LEVEL_DOC);
        conf.define(CAMEL_SINK_CONTROLBUS_ENDPOINT_RESTART_DELAY_CONF, ConfigDef.Type.INT, CAMEL_SINK_CONTROLBUS_ENDPOINT_RESTART_DELAY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CONTROLBUS_ENDPOINT_RESTART_DELAY_DOC);
        conf.define(CAMEL_SINK_CONTROLBUS_ENDPOINT_ROUTE_ID_CONF, ConfigDef.Type.STRING, CAMEL_SINK_CONTROLBUS_ENDPOINT_ROUTE_ID_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CONTROLBUS_ENDPOINT_ROUTE_ID_DOC);
        conf.define(CAMEL_SINK_CONTROLBUS_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_CONTROLBUS_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CONTROLBUS_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_CONTROLBUS_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_CONTROLBUS_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CONTROLBUS_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SINK_CONTROLBUS_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_CONTROLBUS_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CONTROLBUS_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_CONTROLBUS_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_CONTROLBUS_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_CONTROLBUS_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        return conf;
    }
}