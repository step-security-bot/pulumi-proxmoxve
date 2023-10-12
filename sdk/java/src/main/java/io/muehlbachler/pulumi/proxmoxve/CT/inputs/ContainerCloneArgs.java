// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.CT.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ContainerCloneArgs extends com.pulumi.resources.ResourceArgs {

    public static final ContainerCloneArgs Empty = new ContainerCloneArgs();

    /**
     * The identifier for the datastore to create the
     * disk in (defaults to `local`).
     * 
     */
    @Import(name="datastoreId")
    private @Nullable Output<String> datastoreId;

    /**
     * @return The identifier for the datastore to create the
     * disk in (defaults to `local`).
     * 
     */
    public Optional<Output<String>> datastoreId() {
        return Optional.ofNullable(this.datastoreId);
    }

    /**
     * The name of the node to assign the container to.
     * 
     */
    @Import(name="nodeName")
    private @Nullable Output<String> nodeName;

    /**
     * @return The name of the node to assign the container to.
     * 
     */
    public Optional<Output<String>> nodeName() {
        return Optional.ofNullable(this.nodeName);
    }

    /**
     * The container identifier
     * 
     */
    @Import(name="vmId", required=true)
    private Output<Integer> vmId;

    /**
     * @return The container identifier
     * 
     */
    public Output<Integer> vmId() {
        return this.vmId;
    }

    private ContainerCloneArgs() {}

    private ContainerCloneArgs(ContainerCloneArgs $) {
        this.datastoreId = $.datastoreId;
        this.nodeName = $.nodeName;
        this.vmId = $.vmId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContainerCloneArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContainerCloneArgs $;

        public Builder() {
            $ = new ContainerCloneArgs();
        }

        public Builder(ContainerCloneArgs defaults) {
            $ = new ContainerCloneArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param datastoreId The identifier for the datastore to create the
         * disk in (defaults to `local`).
         * 
         * @return builder
         * 
         */
        public Builder datastoreId(@Nullable Output<String> datastoreId) {
            $.datastoreId = datastoreId;
            return this;
        }

        /**
         * @param datastoreId The identifier for the datastore to create the
         * disk in (defaults to `local`).
         * 
         * @return builder
         * 
         */
        public Builder datastoreId(String datastoreId) {
            return datastoreId(Output.of(datastoreId));
        }

        /**
         * @param nodeName The name of the node to assign the container to.
         * 
         * @return builder
         * 
         */
        public Builder nodeName(@Nullable Output<String> nodeName) {
            $.nodeName = nodeName;
            return this;
        }

        /**
         * @param nodeName The name of the node to assign the container to.
         * 
         * @return builder
         * 
         */
        public Builder nodeName(String nodeName) {
            return nodeName(Output.of(nodeName));
        }

        /**
         * @param vmId The container identifier
         * 
         * @return builder
         * 
         */
        public Builder vmId(Output<Integer> vmId) {
            $.vmId = vmId;
            return this;
        }

        /**
         * @param vmId The container identifier
         * 
         * @return builder
         * 
         */
        public Builder vmId(Integer vmId) {
            return vmId(Output.of(vmId));
        }

        public ContainerCloneArgs build() {
            $.vmId = Objects.requireNonNull($.vmId, "expected parameter 'vmId' to be non-null");
            return $;
        }
    }

}
