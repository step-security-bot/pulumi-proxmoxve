// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

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
     * Whether to enable ACPI
     */
    public readonly acpi!: pulumi.Output<boolean | undefined>;
    /**
     * The QEMU agent configuration
     */
    public readonly agent!: pulumi.Output<outputs.VM.VirtualMachineAgent | undefined>;
    /**
     * The audio devices
     */
    public readonly audioDevice!: pulumi.Output<outputs.VM.VirtualMachineAudioDevice | undefined>;
    /**
     * The BIOS implementation
     */
    public readonly bios!: pulumi.Output<string | undefined>;
    /**
     * The guest will attempt to boot from devices in the order they appear here
     */
    public readonly bootOrders!: pulumi.Output<string[] | undefined>;
    /**
     * The CDROM drive
     */
    public readonly cdrom!: pulumi.Output<outputs.VM.VirtualMachineCdrom | undefined>;
    /**
     * The cloning configuration
     */
    public readonly clone!: pulumi.Output<outputs.VM.VirtualMachineClone | undefined>;
    /**
     * The CPU allocation
     */
    public readonly cpu!: pulumi.Output<outputs.VM.VirtualMachineCpu | undefined>;
    /**
     * The description
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The disk devices
     */
    public readonly disks!: pulumi.Output<outputs.VM.VirtualMachineDisk[] | undefined>;
    /**
     * The efidisk device
     */
    public readonly efiDisk!: pulumi.Output<outputs.VM.VirtualMachineEfiDisk | undefined>;
    /**
     * The Host PCI devices mapped to the VM
     */
    public readonly hostpcis!: pulumi.Output<outputs.VM.VirtualMachineHostpci[] | undefined>;
    /**
     * The cloud-init configuration
     */
    public readonly initialization!: pulumi.Output<outputs.VM.VirtualMachineInitialization | undefined>;
    /**
     * The IPv4 addresses published by the QEMU agent
     */
    public /*out*/ readonly ipv4Addresses!: pulumi.Output<string[][]>;
    /**
     * The IPv6 addresses published by the QEMU agent
     */
    public /*out*/ readonly ipv6Addresses!: pulumi.Output<string[][]>;
    /**
     * The keyboard layout
     */
    public readonly keyboardLayout!: pulumi.Output<string | undefined>;
    /**
     * The args implementation
     */
    public readonly kvmArguments!: pulumi.Output<string | undefined>;
    /**
     * The MAC addresses for the network interfaces
     */
    public /*out*/ readonly macAddresses!: pulumi.Output<string[]>;
    /**
     * The VM machine type, either default i440fx or q35
     */
    public readonly machine!: pulumi.Output<string | undefined>;
    /**
     * The memory allocation
     */
    public readonly memory!: pulumi.Output<outputs.VM.VirtualMachineMemory | undefined>;
    /**
     * Whether to migrate the VM on node change instead of re-creating it
     */
    public readonly migrate!: pulumi.Output<boolean | undefined>;
    /**
     * The name
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The network devices
     */
    public readonly networkDevices!: pulumi.Output<outputs.VM.VirtualMachineNetworkDevice[] | undefined>;
    /**
     * The network interface names published by the QEMU agent
     */
    public /*out*/ readonly networkInterfaceNames!: pulumi.Output<string[]>;
    /**
     * The node name
     */
    public readonly nodeName!: pulumi.Output<string>;
    /**
     * Start VM on Node boot
     */
    public readonly onBoot!: pulumi.Output<boolean | undefined>;
    /**
     * The operating system configuration
     */
    public readonly operatingSystem!: pulumi.Output<outputs.VM.VirtualMachineOperatingSystem | undefined>;
    /**
     * The ID of the pool to assign the virtual machine to
     */
    public readonly poolId!: pulumi.Output<string | undefined>;
    /**
     * Whether to reboot vm after creation
     */
    public readonly reboot!: pulumi.Output<boolean | undefined>;
    /**
     * The SCSI hardware type
     */
    public readonly scsiHardware!: pulumi.Output<string | undefined>;
    /**
     * The serial devices
     */
    public readonly serialDevices!: pulumi.Output<outputs.VM.VirtualMachineSerialDevice[] | undefined>;
    /**
     * Specifies SMBIOS (type1) settings for the VM
     */
    public readonly smbios!: pulumi.Output<outputs.VM.VirtualMachineSmbios | undefined>;
    /**
     * Whether to start the virtual machine
     */
    public readonly started!: pulumi.Output<boolean | undefined>;
    /**
     * Defines startup and shutdown behavior of the VM
     */
    public readonly startup!: pulumi.Output<outputs.VM.VirtualMachineStartup | undefined>;
    /**
     * Whether to enable the USB tablet device
     */
    public readonly tabletDevice!: pulumi.Output<boolean | undefined>;
    /**
     * Tags of the virtual machine. This is only meta information.
     */
    public readonly tags!: pulumi.Output<string[] | undefined>;
    /**
     * Whether to create a template
     */
    public readonly template!: pulumi.Output<boolean | undefined>;
    /**
     * Clone VM timeout
     */
    public readonly timeoutClone!: pulumi.Output<number | undefined>;
    /**
     * Migrate VM timeout
     */
    public readonly timeoutMigrate!: pulumi.Output<number | undefined>;
    /**
     * MoveDisk timeout
     */
    public readonly timeoutMoveDisk!: pulumi.Output<number | undefined>;
    /**
     * Reboot timeout
     */
    public readonly timeoutReboot!: pulumi.Output<number | undefined>;
    /**
     * Shutdown timeout
     */
    public readonly timeoutShutdownVm!: pulumi.Output<number | undefined>;
    /**
     * Start VM timeout
     */
    public readonly timeoutStartVm!: pulumi.Output<number | undefined>;
    /**
     * Stop VM timeout
     */
    public readonly timeoutStopVm!: pulumi.Output<number | undefined>;
    /**
     * The VGA configuration
     */
    public readonly vga!: pulumi.Output<outputs.VM.VirtualMachineVga | undefined>;
    /**
     * The VM identifier
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
            resourceInputs["onBoot"] = state ? state.onBoot : undefined;
            resourceInputs["operatingSystem"] = state ? state.operatingSystem : undefined;
            resourceInputs["poolId"] = state ? state.poolId : undefined;
            resourceInputs["reboot"] = state ? state.reboot : undefined;
            resourceInputs["scsiHardware"] = state ? state.scsiHardware : undefined;
            resourceInputs["serialDevices"] = state ? state.serialDevices : undefined;
            resourceInputs["smbios"] = state ? state.smbios : undefined;
            resourceInputs["started"] = state ? state.started : undefined;
            resourceInputs["startup"] = state ? state.startup : undefined;
            resourceInputs["tabletDevice"] = state ? state.tabletDevice : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["template"] = state ? state.template : undefined;
            resourceInputs["timeoutClone"] = state ? state.timeoutClone : undefined;
            resourceInputs["timeoutMigrate"] = state ? state.timeoutMigrate : undefined;
            resourceInputs["timeoutMoveDisk"] = state ? state.timeoutMoveDisk : undefined;
            resourceInputs["timeoutReboot"] = state ? state.timeoutReboot : undefined;
            resourceInputs["timeoutShutdownVm"] = state ? state.timeoutShutdownVm : undefined;
            resourceInputs["timeoutStartVm"] = state ? state.timeoutStartVm : undefined;
            resourceInputs["timeoutStopVm"] = state ? state.timeoutStopVm : undefined;
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
            resourceInputs["hostpcis"] = args ? args.hostpcis : undefined;
            resourceInputs["initialization"] = args ? args.initialization : undefined;
            resourceInputs["keyboardLayout"] = args ? args.keyboardLayout : undefined;
            resourceInputs["kvmArguments"] = args ? args.kvmArguments : undefined;
            resourceInputs["machine"] = args ? args.machine : undefined;
            resourceInputs["memory"] = args ? args.memory : undefined;
            resourceInputs["migrate"] = args ? args.migrate : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["networkDevices"] = args ? args.networkDevices : undefined;
            resourceInputs["nodeName"] = args ? args.nodeName : undefined;
            resourceInputs["onBoot"] = args ? args.onBoot : undefined;
            resourceInputs["operatingSystem"] = args ? args.operatingSystem : undefined;
            resourceInputs["poolId"] = args ? args.poolId : undefined;
            resourceInputs["reboot"] = args ? args.reboot : undefined;
            resourceInputs["scsiHardware"] = args ? args.scsiHardware : undefined;
            resourceInputs["serialDevices"] = args ? args.serialDevices : undefined;
            resourceInputs["smbios"] = args ? args.smbios : undefined;
            resourceInputs["started"] = args ? args.started : undefined;
            resourceInputs["startup"] = args ? args.startup : undefined;
            resourceInputs["tabletDevice"] = args ? args.tabletDevice : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["template"] = args ? args.template : undefined;
            resourceInputs["timeoutClone"] = args ? args.timeoutClone : undefined;
            resourceInputs["timeoutMigrate"] = args ? args.timeoutMigrate : undefined;
            resourceInputs["timeoutMoveDisk"] = args ? args.timeoutMoveDisk : undefined;
            resourceInputs["timeoutReboot"] = args ? args.timeoutReboot : undefined;
            resourceInputs["timeoutShutdownVm"] = args ? args.timeoutShutdownVm : undefined;
            resourceInputs["timeoutStartVm"] = args ? args.timeoutStartVm : undefined;
            resourceInputs["timeoutStopVm"] = args ? args.timeoutStopVm : undefined;
            resourceInputs["vga"] = args ? args.vga : undefined;
            resourceInputs["vmId"] = args ? args.vmId : undefined;
            resourceInputs["ipv4Addresses"] = undefined /*out*/;
            resourceInputs["ipv6Addresses"] = undefined /*out*/;
            resourceInputs["macAddresses"] = undefined /*out*/;
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
     * Whether to enable ACPI
     */
    acpi?: pulumi.Input<boolean>;
    /**
     * The QEMU agent configuration
     */
    agent?: pulumi.Input<inputs.VM.VirtualMachineAgent>;
    /**
     * The audio devices
     */
    audioDevice?: pulumi.Input<inputs.VM.VirtualMachineAudioDevice>;
    /**
     * The BIOS implementation
     */
    bios?: pulumi.Input<string>;
    /**
     * The guest will attempt to boot from devices in the order they appear here
     */
    bootOrders?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The CDROM drive
     */
    cdrom?: pulumi.Input<inputs.VM.VirtualMachineCdrom>;
    /**
     * The cloning configuration
     */
    clone?: pulumi.Input<inputs.VM.VirtualMachineClone>;
    /**
     * The CPU allocation
     */
    cpu?: pulumi.Input<inputs.VM.VirtualMachineCpu>;
    /**
     * The description
     */
    description?: pulumi.Input<string>;
    /**
     * The disk devices
     */
    disks?: pulumi.Input<pulumi.Input<inputs.VM.VirtualMachineDisk>[]>;
    /**
     * The efidisk device
     */
    efiDisk?: pulumi.Input<inputs.VM.VirtualMachineEfiDisk>;
    /**
     * The Host PCI devices mapped to the VM
     */
    hostpcis?: pulumi.Input<pulumi.Input<inputs.VM.VirtualMachineHostpci>[]>;
    /**
     * The cloud-init configuration
     */
    initialization?: pulumi.Input<inputs.VM.VirtualMachineInitialization>;
    /**
     * The IPv4 addresses published by the QEMU agent
     */
    ipv4Addresses?: pulumi.Input<pulumi.Input<pulumi.Input<string>[]>[]>;
    /**
     * The IPv6 addresses published by the QEMU agent
     */
    ipv6Addresses?: pulumi.Input<pulumi.Input<pulumi.Input<string>[]>[]>;
    /**
     * The keyboard layout
     */
    keyboardLayout?: pulumi.Input<string>;
    /**
     * The args implementation
     */
    kvmArguments?: pulumi.Input<string>;
    /**
     * The MAC addresses for the network interfaces
     */
    macAddresses?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The VM machine type, either default i440fx or q35
     */
    machine?: pulumi.Input<string>;
    /**
     * The memory allocation
     */
    memory?: pulumi.Input<inputs.VM.VirtualMachineMemory>;
    /**
     * Whether to migrate the VM on node change instead of re-creating it
     */
    migrate?: pulumi.Input<boolean>;
    /**
     * The name
     */
    name?: pulumi.Input<string>;
    /**
     * The network devices
     */
    networkDevices?: pulumi.Input<pulumi.Input<inputs.VM.VirtualMachineNetworkDevice>[]>;
    /**
     * The network interface names published by the QEMU agent
     */
    networkInterfaceNames?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The node name
     */
    nodeName?: pulumi.Input<string>;
    /**
     * Start VM on Node boot
     */
    onBoot?: pulumi.Input<boolean>;
    /**
     * The operating system configuration
     */
    operatingSystem?: pulumi.Input<inputs.VM.VirtualMachineOperatingSystem>;
    /**
     * The ID of the pool to assign the virtual machine to
     */
    poolId?: pulumi.Input<string>;
    /**
     * Whether to reboot vm after creation
     */
    reboot?: pulumi.Input<boolean>;
    /**
     * The SCSI hardware type
     */
    scsiHardware?: pulumi.Input<string>;
    /**
     * The serial devices
     */
    serialDevices?: pulumi.Input<pulumi.Input<inputs.VM.VirtualMachineSerialDevice>[]>;
    /**
     * Specifies SMBIOS (type1) settings for the VM
     */
    smbios?: pulumi.Input<inputs.VM.VirtualMachineSmbios>;
    /**
     * Whether to start the virtual machine
     */
    started?: pulumi.Input<boolean>;
    /**
     * Defines startup and shutdown behavior of the VM
     */
    startup?: pulumi.Input<inputs.VM.VirtualMachineStartup>;
    /**
     * Whether to enable the USB tablet device
     */
    tabletDevice?: pulumi.Input<boolean>;
    /**
     * Tags of the virtual machine. This is only meta information.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Whether to create a template
     */
    template?: pulumi.Input<boolean>;
    /**
     * Clone VM timeout
     */
    timeoutClone?: pulumi.Input<number>;
    /**
     * Migrate VM timeout
     */
    timeoutMigrate?: pulumi.Input<number>;
    /**
     * MoveDisk timeout
     */
    timeoutMoveDisk?: pulumi.Input<number>;
    /**
     * Reboot timeout
     */
    timeoutReboot?: pulumi.Input<number>;
    /**
     * Shutdown timeout
     */
    timeoutShutdownVm?: pulumi.Input<number>;
    /**
     * Start VM timeout
     */
    timeoutStartVm?: pulumi.Input<number>;
    /**
     * Stop VM timeout
     */
    timeoutStopVm?: pulumi.Input<number>;
    /**
     * The VGA configuration
     */
    vga?: pulumi.Input<inputs.VM.VirtualMachineVga>;
    /**
     * The VM identifier
     */
    vmId?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a VirtualMachine resource.
 */
export interface VirtualMachineArgs {
    /**
     * Whether to enable ACPI
     */
    acpi?: pulumi.Input<boolean>;
    /**
     * The QEMU agent configuration
     */
    agent?: pulumi.Input<inputs.VM.VirtualMachineAgent>;
    /**
     * The audio devices
     */
    audioDevice?: pulumi.Input<inputs.VM.VirtualMachineAudioDevice>;
    /**
     * The BIOS implementation
     */
    bios?: pulumi.Input<string>;
    /**
     * The guest will attempt to boot from devices in the order they appear here
     */
    bootOrders?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The CDROM drive
     */
    cdrom?: pulumi.Input<inputs.VM.VirtualMachineCdrom>;
    /**
     * The cloning configuration
     */
    clone?: pulumi.Input<inputs.VM.VirtualMachineClone>;
    /**
     * The CPU allocation
     */
    cpu?: pulumi.Input<inputs.VM.VirtualMachineCpu>;
    /**
     * The description
     */
    description?: pulumi.Input<string>;
    /**
     * The disk devices
     */
    disks?: pulumi.Input<pulumi.Input<inputs.VM.VirtualMachineDisk>[]>;
    /**
     * The efidisk device
     */
    efiDisk?: pulumi.Input<inputs.VM.VirtualMachineEfiDisk>;
    /**
     * The Host PCI devices mapped to the VM
     */
    hostpcis?: pulumi.Input<pulumi.Input<inputs.VM.VirtualMachineHostpci>[]>;
    /**
     * The cloud-init configuration
     */
    initialization?: pulumi.Input<inputs.VM.VirtualMachineInitialization>;
    /**
     * The keyboard layout
     */
    keyboardLayout?: pulumi.Input<string>;
    /**
     * The args implementation
     */
    kvmArguments?: pulumi.Input<string>;
    /**
     * The VM machine type, either default i440fx or q35
     */
    machine?: pulumi.Input<string>;
    /**
     * The memory allocation
     */
    memory?: pulumi.Input<inputs.VM.VirtualMachineMemory>;
    /**
     * Whether to migrate the VM on node change instead of re-creating it
     */
    migrate?: pulumi.Input<boolean>;
    /**
     * The name
     */
    name?: pulumi.Input<string>;
    /**
     * The network devices
     */
    networkDevices?: pulumi.Input<pulumi.Input<inputs.VM.VirtualMachineNetworkDevice>[]>;
    /**
     * The node name
     */
    nodeName: pulumi.Input<string>;
    /**
     * Start VM on Node boot
     */
    onBoot?: pulumi.Input<boolean>;
    /**
     * The operating system configuration
     */
    operatingSystem?: pulumi.Input<inputs.VM.VirtualMachineOperatingSystem>;
    /**
     * The ID of the pool to assign the virtual machine to
     */
    poolId?: pulumi.Input<string>;
    /**
     * Whether to reboot vm after creation
     */
    reboot?: pulumi.Input<boolean>;
    /**
     * The SCSI hardware type
     */
    scsiHardware?: pulumi.Input<string>;
    /**
     * The serial devices
     */
    serialDevices?: pulumi.Input<pulumi.Input<inputs.VM.VirtualMachineSerialDevice>[]>;
    /**
     * Specifies SMBIOS (type1) settings for the VM
     */
    smbios?: pulumi.Input<inputs.VM.VirtualMachineSmbios>;
    /**
     * Whether to start the virtual machine
     */
    started?: pulumi.Input<boolean>;
    /**
     * Defines startup and shutdown behavior of the VM
     */
    startup?: pulumi.Input<inputs.VM.VirtualMachineStartup>;
    /**
     * Whether to enable the USB tablet device
     */
    tabletDevice?: pulumi.Input<boolean>;
    /**
     * Tags of the virtual machine. This is only meta information.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Whether to create a template
     */
    template?: pulumi.Input<boolean>;
    /**
     * Clone VM timeout
     */
    timeoutClone?: pulumi.Input<number>;
    /**
     * Migrate VM timeout
     */
    timeoutMigrate?: pulumi.Input<number>;
    /**
     * MoveDisk timeout
     */
    timeoutMoveDisk?: pulumi.Input<number>;
    /**
     * Reboot timeout
     */
    timeoutReboot?: pulumi.Input<number>;
    /**
     * Shutdown timeout
     */
    timeoutShutdownVm?: pulumi.Input<number>;
    /**
     * Start VM timeout
     */
    timeoutStartVm?: pulumi.Input<number>;
    /**
     * Stop VM timeout
     */
    timeoutStopVm?: pulumi.Input<number>;
    /**
     * The VGA configuration
     */
    vga?: pulumi.Input<inputs.VM.VirtualMachineVga>;
    /**
     * The VM identifier
     */
    vmId?: pulumi.Input<number>;
}
