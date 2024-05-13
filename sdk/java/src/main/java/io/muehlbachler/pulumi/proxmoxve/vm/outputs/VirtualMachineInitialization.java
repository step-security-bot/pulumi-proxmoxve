// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.VM.outputs;

import com.pulumi.core.annotations.CustomType;
import io.muehlbachler.pulumi.proxmoxve.VM.outputs.VirtualMachineInitializationDns;
import io.muehlbachler.pulumi.proxmoxve.VM.outputs.VirtualMachineInitializationIpConfig;
import io.muehlbachler.pulumi.proxmoxve.VM.outputs.VirtualMachineInitializationUserAccount;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualMachineInitialization {
    /**
     * @return The identifier for the datastore to create the
     * cloud-init disk in (defaults to `local-lvm`).
     * 
     */
    private @Nullable String datastoreId;
    /**
     * @return The DNS configuration.
     * 
     */
    private @Nullable VirtualMachineInitializationDns dns;
    /**
     * @return The hardware interface to connect the cloud-init
     * image to. Must be one of `ide0..3`, `sata0..5`, `scsi0..30`. Will be
     * detected if the setting is missing but a cloud-init image is present,
     * otherwise defaults to `ide2`.
     * 
     */
    private @Nullable String interface_;
    /**
     * @return The IP configuration (one block per network
     * device).
     * 
     */
    private @Nullable List<VirtualMachineInitializationIpConfig> ipConfigs;
    /**
     * @return The identifier for a file containing
     * all meta data passed to the VM via cloud-init.
     * 
     */
    private @Nullable String metaDataFileId;
    /**
     * @return The identifier for a file containing
     * network configuration data passed to the VM via cloud-init (conflicts
     * with `ip_config`).
     * 
     */
    private @Nullable String networkDataFileId;
    /**
     * @return The cloud-init configuration format
     * 
     */
    private @Nullable String type;
    /**
     * @return Whether to do an automatic package upgrade after the first boot (defaults to `true`).
     * 
     */
    private @Nullable Boolean upgrade;
    /**
     * @return The user account configuration (conflicts
     * with `user_data_file_id`).
     * 
     */
    private @Nullable VirtualMachineInitializationUserAccount userAccount;
    /**
     * @return The identifier for a file containing
     * custom user data (conflicts with `user_account`).
     * 
     */
    private @Nullable String userDataFileId;
    /**
     * @return The identifier for a file containing
     * all vendor data passed to the VM via cloud-init.
     * 
     */
    private @Nullable String vendorDataFileId;

    private VirtualMachineInitialization() {}
    /**
     * @return The identifier for the datastore to create the
     * cloud-init disk in (defaults to `local-lvm`).
     * 
     */
    public Optional<String> datastoreId() {
        return Optional.ofNullable(this.datastoreId);
    }
    /**
     * @return The DNS configuration.
     * 
     */
    public Optional<VirtualMachineInitializationDns> dns() {
        return Optional.ofNullable(this.dns);
    }
    /**
     * @return The hardware interface to connect the cloud-init
     * image to. Must be one of `ide0..3`, `sata0..5`, `scsi0..30`. Will be
     * detected if the setting is missing but a cloud-init image is present,
     * otherwise defaults to `ide2`.
     * 
     */
    public Optional<String> interface_() {
        return Optional.ofNullable(this.interface_);
    }
    /**
     * @return The IP configuration (one block per network
     * device).
     * 
     */
    public List<VirtualMachineInitializationIpConfig> ipConfigs() {
        return this.ipConfigs == null ? List.of() : this.ipConfigs;
    }
    /**
     * @return The identifier for a file containing
     * all meta data passed to the VM via cloud-init.
     * 
     */
    public Optional<String> metaDataFileId() {
        return Optional.ofNullable(this.metaDataFileId);
    }
    /**
     * @return The identifier for a file containing
     * network configuration data passed to the VM via cloud-init (conflicts
     * with `ip_config`).
     * 
     */
    public Optional<String> networkDataFileId() {
        return Optional.ofNullable(this.networkDataFileId);
    }
    /**
     * @return The cloud-init configuration format
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    /**
     * @return Whether to do an automatic package upgrade after the first boot (defaults to `true`).
     * 
     */
    public Optional<Boolean> upgrade() {
        return Optional.ofNullable(this.upgrade);
    }
    /**
     * @return The user account configuration (conflicts
     * with `user_data_file_id`).
     * 
     */
    public Optional<VirtualMachineInitializationUserAccount> userAccount() {
        return Optional.ofNullable(this.userAccount);
    }
    /**
     * @return The identifier for a file containing
     * custom user data (conflicts with `user_account`).
     * 
     */
    public Optional<String> userDataFileId() {
        return Optional.ofNullable(this.userDataFileId);
    }
    /**
     * @return The identifier for a file containing
     * all vendor data passed to the VM via cloud-init.
     * 
     */
    public Optional<String> vendorDataFileId() {
        return Optional.ofNullable(this.vendorDataFileId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineInitialization defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String datastoreId;
        private @Nullable VirtualMachineInitializationDns dns;
        private @Nullable String interface_;
        private @Nullable List<VirtualMachineInitializationIpConfig> ipConfigs;
        private @Nullable String metaDataFileId;
        private @Nullable String networkDataFileId;
        private @Nullable String type;
        private @Nullable Boolean upgrade;
        private @Nullable VirtualMachineInitializationUserAccount userAccount;
        private @Nullable String userDataFileId;
        private @Nullable String vendorDataFileId;
        public Builder() {}
        public Builder(VirtualMachineInitialization defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datastoreId = defaults.datastoreId;
    	      this.dns = defaults.dns;
    	      this.interface_ = defaults.interface_;
    	      this.ipConfigs = defaults.ipConfigs;
    	      this.metaDataFileId = defaults.metaDataFileId;
    	      this.networkDataFileId = defaults.networkDataFileId;
    	      this.type = defaults.type;
    	      this.upgrade = defaults.upgrade;
    	      this.userAccount = defaults.userAccount;
    	      this.userDataFileId = defaults.userDataFileId;
    	      this.vendorDataFileId = defaults.vendorDataFileId;
        }

        @CustomType.Setter
        public Builder datastoreId(@Nullable String datastoreId) {

            this.datastoreId = datastoreId;
            return this;
        }
        @CustomType.Setter
        public Builder dns(@Nullable VirtualMachineInitializationDns dns) {

            this.dns = dns;
            return this;
        }
        @CustomType.Setter("interface")
        public Builder interface_(@Nullable String interface_) {

            this.interface_ = interface_;
            return this;
        }
        @CustomType.Setter
        public Builder ipConfigs(@Nullable List<VirtualMachineInitializationIpConfig> ipConfigs) {

            this.ipConfigs = ipConfigs;
            return this;
        }
        public Builder ipConfigs(VirtualMachineInitializationIpConfig... ipConfigs) {
            return ipConfigs(List.of(ipConfigs));
        }
        @CustomType.Setter
        public Builder metaDataFileId(@Nullable String metaDataFileId) {

            this.metaDataFileId = metaDataFileId;
            return this;
        }
        @CustomType.Setter
        public Builder networkDataFileId(@Nullable String networkDataFileId) {

            this.networkDataFileId = networkDataFileId;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder upgrade(@Nullable Boolean upgrade) {

            this.upgrade = upgrade;
            return this;
        }
        @CustomType.Setter
        public Builder userAccount(@Nullable VirtualMachineInitializationUserAccount userAccount) {

            this.userAccount = userAccount;
            return this;
        }
        @CustomType.Setter
        public Builder userDataFileId(@Nullable String userDataFileId) {

            this.userDataFileId = userDataFileId;
            return this;
        }
        @CustomType.Setter
        public Builder vendorDataFileId(@Nullable String vendorDataFileId) {

            this.vendorDataFileId = vendorDataFileId;
            return this;
        }
        public VirtualMachineInitialization build() {
            final var _resultValue = new VirtualMachineInitialization();
            _resultValue.datastoreId = datastoreId;
            _resultValue.dns = dns;
            _resultValue.interface_ = interface_;
            _resultValue.ipConfigs = ipConfigs;
            _resultValue.metaDataFileId = metaDataFileId;
            _resultValue.networkDataFileId = networkDataFileId;
            _resultValue.type = type;
            _resultValue.upgrade = upgrade;
            _resultValue.userAccount = userAccount;
            _resultValue.userDataFileId = userDataFileId;
            _resultValue.vendorDataFileId = vendorDataFileId;
            return _resultValue;
        }
    }
}
