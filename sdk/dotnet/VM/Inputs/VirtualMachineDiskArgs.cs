// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ProxmoxVE.VM.Inputs
{

    public sealed class VirtualMachineDiskArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The cache type (defaults to `none`).
        /// </summary>
        [Input("cache")]
        public Input<string>? Cache { get; set; }

        /// <summary>
        /// The identifier for the datastore to create the
        /// cloud-init disk in (defaults to `local-lvm`).
        /// </summary>
        [Input("datastoreId")]
        public Input<string>? DatastoreId { get; set; }

        /// <summary>
        /// Whether to pass discard/trim requests to the
        /// underlying storage. Supported values are `on`/`ignore` (defaults
        /// to `ignore`).
        /// </summary>
        [Input("discard")]
        public Input<string>? Discard { get; set; }

        /// <summary>
        /// The file format.
        /// </summary>
        [Input("fileFormat")]
        public Input<string>? FileFormat { get; set; }

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
        [Input("interface", required: true)]
        public Input<string> Interface { get; set; } = null!;

        /// <summary>
        /// Whether to use iothreads for this disk (defaults
        /// to `false`).
        /// </summary>
        [Input("iothread")]
        public Input<bool>? Iothread { get; set; }

        /// <summary>
        /// The disk size in gigabytes (defaults to `8`).
        /// </summary>
        [Input("size")]
        public Input<int>? Size { get; set; }

        /// <summary>
        /// The speed limits.
        /// </summary>
        [Input("speed")]
        public Input<Inputs.VirtualMachineDiskSpeedArgs>? Speed { get; set; }

        /// <summary>
        /// Whether to use an SSD emulation option for this disk (
        /// defaults to `false`). Note that SSD emulation is not supported on VirtIO
        /// Block drives.
        /// </summary>
        [Input("ssd")]
        public Input<bool>? Ssd { get; set; }

        public VirtualMachineDiskArgs()
        {
        }
        public static new VirtualMachineDiskArgs Empty => new VirtualMachineDiskArgs();
    }
}
