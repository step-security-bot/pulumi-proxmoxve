// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ProxmoxVE.CT.Inputs
{

    public sealed class ContainerDiskGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The identifier for the datastore to create the
        /// disk in (defaults to `local`).
        /// </summary>
        [Input("datastoreId")]
        public Input<string>? DatastoreId { get; set; }

        /// <summary>
        /// The size of the root filesystem in gigabytes (defaults
        /// to `4`). Requires `datastore_id` to be set.
        /// </summary>
        [Input("size")]
        public Input<int>? Size { get; set; }

        public ContainerDiskGetArgs()
        {
        }
        public static new ContainerDiskGetArgs Empty => new ContainerDiskGetArgs();
    }
}
