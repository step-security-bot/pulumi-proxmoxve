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
    public sealed class VirtualMachineInitialization
    {
        /// <summary>
        /// The identifier for the datastore to create the
        /// cloud-init disk in (defaults to `local-lvm`).
        /// </summary>
        public readonly string? DatastoreId;
        /// <summary>
        /// The DNS configuration.
        /// </summary>
        public readonly Outputs.VirtualMachineInitializationDns? Dns;
        /// <summary>
        /// The hardware interface to connect the cloud-init
        /// image to. Must be one of `ide0..3`, `sata0..5`, `scsi0..30`. Will be
        /// detected if the setting is missing but a cloud-init image is present,
        /// otherwise defaults to `ide2`.
        /// </summary>
        public readonly string? Interface;
        /// <summary>
        /// The IP configuration (one block per network
        /// device).
        /// </summary>
        public readonly ImmutableArray<Outputs.VirtualMachineInitializationIpConfig> IpConfigs;
        /// <summary>
        /// The identifier for a file containing
        /// all meta data passed to the VM via cloud-init.
        /// </summary>
        public readonly string? MetaDataFileId;
        /// <summary>
        /// The identifier for a file containing
        /// network configuration data passed to the VM via cloud-init (conflicts
        /// with `ip_config`).
        /// </summary>
        public readonly string? NetworkDataFileId;
        /// <summary>
        /// The cloud-init configuration format
        /// </summary>
        public readonly string? Type;
        /// <summary>
        /// Whether to do an automatic package upgrade after the first boot (defaults to `true`).
        /// </summary>
        public readonly bool? Upgrade;
        /// <summary>
        /// The user account configuration (conflicts
        /// with `user_data_file_id`).
        /// </summary>
        public readonly Outputs.VirtualMachineInitializationUserAccount? UserAccount;
        /// <summary>
        /// The identifier for a file containing
        /// custom user data (conflicts with `user_account`).
        /// </summary>
        public readonly string? UserDataFileId;
        /// <summary>
        /// The identifier for a file containing
        /// all vendor data passed to the VM via cloud-init.
        /// </summary>
        public readonly string? VendorDataFileId;

        [OutputConstructor]
        private VirtualMachineInitialization(
            string? datastoreId,

            Outputs.VirtualMachineInitializationDns? dns,

            string? @interface,

            ImmutableArray<Outputs.VirtualMachineInitializationIpConfig> ipConfigs,

            string? metaDataFileId,

            string? networkDataFileId,

            string? type,

            bool? upgrade,

            Outputs.VirtualMachineInitializationUserAccount? userAccount,

            string? userDataFileId,

            string? vendorDataFileId)
        {
            DatastoreId = datastoreId;
            Dns = dns;
            Interface = @interface;
            IpConfigs = ipConfigs;
            MetaDataFileId = metaDataFileId;
            NetworkDataFileId = networkDataFileId;
            Type = type;
            Upgrade = upgrade;
            UserAccount = userAccount;
            UserDataFileId = userDataFileId;
            VendorDataFileId = vendorDataFileId;
        }
    }
}
