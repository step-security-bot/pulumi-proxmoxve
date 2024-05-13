// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.CT.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ContainerConsole {
    /**
     * @return Whether to enable the console device (defaults
     * to `true`).
     * 
     */
    private @Nullable Boolean enabled;
    /**
     * @return The number of available TTY (defaults to `2`).
     * 
     */
    private @Nullable Integer ttyCount;
    /**
     * @return The console mode (defaults to `tty`).
     * 
     */
    private @Nullable String type;

    private ContainerConsole() {}
    /**
     * @return Whether to enable the console device (defaults
     * to `true`).
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return The number of available TTY (defaults to `2`).
     * 
     */
    public Optional<Integer> ttyCount() {
        return Optional.ofNullable(this.ttyCount);
    }
    /**
     * @return The console mode (defaults to `tty`).
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerConsole defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable Integer ttyCount;
        private @Nullable String type;
        public Builder() {}
        public Builder(ContainerConsole defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.ttyCount = defaults.ttyCount;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder ttyCount(@Nullable Integer ttyCount) {

            this.ttyCount = ttyCount;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        public ContainerConsole build() {
            final var _resultValue = new ContainerConsole();
            _resultValue.enabled = enabled;
            _resultValue.ttyCount = ttyCount;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
