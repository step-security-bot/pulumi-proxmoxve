// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.VM.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualMachineInitializationIpConfigIpv4 {
    /**
     * @return The IPv4 address
     * 
     */
    private @Nullable String address;
    /**
     * @return The IPv4 gateway
     * 
     */
    private @Nullable String gateway;

    private VirtualMachineInitializationIpConfigIpv4() {}
    /**
     * @return The IPv4 address
     * 
     */
    public Optional<String> address() {
        return Optional.ofNullable(this.address);
    }
    /**
     * @return The IPv4 gateway
     * 
     */
    public Optional<String> gateway() {
        return Optional.ofNullable(this.gateway);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineInitializationIpConfigIpv4 defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String address;
        private @Nullable String gateway;
        public Builder() {}
        public Builder(VirtualMachineInitializationIpConfigIpv4 defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.gateway = defaults.gateway;
        }

        @CustomType.Setter
        public Builder address(@Nullable String address) {

            this.address = address;
            return this;
        }
        @CustomType.Setter
        public Builder gateway(@Nullable String gateway) {

            this.gateway = gateway;
            return this;
        }
        public VirtualMachineInitializationIpConfigIpv4 build() {
            final var _resultValue = new VirtualMachineInitializationIpConfigIpv4();
            _resultValue.address = address;
            _resultValue.gateway = gateway;
            return _resultValue;
        }
    }
}
