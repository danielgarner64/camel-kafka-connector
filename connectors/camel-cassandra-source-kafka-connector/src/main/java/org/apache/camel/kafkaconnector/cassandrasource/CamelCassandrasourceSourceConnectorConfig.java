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
package org.apache.camel.kafkaconnector.cassandrasource;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelCassandrasourceSourceConnectorConfig
        extends
            CamelSourceConnectorConfig {

    public static final String CAMEL_SOURCE_CASSANDRASOURCE_KAMELET_CONNECTION_HOST_CONF = "camel.kamelet.cassandra-source.connectionHost";
    public static final String CAMEL_SOURCE_CASSANDRASOURCE_KAMELET_CONNECTION_HOST_DOC = "Hostname(s) cassandra server(s). Multiple hosts can be separated by comma. Example: localhost";
    public static final String CAMEL_SOURCE_CASSANDRASOURCE_KAMELET_CONNECTION_HOST_DEFAULT = null;
    public static final String CAMEL_SOURCE_CASSANDRASOURCE_KAMELET_CONNECTION_PORT_CONF = "camel.kamelet.cassandra-source.connectionPort";
    public static final String CAMEL_SOURCE_CASSANDRASOURCE_KAMELET_CONNECTION_PORT_DOC = "Port number of cassandra server(s) Example: 9042";
    public static final String CAMEL_SOURCE_CASSANDRASOURCE_KAMELET_CONNECTION_PORT_DEFAULT = null;
    public static final String CAMEL_SOURCE_CASSANDRASOURCE_KAMELET_KEYSPACE_CONF = "camel.kamelet.cassandra-source.keyspace";
    public static final String CAMEL_SOURCE_CASSANDRASOURCE_KAMELET_KEYSPACE_DOC = "Keyspace to use Example: customers";
    public static final String CAMEL_SOURCE_CASSANDRASOURCE_KAMELET_KEYSPACE_DEFAULT = null;
    public static final String CAMEL_SOURCE_CASSANDRASOURCE_KAMELET_USERNAME_CONF = "camel.kamelet.cassandra-source.username";
    public static final String CAMEL_SOURCE_CASSANDRASOURCE_KAMELET_USERNAME_DOC = "The username to use for accessing a secured Cassandra Cluster";
    public static final String CAMEL_SOURCE_CASSANDRASOURCE_KAMELET_USERNAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_CASSANDRASOURCE_KAMELET_PASSWORD_CONF = "camel.kamelet.cassandra-source.password";
    public static final String CAMEL_SOURCE_CASSANDRASOURCE_KAMELET_PASSWORD_DOC = "The password to use for accessing a secured Cassandra Cluster";
    public static final String CAMEL_SOURCE_CASSANDRASOURCE_KAMELET_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SOURCE_CASSANDRASOURCE_KAMELET_RESULT_STRATEGY_CONF = "camel.kamelet.cassandra-source.resultStrategy";
    public static final String CAMEL_SOURCE_CASSANDRASOURCE_KAMELET_RESULT_STRATEGY_DOC = "The strategy to convert the result set of the query. Possible values are ALL, ONE, LIMIT_10, LIMIT_100...";
    public static final String CAMEL_SOURCE_CASSANDRASOURCE_KAMELET_RESULT_STRATEGY_DEFAULT = "ALL";
    public static final String CAMEL_SOURCE_CASSANDRASOURCE_KAMELET_CONSISTENCY_LEVEL_CONF = "camel.kamelet.cassandra-source.consistencyLevel";
    public static final String CAMEL_SOURCE_CASSANDRASOURCE_KAMELET_CONSISTENCY_LEVEL_DOC = "Consistency level to use. The value can be one of ANY, ONE, TWO, THREE, QUORUM, ALL, LOCAL_QUORUM, EACH_QUORUM, SERIAL, LOCAL_SERIAL, LOCAL_ONE";
    public static final String CAMEL_SOURCE_CASSANDRASOURCE_KAMELET_CONSISTENCY_LEVEL_DEFAULT = "ANY";
    public static final String CAMEL_SOURCE_CASSANDRASOURCE_KAMELET_QUERY_CONF = "camel.kamelet.cassandra-source.query";
    public static final String CAMEL_SOURCE_CASSANDRASOURCE_KAMELET_QUERY_DOC = "The query to execute against the Cassandra cluster table";
    public static final String CAMEL_SOURCE_CASSANDRASOURCE_KAMELET_QUERY_DEFAULT = null;

    public CamelCassandrasourceSourceConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelCassandrasourceSourceConnectorConfig(
            Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSourceConnectorConfig.conf());
        conf.define(CAMEL_SOURCE_CASSANDRASOURCE_KAMELET_CONNECTION_HOST_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_CASSANDRASOURCE_KAMELET_CONNECTION_HOST_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_CASSANDRASOURCE_KAMELET_CONNECTION_HOST_DOC);
        conf.define(CAMEL_SOURCE_CASSANDRASOURCE_KAMELET_CONNECTION_PORT_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_CASSANDRASOURCE_KAMELET_CONNECTION_PORT_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_CASSANDRASOURCE_KAMELET_CONNECTION_PORT_DOC);
        conf.define(CAMEL_SOURCE_CASSANDRASOURCE_KAMELET_KEYSPACE_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_CASSANDRASOURCE_KAMELET_KEYSPACE_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_CASSANDRASOURCE_KAMELET_KEYSPACE_DOC);
        conf.define(CAMEL_SOURCE_CASSANDRASOURCE_KAMELET_USERNAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_CASSANDRASOURCE_KAMELET_USERNAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CASSANDRASOURCE_KAMELET_USERNAME_DOC);
        conf.define(CAMEL_SOURCE_CASSANDRASOURCE_KAMELET_PASSWORD_CONF, ConfigDef.Type.PASSWORD, CAMEL_SOURCE_CASSANDRASOURCE_KAMELET_PASSWORD_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CASSANDRASOURCE_KAMELET_PASSWORD_DOC);
        conf.define(CAMEL_SOURCE_CASSANDRASOURCE_KAMELET_RESULT_STRATEGY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_CASSANDRASOURCE_KAMELET_RESULT_STRATEGY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CASSANDRASOURCE_KAMELET_RESULT_STRATEGY_DOC);
        conf.define(CAMEL_SOURCE_CASSANDRASOURCE_KAMELET_CONSISTENCY_LEVEL_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_CASSANDRASOURCE_KAMELET_CONSISTENCY_LEVEL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_CASSANDRASOURCE_KAMELET_CONSISTENCY_LEVEL_DOC);
        conf.define(CAMEL_SOURCE_CASSANDRASOURCE_KAMELET_QUERY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_CASSANDRASOURCE_KAMELET_QUERY_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_CASSANDRASOURCE_KAMELET_QUERY_DOC);
        return conf;
    }
}