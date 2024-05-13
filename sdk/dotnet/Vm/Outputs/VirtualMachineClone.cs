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
    public sealed class VirtualMachineClone
    {
        /// <summary>
        /// The identifier for the target datastore.
        /// </summary>
        public readonly string? DatastoreId;
        /// <summary>
        /// Full or linked clone (defaults to `true`).
        /// </summary>
        public readonly bool? Full;
        /// <summary>
        /// The name of the source node (leave blank, if
        /// equal to the `node_name` argument).
        /// </summary>
        public readonly string? NodeName;
        /// <summary>
        /// Number of retries in Proxmox for clone vm.
        /// Sometimes Proxmox errors with timeout when creating multiple clones at
        /// once.
        /// </summary>
        public readonly int? Retries;
        /// <summary>
        /// The identifier for the source VM.
        /// </summary>
        public readonly int VmId;

        [OutputConstructor]
        private VirtualMachineClone(
            string? datastoreId,

            bool? full,

            string? nodeName,

            int? retries,

            int vmId)
        {
            DatastoreId = datastoreId;
            Full = full;
            NodeName = nodeName;
            Retries = retries;
            VmId = vmId;
        }
    }
}
