// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ProxmoxVE.VM.Inputs
{

    public sealed class VirtualMachineCdromArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether to enable the VGA device (defaults
        /// to `true`).
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// The file ID for a disk image (experimental -
        /// might cause high CPU utilization during import, especially with large
        /// disk images).
        /// </summary>
        [Input("fileId")]
        public Input<string>? FileId { get; set; }

        /// <summary>
        /// The hardware interface to connect the cloud-init
        /// image to. Must be one of `ide0..3`, `sata0..5`, `scsi0..30`. Will be
        /// detected if the setting is missing but a cloud-init image is present,
        /// otherwise defaults to `ide2`.
        /// </summary>
        [Input("interface")]
        public Input<string>? Interface { get; set; }

        public VirtualMachineCdromArgs()
        {
        }
        public static new VirtualMachineCdromArgs Empty => new VirtualMachineCdromArgs();
    }
}
