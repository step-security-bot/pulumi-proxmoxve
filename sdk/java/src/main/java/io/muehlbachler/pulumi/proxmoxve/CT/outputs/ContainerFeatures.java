// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.CT.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ContainerFeatures {
    /**
     * @return Whether the container supports FUSE mounts (defaults
     * to `false`)
     * 
     */
    private @Nullable Boolean fuse;
    /**
     * @return Whether the container supports `keyctl()` system
     * call (defaults to `false`)
     * 
     */
    private @Nullable Boolean keyctl;
    /**
     * @return List of allowed mount types (`cifs` or `nfs`)
     * 
     */
    private @Nullable List<String> mounts;
    /**
     * @return Whether the container is nested (defaults
     * to `false`)
     * 
     */
    private @Nullable Boolean nesting;

    private ContainerFeatures() {}
    /**
     * @return Whether the container supports FUSE mounts (defaults
     * to `false`)
     * 
     */
    public Optional<Boolean> fuse() {
        return Optional.ofNullable(this.fuse);
    }
    /**
     * @return Whether the container supports `keyctl()` system
     * call (defaults to `false`)
     * 
     */
    public Optional<Boolean> keyctl() {
        return Optional.ofNullable(this.keyctl);
    }
    /**
     * @return List of allowed mount types (`cifs` or `nfs`)
     * 
     */
    public List<String> mounts() {
        return this.mounts == null ? List.of() : this.mounts;
    }
    /**
     * @return Whether the container is nested (defaults
     * to `false`)
     * 
     */
    public Optional<Boolean> nesting() {
        return Optional.ofNullable(this.nesting);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerFeatures defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean fuse;
        private @Nullable Boolean keyctl;
        private @Nullable List<String> mounts;
        private @Nullable Boolean nesting;
        public Builder() {}
        public Builder(ContainerFeatures defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fuse = defaults.fuse;
    	      this.keyctl = defaults.keyctl;
    	      this.mounts = defaults.mounts;
    	      this.nesting = defaults.nesting;
        }

        @CustomType.Setter
        public Builder fuse(@Nullable Boolean fuse) {

            this.fuse = fuse;
            return this;
        }
        @CustomType.Setter
        public Builder keyctl(@Nullable Boolean keyctl) {

            this.keyctl = keyctl;
            return this;
        }
        @CustomType.Setter
        public Builder mounts(@Nullable List<String> mounts) {

            this.mounts = mounts;
            return this;
        }
        public Builder mounts(String... mounts) {
            return mounts(List.of(mounts));
        }
        @CustomType.Setter
        public Builder nesting(@Nullable Boolean nesting) {

            this.nesting = nesting;
            return this;
        }
        public ContainerFeatures build() {
            final var _resultValue = new ContainerFeatures();
            _resultValue.fuse = fuse;
            _resultValue.keyctl = keyctl;
            _resultValue.mounts = mounts;
            _resultValue.nesting = nesting;
            return _resultValue;
        }
    }
}
