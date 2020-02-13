/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.file.remote;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.component.file.remote.FtpComponentConfigurer;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class FtpsComponentConfigurer extends FtpComponentConfigurer implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        FtpsComponent target = (FtpsComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "useglobalsslcontextparameters":
        case "useGlobalSslContextParameters": target.setUseGlobalSslContextParameters(property(camelContext, boolean.class, value)); return true;
        default: return super.configure(camelContext, obj, name, value, ignoreCase);
        }
    }

}
