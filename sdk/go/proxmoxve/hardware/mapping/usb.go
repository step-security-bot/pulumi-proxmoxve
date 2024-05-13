// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package mapping

import (
	"context"
	"reflect"

	"errors"
	"github.com/muhlba91/pulumi-proxmoxve/sdk/v6/go/proxmoxve/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a USB hardware mapping in a Proxmox VE cluster.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/muhlba91/pulumi-proxmoxve/sdk/v6/go/proxmoxve/Hardware"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := Hardware.NewUsb(ctx, "example", &Hardware.UsbArgs{
//				Comment: pulumi.String("This is a comment"),
//				Maps: mapping.UsbMapTypeArray{
//					&mapping.UsbMapTypeArgs{
//						Comment: pulumi.String("This is a device specific comment"),
//						Id:      pulumi.String("8087:0a2b"),
//						Node:    pulumi.String("pve"),
//						Path:    pulumi.String("1-8.2"),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// #!/usr/bin/env sh
//
// A USB hardware mapping can be imported using their name, e.g.:
//
// ```sh
// $ pulumi import proxmoxve:Hardware/mapping/usb:Usb example example
// ```
type Usb struct {
	pulumi.CustomResourceState

	// The comment of this USB hardware mapping.
	Comment pulumi.StringPtrOutput `pulumi:"comment"`
	// The actual map of devices for the hardware mapping.
	Maps UsbMapTypeArrayOutput `pulumi:"maps"`
	// The name of this hardware mapping.
	Name pulumi.StringOutput `pulumi:"name"`
}

// NewUsb registers a new resource with the given unique name, arguments, and options.
func NewUsb(ctx *pulumi.Context,
	name string, args *UsbArgs, opts ...pulumi.ResourceOption) (*Usb, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Maps == nil {
		return nil, errors.New("invalid value for required argument 'Maps'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Usb
	err := ctx.RegisterResource("proxmoxve:Hardware/mapping/usb:Usb", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetUsb gets an existing Usb resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetUsb(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *UsbState, opts ...pulumi.ResourceOption) (*Usb, error) {
	var resource Usb
	err := ctx.ReadResource("proxmoxve:Hardware/mapping/usb:Usb", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Usb resources.
type usbState struct {
	// The comment of this USB hardware mapping.
	Comment *string `pulumi:"comment"`
	// The actual map of devices for the hardware mapping.
	Maps []UsbMapType `pulumi:"maps"`
	// The name of this hardware mapping.
	Name *string `pulumi:"name"`
}

type UsbState struct {
	// The comment of this USB hardware mapping.
	Comment pulumi.StringPtrInput
	// The actual map of devices for the hardware mapping.
	Maps UsbMapTypeArrayInput
	// The name of this hardware mapping.
	Name pulumi.StringPtrInput
}

func (UsbState) ElementType() reflect.Type {
	return reflect.TypeOf((*usbState)(nil)).Elem()
}

type usbArgs struct {
	// The comment of this USB hardware mapping.
	Comment *string `pulumi:"comment"`
	// The actual map of devices for the hardware mapping.
	Maps []UsbMapType `pulumi:"maps"`
	// The name of this hardware mapping.
	Name *string `pulumi:"name"`
}

// The set of arguments for constructing a Usb resource.
type UsbArgs struct {
	// The comment of this USB hardware mapping.
	Comment pulumi.StringPtrInput
	// The actual map of devices for the hardware mapping.
	Maps UsbMapTypeArrayInput
	// The name of this hardware mapping.
	Name pulumi.StringPtrInput
}

func (UsbArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*usbArgs)(nil)).Elem()
}

type UsbInput interface {
	pulumi.Input

	ToUsbOutput() UsbOutput
	ToUsbOutputWithContext(ctx context.Context) UsbOutput
}

func (*Usb) ElementType() reflect.Type {
	return reflect.TypeOf((**Usb)(nil)).Elem()
}

func (i *Usb) ToUsbOutput() UsbOutput {
	return i.ToUsbOutputWithContext(context.Background())
}

func (i *Usb) ToUsbOutputWithContext(ctx context.Context) UsbOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UsbOutput)
}

// UsbArrayInput is an input type that accepts UsbArray and UsbArrayOutput values.
// You can construct a concrete instance of `UsbArrayInput` via:
//
//	UsbArray{ UsbArgs{...} }
type UsbArrayInput interface {
	pulumi.Input

	ToUsbArrayOutput() UsbArrayOutput
	ToUsbArrayOutputWithContext(context.Context) UsbArrayOutput
}

type UsbArray []UsbInput

func (UsbArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Usb)(nil)).Elem()
}

func (i UsbArray) ToUsbArrayOutput() UsbArrayOutput {
	return i.ToUsbArrayOutputWithContext(context.Background())
}

func (i UsbArray) ToUsbArrayOutputWithContext(ctx context.Context) UsbArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UsbArrayOutput)
}

// UsbMapInput is an input type that accepts UsbMap and UsbMapOutput values.
// You can construct a concrete instance of `UsbMapInput` via:
//
//	UsbMap{ "key": UsbArgs{...} }
type UsbMapInput interface {
	pulumi.Input

	ToUsbMapOutput() UsbMapOutput
	ToUsbMapOutputWithContext(context.Context) UsbMapOutput
}

type UsbMap map[string]UsbInput

func (UsbMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Usb)(nil)).Elem()
}

func (i UsbMap) ToUsbMapOutput() UsbMapOutput {
	return i.ToUsbMapOutputWithContext(context.Background())
}

func (i UsbMap) ToUsbMapOutputWithContext(ctx context.Context) UsbMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UsbMapOutput)
}

type UsbOutput struct{ *pulumi.OutputState }

func (UsbOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Usb)(nil)).Elem()
}

func (o UsbOutput) ToUsbOutput() UsbOutput {
	return o
}

func (o UsbOutput) ToUsbOutputWithContext(ctx context.Context) UsbOutput {
	return o
}

// The comment of this USB hardware mapping.
func (o UsbOutput) Comment() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Usb) pulumi.StringPtrOutput { return v.Comment }).(pulumi.StringPtrOutput)
}

// The actual map of devices for the hardware mapping.
func (o UsbOutput) Maps() UsbMapTypeArrayOutput {
	return o.ApplyT(func(v *Usb) UsbMapTypeArrayOutput { return v.Maps }).(UsbMapTypeArrayOutput)
}

// The name of this hardware mapping.
func (o UsbOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Usb) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

type UsbArrayOutput struct{ *pulumi.OutputState }

func (UsbArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Usb)(nil)).Elem()
}

func (o UsbArrayOutput) ToUsbArrayOutput() UsbArrayOutput {
	return o
}

func (o UsbArrayOutput) ToUsbArrayOutputWithContext(ctx context.Context) UsbArrayOutput {
	return o
}

func (o UsbArrayOutput) Index(i pulumi.IntInput) UsbOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Usb {
		return vs[0].([]*Usb)[vs[1].(int)]
	}).(UsbOutput)
}

type UsbMapOutput struct{ *pulumi.OutputState }

func (UsbMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Usb)(nil)).Elem()
}

func (o UsbMapOutput) ToUsbMapOutput() UsbMapOutput {
	return o
}

func (o UsbMapOutput) ToUsbMapOutputWithContext(ctx context.Context) UsbMapOutput {
	return o
}

func (o UsbMapOutput) MapIndex(k pulumi.StringInput) UsbOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Usb {
		return vs[0].(map[string]*Usb)[vs[1].(string)]
	}).(UsbOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*UsbInput)(nil)).Elem(), &Usb{})
	pulumi.RegisterInputType(reflect.TypeOf((*UsbArrayInput)(nil)).Elem(), UsbArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*UsbMapInput)(nil)).Elem(), UsbMap{})
	pulumi.RegisterOutputType(UsbOutput{})
	pulumi.RegisterOutputType(UsbArrayOutput{})
	pulumi.RegisterOutputType(UsbMapOutput{})
}
