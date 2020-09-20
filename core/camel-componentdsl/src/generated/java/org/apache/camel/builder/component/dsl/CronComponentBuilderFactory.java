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
import org.apache.camel.component.cron.CronComponent;

/**
 * A generic interface for triggering events at times specified through the Unix
 * cron syntax.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface CronComponentBuilderFactory {

    /**
     * Cron (camel-cron)
     * A generic interface for triggering events at times specified through the
     * Unix cron syntax.
     * 
     * Category: scheduling
     * Since: 3.1
     * Maven coordinates: org.apache.camel:camel-cron
     */
    static CronComponentBuilder cron() {
        return new CronComponentBuilderImpl();
    }

    /**
     * Builder for the Cron component.
     */
    interface CronComponentBuilder extends ComponentBuilder<CronComponent> {
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default CronComponentBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
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
        default CronComponentBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * The id of the CamelCronService to use when multiple implementations
         * are provided.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: advanced
         */
        default CronComponentBuilder cronService(java.lang.String cronService) {
            doSetProperty("cronService", cronService);
            return this;
        }
    }

    class CronComponentBuilderImpl
            extends
                AbstractComponentBuilder<CronComponent>
            implements
                CronComponentBuilder {
        @Override
        protected CronComponent buildConcreteComponent() {
            return new CronComponent();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "bridgeErrorHandler": ((CronComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "basicPropertyBinding": ((CronComponent) component).setBasicPropertyBinding((boolean) value); return true;
            case "cronService": ((CronComponent) component).setCronService((java.lang.String) value); return true;
            default: return false;
            }
        }
    }
}