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
public final class VirtualMachineUsb {
    /**
     * @return The USB device ID. Use either this or `mapping`.
     * 
     */
    private @Nullable String host;
    /**
     * @return The resource mapping name of the device, for
     * example usbdevice. Use either this or `id`.
     * 
     */
    private @Nullable String mapping;
    /**
     * @return Makes the USB device a USB3 device for the VM
     * (defaults to `false`).
     * 
     */
    private @Nullable Boolean usb3;

    private VirtualMachineUsb() {}
    /**
     * @return The USB device ID. Use either this or `mapping`.
     * 
     */
    public Optional<String> host() {
        return Optional.ofNullable(this.host);
    }
    /**
     * @return The resource mapping name of the device, for
     * example usbdevice. Use either this or `id`.
     * 
     */
    public Optional<String> mapping() {
        return Optional.ofNullable(this.mapping);
    }
    /**
     * @return Makes the USB device a USB3 device for the VM
     * (defaults to `false`).
     * 
     */
    public Optional<Boolean> usb3() {
        return Optional.ofNullable(this.usb3);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineUsb defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String host;
        private @Nullable String mapping;
        private @Nullable Boolean usb3;
        public Builder() {}
        public Builder(VirtualMachineUsb defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.host = defaults.host;
    	      this.mapping = defaults.mapping;
    	      this.usb3 = defaults.usb3;
        }

        @CustomType.Setter
        public Builder host(@Nullable String host) {

            this.host = host;
            return this;
        }
        @CustomType.Setter
        public Builder mapping(@Nullable String mapping) {

            this.mapping = mapping;
            return this;
        }
        @CustomType.Setter
        public Builder usb3(@Nullable Boolean usb3) {

            this.usb3 = usb3;
            return this;
        }
        public VirtualMachineUsb build() {
            final var _resultValue = new VirtualMachineUsb();
            _resultValue.host = host;
            _resultValue.mapping = mapping;
            _resultValue.usb3 = usb3;
            return _resultValue;
        }
    }
}
