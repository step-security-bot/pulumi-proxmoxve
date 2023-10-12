// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.Network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import io.muehlbachler.pulumi.proxmoxve.Network.inputs.FirewallLogRatelimitArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FirewallState extends com.pulumi.resources.ResourceArgs {

    public static final FirewallState Empty = new FirewallState();

    /**
     * Enable ebtables rules cluster wide.
     * 
     */
    @Import(name="ebtables")
    private @Nullable Output<Boolean> ebtables;

    /**
     * @return Enable ebtables rules cluster wide.
     * 
     */
    public Optional<Output<Boolean>> ebtables() {
        return Optional.ofNullable(this.ebtables);
    }

    /**
     * Enable or disable the log rate limit.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Enable or disable the log rate limit.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * The default input policy (`ACCEPT`, `DROP`, `REJECT`).
     * 
     */
    @Import(name="inputPolicy")
    private @Nullable Output<String> inputPolicy;

    /**
     * @return The default input policy (`ACCEPT`, `DROP`, `REJECT`).
     * 
     */
    public Optional<Output<String>> inputPolicy() {
        return Optional.ofNullable(this.inputPolicy);
    }

    /**
     * The log rate limit.
     * 
     */
    @Import(name="logRatelimit")
    private @Nullable Output<FirewallLogRatelimitArgs> logRatelimit;

    /**
     * @return The log rate limit.
     * 
     */
    public Optional<Output<FirewallLogRatelimitArgs>> logRatelimit() {
        return Optional.ofNullable(this.logRatelimit);
    }

    /**
     * The default output policy (`ACCEPT`, `DROP`, `REJECT`).
     * 
     */
    @Import(name="outputPolicy")
    private @Nullable Output<String> outputPolicy;

    /**
     * @return The default output policy (`ACCEPT`, `DROP`, `REJECT`).
     * 
     */
    public Optional<Output<String>> outputPolicy() {
        return Optional.ofNullable(this.outputPolicy);
    }

    private FirewallState() {}

    private FirewallState(FirewallState $) {
        this.ebtables = $.ebtables;
        this.enabled = $.enabled;
        this.inputPolicy = $.inputPolicy;
        this.logRatelimit = $.logRatelimit;
        this.outputPolicy = $.outputPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirewallState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirewallState $;

        public Builder() {
            $ = new FirewallState();
        }

        public Builder(FirewallState defaults) {
            $ = new FirewallState(Objects.requireNonNull(defaults));
        }

        /**
         * @param ebtables Enable ebtables rules cluster wide.
         * 
         * @return builder
         * 
         */
        public Builder ebtables(@Nullable Output<Boolean> ebtables) {
            $.ebtables = ebtables;
            return this;
        }

        /**
         * @param ebtables Enable ebtables rules cluster wide.
         * 
         * @return builder
         * 
         */
        public Builder ebtables(Boolean ebtables) {
            return ebtables(Output.of(ebtables));
        }

        /**
         * @param enabled Enable or disable the log rate limit.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Enable or disable the log rate limit.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param inputPolicy The default input policy (`ACCEPT`, `DROP`, `REJECT`).
         * 
         * @return builder
         * 
         */
        public Builder inputPolicy(@Nullable Output<String> inputPolicy) {
            $.inputPolicy = inputPolicy;
            return this;
        }

        /**
         * @param inputPolicy The default input policy (`ACCEPT`, `DROP`, `REJECT`).
         * 
         * @return builder
         * 
         */
        public Builder inputPolicy(String inputPolicy) {
            return inputPolicy(Output.of(inputPolicy));
        }

        /**
         * @param logRatelimit The log rate limit.
         * 
         * @return builder
         * 
         */
        public Builder logRatelimit(@Nullable Output<FirewallLogRatelimitArgs> logRatelimit) {
            $.logRatelimit = logRatelimit;
            return this;
        }

        /**
         * @param logRatelimit The log rate limit.
         * 
         * @return builder
         * 
         */
        public Builder logRatelimit(FirewallLogRatelimitArgs logRatelimit) {
            return logRatelimit(Output.of(logRatelimit));
        }

        /**
         * @param outputPolicy The default output policy (`ACCEPT`, `DROP`, `REJECT`).
         * 
         * @return builder
         * 
         */
        public Builder outputPolicy(@Nullable Output<String> outputPolicy) {
            $.outputPolicy = outputPolicy;
            return this;
        }

        /**
         * @param outputPolicy The default output policy (`ACCEPT`, `DROP`, `REJECT`).
         * 
         * @return builder
         * 
         */
        public Builder outputPolicy(String outputPolicy) {
            return outputPolicy(Output.of(outputPolicy));
        }

        public FirewallState build() {
            return $;
        }
    }

}
