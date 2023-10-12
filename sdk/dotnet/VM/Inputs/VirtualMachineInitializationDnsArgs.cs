// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ProxmoxVE.VM.Inputs
{

    public sealed class VirtualMachineInitializationDnsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The DNS search domain.
        /// </summary>
        [Input("domain")]
        public Input<string>? Domain { get; set; }

        /// <summary>
        /// The DNS server.
        /// </summary>
        [Input("server")]
        public Input<string>? Server { get; set; }

        public VirtualMachineInitializationDnsArgs()
        {
        }
        public static new VirtualMachineInitializationDnsArgs Empty => new VirtualMachineInitializationDnsArgs();
    }
}
