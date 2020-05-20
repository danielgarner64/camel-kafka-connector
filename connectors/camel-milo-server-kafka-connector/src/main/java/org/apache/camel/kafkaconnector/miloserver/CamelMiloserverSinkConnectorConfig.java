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
package org.apache.camel.kafkaconnector.miloserver;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSinkConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelMiloserverSinkConnectorConfig
        extends
            CamelSinkConnectorConfig {

    public static final String CAMEL_SINK_MILOSERVER_PATH_ITEM_ID_CONF = "camel.sink.path.itemId";
    public static final String CAMEL_SINK_MILOSERVER_PATH_ITEM_ID_DOC = "ID of the item";
    public static final String CAMEL_SINK_MILOSERVER_PATH_ITEM_ID_DEFAULT = null;
    public static final String CAMEL_SINK_MILOSERVER_ENDPOINT_LAZY_START_PRODUCER_CONF = "camel.sink.endpoint.lazyStartProducer";
    public static final String CAMEL_SINK_MILOSERVER_ENDPOINT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_MILOSERVER_ENDPOINT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_MILOSERVER_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.sink.endpoint.basicPropertyBinding";
    public static final String CAMEL_SINK_MILOSERVER_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_MILOSERVER_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SINK_MILOSERVER_ENDPOINT_SYNCHRONOUS_CONF = "camel.sink.endpoint.synchronous";
    public static final String CAMEL_SINK_MILOSERVER_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SINK_MILOSERVER_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SINK_MILOSERVER_COMPONENT_APPLICATION_NAME_CONF = "camel.component.milo-server.applicationName";
    public static final String CAMEL_SINK_MILOSERVER_COMPONENT_APPLICATION_NAME_DOC = "The application name";
    public static final String CAMEL_SINK_MILOSERVER_COMPONENT_APPLICATION_NAME_DEFAULT = null;
    public static final String CAMEL_SINK_MILOSERVER_COMPONENT_APPLICATION_URI_CONF = "camel.component.milo-server.applicationUri";
    public static final String CAMEL_SINK_MILOSERVER_COMPONENT_APPLICATION_URI_DOC = "The application URI";
    public static final String CAMEL_SINK_MILOSERVER_COMPONENT_APPLICATION_URI_DEFAULT = null;
    public static final String CAMEL_SINK_MILOSERVER_COMPONENT_BIND_ADDRESSES_CONF = "camel.component.milo-server.bindAddresses";
    public static final String CAMEL_SINK_MILOSERVER_COMPONENT_BIND_ADDRESSES_DOC = "Set the addresses of the local addresses the server should bind to";
    public static final String CAMEL_SINK_MILOSERVER_COMPONENT_BIND_ADDRESSES_DEFAULT = null;
    public static final String CAMEL_SINK_MILOSERVER_COMPONENT_BUILD_INFO_CONF = "camel.component.milo-server.buildInfo";
    public static final String CAMEL_SINK_MILOSERVER_COMPONENT_BUILD_INFO_DOC = "Server build info";
    public static final String CAMEL_SINK_MILOSERVER_COMPONENT_BUILD_INFO_DEFAULT = null;
    public static final String CAMEL_SINK_MILOSERVER_COMPONENT_CERTIFICATE_CONF = "camel.component.milo-server.certificate";
    public static final String CAMEL_SINK_MILOSERVER_COMPONENT_CERTIFICATE_DOC = "Server certificate";
    public static final String CAMEL_SINK_MILOSERVER_COMPONENT_CERTIFICATE_DEFAULT = null;
    public static final String CAMEL_SINK_MILOSERVER_COMPONENT_CERTIFICATE_MANAGER_CONF = "camel.component.milo-server.certificateManager";
    public static final String CAMEL_SINK_MILOSERVER_COMPONENT_CERTIFICATE_MANAGER_DOC = "Server certificate manager";
    public static final String CAMEL_SINK_MILOSERVER_COMPONENT_CERTIFICATE_MANAGER_DEFAULT = null;
    public static final String CAMEL_SINK_MILOSERVER_COMPONENT_CERTIFICATE_VALIDATOR_CONF = "camel.component.milo-server.certificateValidator";
    public static final String CAMEL_SINK_MILOSERVER_COMPONENT_CERTIFICATE_VALIDATOR_DOC = "Validator for client certificates";
    public static final String CAMEL_SINK_MILOSERVER_COMPONENT_CERTIFICATE_VALIDATOR_DEFAULT = null;
    public static final String CAMEL_SINK_MILOSERVER_COMPONENT_DEFAULT_CERTIFICATE_VALIDATOR_CONF = "camel.component.milo-server.defaultCertificateValidator";
    public static final String CAMEL_SINK_MILOSERVER_COMPONENT_DEFAULT_CERTIFICATE_VALIDATOR_DOC = "Validator for client certificates using default file based approach";
    public static final String CAMEL_SINK_MILOSERVER_COMPONENT_DEFAULT_CERTIFICATE_VALIDATOR_DEFAULT = null;
    public static final String CAMEL_SINK_MILOSERVER_COMPONENT_ENABLE_ANONYMOUS_AUTHENTICATION_CONF = "camel.component.milo-server.enableAnonymousAuthentication";
    public static final String CAMEL_SINK_MILOSERVER_COMPONENT_ENABLE_ANONYMOUS_AUTHENTICATION_DOC = "Enable anonymous authentication, disabled by default";
    public static final Boolean CAMEL_SINK_MILOSERVER_COMPONENT_ENABLE_ANONYMOUS_AUTHENTICATION_DEFAULT = false;
    public static final String CAMEL_SINK_MILOSERVER_COMPONENT_NAMESPACE_URI_CONF = "camel.component.milo-server.namespaceUri";
    public static final String CAMEL_SINK_MILOSERVER_COMPONENT_NAMESPACE_URI_DOC = "The URI of the namespace, defaults to urn:org:apache:camel";
    public static final String CAMEL_SINK_MILOSERVER_COMPONENT_NAMESPACE_URI_DEFAULT = null;
    public static final String CAMEL_SINK_MILOSERVER_COMPONENT_PATH_CONF = "camel.component.milo-server.path";
    public static final String CAMEL_SINK_MILOSERVER_COMPONENT_PATH_DOC = "The path to be appended to the end of the endpoint url. (doesn't need to start with '/')";
    public static final String CAMEL_SINK_MILOSERVER_COMPONENT_PATH_DEFAULT = null;
    public static final String CAMEL_SINK_MILOSERVER_COMPONENT_PORT_CONF = "camel.component.milo-server.port";
    public static final String CAMEL_SINK_MILOSERVER_COMPONENT_PORT_DOC = "The TCP port the server binds to";
    public static final Integer CAMEL_SINK_MILOSERVER_COMPONENT_PORT_DEFAULT = null;
    public static final String CAMEL_SINK_MILOSERVER_COMPONENT_PRODUCT_URI_CONF = "camel.component.milo-server.productUri";
    public static final String CAMEL_SINK_MILOSERVER_COMPONENT_PRODUCT_URI_DOC = "The product URI";
    public static final String CAMEL_SINK_MILOSERVER_COMPONENT_PRODUCT_URI_DEFAULT = null;
    public static final String CAMEL_SINK_MILOSERVER_COMPONENT_SECURITY_POLICIES_CONF = "camel.component.milo-server.securityPolicies";
    public static final String CAMEL_SINK_MILOSERVER_COMPONENT_SECURITY_POLICIES_DOC = "Security policies";
    public static final String CAMEL_SINK_MILOSERVER_COMPONENT_SECURITY_POLICIES_DEFAULT = null;
    public static final String CAMEL_SINK_MILOSERVER_COMPONENT_SECURITY_POLICIES_BY_ID_CONF = "camel.component.milo-server.securityPoliciesById";
    public static final String CAMEL_SINK_MILOSERVER_COMPONENT_SECURITY_POLICIES_BY_ID_DOC = "Security policies by URI or name. Multiple policies can be separated by comma.";
    public static final String CAMEL_SINK_MILOSERVER_COMPONENT_SECURITY_POLICIES_BY_ID_DEFAULT = null;
    public static final String CAMEL_SINK_MILOSERVER_COMPONENT_USER_AUTHENTICATION_CREDENTIALS_CONF = "camel.component.milo-server.userAuthenticationCredentials";
    public static final String CAMEL_SINK_MILOSERVER_COMPONENT_USER_AUTHENTICATION_CREDENTIALS_DOC = "Set user password combinations in the form of user1:pwd1,user2:pwd2 Usernames and passwords will be URL decoded";
    public static final String CAMEL_SINK_MILOSERVER_COMPONENT_USER_AUTHENTICATION_CREDENTIALS_DEFAULT = null;
    public static final String CAMEL_SINK_MILOSERVER_COMPONENT_USERNAME_SECURITY_POLICY_URI_CONF = "camel.component.milo-server.usernameSecurityPolicyUri";
    public static final String CAMEL_SINK_MILOSERVER_COMPONENT_USERNAME_SECURITY_POLICY_URI_DOC = "Set the UserTokenPolicy used when One of: [None] [Basic128Rsa15] [Basic256] [Basic256Sha256] [Aes128_Sha256_RsaOaep] [Aes256_Sha256_RsaPss]";
    public static final String CAMEL_SINK_MILOSERVER_COMPONENT_USERNAME_SECURITY_POLICY_URI_DEFAULT = null;
    public static final String CAMEL_SINK_MILOSERVER_COMPONENT_LAZY_START_PRODUCER_CONF = "camel.component.milo-server.lazyStartProducer";
    public static final String CAMEL_SINK_MILOSERVER_COMPONENT_LAZY_START_PRODUCER_DOC = "Whether the producer should be started lazy (on the first message). By starting lazy you can use this to allow CamelContext and routes to startup in situations where a producer may otherwise fail during starting and cause the route to fail being started. By deferring this startup to be lazy then the startup failure can be handled during routing messages via Camel's routing error handlers. Beware that when the first message is processed then creating and starting the producer may take a little time and prolong the total processing time of the processing.";
    public static final Boolean CAMEL_SINK_MILOSERVER_COMPONENT_LAZY_START_PRODUCER_DEFAULT = false;
    public static final String CAMEL_SINK_MILOSERVER_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.milo-server.basicPropertyBinding";
    public static final String CAMEL_SINK_MILOSERVER_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SINK_MILOSERVER_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;

    public CamelMiloserverSinkConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelMiloserverSinkConnectorConfig(Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSinkConnectorConfig.conf());
        conf.define(CAMEL_SINK_MILOSERVER_PATH_ITEM_ID_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MILOSERVER_PATH_ITEM_ID_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SINK_MILOSERVER_PATH_ITEM_ID_DOC);
        conf.define(CAMEL_SINK_MILOSERVER_ENDPOINT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_MILOSERVER_ENDPOINT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MILOSERVER_ENDPOINT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_MILOSERVER_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_MILOSERVER_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MILOSERVER_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SINK_MILOSERVER_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_MILOSERVER_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MILOSERVER_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SINK_MILOSERVER_COMPONENT_APPLICATION_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MILOSERVER_COMPONENT_APPLICATION_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MILOSERVER_COMPONENT_APPLICATION_NAME_DOC);
        conf.define(CAMEL_SINK_MILOSERVER_COMPONENT_APPLICATION_URI_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MILOSERVER_COMPONENT_APPLICATION_URI_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MILOSERVER_COMPONENT_APPLICATION_URI_DOC);
        conf.define(CAMEL_SINK_MILOSERVER_COMPONENT_BIND_ADDRESSES_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MILOSERVER_COMPONENT_BIND_ADDRESSES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MILOSERVER_COMPONENT_BIND_ADDRESSES_DOC);
        conf.define(CAMEL_SINK_MILOSERVER_COMPONENT_BUILD_INFO_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MILOSERVER_COMPONENT_BUILD_INFO_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MILOSERVER_COMPONENT_BUILD_INFO_DOC);
        conf.define(CAMEL_SINK_MILOSERVER_COMPONENT_CERTIFICATE_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MILOSERVER_COMPONENT_CERTIFICATE_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MILOSERVER_COMPONENT_CERTIFICATE_DOC);
        conf.define(CAMEL_SINK_MILOSERVER_COMPONENT_CERTIFICATE_MANAGER_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MILOSERVER_COMPONENT_CERTIFICATE_MANAGER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MILOSERVER_COMPONENT_CERTIFICATE_MANAGER_DOC);
        conf.define(CAMEL_SINK_MILOSERVER_COMPONENT_CERTIFICATE_VALIDATOR_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MILOSERVER_COMPONENT_CERTIFICATE_VALIDATOR_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MILOSERVER_COMPONENT_CERTIFICATE_VALIDATOR_DOC);
        conf.define(CAMEL_SINK_MILOSERVER_COMPONENT_DEFAULT_CERTIFICATE_VALIDATOR_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MILOSERVER_COMPONENT_DEFAULT_CERTIFICATE_VALIDATOR_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MILOSERVER_COMPONENT_DEFAULT_CERTIFICATE_VALIDATOR_DOC);
        conf.define(CAMEL_SINK_MILOSERVER_COMPONENT_ENABLE_ANONYMOUS_AUTHENTICATION_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_MILOSERVER_COMPONENT_ENABLE_ANONYMOUS_AUTHENTICATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MILOSERVER_COMPONENT_ENABLE_ANONYMOUS_AUTHENTICATION_DOC);
        conf.define(CAMEL_SINK_MILOSERVER_COMPONENT_NAMESPACE_URI_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MILOSERVER_COMPONENT_NAMESPACE_URI_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MILOSERVER_COMPONENT_NAMESPACE_URI_DOC);
        conf.define(CAMEL_SINK_MILOSERVER_COMPONENT_PATH_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MILOSERVER_COMPONENT_PATH_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MILOSERVER_COMPONENT_PATH_DOC);
        conf.define(CAMEL_SINK_MILOSERVER_COMPONENT_PORT_CONF, ConfigDef.Type.INT, CAMEL_SINK_MILOSERVER_COMPONENT_PORT_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MILOSERVER_COMPONENT_PORT_DOC);
        conf.define(CAMEL_SINK_MILOSERVER_COMPONENT_PRODUCT_URI_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MILOSERVER_COMPONENT_PRODUCT_URI_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MILOSERVER_COMPONENT_PRODUCT_URI_DOC);
        conf.define(CAMEL_SINK_MILOSERVER_COMPONENT_SECURITY_POLICIES_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MILOSERVER_COMPONENT_SECURITY_POLICIES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MILOSERVER_COMPONENT_SECURITY_POLICIES_DOC);
        conf.define(CAMEL_SINK_MILOSERVER_COMPONENT_SECURITY_POLICIES_BY_ID_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MILOSERVER_COMPONENT_SECURITY_POLICIES_BY_ID_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MILOSERVER_COMPONENT_SECURITY_POLICIES_BY_ID_DOC);
        conf.define(CAMEL_SINK_MILOSERVER_COMPONENT_USER_AUTHENTICATION_CREDENTIALS_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MILOSERVER_COMPONENT_USER_AUTHENTICATION_CREDENTIALS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MILOSERVER_COMPONENT_USER_AUTHENTICATION_CREDENTIALS_DOC);
        conf.define(CAMEL_SINK_MILOSERVER_COMPONENT_USERNAME_SECURITY_POLICY_URI_CONF, ConfigDef.Type.STRING, CAMEL_SINK_MILOSERVER_COMPONENT_USERNAME_SECURITY_POLICY_URI_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MILOSERVER_COMPONENT_USERNAME_SECURITY_POLICY_URI_DOC);
        conf.define(CAMEL_SINK_MILOSERVER_COMPONENT_LAZY_START_PRODUCER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_MILOSERVER_COMPONENT_LAZY_START_PRODUCER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MILOSERVER_COMPONENT_LAZY_START_PRODUCER_DOC);
        conf.define(CAMEL_SINK_MILOSERVER_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SINK_MILOSERVER_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SINK_MILOSERVER_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        return conf;
    }
}