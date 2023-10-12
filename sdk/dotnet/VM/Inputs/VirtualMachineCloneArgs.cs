// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ProxmoxVE.VM.Inputs
{

    public sealed class VirtualMachineCloneArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The identifier for the datastore to create the
        /// cloud-init disk in (defaults to `local-lvm`).
        /// </summary>
        [Input("datastoreId")]
        public Input<string>? DatastoreId { get; set; }

        [Input("full")]
        public Input<bool>? Full { get; set; }

        /// <summary>
        /// The name of the node to assign the virtual machine
        /// to.
        /// </summary>
        [Input("nodeName")]
        public Input<string>? NodeName { get; set; }

        /// <summary>
        /// Number of retries in Proxmox for clone vm.
        /// Sometimes Proxmox errors with timeout when creating multiple clones at
        /// once.
        /// </summary>
        [Input("retries")]
        public Input<int>? Retries { get; set; }

        /// <summary>
        /// The VM identifier.
        /// </summary>
        [Input("vmId", required: true)]
        public Input<int> VmId { get; set; } = null!;

        public VirtualMachineCloneArgs()
        {
        }
        public static new VirtualMachineCloneArgs Empty => new VirtualMachineCloneArgs();
    }
}
