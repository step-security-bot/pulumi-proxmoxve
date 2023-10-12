// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ProxmoxVE.VM.Inputs
{

    public sealed class VirtualMachineAgentGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether to enable the VGA device (defaults
        /// to `true`).
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// The maximum amount of time to wait for data from
        /// the QEMU agent to become available ( defaults to `15m`).
        /// </summary>
        [Input("timeout")]
        public Input<string>? Timeout { get; set; }

        /// <summary>
        /// Whether to enable the FSTRIM feature in the QEMU agent
        /// (defaults to `false`).
        /// </summary>
        [Input("trim")]
        public Input<bool>? Trim { get; set; }

        /// <summary>
        /// The VGA type (defaults to `std`).
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public VirtualMachineAgentGetArgs()
        {
        }
        public static new VirtualMachineAgentGetArgs Empty => new VirtualMachineAgentGetArgs();
    }
}
