// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package vm

import (
	"context"
	"reflect"

	"errors"
	"github.com/muhlba91/pulumi-proxmoxve/sdk/v6/go/proxmoxve/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// !> **DO NOT USE**
// This is an experimental implementation of a Proxmox VM resource using Plugin Framework.<br><br>It is a Proof of Concept, highly experimental and **will** change in future. It does not support all features of the Proxmox API for VMs and **MUST NOT** be used in production.
//
// > Many attributes are marked as **optional** _and_ **computed** in the schema,
// hence you may seem added to the plan with "(known after apply)" status, even if they are not set in the configuration.
// This is done to support the `clone` operation, when a VM is created from an existing VM or template,
// and the source attributes are copied to the clone.<br><br>
// Computed attributes allow the provider to set those attributes without user input.
// The attributes are also marked as optional to allow the practitioner to set (or overwrite) them if needed.
type VirtualMachine2 struct {
	pulumi.CustomResourceState

	// The CD-ROM configuration. The key is the interface of the CD-ROM, could be one of `ideN`, `sataN`, `scsiN`, where N is the index of the interface. Note that `q35` machine type only supports `ide0` and `ide2` of IDE interfaces.
	Cdrom VirtualMachine2CdromMapOutput `pulumi:"cdrom"`
	// The cloning configuration.
	Clone VirtualMachine2ClonePtrOutput `pulumi:"clone"`
	// The CPU configuration.
	Cpu VirtualMachine2CpuOutput `pulumi:"cpu"`
	// The description of the VM.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The name of the VM. Doesn't have to be unique.
	Name pulumi.StringOutput `pulumi:"name"`
	// The name of the node where the VM is provisioned.
	NodeName pulumi.StringOutput `pulumi:"nodeName"`
	// Set to true to stop (rather than shutdown) the VM on destroy (defaults to `false`).
	StopOnDestroy pulumi.BoolOutput `pulumi:"stopOnDestroy"`
	// The tags assigned to the VM.
	Tags pulumi.StringArrayOutput `pulumi:"tags"`
	// Set to true to create a VM template.
	Template pulumi.BoolPtrOutput             `pulumi:"template"`
	Timeouts VirtualMachine2TimeoutsPtrOutput `pulumi:"timeouts"`
	// Configure the VGA Hardware. If you want to use high resolution modes (>= 1280x1024x16) you may need to increase the vga memory option. Since QEMU 2.9 the default VGA display type is `std` for all OS types besides some Windows versions (XP and older) which use `cirrus`. The `qxl` option enables the SPICE display server. For win* OS you can select how many independent displays you want, Linux guests can add displays themself. You can also run without any graphic card, using a serial device as terminal. See the [Proxmox documentation](https://pve.proxmox.com/pve-docs/pve-admin-guide.html#qm_virtual_machines_settings) section 10.2.8 for more information and available configuration parameters.
	Vga VirtualMachine2VgaOutput `pulumi:"vga"`
}

// NewVirtualMachine2 registers a new resource with the given unique name, arguments, and options.
func NewVirtualMachine2(ctx *pulumi.Context,
	name string, args *VirtualMachine2Args, opts ...pulumi.ResourceOption) (*VirtualMachine2, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.NodeName == nil {
		return nil, errors.New("invalid value for required argument 'NodeName'")
	}
	aliases := pulumi.Aliases([]pulumi.Alias{
		{
			Type: pulumi.String("proxmoxve:index/vm2:Vm2"),
		},
	})
	opts = append(opts, aliases)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource VirtualMachine2
	err := ctx.RegisterResource("proxmoxve:VM/virtualMachine2:VirtualMachine2", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetVirtualMachine2 gets an existing VirtualMachine2 resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetVirtualMachine2(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *VirtualMachine2State, opts ...pulumi.ResourceOption) (*VirtualMachine2, error) {
	var resource VirtualMachine2
	err := ctx.ReadResource("proxmoxve:VM/virtualMachine2:VirtualMachine2", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering VirtualMachine2 resources.
type virtualMachine2State struct {
	// The CD-ROM configuration. The key is the interface of the CD-ROM, could be one of `ideN`, `sataN`, `scsiN`, where N is the index of the interface. Note that `q35` machine type only supports `ide0` and `ide2` of IDE interfaces.
	Cdrom map[string]VirtualMachine2Cdrom `pulumi:"cdrom"`
	// The cloning configuration.
	Clone *VirtualMachine2Clone `pulumi:"clone"`
	// The CPU configuration.
	Cpu *VirtualMachine2Cpu `pulumi:"cpu"`
	// The description of the VM.
	Description *string `pulumi:"description"`
	// The name of the VM. Doesn't have to be unique.
	Name *string `pulumi:"name"`
	// The name of the node where the VM is provisioned.
	NodeName *string `pulumi:"nodeName"`
	// Set to true to stop (rather than shutdown) the VM on destroy (defaults to `false`).
	StopOnDestroy *bool `pulumi:"stopOnDestroy"`
	// The tags assigned to the VM.
	Tags []string `pulumi:"tags"`
	// Set to true to create a VM template.
	Template *bool                    `pulumi:"template"`
	Timeouts *VirtualMachine2Timeouts `pulumi:"timeouts"`
	// Configure the VGA Hardware. If you want to use high resolution modes (>= 1280x1024x16) you may need to increase the vga memory option. Since QEMU 2.9 the default VGA display type is `std` for all OS types besides some Windows versions (XP and older) which use `cirrus`. The `qxl` option enables the SPICE display server. For win* OS you can select how many independent displays you want, Linux guests can add displays themself. You can also run without any graphic card, using a serial device as terminal. See the [Proxmox documentation](https://pve.proxmox.com/pve-docs/pve-admin-guide.html#qm_virtual_machines_settings) section 10.2.8 for more information and available configuration parameters.
	Vga *VirtualMachine2Vga `pulumi:"vga"`
}

type VirtualMachine2State struct {
	// The CD-ROM configuration. The key is the interface of the CD-ROM, could be one of `ideN`, `sataN`, `scsiN`, where N is the index of the interface. Note that `q35` machine type only supports `ide0` and `ide2` of IDE interfaces.
	Cdrom VirtualMachine2CdromMapInput
	// The cloning configuration.
	Clone VirtualMachine2ClonePtrInput
	// The CPU configuration.
	Cpu VirtualMachine2CpuPtrInput
	// The description of the VM.
	Description pulumi.StringPtrInput
	// The name of the VM. Doesn't have to be unique.
	Name pulumi.StringPtrInput
	// The name of the node where the VM is provisioned.
	NodeName pulumi.StringPtrInput
	// Set to true to stop (rather than shutdown) the VM on destroy (defaults to `false`).
	StopOnDestroy pulumi.BoolPtrInput
	// The tags assigned to the VM.
	Tags pulumi.StringArrayInput
	// Set to true to create a VM template.
	Template pulumi.BoolPtrInput
	Timeouts VirtualMachine2TimeoutsPtrInput
	// Configure the VGA Hardware. If you want to use high resolution modes (>= 1280x1024x16) you may need to increase the vga memory option. Since QEMU 2.9 the default VGA display type is `std` for all OS types besides some Windows versions (XP and older) which use `cirrus`. The `qxl` option enables the SPICE display server. For win* OS you can select how many independent displays you want, Linux guests can add displays themself. You can also run without any graphic card, using a serial device as terminal. See the [Proxmox documentation](https://pve.proxmox.com/pve-docs/pve-admin-guide.html#qm_virtual_machines_settings) section 10.2.8 for more information and available configuration parameters.
	Vga VirtualMachine2VgaPtrInput
}

func (VirtualMachine2State) ElementType() reflect.Type {
	return reflect.TypeOf((*virtualMachine2State)(nil)).Elem()
}

type virtualMachine2Args struct {
	// The CD-ROM configuration. The key is the interface of the CD-ROM, could be one of `ideN`, `sataN`, `scsiN`, where N is the index of the interface. Note that `q35` machine type only supports `ide0` and `ide2` of IDE interfaces.
	Cdrom map[string]VirtualMachine2Cdrom `pulumi:"cdrom"`
	// The cloning configuration.
	Clone *VirtualMachine2Clone `pulumi:"clone"`
	// The CPU configuration.
	Cpu *VirtualMachine2Cpu `pulumi:"cpu"`
	// The description of the VM.
	Description *string `pulumi:"description"`
	// The name of the VM. Doesn't have to be unique.
	Name *string `pulumi:"name"`
	// The name of the node where the VM is provisioned.
	NodeName string `pulumi:"nodeName"`
	// Set to true to stop (rather than shutdown) the VM on destroy (defaults to `false`).
	StopOnDestroy *bool `pulumi:"stopOnDestroy"`
	// The tags assigned to the VM.
	Tags []string `pulumi:"tags"`
	// Set to true to create a VM template.
	Template *bool                    `pulumi:"template"`
	Timeouts *VirtualMachine2Timeouts `pulumi:"timeouts"`
	// Configure the VGA Hardware. If you want to use high resolution modes (>= 1280x1024x16) you may need to increase the vga memory option. Since QEMU 2.9 the default VGA display type is `std` for all OS types besides some Windows versions (XP and older) which use `cirrus`. The `qxl` option enables the SPICE display server. For win* OS you can select how many independent displays you want, Linux guests can add displays themself. You can also run without any graphic card, using a serial device as terminal. See the [Proxmox documentation](https://pve.proxmox.com/pve-docs/pve-admin-guide.html#qm_virtual_machines_settings) section 10.2.8 for more information and available configuration parameters.
	Vga *VirtualMachine2Vga `pulumi:"vga"`
}

// The set of arguments for constructing a VirtualMachine2 resource.
type VirtualMachine2Args struct {
	// The CD-ROM configuration. The key is the interface of the CD-ROM, could be one of `ideN`, `sataN`, `scsiN`, where N is the index of the interface. Note that `q35` machine type only supports `ide0` and `ide2` of IDE interfaces.
	Cdrom VirtualMachine2CdromMapInput
	// The cloning configuration.
	Clone VirtualMachine2ClonePtrInput
	// The CPU configuration.
	Cpu VirtualMachine2CpuPtrInput
	// The description of the VM.
	Description pulumi.StringPtrInput
	// The name of the VM. Doesn't have to be unique.
	Name pulumi.StringPtrInput
	// The name of the node where the VM is provisioned.
	NodeName pulumi.StringInput
	// Set to true to stop (rather than shutdown) the VM on destroy (defaults to `false`).
	StopOnDestroy pulumi.BoolPtrInput
	// The tags assigned to the VM.
	Tags pulumi.StringArrayInput
	// Set to true to create a VM template.
	Template pulumi.BoolPtrInput
	Timeouts VirtualMachine2TimeoutsPtrInput
	// Configure the VGA Hardware. If you want to use high resolution modes (>= 1280x1024x16) you may need to increase the vga memory option. Since QEMU 2.9 the default VGA display type is `std` for all OS types besides some Windows versions (XP and older) which use `cirrus`. The `qxl` option enables the SPICE display server. For win* OS you can select how many independent displays you want, Linux guests can add displays themself. You can also run without any graphic card, using a serial device as terminal. See the [Proxmox documentation](https://pve.proxmox.com/pve-docs/pve-admin-guide.html#qm_virtual_machines_settings) section 10.2.8 for more information and available configuration parameters.
	Vga VirtualMachine2VgaPtrInput
}

func (VirtualMachine2Args) ElementType() reflect.Type {
	return reflect.TypeOf((*virtualMachine2Args)(nil)).Elem()
}

type VirtualMachine2Input interface {
	pulumi.Input

	ToVirtualMachine2Output() VirtualMachine2Output
	ToVirtualMachine2OutputWithContext(ctx context.Context) VirtualMachine2Output
}

func (*VirtualMachine2) ElementType() reflect.Type {
	return reflect.TypeOf((**VirtualMachine2)(nil)).Elem()
}

func (i *VirtualMachine2) ToVirtualMachine2Output() VirtualMachine2Output {
	return i.ToVirtualMachine2OutputWithContext(context.Background())
}

func (i *VirtualMachine2) ToVirtualMachine2OutputWithContext(ctx context.Context) VirtualMachine2Output {
	return pulumi.ToOutputWithContext(ctx, i).(VirtualMachine2Output)
}

// VirtualMachine2ArrayInput is an input type that accepts VirtualMachine2Array and VirtualMachine2ArrayOutput values.
// You can construct a concrete instance of `VirtualMachine2ArrayInput` via:
//
//	VirtualMachine2Array{ VirtualMachine2Args{...} }
type VirtualMachine2ArrayInput interface {
	pulumi.Input

	ToVirtualMachine2ArrayOutput() VirtualMachine2ArrayOutput
	ToVirtualMachine2ArrayOutputWithContext(context.Context) VirtualMachine2ArrayOutput
}

type VirtualMachine2Array []VirtualMachine2Input

func (VirtualMachine2Array) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*VirtualMachine2)(nil)).Elem()
}

func (i VirtualMachine2Array) ToVirtualMachine2ArrayOutput() VirtualMachine2ArrayOutput {
	return i.ToVirtualMachine2ArrayOutputWithContext(context.Background())
}

func (i VirtualMachine2Array) ToVirtualMachine2ArrayOutputWithContext(ctx context.Context) VirtualMachine2ArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VirtualMachine2ArrayOutput)
}

// VirtualMachine2MapInput is an input type that accepts VirtualMachine2Map and VirtualMachine2MapOutput values.
// You can construct a concrete instance of `VirtualMachine2MapInput` via:
//
//	VirtualMachine2Map{ "key": VirtualMachine2Args{...} }
type VirtualMachine2MapInput interface {
	pulumi.Input

	ToVirtualMachine2MapOutput() VirtualMachine2MapOutput
	ToVirtualMachine2MapOutputWithContext(context.Context) VirtualMachine2MapOutput
}

type VirtualMachine2Map map[string]VirtualMachine2Input

func (VirtualMachine2Map) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*VirtualMachine2)(nil)).Elem()
}

func (i VirtualMachine2Map) ToVirtualMachine2MapOutput() VirtualMachine2MapOutput {
	return i.ToVirtualMachine2MapOutputWithContext(context.Background())
}

func (i VirtualMachine2Map) ToVirtualMachine2MapOutputWithContext(ctx context.Context) VirtualMachine2MapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VirtualMachine2MapOutput)
}

type VirtualMachine2Output struct{ *pulumi.OutputState }

func (VirtualMachine2Output) ElementType() reflect.Type {
	return reflect.TypeOf((**VirtualMachine2)(nil)).Elem()
}

func (o VirtualMachine2Output) ToVirtualMachine2Output() VirtualMachine2Output {
	return o
}

func (o VirtualMachine2Output) ToVirtualMachine2OutputWithContext(ctx context.Context) VirtualMachine2Output {
	return o
}

// The CD-ROM configuration. The key is the interface of the CD-ROM, could be one of `ideN`, `sataN`, `scsiN`, where N is the index of the interface. Note that `q35` machine type only supports `ide0` and `ide2` of IDE interfaces.
func (o VirtualMachine2Output) Cdrom() VirtualMachine2CdromMapOutput {
	return o.ApplyT(func(v *VirtualMachine2) VirtualMachine2CdromMapOutput { return v.Cdrom }).(VirtualMachine2CdromMapOutput)
}

// The cloning configuration.
func (o VirtualMachine2Output) Clone() VirtualMachine2ClonePtrOutput {
	return o.ApplyT(func(v *VirtualMachine2) VirtualMachine2ClonePtrOutput { return v.Clone }).(VirtualMachine2ClonePtrOutput)
}

// The CPU configuration.
func (o VirtualMachine2Output) Cpu() VirtualMachine2CpuOutput {
	return o.ApplyT(func(v *VirtualMachine2) VirtualMachine2CpuOutput { return v.Cpu }).(VirtualMachine2CpuOutput)
}

// The description of the VM.
func (o VirtualMachine2Output) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *VirtualMachine2) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The name of the VM. Doesn't have to be unique.
func (o VirtualMachine2Output) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *VirtualMachine2) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The name of the node where the VM is provisioned.
func (o VirtualMachine2Output) NodeName() pulumi.StringOutput {
	return o.ApplyT(func(v *VirtualMachine2) pulumi.StringOutput { return v.NodeName }).(pulumi.StringOutput)
}

// Set to true to stop (rather than shutdown) the VM on destroy (defaults to `false`).
func (o VirtualMachine2Output) StopOnDestroy() pulumi.BoolOutput {
	return o.ApplyT(func(v *VirtualMachine2) pulumi.BoolOutput { return v.StopOnDestroy }).(pulumi.BoolOutput)
}

// The tags assigned to the VM.
func (o VirtualMachine2Output) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *VirtualMachine2) pulumi.StringArrayOutput { return v.Tags }).(pulumi.StringArrayOutput)
}

// Set to true to create a VM template.
func (o VirtualMachine2Output) Template() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *VirtualMachine2) pulumi.BoolPtrOutput { return v.Template }).(pulumi.BoolPtrOutput)
}

func (o VirtualMachine2Output) Timeouts() VirtualMachine2TimeoutsPtrOutput {
	return o.ApplyT(func(v *VirtualMachine2) VirtualMachine2TimeoutsPtrOutput { return v.Timeouts }).(VirtualMachine2TimeoutsPtrOutput)
}

// Configure the VGA Hardware. If you want to use high resolution modes (>= 1280x1024x16) you may need to increase the vga memory option. Since QEMU 2.9 the default VGA display type is `std` for all OS types besides some Windows versions (XP and older) which use `cirrus`. The `qxl` option enables the SPICE display server. For win* OS you can select how many independent displays you want, Linux guests can add displays themself. You can also run without any graphic card, using a serial device as terminal. See the [Proxmox documentation](https://pve.proxmox.com/pve-docs/pve-admin-guide.html#qm_virtual_machines_settings) section 10.2.8 for more information and available configuration parameters.
func (o VirtualMachine2Output) Vga() VirtualMachine2VgaOutput {
	return o.ApplyT(func(v *VirtualMachine2) VirtualMachine2VgaOutput { return v.Vga }).(VirtualMachine2VgaOutput)
}

type VirtualMachine2ArrayOutput struct{ *pulumi.OutputState }

func (VirtualMachine2ArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*VirtualMachine2)(nil)).Elem()
}

func (o VirtualMachine2ArrayOutput) ToVirtualMachine2ArrayOutput() VirtualMachine2ArrayOutput {
	return o
}

func (o VirtualMachine2ArrayOutput) ToVirtualMachine2ArrayOutputWithContext(ctx context.Context) VirtualMachine2ArrayOutput {
	return o
}

func (o VirtualMachine2ArrayOutput) Index(i pulumi.IntInput) VirtualMachine2Output {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *VirtualMachine2 {
		return vs[0].([]*VirtualMachine2)[vs[1].(int)]
	}).(VirtualMachine2Output)
}

type VirtualMachine2MapOutput struct{ *pulumi.OutputState }

func (VirtualMachine2MapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*VirtualMachine2)(nil)).Elem()
}

func (o VirtualMachine2MapOutput) ToVirtualMachine2MapOutput() VirtualMachine2MapOutput {
	return o
}

func (o VirtualMachine2MapOutput) ToVirtualMachine2MapOutputWithContext(ctx context.Context) VirtualMachine2MapOutput {
	return o
}

func (o VirtualMachine2MapOutput) MapIndex(k pulumi.StringInput) VirtualMachine2Output {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *VirtualMachine2 {
		return vs[0].(map[string]*VirtualMachine2)[vs[1].(string)]
	}).(VirtualMachine2Output)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*VirtualMachine2Input)(nil)).Elem(), &VirtualMachine2{})
	pulumi.RegisterInputType(reflect.TypeOf((*VirtualMachine2ArrayInput)(nil)).Elem(), VirtualMachine2Array{})
	pulumi.RegisterInputType(reflect.TypeOf((*VirtualMachine2MapInput)(nil)).Elem(), VirtualMachine2Map{})
	pulumi.RegisterOutputType(VirtualMachine2Output{})
	pulumi.RegisterOutputType(VirtualMachine2ArrayOutput{})
	pulumi.RegisterOutputType(VirtualMachine2MapOutput{})
}
