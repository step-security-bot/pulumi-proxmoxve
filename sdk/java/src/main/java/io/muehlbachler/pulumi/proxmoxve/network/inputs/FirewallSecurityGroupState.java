// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.Network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import io.muehlbachler.pulumi.proxmoxve.Network.inputs.FirewallSecurityGroupRuleArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FirewallSecurityGroupState extends com.pulumi.resources.ResourceArgs {

    public static final FirewallSecurityGroupState Empty = new FirewallSecurityGroupState();

    /**
     * Security group comment.
     * 
     */
    @Import(name="comment")
    private @Nullable Output<String> comment;

    /**
     * @return Security group comment.
     * 
     */
    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    /**
     * The ID of the container to manage the firewall for.
     * 
     */
    @Import(name="containerId")
    private @Nullable Output<Integer> containerId;

    /**
     * @return The ID of the container to manage the firewall for.
     * 
     */
    public Optional<Output<Integer>> containerId() {
        return Optional.ofNullable(this.containerId);
    }

    /**
     * Security group name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Security group name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the node.
     * 
     */
    @Import(name="nodeName")
    private @Nullable Output<String> nodeName;

    /**
     * @return The name of the node.
     * 
     */
    public Optional<Output<String>> nodeName() {
        return Optional.ofNullable(this.nodeName);
    }

    /**
     * Firewall rule block (multiple blocks supported).
     * 
     */
    @Import(name="rules")
    private @Nullable Output<List<FirewallSecurityGroupRuleArgs>> rules;

    /**
     * @return Firewall rule block (multiple blocks supported).
     * 
     */
    public Optional<Output<List<FirewallSecurityGroupRuleArgs>>> rules() {
        return Optional.ofNullable(this.rules);
    }

    /**
     * The ID of the VM to manage the firewall for.
     * 
     */
    @Import(name="vmId")
    private @Nullable Output<Integer> vmId;

    /**
     * @return The ID of the VM to manage the firewall for.
     * 
     */
    public Optional<Output<Integer>> vmId() {
        return Optional.ofNullable(this.vmId);
    }

    private FirewallSecurityGroupState() {}

    private FirewallSecurityGroupState(FirewallSecurityGroupState $) {
        this.comment = $.comment;
        this.containerId = $.containerId;
        this.name = $.name;
        this.nodeName = $.nodeName;
        this.rules = $.rules;
        this.vmId = $.vmId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirewallSecurityGroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirewallSecurityGroupState $;

        public Builder() {
            $ = new FirewallSecurityGroupState();
        }

        public Builder(FirewallSecurityGroupState defaults) {
            $ = new FirewallSecurityGroupState(Objects.requireNonNull(defaults));
        }

        /**
         * @param comment Security group comment.
         * 
         * @return builder
         * 
         */
        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        /**
         * @param comment Security group comment.
         * 
         * @return builder
         * 
         */
        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        /**
         * @param containerId The ID of the container to manage the firewall for.
         * 
         * @return builder
         * 
         */
        public Builder containerId(@Nullable Output<Integer> containerId) {
            $.containerId = containerId;
            return this;
        }

        /**
         * @param containerId The ID of the container to manage the firewall for.
         * 
         * @return builder
         * 
         */
        public Builder containerId(Integer containerId) {
            return containerId(Output.of(containerId));
        }

        /**
         * @param name Security group name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Security group name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param nodeName The name of the node.
         * 
         * @return builder
         * 
         */
        public Builder nodeName(@Nullable Output<String> nodeName) {
            $.nodeName = nodeName;
            return this;
        }

        /**
         * @param nodeName The name of the node.
         * 
         * @return builder
         * 
         */
        public Builder nodeName(String nodeName) {
            return nodeName(Output.of(nodeName));
        }

        /**
         * @param rules Firewall rule block (multiple blocks supported).
         * 
         * @return builder
         * 
         */
        public Builder rules(@Nullable Output<List<FirewallSecurityGroupRuleArgs>> rules) {
            $.rules = rules;
            return this;
        }

        /**
         * @param rules Firewall rule block (multiple blocks supported).
         * 
         * @return builder
         * 
         */
        public Builder rules(List<FirewallSecurityGroupRuleArgs> rules) {
            return rules(Output.of(rules));
        }

        /**
         * @param rules Firewall rule block (multiple blocks supported).
         * 
         * @return builder
         * 
         */
        public Builder rules(FirewallSecurityGroupRuleArgs... rules) {
            return rules(List.of(rules));
        }

        /**
         * @param vmId The ID of the VM to manage the firewall for.
         * 
         * @return builder
         * 
         */
        public Builder vmId(@Nullable Output<Integer> vmId) {
            $.vmId = vmId;
            return this;
        }

        /**
         * @param vmId The ID of the VM to manage the firewall for.
         * 
         * @return builder
         * 
         */
        public Builder vmId(Integer vmId) {
            return vmId(Output.of(vmId));
        }

        public FirewallSecurityGroupState build() {
            return $;
        }
    }

}
