// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ProxmoxVE.Inputs
{

    public sealed class HostsEntryArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The IP address.
        /// </summary>
        [Input("address", required: true)]
        public Input<string> Address { get; set; } = null!;

        [Input("hostnames", required: true)]
        private InputList<string>? _hostnames;

        /// <summary>
        /// The hostnames.
        /// </summary>
        public InputList<string> Hostnames
        {
            get => _hostnames ?? (_hostnames = new InputList<string>());
            set => _hostnames = value;
        }

        public HostsEntryArgs()
        {
        }
        public static new HostsEntryArgs Empty => new HostsEntryArgs();
    }
}
