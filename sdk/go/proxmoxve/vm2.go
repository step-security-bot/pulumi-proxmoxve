// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package proxmoxve

import (
	"context"
	"reflect"

	"errors"
	"github.com/muhlba91/pulumi-proxmoxve/sdk/v6/go/proxmoxve/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Deprecated: proxmoxve.index/vm2.Vm2 has been deprecated in favor of proxmoxve.vm/virtualmachine2.VirtualMachine2
type Vm2 struct {
	pulumi.CustomResourceState

	// The CD-ROM configuration. The key is the interface of the CD-ROM, could be one of `ideN`, `sataN`, `scsiN`, where N is
	// the index of the interface. Note that `q35` machine type only supports `ide0` and `ide2` of IDE interfaces.
	Cdrom Vm2CdromMapOutput `pulumi:"cdrom"`
	// The cloning configuration.
	Clone Vm2ClonePtrOutput `pulumi:"clone"`
	// The CPU configuration.
	Cpu Vm2CpuOutput `pulumi:"cpu"`
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
	Template pulumi.BoolPtrOutput `pulumi:"template"`
	Timeouts Vm2TimeoutsPtrOutput `pulumi:"timeouts"`
	// Configure the VGA Hardware. If you want to use high resolution modes (>= 1280x1024x16) you may need to increase the vga
	// memory option. Since QEMU 2.9 the default VGA display type is `std` for all OS types besides some Windows versions (XP
	// and older) which use `cirrus`. The `qxl` option enables the SPICE display server. For win* OS you can select how many
	// independent displays you want, Linux guests can add displays themself. You can also run without any graphic card, using
	// a serial device as terminal. See the [Proxmox
	// documentation](https://pve.proxmox.com/pve-docs/pve-admin-guide.html#qm_virtual_machines_settings) section 10.2.8 for
	// more information and available configuration parameters.
	Vga Vm2VgaOutput `pulumi:"vga"`
}

// NewVm2 registers a new resource with the given unique name, arguments, and options.
func NewVm2(ctx *pulumi.Context,
	name string, args *Vm2Args, opts ...pulumi.ResourceOption) (*Vm2, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.NodeName == nil {
		return nil, errors.New("invalid value for required argument 'NodeName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Vm2
	err := ctx.RegisterResource("proxmoxve:index/vm2:Vm2", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetVm2 gets an existing Vm2 resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetVm2(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *Vm2State, opts ...pulumi.ResourceOption) (*Vm2, error) {
	var resource Vm2
	err := ctx.ReadResource("proxmoxve:index/vm2:Vm2", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Vm2 resources.
type vm2State struct {
	// The CD-ROM configuration. The key is the interface of the CD-ROM, could be one of `ideN`, `sataN`, `scsiN`, where N is
	// the index of the interface. Note that `q35` machine type only supports `ide0` and `ide2` of IDE interfaces.
	Cdrom map[string]Vm2Cdrom `pulumi:"cdrom"`
	// The cloning configuration.
	Clone *Vm2Clone `pulumi:"clone"`
	// The CPU configuration.
	Cpu *Vm2Cpu `pulumi:"cpu"`
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
	Template *bool        `pulumi:"template"`
	Timeouts *Vm2Timeouts `pulumi:"timeouts"`
	// Configure the VGA Hardware. If you want to use high resolution modes (>= 1280x1024x16) you may need to increase the vga
	// memory option. Since QEMU 2.9 the default VGA display type is `std` for all OS types besides some Windows versions (XP
	// and older) which use `cirrus`. The `qxl` option enables the SPICE display server. For win* OS you can select how many
	// independent displays you want, Linux guests can add displays themself. You can also run without any graphic card, using
	// a serial device as terminal. See the [Proxmox
	// documentation](https://pve.proxmox.com/pve-docs/pve-admin-guide.html#qm_virtual_machines_settings) section 10.2.8 for
	// more information and available configuration parameters.
	Vga *Vm2Vga `pulumi:"vga"`
}

type Vm2State struct {
	// The CD-ROM configuration. The key is the interface of the CD-ROM, could be one of `ideN`, `sataN`, `scsiN`, where N is
	// the index of the interface. Note that `q35` machine type only supports `ide0` and `ide2` of IDE interfaces.
	Cdrom Vm2CdromMapInput
	// The cloning configuration.
	Clone Vm2ClonePtrInput
	// The CPU configuration.
	Cpu Vm2CpuPtrInput
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
	Timeouts Vm2TimeoutsPtrInput
	// Configure the VGA Hardware. If you want to use high resolution modes (>= 1280x1024x16) you may need to increase the vga
	// memory option. Since QEMU 2.9 the default VGA display type is `std` for all OS types besides some Windows versions (XP
	// and older) which use `cirrus`. The `qxl` option enables the SPICE display server. For win* OS you can select how many
	// independent displays you want, Linux guests can add displays themself. You can also run without any graphic card, using
	// a serial device as terminal. See the [Proxmox
	// documentation](https://pve.proxmox.com/pve-docs/pve-admin-guide.html#qm_virtual_machines_settings) section 10.2.8 for
	// more information and available configuration parameters.
	Vga Vm2VgaPtrInput
}

func (Vm2State) ElementType() reflect.Type {
	return reflect.TypeOf((*vm2State)(nil)).Elem()
}

type vm2Args struct {
	// The CD-ROM configuration. The key is the interface of the CD-ROM, could be one of `ideN`, `sataN`, `scsiN`, where N is
	// the index of the interface. Note that `q35` machine type only supports `ide0` and `ide2` of IDE interfaces.
	Cdrom map[string]Vm2Cdrom `pulumi:"cdrom"`
	// The cloning configuration.
	Clone *Vm2Clone `pulumi:"clone"`
	// The CPU configuration.
	Cpu *Vm2Cpu `pulumi:"cpu"`
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
	Template *bool        `pulumi:"template"`
	Timeouts *Vm2Timeouts `pulumi:"timeouts"`
	// Configure the VGA Hardware. If you want to use high resolution modes (>= 1280x1024x16) you may need to increase the vga
	// memory option. Since QEMU 2.9 the default VGA display type is `std` for all OS types besides some Windows versions (XP
	// and older) which use `cirrus`. The `qxl` option enables the SPICE display server. For win* OS you can select how many
	// independent displays you want, Linux guests can add displays themself. You can also run without any graphic card, using
	// a serial device as terminal. See the [Proxmox
	// documentation](https://pve.proxmox.com/pve-docs/pve-admin-guide.html#qm_virtual_machines_settings) section 10.2.8 for
	// more information and available configuration parameters.
	Vga *Vm2Vga `pulumi:"vga"`
}

// The set of arguments for constructing a Vm2 resource.
type Vm2Args struct {
	// The CD-ROM configuration. The key is the interface of the CD-ROM, could be one of `ideN`, `sataN`, `scsiN`, where N is
	// the index of the interface. Note that `q35` machine type only supports `ide0` and `ide2` of IDE interfaces.
	Cdrom Vm2CdromMapInput
	// The cloning configuration.
	Clone Vm2ClonePtrInput
	// The CPU configuration.
	Cpu Vm2CpuPtrInput
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
	Timeouts Vm2TimeoutsPtrInput
	// Configure the VGA Hardware. If you want to use high resolution modes (>= 1280x1024x16) you may need to increase the vga
	// memory option. Since QEMU 2.9 the default VGA display type is `std` for all OS types besides some Windows versions (XP
	// and older) which use `cirrus`. The `qxl` option enables the SPICE display server. For win* OS you can select how many
	// independent displays you want, Linux guests can add displays themself. You can also run without any graphic card, using
	// a serial device as terminal. See the [Proxmox
	// documentation](https://pve.proxmox.com/pve-docs/pve-admin-guide.html#qm_virtual_machines_settings) section 10.2.8 for
	// more information and available configuration parameters.
	Vga Vm2VgaPtrInput
}

func (Vm2Args) ElementType() reflect.Type {
	return reflect.TypeOf((*vm2Args)(nil)).Elem()
}

type Vm2Input interface {
	pulumi.Input

	ToVm2Output() Vm2Output
	ToVm2OutputWithContext(ctx context.Context) Vm2Output
}

func (*Vm2) ElementType() reflect.Type {
	return reflect.TypeOf((**Vm2)(nil)).Elem()
}

func (i *Vm2) ToVm2Output() Vm2Output {
	return i.ToVm2OutputWithContext(context.Background())
}

func (i *Vm2) ToVm2OutputWithContext(ctx context.Context) Vm2Output {
	return pulumi.ToOutputWithContext(ctx, i).(Vm2Output)
}

// Vm2ArrayInput is an input type that accepts Vm2Array and Vm2ArrayOutput values.
// You can construct a concrete instance of `Vm2ArrayInput` via:
//
//	Vm2Array{ Vm2Args{...} }
type Vm2ArrayInput interface {
	pulumi.Input

	ToVm2ArrayOutput() Vm2ArrayOutput
	ToVm2ArrayOutputWithContext(context.Context) Vm2ArrayOutput
}

type Vm2Array []Vm2Input

func (Vm2Array) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Vm2)(nil)).Elem()
}

func (i Vm2Array) ToVm2ArrayOutput() Vm2ArrayOutput {
	return i.ToVm2ArrayOutputWithContext(context.Background())
}

func (i Vm2Array) ToVm2ArrayOutputWithContext(ctx context.Context) Vm2ArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(Vm2ArrayOutput)
}

// Vm2MapInput is an input type that accepts Vm2Map and Vm2MapOutput values.
// You can construct a concrete instance of `Vm2MapInput` via:
//
//	Vm2Map{ "key": Vm2Args{...} }
type Vm2MapInput interface {
	pulumi.Input

	ToVm2MapOutput() Vm2MapOutput
	ToVm2MapOutputWithContext(context.Context) Vm2MapOutput
}

type Vm2Map map[string]Vm2Input

func (Vm2Map) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Vm2)(nil)).Elem()
}

func (i Vm2Map) ToVm2MapOutput() Vm2MapOutput {
	return i.ToVm2MapOutputWithContext(context.Background())
}

func (i Vm2Map) ToVm2MapOutputWithContext(ctx context.Context) Vm2MapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(Vm2MapOutput)
}

type Vm2Output struct{ *pulumi.OutputState }

func (Vm2Output) ElementType() reflect.Type {
	return reflect.TypeOf((**Vm2)(nil)).Elem()
}

func (o Vm2Output) ToVm2Output() Vm2Output {
	return o
}

func (o Vm2Output) ToVm2OutputWithContext(ctx context.Context) Vm2Output {
	return o
}

// The CD-ROM configuration. The key is the interface of the CD-ROM, could be one of `ideN`, `sataN`, `scsiN`, where N is
// the index of the interface. Note that `q35` machine type only supports `ide0` and `ide2` of IDE interfaces.
func (o Vm2Output) Cdrom() Vm2CdromMapOutput {
	return o.ApplyT(func(v *Vm2) Vm2CdromMapOutput { return v.Cdrom }).(Vm2CdromMapOutput)
}

// The cloning configuration.
func (o Vm2Output) Clone() Vm2ClonePtrOutput {
	return o.ApplyT(func(v *Vm2) Vm2ClonePtrOutput { return v.Clone }).(Vm2ClonePtrOutput)
}

// The CPU configuration.
func (o Vm2Output) Cpu() Vm2CpuOutput {
	return o.ApplyT(func(v *Vm2) Vm2CpuOutput { return v.Cpu }).(Vm2CpuOutput)
}

// The description of the VM.
func (o Vm2Output) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Vm2) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The name of the VM. Doesn't have to be unique.
func (o Vm2Output) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Vm2) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The name of the node where the VM is provisioned.
func (o Vm2Output) NodeName() pulumi.StringOutput {
	return o.ApplyT(func(v *Vm2) pulumi.StringOutput { return v.NodeName }).(pulumi.StringOutput)
}

// Set to true to stop (rather than shutdown) the VM on destroy (defaults to `false`).
func (o Vm2Output) StopOnDestroy() pulumi.BoolOutput {
	return o.ApplyT(func(v *Vm2) pulumi.BoolOutput { return v.StopOnDestroy }).(pulumi.BoolOutput)
}

// The tags assigned to the VM.
func (o Vm2Output) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Vm2) pulumi.StringArrayOutput { return v.Tags }).(pulumi.StringArrayOutput)
}

// Set to true to create a VM template.
func (o Vm2Output) Template() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Vm2) pulumi.BoolPtrOutput { return v.Template }).(pulumi.BoolPtrOutput)
}

func (o Vm2Output) Timeouts() Vm2TimeoutsPtrOutput {
	return o.ApplyT(func(v *Vm2) Vm2TimeoutsPtrOutput { return v.Timeouts }).(Vm2TimeoutsPtrOutput)
}

// Configure the VGA Hardware. If you want to use high resolution modes (>= 1280x1024x16) you may need to increase the vga
// memory option. Since QEMU 2.9 the default VGA display type is `std` for all OS types besides some Windows versions (XP
// and older) which use `cirrus`. The `qxl` option enables the SPICE display server. For win* OS you can select how many
// independent displays you want, Linux guests can add displays themself. You can also run without any graphic card, using
// a serial device as terminal. See the [Proxmox
// documentation](https://pve.proxmox.com/pve-docs/pve-admin-guide.html#qm_virtual_machines_settings) section 10.2.8 for
// more information and available configuration parameters.
func (o Vm2Output) Vga() Vm2VgaOutput {
	return o.ApplyT(func(v *Vm2) Vm2VgaOutput { return v.Vga }).(Vm2VgaOutput)
}

type Vm2ArrayOutput struct{ *pulumi.OutputState }

func (Vm2ArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Vm2)(nil)).Elem()
}

func (o Vm2ArrayOutput) ToVm2ArrayOutput() Vm2ArrayOutput {
	return o
}

func (o Vm2ArrayOutput) ToVm2ArrayOutputWithContext(ctx context.Context) Vm2ArrayOutput {
	return o
}

func (o Vm2ArrayOutput) Index(i pulumi.IntInput) Vm2Output {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Vm2 {
		return vs[0].([]*Vm2)[vs[1].(int)]
	}).(Vm2Output)
}

type Vm2MapOutput struct{ *pulumi.OutputState }

func (Vm2MapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Vm2)(nil)).Elem()
}

func (o Vm2MapOutput) ToVm2MapOutput() Vm2MapOutput {
	return o
}

func (o Vm2MapOutput) ToVm2MapOutputWithContext(ctx context.Context) Vm2MapOutput {
	return o
}

func (o Vm2MapOutput) MapIndex(k pulumi.StringInput) Vm2Output {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Vm2 {
		return vs[0].(map[string]*Vm2)[vs[1].(string)]
	}).(Vm2Output)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*Vm2Input)(nil)).Elem(), &Vm2{})
	pulumi.RegisterInputType(reflect.TypeOf((*Vm2ArrayInput)(nil)).Elem(), Vm2Array{})
	pulumi.RegisterInputType(reflect.TypeOf((*Vm2MapInput)(nil)).Elem(), Vm2Map{})
	pulumi.RegisterOutputType(Vm2Output{})
	pulumi.RegisterOutputType(Vm2ArrayOutput{})
	pulumi.RegisterOutputType(Vm2MapOutput{})
}
