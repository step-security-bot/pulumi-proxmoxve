// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.CT.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ContainerOperatingSystemArgs extends com.pulumi.resources.ResourceArgs {

    public static final ContainerOperatingSystemArgs Empty = new ContainerOperatingSystemArgs();

    /**
     * The identifier for an OS template file.
     * 
     */
    @Import(name="templateFileId", required=true)
    private Output<String> templateFileId;

    /**
     * @return The identifier for an OS template file.
     * 
     */
    public Output<String> templateFileId() {
        return this.templateFileId;
    }

    /**
     * The type (defaults to `unmanaged`).
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return The type (defaults to `unmanaged`).
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private ContainerOperatingSystemArgs() {}

    private ContainerOperatingSystemArgs(ContainerOperatingSystemArgs $) {
        this.templateFileId = $.templateFileId;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContainerOperatingSystemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContainerOperatingSystemArgs $;

        public Builder() {
            $ = new ContainerOperatingSystemArgs();
        }

        public Builder(ContainerOperatingSystemArgs defaults) {
            $ = new ContainerOperatingSystemArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param templateFileId The identifier for an OS template file.
         * 
         * @return builder
         * 
         */
        public Builder templateFileId(Output<String> templateFileId) {
            $.templateFileId = templateFileId;
            return this;
        }

        /**
         * @param templateFileId The identifier for an OS template file.
         * 
         * @return builder
         * 
         */
        public Builder templateFileId(String templateFileId) {
            return templateFileId(Output.of(templateFileId));
        }

        /**
         * @param type The type (defaults to `unmanaged`).
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type (defaults to `unmanaged`).
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ContainerOperatingSystemArgs build() {
            if ($.templateFileId == null) {
                throw new MissingRequiredPropertyException("ContainerOperatingSystemArgs", "templateFileId");
            }
            return $;
        }
    }

}
