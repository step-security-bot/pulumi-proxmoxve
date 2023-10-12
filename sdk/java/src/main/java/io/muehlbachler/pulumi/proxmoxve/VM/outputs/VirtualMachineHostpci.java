// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.VM.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualMachineHostpci {
    /**
     * @return The device (defaults to `socket`).
     * - `/dev/*` - A host serial device.
     * 
     */
    private String device;
    /**
     * @return The PCI device ID. Use either this or `mapping`.
     * 
     */
    private @Nullable String id;
    /**
     * @return The resource mapping name of the device, for
     * example gpu. Use either this or `id`.
     * 
     */
    private @Nullable String mapping;
    /**
     * @return The mediated device ID to use.
     * 
     */
    private @Nullable String mdev;
    /**
     * @return Tells Proxmox to use a PCIe or PCI port. Some
     * guests/device combination require PCIe rather than PCI. PCIe is only
     * available for q35 machine types.
     * 
     */
    private @Nullable Boolean pcie;
    /**
     * @return A path to a ROM file for the device to use. This
     * is a relative path under `/usr/share/kvm/`.
     * 
     */
    private @Nullable String romFile;
    /**
     * @return Makes the firmware ROM visible for the VM (defaults
     * to `true`).
     * 
     */
    private @Nullable Boolean rombar;
    /**
     * @return Marks the PCI(e) device as the primary GPU of the VM.
     * With this enabled the `vga` configuration argument will be ignored.
     * 
     */
    private @Nullable Boolean xvga;

    private VirtualMachineHostpci() {}
    /**
     * @return The device (defaults to `socket`).
     * - `/dev/*` - A host serial device.
     * 
     */
    public String device() {
        return this.device;
    }
    /**
     * @return The PCI device ID. Use either this or `mapping`.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return The resource mapping name of the device, for
     * example gpu. Use either this or `id`.
     * 
     */
    public Optional<String> mapping() {
        return Optional.ofNullable(this.mapping);
    }
    /**
     * @return The mediated device ID to use.
     * 
     */
    public Optional<String> mdev() {
        return Optional.ofNullable(this.mdev);
    }
    /**
     * @return Tells Proxmox to use a PCIe or PCI port. Some
     * guests/device combination require PCIe rather than PCI. PCIe is only
     * available for q35 machine types.
     * 
     */
    public Optional<Boolean> pcie() {
        return Optional.ofNullable(this.pcie);
    }
    /**
     * @return A path to a ROM file for the device to use. This
     * is a relative path under `/usr/share/kvm/`.
     * 
     */
    public Optional<String> romFile() {
        return Optional.ofNullable(this.romFile);
    }
    /**
     * @return Makes the firmware ROM visible for the VM (defaults
     * to `true`).
     * 
     */
    public Optional<Boolean> rombar() {
        return Optional.ofNullable(this.rombar);
    }
    /**
     * @return Marks the PCI(e) device as the primary GPU of the VM.
     * With this enabled the `vga` configuration argument will be ignored.
     * 
     */
    public Optional<Boolean> xvga() {
        return Optional.ofNullable(this.xvga);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineHostpci defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String device;
        private @Nullable String id;
        private @Nullable String mapping;
        private @Nullable String mdev;
        private @Nullable Boolean pcie;
        private @Nullable String romFile;
        private @Nullable Boolean rombar;
        private @Nullable Boolean xvga;
        public Builder() {}
        public Builder(VirtualMachineHostpci defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.device = defaults.device;
    	      this.id = defaults.id;
    	      this.mapping = defaults.mapping;
    	      this.mdev = defaults.mdev;
    	      this.pcie = defaults.pcie;
    	      this.romFile = defaults.romFile;
    	      this.rombar = defaults.rombar;
    	      this.xvga = defaults.xvga;
        }

        @CustomType.Setter
        public Builder device(String device) {
            this.device = Objects.requireNonNull(device);
            return this;
        }
        @CustomType.Setter
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder mapping(@Nullable String mapping) {
            this.mapping = mapping;
            return this;
        }
        @CustomType.Setter
        public Builder mdev(@Nullable String mdev) {
            this.mdev = mdev;
            return this;
        }
        @CustomType.Setter
        public Builder pcie(@Nullable Boolean pcie) {
            this.pcie = pcie;
            return this;
        }
        @CustomType.Setter
        public Builder romFile(@Nullable String romFile) {
            this.romFile = romFile;
            return this;
        }
        @CustomType.Setter
        public Builder rombar(@Nullable Boolean rombar) {
            this.rombar = rombar;
            return this;
        }
        @CustomType.Setter
        public Builder xvga(@Nullable Boolean xvga) {
            this.xvga = xvga;
            return this;
        }
        public VirtualMachineHostpci build() {
            final var o = new VirtualMachineHostpci();
            o.device = device;
            o.id = id;
            o.mapping = mapping;
            o.mdev = mdev;
            o.pcie = pcie;
            o.romFile = romFile;
            o.rombar = rombar;
            o.xvga = xvga;
            return o;
        }
    }
}
