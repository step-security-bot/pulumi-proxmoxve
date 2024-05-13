// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Manages a virtual machine.
 *
 * > This resource uses SSH access to the node. You might need to configure the `ssh` option in the `provider` section.
 *
 * ## Import
 *
 * Instances can be imported using the `node_name` and the `vm_id`, e.g.,
 *
 * bash
 *
 * ```sh
 * $ pulumi import proxmoxve:VM/virtualMachine:VirtualMachine ubuntu_vm first-node/4321
 * ```
 */
export class VirtualMachine extends pulumi.CustomResource {
    /**
     * Get an existing VirtualMachine resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: VirtualMachineState, opts?: pulumi.CustomResourceOptions): VirtualMachine {
        return new VirtualMachine(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'proxmoxve:VM/virtualMachine:VirtualMachine';

    /**
     * Returns true if the given object is an instance of VirtualMachine.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is VirtualMachine {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === VirtualMachine.__pulumiType;
    }

    /**
     * Whether to enable ACPI (defaults to `true`).
     */
    public readonly acpi!: pulumi.Output<boolean | undefined>;
    /**
     * The QEMU agent configuration.
     */
    public readonly agent!: pulumi.Output<outputs.VM.VirtualMachineAgent | undefined>;
    /**
     * An audio device.
     */
    public readonly audioDevice!: pulumi.Output<outputs.VM.VirtualMachineAudioDevice | undefined>;
    /**
     * The BIOS implementation (defaults to `seabios`).
     */
    public readonly bios!: pulumi.Output<string | undefined>;
    /**
     * Specify a list of devices to boot from in the order
     * they appear in the list (defaults to `[]`).
     */
    public readonly bootOrders!: pulumi.Output<string[] | undefined>;
    /**
     * The CDROM configuration.
     */
    public readonly cdrom!: pulumi.Output<outputs.VM.VirtualMachineCdrom | undefined>;
    /**
     * The cloning configuration.
     */
    public readonly clone!: pulumi.Output<outputs.VM.VirtualMachineClone | undefined>;
    /**
     * The CPU configuration.
     */
    public readonly cpu!: pulumi.Output<outputs.VM.VirtualMachineCpu | undefined>;
    /**
     * The description.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * A disk (multiple blocks supported).
     */
    public readonly disks!: pulumi.Output<outputs.VM.VirtualMachineDisk[] | undefined>;
    /**
     * The efi disk device (required if `bios` is set
     * to `ovmf`)
     */
    public readonly efiDisk!: pulumi.Output<outputs.VM.VirtualMachineEfiDisk | undefined>;
    /**
     * The identifier for a file containing a hook script (needs to be executable).
     */
    public readonly hookScriptFileId!: pulumi.Output<string | undefined>;
    /**
     * A host PCI device mapping (multiple blocks supported).
     */
    public readonly hostpcis!: pulumi.Output<outputs.VM.VirtualMachineHostpci[] | undefined>;
    /**
     * The cloud-init configuration.
     */
    public readonly initialization!: pulumi.Output<outputs.VM.VirtualMachineInitialization | undefined>;
    /**
     * The IPv4 addresses per network interface published by the
     * QEMU agent (empty list when `agent.enabled` is `false`)
     */
    public /*out*/ readonly ipv4Addresses!: pulumi.Output<string[][]>;
    /**
     * The IPv6 addresses per network interface published by the
     * QEMU agent (empty list when `agent.enabled` is `false`)
     */
    public /*out*/ readonly ipv6Addresses!: pulumi.Output<string[][]>;
    /**
     * The keyboard layout (defaults to `en-us`).
     */
    public readonly keyboardLayout!: pulumi.Output<string | undefined>;
    /**
     * Arbitrary arguments passed to kvm.
     */
    public readonly kvmArguments!: pulumi.Output<string | undefined>;
    /**
     * The MAC addresses published by the QEMU agent with fallback
     * to the network device configuration, if the agent is disabled
     */
    public readonly macAddresses!: pulumi.Output<string[]>;
    /**
     * The VM machine type (defaults to `pc`).
     */
    public readonly machine!: pulumi.Output<string | undefined>;
    /**
     * The memory configuration.
     */
    public readonly memory!: pulumi.Output<outputs.VM.VirtualMachineMemory | undefined>;
    /**
     * Migrate the VM on node change instead of re-creating
     * it (defaults to `false`).
     */
    public readonly migrate!: pulumi.Output<boolean | undefined>;
    /**
     * The virtual machine name.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * A network device (multiple blocks supported).
     */
    public readonly networkDevices!: pulumi.Output<outputs.VM.VirtualMachineNetworkDevice[] | undefined>;
    /**
     * The network interface names published by the QEMU
     * agent (empty list when `agent.enabled` is `false`)
     */
    public /*out*/ readonly networkInterfaceNames!: pulumi.Output<string[]>;
    /**
     * The name of the node to assign the virtual machine
     * to.
     */
    public readonly nodeName!: pulumi.Output<string>;
    /**
     * The NUMA configuration.
     */
    public readonly numas!: pulumi.Output<outputs.VM.VirtualMachineNuma[] | undefined>;
    /**
     * Specifies whether a VM will be started during system
     * boot. (defaults to `true`)
     */
    public readonly onBoot!: pulumi.Output<boolean | undefined>;
    /**
     * The Operating System configuration.
     */
    public readonly operatingSystem!: pulumi.Output<outputs.VM.VirtualMachineOperatingSystem | undefined>;
    /**
     * The identifier for a pool to assign the virtual machine to.
     */
    public readonly poolId!: pulumi.Output<string | undefined>;
    /**
     * Sets the protection flag of the VM. This will disable the remove VM and remove disk operations (defaults to `false`).
     */
    public readonly protection!: pulumi.Output<boolean | undefined>;
    /**
     * Reboot the VM after initial creation. (defaults to `false`)
     */
    public readonly reboot!: pulumi.Output<boolean | undefined>;
    /**
     * The SCSI hardware type (defaults to
     * `virtio-scsi-pci`).
     */
    public readonly scsiHardware!: pulumi.Output<string | undefined>;
    /**
     * A serial device (multiple blocks supported).
     */
    public readonly serialDevices!: pulumi.Output<outputs.VM.VirtualMachineSerialDevice[] | undefined>;
    /**
     * The SMBIOS (type1) settings for the VM.
     */
    public readonly smbios!: pulumi.Output<outputs.VM.VirtualMachineSmbios | undefined>;
    /**
     * Whether to start the virtual machine (defaults
     * to `true`).
     */
    public readonly started!: pulumi.Output<boolean | undefined>;
    /**
     * Defines startup and shutdown behavior of the VM.
     */
    public readonly startup!: pulumi.Output<outputs.VM.VirtualMachineStartup | undefined>;
    /**
     * Whether to stop rather than shutdown on VM destroy (defaults to `false`)
     */
    public readonly stopOnDestroy!: pulumi.Output<boolean | undefined>;
    /**
     * Whether to enable the USB tablet device (defaults
     * to `true`).
     */
    public readonly tabletDevice!: pulumi.Output<boolean | undefined>;
    /**
     * A list of tags of the VM. This is only meta information (
     * defaults to `[]`). Note: Proxmox always sorts the VM tags. If the list in
     * template is not sorted, then Proxmox will always report a difference on the
     * resource. You may use the `ignoreChanges` lifecycle meta-argument to ignore
     * changes to this attribute.
     */
    public readonly tags!: pulumi.Output<string[] | undefined>;
    /**
     * Whether to create a template (defaults to `false`).
     */
    public readonly template!: pulumi.Output<boolean | undefined>;
    /**
     * Timeout for cloning a VM in seconds (defaults to
     * 1800).
     */
    public readonly timeoutClone!: pulumi.Output<number | undefined>;
    /**
     * Timeout for creating a VM in seconds (defaults to
     * 1800).
     */
    public readonly timeoutCreate!: pulumi.Output<number | undefined>;
    /**
     * Timeout for migrating the VM (defaults to
     * 1800).
     */
    public readonly timeoutMigrate!: pulumi.Output<number | undefined>;
    /**
     * MoveDisk timeout
     *
     * @deprecated This field is deprecated and will be removed in a future release. An overall operation timeout (timeout_create / timeoutClone / timeout_migrate) is used instead.
     */
    public readonly timeoutMoveDisk!: pulumi.Output<number | undefined>;
    /**
     * Timeout for rebooting a VM in seconds (defaults
     * to 1800).
     */
    public readonly timeoutReboot!: pulumi.Output<number | undefined>;
    /**
     * Timeout for shutting down a VM in seconds (
     * defaults to 1800).
     */
    public readonly timeoutShutdownVm!: pulumi.Output<number | undefined>;
    /**
     * Timeout for starting a VM in seconds (defaults
     * to 1800).
     */
    public readonly timeoutStartVm!: pulumi.Output<number | undefined>;
    /**
     * Timeout for stopping a VM in seconds (defaults
     * to 300).
     */
    public readonly timeoutStopVm!: pulumi.Output<number | undefined>;
    /**
     * The TPM state device.
     */
    public readonly tpmState!: pulumi.Output<outputs.VM.VirtualMachineTpmState | undefined>;
    /**
     * A host USB device mapping (multiple blocks supported).
     */
    public readonly usbs!: pulumi.Output<outputs.VM.VirtualMachineUsb[] | undefined>;
    /**
     * The VGA configuration.
     */
    public readonly vga!: pulumi.Output<outputs.VM.VirtualMachineVga | undefined>;
    /**
     * The VM identifier.
     */
    public readonly vmId!: pulumi.Output<number>;

    /**
     * Create a VirtualMachine resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: VirtualMachineArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: VirtualMachineArgs | VirtualMachineState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as VirtualMachineState | undefined;
            resourceInputs["acpi"] = state ? state.acpi : undefined;
            resourceInputs["agent"] = state ? state.agent : undefined;
            resourceInputs["audioDevice"] = state ? state.audioDevice : undefined;
            resourceInputs["bios"] = state ? state.bios : undefined;
            resourceInputs["bootOrders"] = state ? state.bootOrders : undefined;
            resourceInputs["cdrom"] = state ? state.cdrom : undefined;
            resourceInputs["clone"] = state ? state.clone : undefined;
            resourceInputs["cpu"] = state ? state.cpu : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["disks"] = state ? state.disks : undefined;
            resourceInputs["efiDisk"] = state ? state.efiDisk : undefined;
            resourceInputs["hookScriptFileId"] = state ? state.hookScriptFileId : undefined;
            resourceInputs["hostpcis"] = state ? state.hostpcis : undefined;
            resourceInputs["initialization"] = state ? state.initialization : undefined;
            resourceInputs["ipv4Addresses"] = state ? state.ipv4Addresses : undefined;
            resourceInputs["ipv6Addresses"] = state ? state.ipv6Addresses : undefined;
            resourceInputs["keyboardLayout"] = state ? state.keyboardLayout : undefined;
            resourceInputs["kvmArguments"] = state ? state.kvmArguments : undefined;
            resourceInputs["macAddresses"] = state ? state.macAddresses : undefined;
            resourceInputs["machine"] = state ? state.machine : undefined;
            resourceInputs["memory"] = state ? state.memory : undefined;
            resourceInputs["migrate"] = state ? state.migrate : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["networkDevices"] = state ? state.networkDevices : undefined;
            resourceInputs["networkInterfaceNames"] = state ? state.networkInterfaceNames : undefined;
            resourceInputs["nodeName"] = state ? state.nodeName : undefined;
            resourceInputs["numas"] = state ? state.numas : undefined;
            resourceInputs["onBoot"] = state ? state.onBoot : undefined;
            resourceInputs["operatingSystem"] = state ? state.operatingSystem : undefined;
            resourceInputs["poolId"] = state ? state.poolId : undefined;
            resourceInputs["protection"] = state ? state.protection : undefined;
            resourceInputs["reboot"] = state ? state.reboot : undefined;
            resourceInputs["scsiHardware"] = state ? state.scsiHardware : undefined;
            resourceInputs["serialDevices"] = state ? state.serialDevices : undefined;
            resourceInputs["smbios"] = state ? state.smbios : undefined;
            resourceInputs["started"] = state ? state.started : undefined;
            resourceInputs["startup"] = state ? state.startup : undefined;
            resourceInputs["stopOnDestroy"] = state ? state.stopOnDestroy : undefined;
            resourceInputs["tabletDevice"] = state ? state.tabletDevice : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["template"] = state ? state.template : undefined;
            resourceInputs["timeoutClone"] = state ? state.timeoutClone : undefined;
            resourceInputs["timeoutCreate"] = state ? state.timeoutCreate : undefined;
            resourceInputs["timeoutMigrate"] = state ? state.timeoutMigrate : undefined;
            resourceInputs["timeoutMoveDisk"] = state ? state.timeoutMoveDisk : undefined;
            resourceInputs["timeoutReboot"] = state ? state.timeoutReboot : undefined;
            resourceInputs["timeoutShutdownVm"] = state ? state.timeoutShutdownVm : undefined;
            resourceInputs["timeoutStartVm"] = state ? state.timeoutStartVm : undefined;
            resourceInputs["timeoutStopVm"] = state ? state.timeoutStopVm : undefined;
            resourceInputs["tpmState"] = state ? state.tpmState : undefined;
            resourceInputs["usbs"] = state ? state.usbs : undefined;
            resourceInputs["vga"] = state ? state.vga : undefined;
            resourceInputs["vmId"] = state ? state.vmId : undefined;
        } else {
            const args = argsOrState as VirtualMachineArgs | undefined;
            if ((!args || args.nodeName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'nodeName'");
            }
            resourceInputs["acpi"] = args ? args.acpi : undefined;
            resourceInputs["agent"] = args ? args.agent : undefined;
            resourceInputs["audioDevice"] = args ? args.audioDevice : undefined;
            resourceInputs["bios"] = args ? args.bios : undefined;
            resourceInputs["bootOrders"] = args ? args.bootOrders : undefined;
            resourceInputs["cdrom"] = args ? args.cdrom : undefined;
            resourceInputs["clone"] = args ? args.clone : undefined;
            resourceInputs["cpu"] = args ? args.cpu : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["disks"] = args ? args.disks : undefined;
            resourceInputs["efiDisk"] = args ? args.efiDisk : undefined;
            resourceInputs["hookScriptFileId"] = args ? args.hookScriptFileId : undefined;
            resourceInputs["hostpcis"] = args ? args.hostpcis : undefined;
            resourceInputs["initialization"] = args ? args.initialization : undefined;
            resourceInputs["keyboardLayout"] = args ? args.keyboardLayout : undefined;
            resourceInputs["kvmArguments"] = args ? args.kvmArguments : undefined;
            resourceInputs["macAddresses"] = args ? args.macAddresses : undefined;
            resourceInputs["machine"] = args ? args.machine : undefined;
            resourceInputs["memory"] = args ? args.memory : undefined;
            resourceInputs["migrate"] = args ? args.migrate : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["networkDevices"] = args ? args.networkDevices : undefined;
            resourceInputs["nodeName"] = args ? args.nodeName : undefined;
            resourceInputs["numas"] = args ? args.numas : undefined;
            resourceInputs["onBoot"] = args ? args.onBoot : undefined;
            resourceInputs["operatingSystem"] = args ? args.operatingSystem : undefined;
            resourceInputs["poolId"] = args ? args.poolId : undefined;
            resourceInputs["protection"] = args ? args.protection : undefined;
            resourceInputs["reboot"] = args ? args.reboot : undefined;
            resourceInputs["scsiHardware"] = args ? args.scsiHardware : undefined;
            resourceInputs["serialDevices"] = args ? args.serialDevices : undefined;
            resourceInputs["smbios"] = args ? args.smbios : undefined;
            resourceInputs["started"] = args ? args.started : undefined;
            resourceInputs["startup"] = args ? args.startup : undefined;
            resourceInputs["stopOnDestroy"] = args ? args.stopOnDestroy : undefined;
            resourceInputs["tabletDevice"] = args ? args.tabletDevice : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["template"] = args ? args.template : undefined;
            resourceInputs["timeoutClone"] = args ? args.timeoutClone : undefined;
            resourceInputs["timeoutCreate"] = args ? args.timeoutCreate : undefined;
            resourceInputs["timeoutMigrate"] = args ? args.timeoutMigrate : undefined;
            resourceInputs["timeoutMoveDisk"] = args ? args.timeoutMoveDisk : undefined;
            resourceInputs["timeoutReboot"] = args ? args.timeoutReboot : undefined;
            resourceInputs["timeoutShutdownVm"] = args ? args.timeoutShutdownVm : undefined;
            resourceInputs["timeoutStartVm"] = args ? args.timeoutStartVm : undefined;
            resourceInputs["timeoutStopVm"] = args ? args.timeoutStopVm : undefined;
            resourceInputs["tpmState"] = args ? args.tpmState : undefined;
            resourceInputs["usbs"] = args ? args.usbs : undefined;
            resourceInputs["vga"] = args ? args.vga : undefined;
            resourceInputs["vmId"] = args ? args.vmId : undefined;
            resourceInputs["ipv4Addresses"] = undefined /*out*/;
            resourceInputs["ipv6Addresses"] = undefined /*out*/;
            resourceInputs["networkInterfaceNames"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(VirtualMachine.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering VirtualMachine resources.
 */
export interface VirtualMachineState {
    /**
     * Whether to enable ACPI (defaults to `true`).
     */
    acpi?: pulumi.Input<boolean>;
    /**
     * The QEMU agent configuration.
     */
    agent?: pulumi.Input<inputs.VM.VirtualMachineAgent>;
    /**
     * An audio device.
     */
    audioDevice?: pulumi.Input<inputs.VM.VirtualMachineAudioDevice>;
    /**
     * The BIOS implementation (defaults to `seabios`).
     */
    bios?: pulumi.Input<string>;
    /**
     * Specify a list of devices to boot from in the order
     * they appear in the list (defaults to `[]`).
     */
    bootOrders?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The CDROM configuration.
     */
    cdrom?: pulumi.Input<inputs.VM.VirtualMachineCdrom>;
    /**
     * The cloning configuration.
     */
    clone?: pulumi.Input<inputs.VM.VirtualMachineClone>;
    /**
     * The CPU configuration.
     */
    cpu?: pulumi.Input<inputs.VM.VirtualMachineCpu>;
    /**
     * The description.
     */
    description?: pulumi.Input<string>;
    /**
     * A disk (multiple blocks supported).
     */
    disks?: pulumi.Input<pulumi.Input<inputs.VM.VirtualMachineDisk>[]>;
    /**
     * The efi disk device (required if `bios` is set
     * to `ovmf`)
     */
    efiDisk?: pulumi.Input<inputs.VM.VirtualMachineEfiDisk>;
    /**
     * The identifier for a file containing a hook script (needs to be executable).
     */
    hookScriptFileId?: pulumi.Input<string>;
    /**
     * A host PCI device mapping (multiple blocks supported).
     */
    hostpcis?: pulumi.Input<pulumi.Input<inputs.VM.VirtualMachineHostpci>[]>;
    /**
     * The cloud-init configuration.
     */
    initialization?: pulumi.Input<inputs.VM.VirtualMachineInitialization>;
    /**
     * The IPv4 addresses per network interface published by the
     * QEMU agent (empty list when `agent.enabled` is `false`)
     */
    ipv4Addresses?: pulumi.Input<pulumi.Input<pulumi.Input<string>[]>[]>;
    /**
     * The IPv6 addresses per network interface published by the
     * QEMU agent (empty list when `agent.enabled` is `false`)
     */
    ipv6Addresses?: pulumi.Input<pulumi.Input<pulumi.Input<string>[]>[]>;
    /**
     * The keyboard layout (defaults to `en-us`).
     */
    keyboardLayout?: pulumi.Input<string>;
    /**
     * Arbitrary arguments passed to kvm.
     */
    kvmArguments?: pulumi.Input<string>;
    /**
     * The MAC addresses published by the QEMU agent with fallback
     * to the network device configuration, if the agent is disabled
     */
    macAddresses?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The VM machine type (defaults to `pc`).
     */
    machine?: pulumi.Input<string>;
    /**
     * The memory configuration.
     */
    memory?: pulumi.Input<inputs.VM.VirtualMachineMemory>;
    /**
     * Migrate the VM on node change instead of re-creating
     * it (defaults to `false`).
     */
    migrate?: pulumi.Input<boolean>;
    /**
     * The virtual machine name.
     */
    name?: pulumi.Input<string>;
    /**
     * A network device (multiple blocks supported).
     */
    networkDevices?: pulumi.Input<pulumi.Input<inputs.VM.VirtualMachineNetworkDevice>[]>;
    /**
     * The network interface names published by the QEMU
     * agent (empty list when `agent.enabled` is `false`)
     */
    networkInterfaceNames?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name of the node to assign the virtual machine
     * to.
     */
    nodeName?: pulumi.Input<string>;
    /**
     * The NUMA configuration.
     */
    numas?: pulumi.Input<pulumi.Input<inputs.VM.VirtualMachineNuma>[]>;
    /**
     * Specifies whether a VM will be started during system
     * boot. (defaults to `true`)
     */
    onBoot?: pulumi.Input<boolean>;
    /**
     * The Operating System configuration.
     */
    operatingSystem?: pulumi.Input<inputs.VM.VirtualMachineOperatingSystem>;
    /**
     * The identifier for a pool to assign the virtual machine to.
     */
    poolId?: pulumi.Input<string>;
    /**
     * Sets the protection flag of the VM. This will disable the remove VM and remove disk operations (defaults to `false`).
     */
    protection?: pulumi.Input<boolean>;
    /**
     * Reboot the VM after initial creation. (defaults to `false`)
     */
    reboot?: pulumi.Input<boolean>;
    /**
     * The SCSI hardware type (defaults to
     * `virtio-scsi-pci`).
     */
    scsiHardware?: pulumi.Input<string>;
    /**
     * A serial device (multiple blocks supported).
     */
    serialDevices?: pulumi.Input<pulumi.Input<inputs.VM.VirtualMachineSerialDevice>[]>;
    /**
     * The SMBIOS (type1) settings for the VM.
     */
    smbios?: pulumi.Input<inputs.VM.VirtualMachineSmbios>;
    /**
     * Whether to start the virtual machine (defaults
     * to `true`).
     */
    started?: pulumi.Input<boolean>;
    /**
     * Defines startup and shutdown behavior of the VM.
     */
    startup?: pulumi.Input<inputs.VM.VirtualMachineStartup>;
    /**
     * Whether to stop rather than shutdown on VM destroy (defaults to `false`)
     */
    stopOnDestroy?: pulumi.Input<boolean>;
    /**
     * Whether to enable the USB tablet device (defaults
     * to `true`).
     */
    tabletDevice?: pulumi.Input<boolean>;
    /**
     * A list of tags of the VM. This is only meta information (
     * defaults to `[]`). Note: Proxmox always sorts the VM tags. If the list in
     * template is not sorted, then Proxmox will always report a difference on the
     * resource. You may use the `ignoreChanges` lifecycle meta-argument to ignore
     * changes to this attribute.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Whether to create a template (defaults to `false`).
     */
    template?: pulumi.Input<boolean>;
    /**
     * Timeout for cloning a VM in seconds (defaults to
     * 1800).
     */
    timeoutClone?: pulumi.Input<number>;
    /**
     * Timeout for creating a VM in seconds (defaults to
     * 1800).
     */
    timeoutCreate?: pulumi.Input<number>;
    /**
     * Timeout for migrating the VM (defaults to
     * 1800).
     */
    timeoutMigrate?: pulumi.Input<number>;
    /**
     * MoveDisk timeout
     *
     * @deprecated This field is deprecated and will be removed in a future release. An overall operation timeout (timeout_create / timeoutClone / timeout_migrate) is used instead.
     */
    timeoutMoveDisk?: pulumi.Input<number>;
    /**
     * Timeout for rebooting a VM in seconds (defaults
     * to 1800).
     */
    timeoutReboot?: pulumi.Input<number>;
    /**
     * Timeout for shutting down a VM in seconds (
     * defaults to 1800).
     */
    timeoutShutdownVm?: pulumi.Input<number>;
    /**
     * Timeout for starting a VM in seconds (defaults
     * to 1800).
     */
    timeoutStartVm?: pulumi.Input<number>;
    /**
     * Timeout for stopping a VM in seconds (defaults
     * to 300).
     */
    timeoutStopVm?: pulumi.Input<number>;
    /**
     * The TPM state device.
     */
    tpmState?: pulumi.Input<inputs.VM.VirtualMachineTpmState>;
    /**
     * A host USB device mapping (multiple blocks supported).
     */
    usbs?: pulumi.Input<pulumi.Input<inputs.VM.VirtualMachineUsb>[]>;
    /**
     * The VGA configuration.
     */
    vga?: pulumi.Input<inputs.VM.VirtualMachineVga>;
    /**
     * The VM identifier.
     */
    vmId?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a VirtualMachine resource.
 */
export interface VirtualMachineArgs {
    /**
     * Whether to enable ACPI (defaults to `true`).
     */
    acpi?: pulumi.Input<boolean>;
    /**
     * The QEMU agent configuration.
     */
    agent?: pulumi.Input<inputs.VM.VirtualMachineAgent>;
    /**
     * An audio device.
     */
    audioDevice?: pulumi.Input<inputs.VM.VirtualMachineAudioDevice>;
    /**
     * The BIOS implementation (defaults to `seabios`).
     */
    bios?: pulumi.Input<string>;
    /**
     * Specify a list of devices to boot from in the order
     * they appear in the list (defaults to `[]`).
     */
    bootOrders?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The CDROM configuration.
     */
    cdrom?: pulumi.Input<inputs.VM.VirtualMachineCdrom>;
    /**
     * The cloning configuration.
     */
    clone?: pulumi.Input<inputs.VM.VirtualMachineClone>;
    /**
     * The CPU configuration.
     */
    cpu?: pulumi.Input<inputs.VM.VirtualMachineCpu>;
    /**
     * The description.
     */
    description?: pulumi.Input<string>;
    /**
     * A disk (multiple blocks supported).
     */
    disks?: pulumi.Input<pulumi.Input<inputs.VM.VirtualMachineDisk>[]>;
    /**
     * The efi disk device (required if `bios` is set
     * to `ovmf`)
     */
    efiDisk?: pulumi.Input<inputs.VM.VirtualMachineEfiDisk>;
    /**
     * The identifier for a file containing a hook script (needs to be executable).
     */
    hookScriptFileId?: pulumi.Input<string>;
    /**
     * A host PCI device mapping (multiple blocks supported).
     */
    hostpcis?: pulumi.Input<pulumi.Input<inputs.VM.VirtualMachineHostpci>[]>;
    /**
     * The cloud-init configuration.
     */
    initialization?: pulumi.Input<inputs.VM.VirtualMachineInitialization>;
    /**
     * The keyboard layout (defaults to `en-us`).
     */
    keyboardLayout?: pulumi.Input<string>;
    /**
     * Arbitrary arguments passed to kvm.
     */
    kvmArguments?: pulumi.Input<string>;
    /**
     * The MAC addresses published by the QEMU agent with fallback
     * to the network device configuration, if the agent is disabled
     */
    macAddresses?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The VM machine type (defaults to `pc`).
     */
    machine?: pulumi.Input<string>;
    /**
     * The memory configuration.
     */
    memory?: pulumi.Input<inputs.VM.VirtualMachineMemory>;
    /**
     * Migrate the VM on node change instead of re-creating
     * it (defaults to `false`).
     */
    migrate?: pulumi.Input<boolean>;
    /**
     * The virtual machine name.
     */
    name?: pulumi.Input<string>;
    /**
     * A network device (multiple blocks supported).
     */
    networkDevices?: pulumi.Input<pulumi.Input<inputs.VM.VirtualMachineNetworkDevice>[]>;
    /**
     * The name of the node to assign the virtual machine
     * to.
     */
    nodeName: pulumi.Input<string>;
    /**
     * The NUMA configuration.
     */
    numas?: pulumi.Input<pulumi.Input<inputs.VM.VirtualMachineNuma>[]>;
    /**
     * Specifies whether a VM will be started during system
     * boot. (defaults to `true`)
     */
    onBoot?: pulumi.Input<boolean>;
    /**
     * The Operating System configuration.
     */
    operatingSystem?: pulumi.Input<inputs.VM.VirtualMachineOperatingSystem>;
    /**
     * The identifier for a pool to assign the virtual machine to.
     */
    poolId?: pulumi.Input<string>;
    /**
     * Sets the protection flag of the VM. This will disable the remove VM and remove disk operations (defaults to `false`).
     */
    protection?: pulumi.Input<boolean>;
    /**
     * Reboot the VM after initial creation. (defaults to `false`)
     */
    reboot?: pulumi.Input<boolean>;
    /**
     * The SCSI hardware type (defaults to
     * `virtio-scsi-pci`).
     */
    scsiHardware?: pulumi.Input<string>;
    /**
     * A serial device (multiple blocks supported).
     */
    serialDevices?: pulumi.Input<pulumi.Input<inputs.VM.VirtualMachineSerialDevice>[]>;
    /**
     * The SMBIOS (type1) settings for the VM.
     */
    smbios?: pulumi.Input<inputs.VM.VirtualMachineSmbios>;
    /**
     * Whether to start the virtual machine (defaults
     * to `true`).
     */
    started?: pulumi.Input<boolean>;
    /**
     * Defines startup and shutdown behavior of the VM.
     */
    startup?: pulumi.Input<inputs.VM.VirtualMachineStartup>;
    /**
     * Whether to stop rather than shutdown on VM destroy (defaults to `false`)
     */
    stopOnDestroy?: pulumi.Input<boolean>;
    /**
     * Whether to enable the USB tablet device (defaults
     * to `true`).
     */
    tabletDevice?: pulumi.Input<boolean>;
    /**
     * A list of tags of the VM. This is only meta information (
     * defaults to `[]`). Note: Proxmox always sorts the VM tags. If the list in
     * template is not sorted, then Proxmox will always report a difference on the
     * resource. You may use the `ignoreChanges` lifecycle meta-argument to ignore
     * changes to this attribute.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Whether to create a template (defaults to `false`).
     */
    template?: pulumi.Input<boolean>;
    /**
     * Timeout for cloning a VM in seconds (defaults to
     * 1800).
     */
    timeoutClone?: pulumi.Input<number>;
    /**
     * Timeout for creating a VM in seconds (defaults to
     * 1800).
     */
    timeoutCreate?: pulumi.Input<number>;
    /**
     * Timeout for migrating the VM (defaults to
     * 1800).
     */
    timeoutMigrate?: pulumi.Input<number>;
    /**
     * MoveDisk timeout
     *
     * @deprecated This field is deprecated and will be removed in a future release. An overall operation timeout (timeout_create / timeoutClone / timeout_migrate) is used instead.
     */
    timeoutMoveDisk?: pulumi.Input<number>;
    /**
     * Timeout for rebooting a VM in seconds (defaults
     * to 1800).
     */
    timeoutReboot?: pulumi.Input<number>;
    /**
     * Timeout for shutting down a VM in seconds (
     * defaults to 1800).
     */
    timeoutShutdownVm?: pulumi.Input<number>;
    /**
     * Timeout for starting a VM in seconds (defaults
     * to 1800).
     */
    timeoutStartVm?: pulumi.Input<number>;
    /**
     * Timeout for stopping a VM in seconds (defaults
     * to 300).
     */
    timeoutStopVm?: pulumi.Input<number>;
    /**
     * The TPM state device.
     */
    tpmState?: pulumi.Input<inputs.VM.VirtualMachineTpmState>;
    /**
     * A host USB device mapping (multiple blocks supported).
     */
    usbs?: pulumi.Input<pulumi.Input<inputs.VM.VirtualMachineUsb>[]>;
    /**
     * The VGA configuration.
     */
    vga?: pulumi.Input<inputs.VM.VirtualMachineVga>;
    /**
     * The VM identifier.
     */
    vmId?: pulumi.Input<number>;
}
