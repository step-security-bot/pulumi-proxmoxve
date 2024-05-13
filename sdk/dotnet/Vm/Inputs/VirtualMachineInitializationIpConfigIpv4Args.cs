// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ProxmoxVE.VM.Inputs
{

    public sealed class VirtualMachineInitializationIpConfigIpv4Args : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The IPv4 address
        /// </summary>
        [Input("address")]
        public Input<string>? Address { get; set; }

        /// <summary>
        /// The IPv4 gateway
        /// </summary>
        [Input("gateway")]
        public Input<string>? Gateway { get; set; }

        public VirtualMachineInitializationIpConfigIpv4Args()
        {
        }
        public static new VirtualMachineInitializationIpConfigIpv4Args Empty => new VirtualMachineInitializationIpConfigIpv4Args();
    }
}
