// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ProxmoxVE.VM.Inputs
{

    public sealed class VirtualMachineOperatingSystemArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The VGA type (defaults to `std`).
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public VirtualMachineOperatingSystemArgs()
        {
        }
        public static new VirtualMachineOperatingSystemArgs Empty => new VirtualMachineOperatingSystemArgs();
    }
}
