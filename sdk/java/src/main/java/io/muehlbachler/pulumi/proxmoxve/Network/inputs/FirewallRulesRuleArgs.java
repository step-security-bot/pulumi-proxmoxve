// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.Network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FirewallRulesRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirewallRulesRuleArgs Empty = new FirewallRulesRuleArgs();

    /**
     * Rule action (`ACCEPT`, `DROP`, `REJECT`).
     * 
     */
    @Import(name="action")
    private @Nullable Output<String> action;

    /**
     * @return Rule action (`ACCEPT`, `DROP`, `REJECT`).
     * 
     */
    public Optional<Output<String>> action() {
        return Optional.ofNullable(this.action);
    }

    /**
     * Rule comment.
     * 
     */
    @Import(name="comment")
    private @Nullable Output<String> comment;

    /**
     * @return Rule comment.
     * 
     */
    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    /**
     * Restrict packet destination address. This can
     * refer to a single IP address, an IP set (&#39;+ipsetname&#39;) or an IP alias
     * definition. You can also specify an address range
     * like `20.34.101.207-201.3.9.99`, or a list of IP addresses and
     * networks (entries are separated by comma). Please do not mix IPv4 and
     * IPv6 addresses inside such lists.
     * 
     */
    @Import(name="dest")
    private @Nullable Output<String> dest;

    /**
     * @return Restrict packet destination address. This can
     * refer to a single IP address, an IP set (&#39;+ipsetname&#39;) or an IP alias
     * definition. You can also specify an address range
     * like `20.34.101.207-201.3.9.99`, or a list of IP addresses and
     * networks (entries are separated by comma). Please do not mix IPv4 and
     * IPv6 addresses inside such lists.
     * 
     */
    public Optional<Output<String>> dest() {
        return Optional.ofNullable(this.dest);
    }

    /**
     * Restrict TCP/UDP destination port. You can use
     * service names or simple numbers (0-65535), as defined
     * in `/etc/services`. Port ranges can be specified with &#39;\d+:\d+&#39;, for
     * example `80:85`, and you can use comma separated list to match several
     * ports or ranges.
     * 
     */
    @Import(name="dport")
    private @Nullable Output<String> dport;

    /**
     * @return Restrict TCP/UDP destination port. You can use
     * service names or simple numbers (0-65535), as defined
     * in `/etc/services`. Port ranges can be specified with &#39;\d+:\d+&#39;, for
     * example `80:85`, and you can use comma separated list to match several
     * ports or ranges.
     * 
     */
    public Optional<Output<String>> dport() {
        return Optional.ofNullable(this.dport);
    }

    /**
     * Enable this rule. Defaults to `true`.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Enable this rule. Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Network interface name. You have to use network
     * configuration key names for VMs and containers (&#39;net\d+&#39;). Host
     * related rules can use arbitrary strings.
     * 
     */
    @Import(name="iface")
    private @Nullable Output<String> iface;

    /**
     * @return Network interface name. You have to use network
     * configuration key names for VMs and containers (&#39;net\d+&#39;). Host
     * related rules can use arbitrary strings.
     * 
     */
    public Optional<Output<String>> iface() {
        return Optional.ofNullable(this.iface);
    }

    /**
     * Log level for this rule (`emerg`, `alert`, `crit`,
     * `err`, `warning`, `notice`, `info`, `debug`, `nolog`).
     * 
     */
    @Import(name="log")
    private @Nullable Output<String> log;

    /**
     * @return Log level for this rule (`emerg`, `alert`, `crit`,
     * `err`, `warning`, `notice`, `info`, `debug`, `nolog`).
     * 
     */
    public Optional<Output<String>> log() {
        return Optional.ofNullable(this.log);
    }

    /**
     * Macro name. Use predefined standard macro
     * from https://pve.proxmox.com/pve-docs/pve-admin-guide.html#_firewall_macro_definitions
     * 
     */
    @Import(name="macro")
    private @Nullable Output<String> macro;

    /**
     * @return Macro name. Use predefined standard macro
     * from https://pve.proxmox.com/pve-docs/pve-admin-guide.html#_firewall_macro_definitions
     * 
     */
    public Optional<Output<String>> macro() {
        return Optional.ofNullable(this.macro);
    }

    /**
     * Position of the rule in the list.
     * 
     */
    @Import(name="pos")
    private @Nullable Output<Integer> pos;

    /**
     * @return Position of the rule in the list.
     * 
     */
    public Optional<Output<Integer>> pos() {
        return Optional.ofNullable(this.pos);
    }

    /**
     * Restrict packet protocol. You can use protocol
     * names as defined in &#39;/etc/protocols&#39;.
     * 
     */
    @Import(name="proto")
    private @Nullable Output<String> proto;

    /**
     * @return Restrict packet protocol. You can use protocol
     * names as defined in &#39;/etc/protocols&#39;.
     * 
     */
    public Optional<Output<String>> proto() {
        return Optional.ofNullable(this.proto);
    }

    /**
     * Security group name.
     * 
     */
    @Import(name="securityGroup")
    private @Nullable Output<String> securityGroup;

    /**
     * @return Security group name.
     * 
     */
    public Optional<Output<String>> securityGroup() {
        return Optional.ofNullable(this.securityGroup);
    }

    /**
     * Restrict packet source address. This can refer
     * to a single IP address, an IP set (&#39;+ipsetname&#39;) or an IP alias
     * definition. You can also specify an address range
     * like `20.34.101.207-201.3.9.99`, or a list of IP addresses and
     * networks (entries are separated by comma). Please do not mix IPv4 and
     * IPv6 addresses inside such lists.
     * 
     */
    @Import(name="source")
    private @Nullable Output<String> source;

    /**
     * @return Restrict packet source address. This can refer
     * to a single IP address, an IP set (&#39;+ipsetname&#39;) or an IP alias
     * definition. You can also specify an address range
     * like `20.34.101.207-201.3.9.99`, or a list of IP addresses and
     * networks (entries are separated by comma). Please do not mix IPv4 and
     * IPv6 addresses inside such lists.
     * 
     */
    public Optional<Output<String>> source() {
        return Optional.ofNullable(this.source);
    }

    /**
     * Restrict TCP/UDP source port. You can use
     * service names or simple numbers (0-65535), as defined
     * in `/etc/services`. Port ranges can be specified with &#39;\d+:\d+&#39;, for
     * example `80:85`, and you can use comma separated list to match several
     * ports or ranges.
     * - a security group insertion block, which includes the following arguments:
     * 
     */
    @Import(name="sport")
    private @Nullable Output<String> sport;

    /**
     * @return Restrict TCP/UDP source port. You can use
     * service names or simple numbers (0-65535), as defined
     * in `/etc/services`. Port ranges can be specified with &#39;\d+:\d+&#39;, for
     * example `80:85`, and you can use comma separated list to match several
     * ports or ranges.
     * - a security group insertion block, which includes the following arguments:
     * 
     */
    public Optional<Output<String>> sport() {
        return Optional.ofNullable(this.sport);
    }

    /**
     * Rule type (`in`, `out`).
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Rule type (`in`, `out`).
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private FirewallRulesRuleArgs() {}

    private FirewallRulesRuleArgs(FirewallRulesRuleArgs $) {
        this.action = $.action;
        this.comment = $.comment;
        this.dest = $.dest;
        this.dport = $.dport;
        this.enabled = $.enabled;
        this.iface = $.iface;
        this.log = $.log;
        this.macro = $.macro;
        this.pos = $.pos;
        this.proto = $.proto;
        this.securityGroup = $.securityGroup;
        this.source = $.source;
        this.sport = $.sport;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirewallRulesRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirewallRulesRuleArgs $;

        public Builder() {
            $ = new FirewallRulesRuleArgs();
        }

        public Builder(FirewallRulesRuleArgs defaults) {
            $ = new FirewallRulesRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param action Rule action (`ACCEPT`, `DROP`, `REJECT`).
         * 
         * @return builder
         * 
         */
        public Builder action(@Nullable Output<String> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action Rule action (`ACCEPT`, `DROP`, `REJECT`).
         * 
         * @return builder
         * 
         */
        public Builder action(String action) {
            return action(Output.of(action));
        }

        /**
         * @param comment Rule comment.
         * 
         * @return builder
         * 
         */
        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        /**
         * @param comment Rule comment.
         * 
         * @return builder
         * 
         */
        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        /**
         * @param dest Restrict packet destination address. This can
         * refer to a single IP address, an IP set (&#39;+ipsetname&#39;) or an IP alias
         * definition. You can also specify an address range
         * like `20.34.101.207-201.3.9.99`, or a list of IP addresses and
         * networks (entries are separated by comma). Please do not mix IPv4 and
         * IPv6 addresses inside such lists.
         * 
         * @return builder
         * 
         */
        public Builder dest(@Nullable Output<String> dest) {
            $.dest = dest;
            return this;
        }

        /**
         * @param dest Restrict packet destination address. This can
         * refer to a single IP address, an IP set (&#39;+ipsetname&#39;) or an IP alias
         * definition. You can also specify an address range
         * like `20.34.101.207-201.3.9.99`, or a list of IP addresses and
         * networks (entries are separated by comma). Please do not mix IPv4 and
         * IPv6 addresses inside such lists.
         * 
         * @return builder
         * 
         */
        public Builder dest(String dest) {
            return dest(Output.of(dest));
        }

        /**
         * @param dport Restrict TCP/UDP destination port. You can use
         * service names or simple numbers (0-65535), as defined
         * in `/etc/services`. Port ranges can be specified with &#39;\d+:\d+&#39;, for
         * example `80:85`, and you can use comma separated list to match several
         * ports or ranges.
         * 
         * @return builder
         * 
         */
        public Builder dport(@Nullable Output<String> dport) {
            $.dport = dport;
            return this;
        }

        /**
         * @param dport Restrict TCP/UDP destination port. You can use
         * service names or simple numbers (0-65535), as defined
         * in `/etc/services`. Port ranges can be specified with &#39;\d+:\d+&#39;, for
         * example `80:85`, and you can use comma separated list to match several
         * ports or ranges.
         * 
         * @return builder
         * 
         */
        public Builder dport(String dport) {
            return dport(Output.of(dport));
        }

        /**
         * @param enabled Enable this rule. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Enable this rule. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param iface Network interface name. You have to use network
         * configuration key names for VMs and containers (&#39;net\d+&#39;). Host
         * related rules can use arbitrary strings.
         * 
         * @return builder
         * 
         */
        public Builder iface(@Nullable Output<String> iface) {
            $.iface = iface;
            return this;
        }

        /**
         * @param iface Network interface name. You have to use network
         * configuration key names for VMs and containers (&#39;net\d+&#39;). Host
         * related rules can use arbitrary strings.
         * 
         * @return builder
         * 
         */
        public Builder iface(String iface) {
            return iface(Output.of(iface));
        }

        /**
         * @param log Log level for this rule (`emerg`, `alert`, `crit`,
         * `err`, `warning`, `notice`, `info`, `debug`, `nolog`).
         * 
         * @return builder
         * 
         */
        public Builder log(@Nullable Output<String> log) {
            $.log = log;
            return this;
        }

        /**
         * @param log Log level for this rule (`emerg`, `alert`, `crit`,
         * `err`, `warning`, `notice`, `info`, `debug`, `nolog`).
         * 
         * @return builder
         * 
         */
        public Builder log(String log) {
            return log(Output.of(log));
        }

        /**
         * @param macro Macro name. Use predefined standard macro
         * from https://pve.proxmox.com/pve-docs/pve-admin-guide.html#_firewall_macro_definitions
         * 
         * @return builder
         * 
         */
        public Builder macro(@Nullable Output<String> macro) {
            $.macro = macro;
            return this;
        }

        /**
         * @param macro Macro name. Use predefined standard macro
         * from https://pve.proxmox.com/pve-docs/pve-admin-guide.html#_firewall_macro_definitions
         * 
         * @return builder
         * 
         */
        public Builder macro(String macro) {
            return macro(Output.of(macro));
        }

        /**
         * @param pos Position of the rule in the list.
         * 
         * @return builder
         * 
         */
        public Builder pos(@Nullable Output<Integer> pos) {
            $.pos = pos;
            return this;
        }

        /**
         * @param pos Position of the rule in the list.
         * 
         * @return builder
         * 
         */
        public Builder pos(Integer pos) {
            return pos(Output.of(pos));
        }

        /**
         * @param proto Restrict packet protocol. You can use protocol
         * names as defined in &#39;/etc/protocols&#39;.
         * 
         * @return builder
         * 
         */
        public Builder proto(@Nullable Output<String> proto) {
            $.proto = proto;
            return this;
        }

        /**
         * @param proto Restrict packet protocol. You can use protocol
         * names as defined in &#39;/etc/protocols&#39;.
         * 
         * @return builder
         * 
         */
        public Builder proto(String proto) {
            return proto(Output.of(proto));
        }

        /**
         * @param securityGroup Security group name.
         * 
         * @return builder
         * 
         */
        public Builder securityGroup(@Nullable Output<String> securityGroup) {
            $.securityGroup = securityGroup;
            return this;
        }

        /**
         * @param securityGroup Security group name.
         * 
         * @return builder
         * 
         */
        public Builder securityGroup(String securityGroup) {
            return securityGroup(Output.of(securityGroup));
        }

        /**
         * @param source Restrict packet source address. This can refer
         * to a single IP address, an IP set (&#39;+ipsetname&#39;) or an IP alias
         * definition. You can also specify an address range
         * like `20.34.101.207-201.3.9.99`, or a list of IP addresses and
         * networks (entries are separated by comma). Please do not mix IPv4 and
         * IPv6 addresses inside such lists.
         * 
         * @return builder
         * 
         */
        public Builder source(@Nullable Output<String> source) {
            $.source = source;
            return this;
        }

        /**
         * @param source Restrict packet source address. This can refer
         * to a single IP address, an IP set (&#39;+ipsetname&#39;) or an IP alias
         * definition. You can also specify an address range
         * like `20.34.101.207-201.3.9.99`, or a list of IP addresses and
         * networks (entries are separated by comma). Please do not mix IPv4 and
         * IPv6 addresses inside such lists.
         * 
         * @return builder
         * 
         */
        public Builder source(String source) {
            return source(Output.of(source));
        }

        /**
         * @param sport Restrict TCP/UDP source port. You can use
         * service names or simple numbers (0-65535), as defined
         * in `/etc/services`. Port ranges can be specified with &#39;\d+:\d+&#39;, for
         * example `80:85`, and you can use comma separated list to match several
         * ports or ranges.
         * - a security group insertion block, which includes the following arguments:
         * 
         * @return builder
         * 
         */
        public Builder sport(@Nullable Output<String> sport) {
            $.sport = sport;
            return this;
        }

        /**
         * @param sport Restrict TCP/UDP source port. You can use
         * service names or simple numbers (0-65535), as defined
         * in `/etc/services`. Port ranges can be specified with &#39;\d+:\d+&#39;, for
         * example `80:85`, and you can use comma separated list to match several
         * ports or ranges.
         * - a security group insertion block, which includes the following arguments:
         * 
         * @return builder
         * 
         */
        public Builder sport(String sport) {
            return sport(Output.of(sport));
        }

        /**
         * @param type Rule type (`in`, `out`).
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Rule type (`in`, `out`).
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public FirewallRulesRuleArgs build() {
            return $;
        }
    }

}
