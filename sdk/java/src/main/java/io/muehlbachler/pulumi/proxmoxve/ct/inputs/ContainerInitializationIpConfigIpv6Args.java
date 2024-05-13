// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.CT.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ContainerInitializationIpConfigIpv6Args extends com.pulumi.resources.ResourceArgs {

    public static final ContainerInitializationIpConfigIpv6Args Empty = new ContainerInitializationIpConfigIpv6Args();

    /**
     * The IPv6 address
     * 
     */
    @Import(name="address")
    private @Nullable Output<String> address;

    /**
     * @return The IPv6 address
     * 
     */
    public Optional<Output<String>> address() {
        return Optional.ofNullable(this.address);
    }

    /**
     * The IPv6 gateway
     * 
     */
    @Import(name="gateway")
    private @Nullable Output<String> gateway;

    /**
     * @return The IPv6 gateway
     * 
     */
    public Optional<Output<String>> gateway() {
        return Optional.ofNullable(this.gateway);
    }

    private ContainerInitializationIpConfigIpv6Args() {}

    private ContainerInitializationIpConfigIpv6Args(ContainerInitializationIpConfigIpv6Args $) {
        this.address = $.address;
        this.gateway = $.gateway;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContainerInitializationIpConfigIpv6Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContainerInitializationIpConfigIpv6Args $;

        public Builder() {
            $ = new ContainerInitializationIpConfigIpv6Args();
        }

        public Builder(ContainerInitializationIpConfigIpv6Args defaults) {
            $ = new ContainerInitializationIpConfigIpv6Args(Objects.requireNonNull(defaults));
        }

        /**
         * @param address The IPv6 address
         * 
         * @return builder
         * 
         */
        public Builder address(@Nullable Output<String> address) {
            $.address = address;
            return this;
        }

        /**
         * @param address The IPv6 address
         * 
         * @return builder
         * 
         */
        public Builder address(String address) {
            return address(Output.of(address));
        }

        /**
         * @param gateway The IPv6 gateway
         * 
         * @return builder
         * 
         */
        public Builder gateway(@Nullable Output<String> gateway) {
            $.gateway = gateway;
            return this;
        }

        /**
         * @param gateway The IPv6 gateway
         * 
         * @return builder
         * 
         */
        public Builder gateway(String gateway) {
            return gateway(Output.of(gateway));
        }

        public ContainerInitializationIpConfigIpv6Args build() {
            return $;
        }
    }

}
