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
package org.apache.camel.builder.component.dsl;

import javax.annotation.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.nagios.NagiosComponent;

/**
 * Send passive checks to Nagios using JSendNSCA.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface NagiosComponentBuilderFactory {

    /**
     * Nagios (camel-nagios)
     * Send passive checks to Nagios using JSendNSCA.
     * 
     * Category: monitoring
     * Since: 2.3
     * Maven coordinates: org.apache.camel:camel-nagios
     */
    static NagiosComponentBuilder nagios() {
        return new NagiosComponentBuilderImpl();
    }

    /**
     * Builder for the Nagios component.
     */
    interface NagiosComponentBuilder
            extends
                ComponentBuilder<NagiosComponent> {
        /**
         * Connection timeout in millis.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 5000
         * Group: producer
         */
        default NagiosComponentBuilder connectionTimeout(int connectionTimeout) {
            doSetProperty("connectionTimeout", connectionTimeout);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default NagiosComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Sending timeout in millis.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 5000
         * Group: producer
         */
        default NagiosComponentBuilder timeout(int timeout) {
            doSetProperty("timeout", timeout);
            return this;
        }
        /**
         * Whether the component should use basic property binding (Camel 2.x)
         * or the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        @Deprecated
        default NagiosComponentBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * To use a shared NagiosConfiguration.
         * 
         * The option is a:
         * <code>org.apache.camel.component.nagios.NagiosConfiguration</code>
         * type.
         * 
         * Group: advanced
         */
        default NagiosComponentBuilder configuration(
                org.apache.camel.component.nagios.NagiosConfiguration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * To specify an encryption method.
         * 
         * The option is a:
         * <code>com.googlecode.jsendnsca.encryption.Encryption</code> type.
         * 
         * Group: security
         */
        default NagiosComponentBuilder encryption(
                com.googlecode.jsendnsca.encryption.Encryption encryption) {
            doSetProperty("encryption", encryption);
            return this;
        }
        /**
         * Password to be authenticated when sending checks to Nagios.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default NagiosComponentBuilder password(java.lang.String password) {
            doSetProperty("password", password);
            return this;
        }
    }

    class NagiosComponentBuilderImpl
            extends
                AbstractComponentBuilder<NagiosComponent>
            implements
                NagiosComponentBuilder {
        @Override
        protected NagiosComponent buildConcreteComponent() {
            return new NagiosComponent();
        }
        private org.apache.camel.component.nagios.NagiosConfiguration getOrCreateConfiguration(
                org.apache.camel.component.nagios.NagiosComponent component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.nagios.NagiosConfiguration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "connectionTimeout": getOrCreateConfiguration((NagiosComponent) component).setConnectionTimeout((int) value); return true;
            case "lazyStartProducer": ((NagiosComponent) component).setLazyStartProducer((boolean) value); return true;
            case "timeout": getOrCreateConfiguration((NagiosComponent) component).setTimeout((int) value); return true;
            case "basicPropertyBinding": ((NagiosComponent) component).setBasicPropertyBinding((boolean) value); return true;
            case "configuration": ((NagiosComponent) component).setConfiguration((org.apache.camel.component.nagios.NagiosConfiguration) value); return true;
            case "encryption": getOrCreateConfiguration((NagiosComponent) component).setEncryption((com.googlecode.jsendnsca.encryption.Encryption) value); return true;
            case "password": getOrCreateConfiguration((NagiosComponent) component).setPassword((java.lang.String) value); return true;
            default: return false;
            }
        }
    }
}