// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.CT.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ContainerDisk {
    /**
     * @return The identifier for the datastore to create the
     * disk in (defaults to `local`).
     * 
     */
    private @Nullable String datastoreId;
    /**
     * @return The size of the root filesystem in gigabytes (defaults
     * to `4`). Requires `datastore_id` to be set.
     * 
     */
    private @Nullable Integer size;

    private ContainerDisk() {}
    /**
     * @return The identifier for the datastore to create the
     * disk in (defaults to `local`).
     * 
     */
    public Optional<String> datastoreId() {
        return Optional.ofNullable(this.datastoreId);
    }
    /**
     * @return The size of the root filesystem in gigabytes (defaults
     * to `4`). Requires `datastore_id` to be set.
     * 
     */
    public Optional<Integer> size() {
        return Optional.ofNullable(this.size);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerDisk defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String datastoreId;
        private @Nullable Integer size;
        public Builder() {}
        public Builder(ContainerDisk defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datastoreId = defaults.datastoreId;
    	      this.size = defaults.size;
        }

        @CustomType.Setter
        public Builder datastoreId(@Nullable String datastoreId) {

            this.datastoreId = datastoreId;
            return this;
        }
        @CustomType.Setter
        public Builder size(@Nullable Integer size) {

            this.size = size;
            return this;
        }
        public ContainerDisk build() {
            final var _resultValue = new ContainerDisk();
            _resultValue.datastoreId = datastoreId;
            _resultValue.size = size;
            return _resultValue;
        }
    }
}
