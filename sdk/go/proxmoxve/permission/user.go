// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package permission

import (
	"context"
	"reflect"

	"errors"
	"github.com/muhlba91/pulumi-proxmoxve/sdk/v6/go/proxmoxve/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a user.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/muhlba91/pulumi-proxmoxve/sdk/v6/go/proxmoxve/Permission"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			operationsMonitoring, err := Permission.NewRole(ctx, "operationsMonitoring", &Permission.RoleArgs{
//				RoleId: pulumi.String("operations-monitoring"),
//				Privileges: pulumi.StringArray{
//					pulumi.String("VM.Monitor"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = Permission.NewUser(ctx, "operationsAutomation", &Permission.UserArgs{
//				Acls: permission.UserAclArray{
//					&permission.UserAclArgs{
//						Path:      pulumi.String("/vms/1234"),
//						Propagate: pulumi.Bool(true),
//						RoleId:    operationsMonitoring.RoleId,
//					},
//				},
//				Comment:  pulumi.String("Managed by Terraform"),
//				Password: pulumi.String("a-strong-password"),
//				UserId:   pulumi.String("operations-automation@pve"),
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
// Instances can be imported using the `user_id`, e.g.,
//
// bash
//
// ```sh
// $ pulumi import proxmoxve:Permission/user:User operations_automation operations-automation@pve
// ```
type User struct {
	pulumi.CustomResourceState

	// The access control list (multiple blocks supported).
	Acls UserAclArrayOutput `pulumi:"acls"`
	// The user comment.
	Comment pulumi.StringPtrOutput `pulumi:"comment"`
	// The user's email address.
	Email pulumi.StringPtrOutput `pulumi:"email"`
	// Whether the user account is enabled.
	Enabled pulumi.BoolPtrOutput `pulumi:"enabled"`
	// The user account's expiration date (RFC 3339).
	ExpirationDate pulumi.StringPtrOutput `pulumi:"expirationDate"`
	// The user's first name.
	FirstName pulumi.StringPtrOutput `pulumi:"firstName"`
	// The user's groups.
	Groups pulumi.StringArrayOutput `pulumi:"groups"`
	// The user's keys.
	Keys pulumi.StringPtrOutput `pulumi:"keys"`
	// The user's last name.
	LastName pulumi.StringPtrOutput `pulumi:"lastName"`
	// The user's password. Required for PVE or PAM realms.
	Password pulumi.StringPtrOutput `pulumi:"password"`
	// The user identifier.
	UserId pulumi.StringOutput `pulumi:"userId"`
}

// NewUser registers a new resource with the given unique name, arguments, and options.
func NewUser(ctx *pulumi.Context,
	name string, args *UserArgs, opts ...pulumi.ResourceOption) (*User, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.UserId == nil {
		return nil, errors.New("invalid value for required argument 'UserId'")
	}
	if args.Password != nil {
		args.Password = pulumi.ToSecret(args.Password).(pulumi.StringPtrInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"password",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource User
	err := ctx.RegisterResource("proxmoxve:Permission/user:User", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetUser gets an existing User resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetUser(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *UserState, opts ...pulumi.ResourceOption) (*User, error) {
	var resource User
	err := ctx.ReadResource("proxmoxve:Permission/user:User", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering User resources.
type userState struct {
	// The access control list (multiple blocks supported).
	Acls []UserAcl `pulumi:"acls"`
	// The user comment.
	Comment *string `pulumi:"comment"`
	// The user's email address.
	Email *string `pulumi:"email"`
	// Whether the user account is enabled.
	Enabled *bool `pulumi:"enabled"`
	// The user account's expiration date (RFC 3339).
	ExpirationDate *string `pulumi:"expirationDate"`
	// The user's first name.
	FirstName *string `pulumi:"firstName"`
	// The user's groups.
	Groups []string `pulumi:"groups"`
	// The user's keys.
	Keys *string `pulumi:"keys"`
	// The user's last name.
	LastName *string `pulumi:"lastName"`
	// The user's password. Required for PVE or PAM realms.
	Password *string `pulumi:"password"`
	// The user identifier.
	UserId *string `pulumi:"userId"`
}

type UserState struct {
	// The access control list (multiple blocks supported).
	Acls UserAclArrayInput
	// The user comment.
	Comment pulumi.StringPtrInput
	// The user's email address.
	Email pulumi.StringPtrInput
	// Whether the user account is enabled.
	Enabled pulumi.BoolPtrInput
	// The user account's expiration date (RFC 3339).
	ExpirationDate pulumi.StringPtrInput
	// The user's first name.
	FirstName pulumi.StringPtrInput
	// The user's groups.
	Groups pulumi.StringArrayInput
	// The user's keys.
	Keys pulumi.StringPtrInput
	// The user's last name.
	LastName pulumi.StringPtrInput
	// The user's password. Required for PVE or PAM realms.
	Password pulumi.StringPtrInput
	// The user identifier.
	UserId pulumi.StringPtrInput
}

func (UserState) ElementType() reflect.Type {
	return reflect.TypeOf((*userState)(nil)).Elem()
}

type userArgs struct {
	// The access control list (multiple blocks supported).
	Acls []UserAcl `pulumi:"acls"`
	// The user comment.
	Comment *string `pulumi:"comment"`
	// The user's email address.
	Email *string `pulumi:"email"`
	// Whether the user account is enabled.
	Enabled *bool `pulumi:"enabled"`
	// The user account's expiration date (RFC 3339).
	ExpirationDate *string `pulumi:"expirationDate"`
	// The user's first name.
	FirstName *string `pulumi:"firstName"`
	// The user's groups.
	Groups []string `pulumi:"groups"`
	// The user's keys.
	Keys *string `pulumi:"keys"`
	// The user's last name.
	LastName *string `pulumi:"lastName"`
	// The user's password. Required for PVE or PAM realms.
	Password *string `pulumi:"password"`
	// The user identifier.
	UserId string `pulumi:"userId"`
}

// The set of arguments for constructing a User resource.
type UserArgs struct {
	// The access control list (multiple blocks supported).
	Acls UserAclArrayInput
	// The user comment.
	Comment pulumi.StringPtrInput
	// The user's email address.
	Email pulumi.StringPtrInput
	// Whether the user account is enabled.
	Enabled pulumi.BoolPtrInput
	// The user account's expiration date (RFC 3339).
	ExpirationDate pulumi.StringPtrInput
	// The user's first name.
	FirstName pulumi.StringPtrInput
	// The user's groups.
	Groups pulumi.StringArrayInput
	// The user's keys.
	Keys pulumi.StringPtrInput
	// The user's last name.
	LastName pulumi.StringPtrInput
	// The user's password. Required for PVE or PAM realms.
	Password pulumi.StringPtrInput
	// The user identifier.
	UserId pulumi.StringInput
}

func (UserArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*userArgs)(nil)).Elem()
}

type UserInput interface {
	pulumi.Input

	ToUserOutput() UserOutput
	ToUserOutputWithContext(ctx context.Context) UserOutput
}

func (*User) ElementType() reflect.Type {
	return reflect.TypeOf((**User)(nil)).Elem()
}

func (i *User) ToUserOutput() UserOutput {
	return i.ToUserOutputWithContext(context.Background())
}

func (i *User) ToUserOutputWithContext(ctx context.Context) UserOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserOutput)
}

// UserArrayInput is an input type that accepts UserArray and UserArrayOutput values.
// You can construct a concrete instance of `UserArrayInput` via:
//
//	UserArray{ UserArgs{...} }
type UserArrayInput interface {
	pulumi.Input

	ToUserArrayOutput() UserArrayOutput
	ToUserArrayOutputWithContext(context.Context) UserArrayOutput
}

type UserArray []UserInput

func (UserArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*User)(nil)).Elem()
}

func (i UserArray) ToUserArrayOutput() UserArrayOutput {
	return i.ToUserArrayOutputWithContext(context.Background())
}

func (i UserArray) ToUserArrayOutputWithContext(ctx context.Context) UserArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserArrayOutput)
}

// UserMapInput is an input type that accepts UserMap and UserMapOutput values.
// You can construct a concrete instance of `UserMapInput` via:
//
//	UserMap{ "key": UserArgs{...} }
type UserMapInput interface {
	pulumi.Input

	ToUserMapOutput() UserMapOutput
	ToUserMapOutputWithContext(context.Context) UserMapOutput
}

type UserMap map[string]UserInput

func (UserMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*User)(nil)).Elem()
}

func (i UserMap) ToUserMapOutput() UserMapOutput {
	return i.ToUserMapOutputWithContext(context.Background())
}

func (i UserMap) ToUserMapOutputWithContext(ctx context.Context) UserMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserMapOutput)
}

type UserOutput struct{ *pulumi.OutputState }

func (UserOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**User)(nil)).Elem()
}

func (o UserOutput) ToUserOutput() UserOutput {
	return o
}

func (o UserOutput) ToUserOutputWithContext(ctx context.Context) UserOutput {
	return o
}

// The access control list (multiple blocks supported).
func (o UserOutput) Acls() UserAclArrayOutput {
	return o.ApplyT(func(v *User) UserAclArrayOutput { return v.Acls }).(UserAclArrayOutput)
}

// The user comment.
func (o UserOutput) Comment() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *User) pulumi.StringPtrOutput { return v.Comment }).(pulumi.StringPtrOutput)
}

// The user's email address.
func (o UserOutput) Email() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *User) pulumi.StringPtrOutput { return v.Email }).(pulumi.StringPtrOutput)
}

// Whether the user account is enabled.
func (o UserOutput) Enabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *User) pulumi.BoolPtrOutput { return v.Enabled }).(pulumi.BoolPtrOutput)
}

// The user account's expiration date (RFC 3339).
func (o UserOutput) ExpirationDate() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *User) pulumi.StringPtrOutput { return v.ExpirationDate }).(pulumi.StringPtrOutput)
}

// The user's first name.
func (o UserOutput) FirstName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *User) pulumi.StringPtrOutput { return v.FirstName }).(pulumi.StringPtrOutput)
}

// The user's groups.
func (o UserOutput) Groups() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *User) pulumi.StringArrayOutput { return v.Groups }).(pulumi.StringArrayOutput)
}

// The user's keys.
func (o UserOutput) Keys() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *User) pulumi.StringPtrOutput { return v.Keys }).(pulumi.StringPtrOutput)
}

// The user's last name.
func (o UserOutput) LastName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *User) pulumi.StringPtrOutput { return v.LastName }).(pulumi.StringPtrOutput)
}

// The user's password. Required for PVE or PAM realms.
func (o UserOutput) Password() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *User) pulumi.StringPtrOutput { return v.Password }).(pulumi.StringPtrOutput)
}

// The user identifier.
func (o UserOutput) UserId() pulumi.StringOutput {
	return o.ApplyT(func(v *User) pulumi.StringOutput { return v.UserId }).(pulumi.StringOutput)
}

type UserArrayOutput struct{ *pulumi.OutputState }

func (UserArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*User)(nil)).Elem()
}

func (o UserArrayOutput) ToUserArrayOutput() UserArrayOutput {
	return o
}

func (o UserArrayOutput) ToUserArrayOutputWithContext(ctx context.Context) UserArrayOutput {
	return o
}

func (o UserArrayOutput) Index(i pulumi.IntInput) UserOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *User {
		return vs[0].([]*User)[vs[1].(int)]
	}).(UserOutput)
}

type UserMapOutput struct{ *pulumi.OutputState }

func (UserMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*User)(nil)).Elem()
}

func (o UserMapOutput) ToUserMapOutput() UserMapOutput {
	return o
}

func (o UserMapOutput) ToUserMapOutputWithContext(ctx context.Context) UserMapOutput {
	return o
}

func (o UserMapOutput) MapIndex(k pulumi.StringInput) UserOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *User {
		return vs[0].(map[string]*User)[vs[1].(string)]
	}).(UserOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*UserInput)(nil)).Elem(), &User{})
	pulumi.RegisterInputType(reflect.TypeOf((*UserArrayInput)(nil)).Elem(), UserArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*UserMapInput)(nil)).Elem(), UserMap{})
	pulumi.RegisterOutputType(UserOutput{})
	pulumi.RegisterOutputType(UserArrayOutput{})
	pulumi.RegisterOutputType(UserMapOutput{})
}
