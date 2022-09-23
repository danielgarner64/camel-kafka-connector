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
package org.apache.camel.kafkaconnector.beersource;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelBeersourceSourceConnectorConfig
        extends
            CamelSourceConnectorConfig {

    public static final String CAMEL_SOURCE_BEERSOURCE_KAMELET_PERIOD_CONF = "camel.kamelet.beer-source.period";
    public static final String CAMEL_SOURCE_BEERSOURCE_KAMELET_PERIOD_DOC = "The time interval between two events";
    public static final Integer CAMEL_SOURCE_BEERSOURCE_KAMELET_PERIOD_DEFAULT = 5000;

    public CamelBeersourceSourceConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelBeersourceSourceConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSourceConnectorConfig.conf());
        conf.define(CAMEL_SOURCE_BEERSOURCE_KAMELET_PERIOD_CONF, ConfigDef.Type.INT, CAMEL_SOURCE_BEERSOURCE_KAMELET_PERIOD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_BEERSOURCE_KAMELET_PERIOD_DOC);
        return conf;
    }
}