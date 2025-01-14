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
package org.apache.camel.kafkaconnector.kafkasslsink;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelKafkasslsinkSinkConnectorConfig
        extends
            CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_KAFKASSLSINK_KAMELET_BOOTSTRAP_SERVERS_CONF = "camel.kamelet.kafka-ssl-sink.bootstrapServers";
    public static final String CAMEL_SINK_KAFKASSLSINK_KAMELET_BOOTSTRAP_SERVERS_DOC = "Comma separated list of Kafka Broker URLs";
    public static final String CAMEL_SINK_KAFKASSLSINK_KAMELET_BOOTSTRAP_SERVERS_DEFAULT = null;
    public static final String CAMEL_SINK_KAFKASSLSINK_KAMELET_SSL_KEYSTORE_LOCATION_CONF = "camel.kamelet.kafka-ssl-sink.sslKeystoreLocation";
    public static final String CAMEL_SINK_KAFKASSLSINK_KAMELET_SSL_KEYSTORE_LOCATION_DOC = "The location of the key store file. This is optional for client and can be used for two-way authentication for client.";
    public static final String CAMEL_SINK_KAFKASSLSINK_KAMELET_SSL_KEYSTORE_LOCATION_DEFAULT = null;
    public static final String CAMEL_SINK_KAFKASSLSINK_KAMELET_SSL_PROTOCOL_CONF = "camel.kamelet.kafka-ssl-sink.sslProtocol";
    public static final String CAMEL_SINK_KAFKASSLSINK_KAMELET_SSL_PROTOCOL_DOC = "The SSL protocol used to generate the SSLContext. Default setting is TLS, which is fine for most cases. Allowed values in recent JVMs are TLS, TLSv1.1 and TLSv1.2. SSL, SSLv2 and SSLv3 may be supported in older JVMs, but their usage is discouraged due to known security vulnerabilities.";
    public static final String CAMEL_SINK_KAFKASSLSINK_KAMELET_SSL_PROTOCOL_DEFAULT = "TLSv1.2";
    public static final String CAMEL_SINK_KAFKASSLSINK_KAMELET_SASL_MECHANISM_CONF = "camel.kamelet.kafka-ssl-sink.saslMechanism";
    public static final String CAMEL_SINK_KAFKASSLSINK_KAMELET_SASL_MECHANISM_DOC = "The Simple Authentication and Security Layer (SASL) Mechanism used.";
    public static final String CAMEL_SINK_KAFKASSLSINK_KAMELET_SASL_MECHANISM_DEFAULT = "GSSAPI";
    public static final String CAMEL_SINK_KAFKASSLSINK_KAMELET_SSL_ENABLED_PROTOCOLS_CONF = "camel.kamelet.kafka-ssl-sink.sslEnabledProtocols";
    public static final String CAMEL_SINK_KAFKASSLSINK_KAMELET_SSL_ENABLED_PROTOCOLS_DOC = "The list of protocols enabled for SSL connections. TLSv1.2, TLSv1.1 and TLSv1 are enabled by default.";
    public static final String CAMEL_SINK_KAFKASSLSINK_KAMELET_SSL_ENABLED_PROTOCOLS_DEFAULT = "TLSv1.2,TLSv1.1,TLSv1";
    public static final String CAMEL_SINK_KAFKASSLSINK_KAMELET_SSL_KEYSTORE_PASSWORD_CONF = "camel.kamelet.kafka-ssl-sink.sslKeystorePassword";
    public static final String CAMEL_SINK_KAFKASSLSINK_KAMELET_SSL_KEYSTORE_PASSWORD_DOC = "The store password for the key store file.This is optional for client and only needed if ssl.keystore.location is configured.";
    public static final String CAMEL_SINK_KAFKASSLSINK_KAMELET_SSL_KEYSTORE_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SINK_KAFKASSLSINK_KAMELET_SSL_TRUSTSTORE_LOCATION_CONF = "camel.kamelet.kafka-ssl-sink.sslTruststoreLocation";
    public static final String CAMEL_SINK_KAFKASSLSINK_KAMELET_SSL_TRUSTSTORE_LOCATION_DOC = "The location of the trust store file.";
    public static final String CAMEL_SINK_KAFKASSLSINK_KAMELET_SSL_TRUSTSTORE_LOCATION_DEFAULT = null;
    public static final String CAMEL_SINK_KAFKASSLSINK_KAMELET_SSL_KEY_PASSWORD_CONF = "camel.kamelet.kafka-ssl-sink.sslKeyPassword";
    public static final String CAMEL_SINK_KAFKASSLSINK_KAMELET_SSL_KEY_PASSWORD_DOC = "The password of the private key in the key store file.";
    public static final String CAMEL_SINK_KAFKASSLSINK_KAMELET_SSL_KEY_PASSWORD_DEFAULT = null;
    public static final String CAMEL_SINK_KAFKASSLSINK_KAMELET_TOPIC_CONF = "camel.kamelet.kafka-ssl-sink.topic";
    public static final String CAMEL_SINK_KAFKASSLSINK_KAMELET_TOPIC_DOC = "Comma separated list of Kafka topic names";
    public static final String CAMEL_SINK_KAFKASSLSINK_KAMELET_TOPIC_DEFAULT = null;
    public static final String CAMEL_SINK_KAFKASSLSINK_KAMELET_SECURITY_PROTOCOL_CONF = "camel.kamelet.kafka-ssl-sink.securityProtocol";
    public static final String CAMEL_SINK_KAFKASSLSINK_KAMELET_SECURITY_PROTOCOL_DOC = "Protocol used to communicate with brokers. SASL_PLAINTEXT, PLAINTEXT, SASL_SSL and SSL are supported";
    public static final String CAMEL_SINK_KAFKASSLSINK_KAMELET_SECURITY_PROTOCOL_DEFAULT = "SSL";

    public CamelKafkasslsinkSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelKafkasslsinkSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_KAFKASSLSINK_KAMELET_BOOTSTRAP_SERVERS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_KAFKASSLSINK_KAMELET_BOOTSTRAP_SERVERS_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_KAFKASSLSINK_KAMELET_BOOTSTRAP_SERVERS_DOC);
        conf.define(CAMEL_SINK_KAFKASSLSINK_KAMELET_SSL_KEYSTORE_LOCATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_KAFKASSLSINK_KAMELET_SSL_KEYSTORE_LOCATION_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_KAFKASSLSINK_KAMELET_SSL_KEYSTORE_LOCATION_DOC);
        conf.define(CAMEL_SINK_KAFKASSLSINK_KAMELET_SSL_PROTOCOL_CONF, ConfigDef.Type.STRING, CAMEL_SINK_KAFKASSLSINK_KAMELET_SSL_PROTOCOL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_KAFKASSLSINK_KAMELET_SSL_PROTOCOL_DOC);
        conf.define(CAMEL_SINK_KAFKASSLSINK_KAMELET_SASL_MECHANISM_CONF, ConfigDef.Type.STRING, CAMEL_SINK_KAFKASSLSINK_KAMELET_SASL_MECHANISM_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_KAFKASSLSINK_KAMELET_SASL_MECHANISM_DOC);
        conf.define(CAMEL_SINK_KAFKASSLSINK_KAMELET_SSL_ENABLED_PROTOCOLS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_KAFKASSLSINK_KAMELET_SSL_ENABLED_PROTOCOLS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_KAFKASSLSINK_KAMELET_SSL_ENABLED_PROTOCOLS_DOC);
        conf.define(CAMEL_SINK_KAFKASSLSINK_KAMELET_SSL_KEYSTORE_PASSWORD_CONF, ConfigDef.Type.PASSWORD, CAMEL_SINK_KAFKASSLSINK_KAMELET_SSL_KEYSTORE_PASSWORD_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_KAFKASSLSINK_KAMELET_SSL_KEYSTORE_PASSWORD_DOC);
        conf.define(CAMEL_SINK_KAFKASSLSINK_KAMELET_SSL_TRUSTSTORE_LOCATION_CONF, ConfigDef.Type.STRING, CAMEL_SINK_KAFKASSLSINK_KAMELET_SSL_TRUSTSTORE_LOCATION_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_KAFKASSLSINK_KAMELET_SSL_TRUSTSTORE_LOCATION_DOC);
        conf.define(CAMEL_SINK_KAFKASSLSINK_KAMELET_SSL_KEY_PASSWORD_CONF, ConfigDef.Type.PASSWORD, CAMEL_SINK_KAFKASSLSINK_KAMELET_SSL_KEY_PASSWORD_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_KAFKASSLSINK_KAMELET_SSL_KEY_PASSWORD_DOC);
        conf.define(CAMEL_SINK_KAFKASSLSINK_KAMELET_TOPIC_CONF, ConfigDef.Type.STRING, CAMEL_SINK_KAFKASSLSINK_KAMELET_TOPIC_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_KAFKASSLSINK_KAMELET_TOPIC_DOC);
        conf.define(CAMEL_SINK_KAFKASSLSINK_KAMELET_SECURITY_PROTOCOL_CONF, ConfigDef.Type.STRING, CAMEL_SINK_KAFKASSLSINK_KAMELET_SECURITY_PROTOCOL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_KAFKASSLSINK_KAMELET_SECURITY_PROTOCOL_DOC);
        return conf;
    }
}