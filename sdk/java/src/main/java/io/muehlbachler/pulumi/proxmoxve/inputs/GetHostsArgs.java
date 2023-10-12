// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetHostsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetHostsArgs Empty = new GetHostsArgs();

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

    private GetHostsArgs() {}

    private GetHostsArgs(GetHostsArgs $) {
        this.nodeName = $.nodeName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetHostsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetHostsArgs $;

        public Builder() {
            $ = new GetHostsArgs();
        }

        public Builder(GetHostsArgs defaults) {
            $ = new GetHostsArgs(Objects.requireNonNull(defaults));
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

        public GetHostsArgs build() {
            $.nodeName = Objects.requireNonNull($.nodeName, "expected parameter 'nodeName' to be non-null");
            return $;
        }
    }

}
