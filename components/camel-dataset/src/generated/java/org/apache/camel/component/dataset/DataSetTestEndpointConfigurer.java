/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.dataset;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.component.mock.MockEndpointConfigurer;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class DataSetTestEndpointConfigurer extends MockEndpointConfigurer implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        DataSetTestEndpoint target = (DataSetTestEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "anyorder":
        case "anyOrder": target.setAnyOrder(property(camelContext, boolean.class, value)); return true;
        case "delimiter": target.setDelimiter(property(camelContext, java.lang.String.class, value)); return true;
        case "split": target.setSplit(property(camelContext, boolean.class, value)); return true;
        case "timeout": target.setTimeout(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        default: return super.configure(camelContext, obj, name, value, ignoreCase);
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = super.getAllOptions(target);
        answer.put("anyOrder", boolean.class);
        answer.put("delimiter", java.lang.String.class);
        answer.put("split", boolean.class);
        answer.put("timeout", long.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        DataSetTestEndpoint target = (DataSetTestEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "anyorder":
        case "anyOrder": return target.isAnyOrder();
        case "delimiter": return target.getDelimiter();
        case "split": return target.isSplit();
        case "timeout": return target.getTimeout();
        default: return super.getOptionValue(obj, name, ignoreCase);
        }
    }
}
