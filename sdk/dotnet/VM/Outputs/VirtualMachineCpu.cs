// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ProxmoxVE.VM.Outputs
{

    [OutputType]
    public sealed class VirtualMachineCpu
    {
        /// <summary>
        /// The CPU architecture (defaults to `x86_64`).
        /// </summary>
        public readonly string? Architecture;
        /// <summary>
        /// The number of CPU cores (defaults to `1`).
        /// </summary>
        public readonly int? Cores;
        /// <summary>
        /// The CPU flags.
        /// - `+aes`/`-aes` - Activate AES instruction set for HW acceleration.
        /// - `+amd-no-ssb`/`-amd-no-ssb` - Notifies guest OS that host is not
        /// vulnerable for Spectre on AMD CPUs.
        /// - `+amd-ssbd`/`-amd-ssbd` - Improves Spectre mitigation performance with
        /// AMD CPUs, best used with "virt-ssbd".
        /// - `+hv-evmcs`/`-hv-evmcs` - Improve performance for nested
        /// virtualization (only supported on Intel CPUs).
        /// - `+hv-tlbflush`/`-hv-tlbflush` - Improve performance in overcommitted
        /// Windows guests (may lead to guest BSOD on old CPUs).
        /// - `+ibpb`/`-ibpb` - Allows improved Spectre mitigation on AMD CPUs.
        /// - `+md-clear`/`-md-clear` - Required to let the guest OS know if MDS is
        /// mitigated correctly.
        /// - `+pcid`/`-pcid` - Meltdown fix cost reduction on Westmere, Sandy- and
        /// Ivy Bridge Intel CPUs.
        /// - `+pdpe1gb`/`-pdpe1gb` - Allows guest OS to use 1 GB size pages, if
        /// host HW supports it.
        /// - `+spec-ctrl`/`-spec-ctrl` - Allows improved Spectre mitigation with
        /// Intel CPUs.
        /// - `+ssbd`/`-ssbd` - Protection for "Speculative Store Bypass" for Intel
        /// models.
        /// - `+virt-ssbd`/`-virt-ssbd` - Basis for "Speculative Store Bypass"
        /// protection for AMD models.
        /// </summary>
        public readonly ImmutableArray<string> Flags;
        /// <summary>
        /// The number of hotplugged vCPUs (defaults
        /// to `0`).
        /// </summary>
        public readonly int? Hotplugged;
        /// <summary>
        /// Enable/disable NUMA. (default to `false`)
        /// </summary>
        public readonly bool? Numa;
        /// <summary>
        /// The number of CPU sockets (defaults to `1`).
        /// </summary>
        public readonly int? Sockets;
        /// <summary>
        /// The VGA type (defaults to `std`).
        /// </summary>
        public readonly string? Type;
        /// <summary>
        /// The CPU units (defaults to `1024`).
        /// </summary>
        public readonly int? Units;

        [OutputConstructor]
        private VirtualMachineCpu(
            string? architecture,

            int? cores,

            ImmutableArray<string> flags,

            int? hotplugged,

            bool? numa,

            int? sockets,

            string? type,

            int? units)
        {
            Architecture = architecture;
            Cores = cores;
            Flags = flags;
            Hotplugged = hotplugged;
            Numa = numa;
            Sockets = sockets;
            Type = type;
            Units = units;
        }
    }
}
