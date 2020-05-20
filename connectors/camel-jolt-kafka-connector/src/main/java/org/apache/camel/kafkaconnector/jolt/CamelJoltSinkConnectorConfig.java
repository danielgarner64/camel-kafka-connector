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
package org.apache.camel.kafkaconnector.jolt;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelJoltSinkConnectorConfig extends CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_JOLT_PATH_RESOURCE_URI_CONF = "camel.sink.path.resourceUri";
    public static final String CAMEL_SINK_JOLT_PATH_RESOURCE_URI_DOC = "Path to the resource. You can prefix with: classpath, file, http, ref, or bean. classpath, file and http loads the resource using these protocols (classpath is default). ref will lookup the resource in the registry. bean will call a method on a bean to be used as the resource. For bean you can specify the method name after dot, eg bean:myBean.myMethod.";
    public static final String CAMEL_SINK_JOLT_PATH_RESOURCE_URI_DEFAULT = null;
    public static final String CAMEL_SINK_JOLT_ENDPOINT_CONTENT_CACHE_CONF = "camel.sink.endpoint.contentCache";
    public static final String CAMEL_SINK_JOLT_ENDPOINT_CONTENT_CACHE_DOC = "Sets whether to use resource content cache or not";
    public static final Boolean CAMEL_SINK_JOLT_ENDPOINT_CONTENT_CACHE_DEFAULT = false;
    public static final String CAMEL_SINK_JOLT_ENDPOINT_INPUT_TYPE_CONF = "camel.sink.endpoint.inputType";
    public static final String CAMEL_SINK_JOLT_ENDPOINT_INPUT_TYPE_DOC = "Specifies if the input is hydrated JSON or a JSON String. One of: [Hydrated] [JsonString]";
    public static final String CAMEL_SINK_JOLT_ENDPOINT_INPUT_TYPE_DEFAULT = "Hydrated";
    public static final String CAMEL_SINK_JOLT_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_JOLT_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_JOLT_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_JOLT_ENDPOINT_OUTPUT_TYPE_CONF = "camel.sink.endpoint.outputType";
    public static final String CAMEL_SINK_JOLT_ENDPOINT_OUTPUT_TYPE_DOC = "Specifies if the output should be hydrated JSON or a JSON String. One of: [Hydrated] [JsonString]";
    public static final String CAMEL_SINK_JOLT_ENDPOINT_OUTPUT_TYPE_DEFAULT = "Hydrated";
    public static final String CAMEL_SINK_JOLT_ENDPOINT_TRANSFORM_DSL_CONF = "camel.sink.endpoint.transformDsl";
    public static final String CAMEL_SINK_JOLT_ENDPOINT_TRANSFORM_DSL_DOC = "Specifies the Transform DSL of the endpoint resource. If none is specified Chainr will be used. One of: [Chainr] [Shiftr] [Defaultr] [Removr] [Sortr]";
    public static final String CAMEL_SINK_JOLT_ENDPOINT_TRANSFORM_DSL_DEFAULT = "Chainr";
    public static final String CAMEL_SINK_JOLT_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.sink.endpoint.basicPropertyBinding";
    public static final String CAMEL_SINK_JOLT_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_JOLT_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_JOLT_ENDPOINT_SYNCHRONOUS_CONF = "camel.sink.endpoint.synchronous";
    public static final String CAMEL_SINK_JOLT_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SINK_JOLT_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SINK_JOLT_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.jolt.lazyStartProducer";
    public static final String CAMEL_SINK_JOLT_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_JOLT_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_JOLT_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.jolt.basicPropertyBinding";
    public static final String CAMEL_SINK_JOLT_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_JOLT_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_JOLT_COMPONENT_TRANSFORM_CONF = "camel.component.jolt.transform";
    public static final String CAMEL_SINK_JOLT_COMPONENT_TRANSFORM_DOC = "Explicitly sets the Transform to use. If not set a Transform specified by the transformDsl will be created";
    public static final String CAMEL_SINK_JOLT_COMPONENT_TRANSFORM_DEFAULT = null;

    public CamelJoltSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelJoltSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_JOLT_PATH_RESOURCE_URI_CONF, ConfigDef.Type.STRING, CAMEL_SINK_JOLT_PATH_RESOURCE_URI_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_JOLT_PATH_RESOURCE_URI_DOC);
        conf.define(CAMEL_SINK_JOLT_ENDPOINT_CONTENT_CACHE_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_JOLT_ENDPOINT_CONTENT_CACHE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JOLT_ENDPOINT_CONTENT_CACHE_DOC);
        conf.define(CAMEL_SINK_JOLT_ENDPOINT_INPUT_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_JOLT_ENDPOINT_INPUT_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JOLT_ENDPOINT_INPUT_TYPE_DOC);
        conf.define(CAMEL_SINK_JOLT_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_JOLT_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JOLT_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_JOLT_ENDPOINT_OUTPUT_TYPE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_JOLT_ENDPOINT_OUTPUT_TYPE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JOLT_ENDPOINT_OUTPUT_TYPE_DOC);
        conf.define(CAMEL_SINK_JOLT_ENDPOINT_TRANSFORM_DSL_CONF, ConfigDef.Type.STRING, CAMEL_SINK_JOLT_ENDPOINT_TRANSFORM_DSL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JOLT_ENDPOINT_TRANSFORM_DSL_DOC);
        conf.define(CAMEL_SINK_JOLT_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_JOLT_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JOLT_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_JOLT_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_JOLT_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JOLT_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SINK_JOLT_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_JOLT_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JOLT_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_JOLT_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_JOLT_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JOLT_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_JOLT_COMPONENT_TRANSFORM_CONF, ConfigDef.Type.STRING, CAMEL_SINK_JOLT_COMPONENT_TRANSFORM_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_JOLT_COMPONENT_TRANSFORM_DOC);
        return conf;
    }
}