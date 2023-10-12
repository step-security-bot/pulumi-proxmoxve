// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ProxmoxVE.VM.Inputs
{

    public sealed class VirtualMachineStartupArgs : global::Pulumi.ResourceArgs
    {
        [Input("downDelay")]
        public Input<int>? DownDelay { get; set; }

        /// <summary>
        /// A non-negative number defining the general startup
        /// order.
        /// </summary>
        [Input("order")]
        public Input<int>? Order { get; set; }

        [Input("upDelay")]
        public Input<int>? UpDelay { get; set; }

        public VirtualMachineStartupArgs()
        {
        }
        public static new VirtualMachineStartupArgs Empty => new VirtualMachineStartupArgs();
    }
}
