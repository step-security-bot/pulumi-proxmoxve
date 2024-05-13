// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.VM.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualMachineCdromArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualMachineCdromArgs Empty = new VirtualMachineCdromArgs();

    /**
     * Whether to enable the CDROM drive (defaults
     * to `false`).
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Whether to enable the CDROM drive (defaults
     * to `false`).
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * A file ID for an ISO file (defaults to `cdrom` as
     * in the physical drive).
     * 
     */
    @Import(name="fileId")
    private @Nullable Output<String> fileId;

    /**
     * @return A file ID for an ISO file (defaults to `cdrom` as
     * in the physical drive).
     * 
     */
    public Optional<Output<String>> fileId() {
        return Optional.ofNullable(this.fileId);
    }

    /**
     * A hardware interface to connect CDROM drive to,
     * must be `ideN` (defaults to `ide3`). Note that `q35` machine type only
     * supports `ide0` and `ide2`.
     * 
     */
    @Import(name="interface")
    private @Nullable Output<String> interface_;

    /**
     * @return A hardware interface to connect CDROM drive to,
     * must be `ideN` (defaults to `ide3`). Note that `q35` machine type only
     * supports `ide0` and `ide2`.
     * 
     */
    public Optional<Output<String>> interface_() {
        return Optional.ofNullable(this.interface_);
    }

    private VirtualMachineCdromArgs() {}

    private VirtualMachineCdromArgs(VirtualMachineCdromArgs $) {
        this.enabled = $.enabled;
        this.fileId = $.fileId;
        this.interface_ = $.interface_;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualMachineCdromArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualMachineCdromArgs $;

        public Builder() {
            $ = new VirtualMachineCdromArgs();
        }

        public Builder(VirtualMachineCdromArgs defaults) {
            $ = new VirtualMachineCdromArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Whether to enable the CDROM drive (defaults
         * to `false`).
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether to enable the CDROM drive (defaults
         * to `false`).
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param fileId A file ID for an ISO file (defaults to `cdrom` as
         * in the physical drive).
         * 
         * @return builder
         * 
         */
        public Builder fileId(@Nullable Output<String> fileId) {
            $.fileId = fileId;
            return this;
        }

        /**
         * @param fileId A file ID for an ISO file (defaults to `cdrom` as
         * in the physical drive).
         * 
         * @return builder
         * 
         */
        public Builder fileId(String fileId) {
            return fileId(Output.of(fileId));
        }

        /**
         * @param interface_ A hardware interface to connect CDROM drive to,
         * must be `ideN` (defaults to `ide3`). Note that `q35` machine type only
         * supports `ide0` and `ide2`.
         * 
         * @return builder
         * 
         */
        public Builder interface_(@Nullable Output<String> interface_) {
            $.interface_ = interface_;
            return this;
        }

        /**
         * @param interface_ A hardware interface to connect CDROM drive to,
         * must be `ideN` (defaults to `ide3`). Note that `q35` machine type only
         * supports `ide0` and `ide2`.
         * 
         * @return builder
         * 
         */
        public Builder interface_(String interface_) {
            return interface_(Output.of(interface_));
        }

        public VirtualMachineCdromArgs build() {
            return $;
        }
    }

}
