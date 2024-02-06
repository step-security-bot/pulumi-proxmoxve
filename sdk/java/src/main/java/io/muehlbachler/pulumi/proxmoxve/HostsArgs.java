// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import io.muehlbachler.pulumi.proxmoxve.inputs.HostsEntryArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class HostsArgs extends com.pulumi.resources.ResourceArgs {

    public static final HostsArgs Empty = new HostsArgs();

    /**
     * A host entry (multiple blocks supported).
     * 
     */
    @Import(name="entry", required=true)
    private Output<List<HostsEntryArgs>> entry;

    /**
     * @return A host entry (multiple blocks supported).
     * 
     */
    public Output<List<HostsEntryArgs>> entry() {
        return this.entry;
    }

    /**
     * A node name.
     * 
     */
    @Import(name="nodeName", required=true)
    private Output<String> nodeName;

    /**
     * @return A node name.
     * 
     */
    public Output<String> nodeName() {
        return this.nodeName;
    }

    private HostsArgs() {}

    private HostsArgs(HostsArgs $) {
        this.entry = $.entry;
        this.nodeName = $.nodeName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HostsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HostsArgs $;

        public Builder() {
            $ = new HostsArgs();
        }

        public Builder(HostsArgs defaults) {
            $ = new HostsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param entry A host entry (multiple blocks supported).
         * 
         * @return builder
         * 
         */
        public Builder entry(Output<List<HostsEntryArgs>> entry) {
            $.entry = entry;
            return this;
        }

        /**
         * @param entry A host entry (multiple blocks supported).
         * 
         * @return builder
         * 
         */
        public Builder entry(List<HostsEntryArgs> entry) {
            return entry(Output.of(entry));
        }

        /**
         * @param entry A host entry (multiple blocks supported).
         * 
         * @return builder
         * 
         */
        public Builder entry(HostsEntryArgs... entry) {
            return entry(List.of(entry));
        }

        /**
         * @param nodeName A node name.
         * 
         * @return builder
         * 
         */
        public Builder nodeName(Output<String> nodeName) {
            $.nodeName = nodeName;
            return this;
        }

        /**
         * @param nodeName A node name.
         * 
         * @return builder
         * 
         */
        public Builder nodeName(String nodeName) {
            return nodeName(Output.of(nodeName));
        }

        public HostsArgs build() {
            if ($.entry == null) {
                throw new MissingRequiredPropertyException("HostsArgs", "entry");
            }
            if ($.nodeName == null) {
                throw new MissingRequiredPropertyException("HostsArgs", "nodeName");
            }
            return $;
        }
    }

}
