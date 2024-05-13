// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.VM.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualMachineNetworkDevice {
    /**
     * @return The name of the network bridge (defaults to `vmbr0`).
     * 
     */
    private @Nullable String bridge;
    /**
     * @return Whether to disconnect the network device from the network (defaults to `false`).
     * 
     */
    private @Nullable Boolean disconnected;
    /**
     * @return Whether to enable the network device (defaults to `true`).
     * 
     */
    private @Nullable Boolean enabled;
    /**
     * @return Whether this interface&#39;s firewall rules should be used (defaults to `false`).
     * 
     */
    private @Nullable Boolean firewall;
    /**
     * @return The MAC address.
     * 
     */
    private @Nullable String macAddress;
    /**
     * @return The network device model (defaults to `virtio`).
     * 
     */
    private @Nullable String model;
    /**
     * @return Force MTU, for VirtIO only. Set to 1 to use the bridge MTU. Cannot be larger than the bridge MTU.
     * 
     */
    private @Nullable Integer mtu;
    /**
     * @return The number of queues for VirtIO (1..64).
     * 
     */
    private @Nullable Integer queues;
    /**
     * @return The rate limit in megabytes per second.
     * 
     */
    private @Nullable Double rateLimit;
    /**
     * @return String containing a `;` separated list of VLAN trunks
     * (&#34;10;20;30&#34;). Note that the VLAN-aware feature need to be enabled on the PVE
     * Linux Bridge to use trunks.
     * 
     */
    private @Nullable String trunks;
    /**
     * @return The VLAN identifier.
     * 
     */
    private @Nullable Integer vlanId;

    private VirtualMachineNetworkDevice() {}
    /**
     * @return The name of the network bridge (defaults to `vmbr0`).
     * 
     */
    public Optional<String> bridge() {
        return Optional.ofNullable(this.bridge);
    }
    /**
     * @return Whether to disconnect the network device from the network (defaults to `false`).
     * 
     */
    public Optional<Boolean> disconnected() {
        return Optional.ofNullable(this.disconnected);
    }
    /**
     * @return Whether to enable the network device (defaults to `true`).
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return Whether this interface&#39;s firewall rules should be used (defaults to `false`).
     * 
     */
    public Optional<Boolean> firewall() {
        return Optional.ofNullable(this.firewall);
    }
    /**
     * @return The MAC address.
     * 
     */
    public Optional<String> macAddress() {
        return Optional.ofNullable(this.macAddress);
    }
    /**
     * @return The network device model (defaults to `virtio`).
     * 
     */
    public Optional<String> model() {
        return Optional.ofNullable(this.model);
    }
    /**
     * @return Force MTU, for VirtIO only. Set to 1 to use the bridge MTU. Cannot be larger than the bridge MTU.
     * 
     */
    public Optional<Integer> mtu() {
        return Optional.ofNullable(this.mtu);
    }
    /**
     * @return The number of queues for VirtIO (1..64).
     * 
     */
    public Optional<Integer> queues() {
        return Optional.ofNullable(this.queues);
    }
    /**
     * @return The rate limit in megabytes per second.
     * 
     */
    public Optional<Double> rateLimit() {
        return Optional.ofNullable(this.rateLimit);
    }
    /**
     * @return String containing a `;` separated list of VLAN trunks
     * (&#34;10;20;30&#34;). Note that the VLAN-aware feature need to be enabled on the PVE
     * Linux Bridge to use trunks.
     * 
     */
    public Optional<String> trunks() {
        return Optional.ofNullable(this.trunks);
    }
    /**
     * @return The VLAN identifier.
     * 
     */
    public Optional<Integer> vlanId() {
        return Optional.ofNullable(this.vlanId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineNetworkDevice defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String bridge;
        private @Nullable Boolean disconnected;
        private @Nullable Boolean enabled;
        private @Nullable Boolean firewall;
        private @Nullable String macAddress;
        private @Nullable String model;
        private @Nullable Integer mtu;
        private @Nullable Integer queues;
        private @Nullable Double rateLimit;
        private @Nullable String trunks;
        private @Nullable Integer vlanId;
        public Builder() {}
        public Builder(VirtualMachineNetworkDevice defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bridge = defaults.bridge;
    	      this.disconnected = defaults.disconnected;
    	      this.enabled = defaults.enabled;
    	      this.firewall = defaults.firewall;
    	      this.macAddress = defaults.macAddress;
    	      this.model = defaults.model;
    	      this.mtu = defaults.mtu;
    	      this.queues = defaults.queues;
    	      this.rateLimit = defaults.rateLimit;
    	      this.trunks = defaults.trunks;
    	      this.vlanId = defaults.vlanId;
        }

        @CustomType.Setter
        public Builder bridge(@Nullable String bridge) {

            this.bridge = bridge;
            return this;
        }
        @CustomType.Setter
        public Builder disconnected(@Nullable Boolean disconnected) {

            this.disconnected = disconnected;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder firewall(@Nullable Boolean firewall) {

            this.firewall = firewall;
            return this;
        }
        @CustomType.Setter
        public Builder macAddress(@Nullable String macAddress) {

            this.macAddress = macAddress;
            return this;
        }
        @CustomType.Setter
        public Builder model(@Nullable String model) {

            this.model = model;
            return this;
        }
        @CustomType.Setter
        public Builder mtu(@Nullable Integer mtu) {

            this.mtu = mtu;
            return this;
        }
        @CustomType.Setter
        public Builder queues(@Nullable Integer queues) {

            this.queues = queues;
            return this;
        }
        @CustomType.Setter
        public Builder rateLimit(@Nullable Double rateLimit) {

            this.rateLimit = rateLimit;
            return this;
        }
        @CustomType.Setter
        public Builder trunks(@Nullable String trunks) {

            this.trunks = trunks;
            return this;
        }
        @CustomType.Setter
        public Builder vlanId(@Nullable Integer vlanId) {

            this.vlanId = vlanId;
            return this;
        }
        public VirtualMachineNetworkDevice build() {
            final var _resultValue = new VirtualMachineNetworkDevice();
            _resultValue.bridge = bridge;
            _resultValue.disconnected = disconnected;
            _resultValue.enabled = enabled;
            _resultValue.firewall = firewall;
            _resultValue.macAddress = macAddress;
            _resultValue.model = model;
            _resultValue.mtu = mtu;
            _resultValue.queues = queues;
            _resultValue.rateLimit = rateLimit;
            _resultValue.trunks = trunks;
            _resultValue.vlanId = vlanId;
            return _resultValue;
        }
    }
}
