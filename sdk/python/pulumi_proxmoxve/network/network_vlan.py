# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['NetworkVlanArgs', 'NetworkVlan']

@pulumi.input_type
class NetworkVlanArgs:
    def __init__(__self__, *,
                 node_name: pulumi.Input[str],
                 address: Optional[pulumi.Input[str]] = None,
                 address6: Optional[pulumi.Input[str]] = None,
                 autostart: Optional[pulumi.Input[bool]] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 gateway: Optional[pulumi.Input[str]] = None,
                 gateway6: Optional[pulumi.Input[str]] = None,
                 interface: Optional[pulumi.Input[str]] = None,
                 mtu: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 vlan: Optional[pulumi.Input[int]] = None):
        """
        The set of arguments for constructing a NetworkVlan resource.
        :param pulumi.Input[str] node_name: The name of the node.
        :param pulumi.Input[str] address: The interface IPv4/CIDR address.
        :param pulumi.Input[str] address6: The interface IPv6/CIDR address.
        :param pulumi.Input[bool] autostart: Automatically start interface on boot (defaults to `true`).
        :param pulumi.Input[str] comment: Comment for the interface.
        :param pulumi.Input[str] gateway: Default gateway address.
        :param pulumi.Input[str] gateway6: Default IPv6 gateway address.
        :param pulumi.Input[str] interface: The VLAN raw device. See also `name`.
        :param pulumi.Input[int] mtu: The interface MTU.
        :param pulumi.Input[str] name: The interface name. Either add the VLAN tag number to an existing interface name, e.g. `ens18.21` (and do not set `interface` and `vlan`), or use custom name, e.g. `vlan_lab` (`interface` and `vlan` are then required).
        :param pulumi.Input[int] vlan: The VLAN tag. See also `name`.
        """
        pulumi.set(__self__, "node_name", node_name)
        if address is not None:
            pulumi.set(__self__, "address", address)
        if address6 is not None:
            pulumi.set(__self__, "address6", address6)
        if autostart is not None:
            pulumi.set(__self__, "autostart", autostart)
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if gateway is not None:
            pulumi.set(__self__, "gateway", gateway)
        if gateway6 is not None:
            pulumi.set(__self__, "gateway6", gateway6)
        if interface is not None:
            pulumi.set(__self__, "interface", interface)
        if mtu is not None:
            pulumi.set(__self__, "mtu", mtu)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if vlan is not None:
            pulumi.set(__self__, "vlan", vlan)

    @property
    @pulumi.getter(name="nodeName")
    def node_name(self) -> pulumi.Input[str]:
        """
        The name of the node.
        """
        return pulumi.get(self, "node_name")

    @node_name.setter
    def node_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "node_name", value)

    @property
    @pulumi.getter
    def address(self) -> Optional[pulumi.Input[str]]:
        """
        The interface IPv4/CIDR address.
        """
        return pulumi.get(self, "address")

    @address.setter
    def address(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "address", value)

    @property
    @pulumi.getter
    def address6(self) -> Optional[pulumi.Input[str]]:
        """
        The interface IPv6/CIDR address.
        """
        return pulumi.get(self, "address6")

    @address6.setter
    def address6(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "address6", value)

    @property
    @pulumi.getter
    def autostart(self) -> Optional[pulumi.Input[bool]]:
        """
        Automatically start interface on boot (defaults to `true`).
        """
        return pulumi.get(self, "autostart")

    @autostart.setter
    def autostart(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "autostart", value)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        """
        Comment for the interface.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter
    def gateway(self) -> Optional[pulumi.Input[str]]:
        """
        Default gateway address.
        """
        return pulumi.get(self, "gateway")

    @gateway.setter
    def gateway(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "gateway", value)

    @property
    @pulumi.getter
    def gateway6(self) -> Optional[pulumi.Input[str]]:
        """
        Default IPv6 gateway address.
        """
        return pulumi.get(self, "gateway6")

    @gateway6.setter
    def gateway6(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "gateway6", value)

    @property
    @pulumi.getter
    def interface(self) -> Optional[pulumi.Input[str]]:
        """
        The VLAN raw device. See also `name`.
        """
        return pulumi.get(self, "interface")

    @interface.setter
    def interface(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "interface", value)

    @property
    @pulumi.getter
    def mtu(self) -> Optional[pulumi.Input[int]]:
        """
        The interface MTU.
        """
        return pulumi.get(self, "mtu")

    @mtu.setter
    def mtu(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "mtu", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The interface name. Either add the VLAN tag number to an existing interface name, e.g. `ens18.21` (and do not set `interface` and `vlan`), or use custom name, e.g. `vlan_lab` (`interface` and `vlan` are then required).
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def vlan(self) -> Optional[pulumi.Input[int]]:
        """
        The VLAN tag. See also `name`.
        """
        return pulumi.get(self, "vlan")

    @vlan.setter
    def vlan(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "vlan", value)


@pulumi.input_type
class _NetworkVlanState:
    def __init__(__self__, *,
                 address: Optional[pulumi.Input[str]] = None,
                 address6: Optional[pulumi.Input[str]] = None,
                 autostart: Optional[pulumi.Input[bool]] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 gateway: Optional[pulumi.Input[str]] = None,
                 gateway6: Optional[pulumi.Input[str]] = None,
                 interface: Optional[pulumi.Input[str]] = None,
                 mtu: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 node_name: Optional[pulumi.Input[str]] = None,
                 vlan: Optional[pulumi.Input[int]] = None):
        """
        Input properties used for looking up and filtering NetworkVlan resources.
        :param pulumi.Input[str] address: The interface IPv4/CIDR address.
        :param pulumi.Input[str] address6: The interface IPv6/CIDR address.
        :param pulumi.Input[bool] autostart: Automatically start interface on boot (defaults to `true`).
        :param pulumi.Input[str] comment: Comment for the interface.
        :param pulumi.Input[str] gateway: Default gateway address.
        :param pulumi.Input[str] gateway6: Default IPv6 gateway address.
        :param pulumi.Input[str] interface: The VLAN raw device. See also `name`.
        :param pulumi.Input[int] mtu: The interface MTU.
        :param pulumi.Input[str] name: The interface name. Either add the VLAN tag number to an existing interface name, e.g. `ens18.21` (and do not set `interface` and `vlan`), or use custom name, e.g. `vlan_lab` (`interface` and `vlan` are then required).
        :param pulumi.Input[str] node_name: The name of the node.
        :param pulumi.Input[int] vlan: The VLAN tag. See also `name`.
        """
        if address is not None:
            pulumi.set(__self__, "address", address)
        if address6 is not None:
            pulumi.set(__self__, "address6", address6)
        if autostart is not None:
            pulumi.set(__self__, "autostart", autostart)
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if gateway is not None:
            pulumi.set(__self__, "gateway", gateway)
        if gateway6 is not None:
            pulumi.set(__self__, "gateway6", gateway6)
        if interface is not None:
            pulumi.set(__self__, "interface", interface)
        if mtu is not None:
            pulumi.set(__self__, "mtu", mtu)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if node_name is not None:
            pulumi.set(__self__, "node_name", node_name)
        if vlan is not None:
            pulumi.set(__self__, "vlan", vlan)

    @property
    @pulumi.getter
    def address(self) -> Optional[pulumi.Input[str]]:
        """
        The interface IPv4/CIDR address.
        """
        return pulumi.get(self, "address")

    @address.setter
    def address(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "address", value)

    @property
    @pulumi.getter
    def address6(self) -> Optional[pulumi.Input[str]]:
        """
        The interface IPv6/CIDR address.
        """
        return pulumi.get(self, "address6")

    @address6.setter
    def address6(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "address6", value)

    @property
    @pulumi.getter
    def autostart(self) -> Optional[pulumi.Input[bool]]:
        """
        Automatically start interface on boot (defaults to `true`).
        """
        return pulumi.get(self, "autostart")

    @autostart.setter
    def autostart(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "autostart", value)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        """
        Comment for the interface.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter
    def gateway(self) -> Optional[pulumi.Input[str]]:
        """
        Default gateway address.
        """
        return pulumi.get(self, "gateway")

    @gateway.setter
    def gateway(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "gateway", value)

    @property
    @pulumi.getter
    def gateway6(self) -> Optional[pulumi.Input[str]]:
        """
        Default IPv6 gateway address.
        """
        return pulumi.get(self, "gateway6")

    @gateway6.setter
    def gateway6(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "gateway6", value)

    @property
    @pulumi.getter
    def interface(self) -> Optional[pulumi.Input[str]]:
        """
        The VLAN raw device. See also `name`.
        """
        return pulumi.get(self, "interface")

    @interface.setter
    def interface(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "interface", value)

    @property
    @pulumi.getter
    def mtu(self) -> Optional[pulumi.Input[int]]:
        """
        The interface MTU.
        """
        return pulumi.get(self, "mtu")

    @mtu.setter
    def mtu(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "mtu", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The interface name. Either add the VLAN tag number to an existing interface name, e.g. `ens18.21` (and do not set `interface` and `vlan`), or use custom name, e.g. `vlan_lab` (`interface` and `vlan` are then required).
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="nodeName")
    def node_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the node.
        """
        return pulumi.get(self, "node_name")

    @node_name.setter
    def node_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "node_name", value)

    @property
    @pulumi.getter
    def vlan(self) -> Optional[pulumi.Input[int]]:
        """
        The VLAN tag. See also `name`.
        """
        return pulumi.get(self, "vlan")

    @vlan.setter
    def vlan(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "vlan", value)


class NetworkVlan(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 address: Optional[pulumi.Input[str]] = None,
                 address6: Optional[pulumi.Input[str]] = None,
                 autostart: Optional[pulumi.Input[bool]] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 gateway: Optional[pulumi.Input[str]] = None,
                 gateway6: Optional[pulumi.Input[str]] = None,
                 interface: Optional[pulumi.Input[str]] = None,
                 mtu: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 node_name: Optional[pulumi.Input[str]] = None,
                 vlan: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        """
        Manages a Linux VLAN network interface in a Proxmox VE node.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_proxmoxve as proxmoxve

        # using VLAN tag
        vlan99 = proxmoxve.network.NetworkVlan("vlan99",
            comment="VLAN 99",
            node_name="pve")
        # using custom network interface name
        vlan98 = proxmoxve.network.NetworkVlan("vlan98",
            comment="VLAN 98",
            interface="eno0",
            node_name="pve",
            vlan=98)
        ```

        ## Import

        #!/usr/bin/env sh

        #Interfaces can be imported using the `node_name:iface` format, e.g.

        ```sh
        $ pulumi import proxmoxve:Network/networkVlan:NetworkVlan vlan99 pve:vlan99
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] address: The interface IPv4/CIDR address.
        :param pulumi.Input[str] address6: The interface IPv6/CIDR address.
        :param pulumi.Input[bool] autostart: Automatically start interface on boot (defaults to `true`).
        :param pulumi.Input[str] comment: Comment for the interface.
        :param pulumi.Input[str] gateway: Default gateway address.
        :param pulumi.Input[str] gateway6: Default IPv6 gateway address.
        :param pulumi.Input[str] interface: The VLAN raw device. See also `name`.
        :param pulumi.Input[int] mtu: The interface MTU.
        :param pulumi.Input[str] name: The interface name. Either add the VLAN tag number to an existing interface name, e.g. `ens18.21` (and do not set `interface` and `vlan`), or use custom name, e.g. `vlan_lab` (`interface` and `vlan` are then required).
        :param pulumi.Input[str] node_name: The name of the node.
        :param pulumi.Input[int] vlan: The VLAN tag. See also `name`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: NetworkVlanArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Linux VLAN network interface in a Proxmox VE node.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_proxmoxve as proxmoxve

        # using VLAN tag
        vlan99 = proxmoxve.network.NetworkVlan("vlan99",
            comment="VLAN 99",
            node_name="pve")
        # using custom network interface name
        vlan98 = proxmoxve.network.NetworkVlan("vlan98",
            comment="VLAN 98",
            interface="eno0",
            node_name="pve",
            vlan=98)
        ```

        ## Import

        #!/usr/bin/env sh

        #Interfaces can be imported using the `node_name:iface` format, e.g.

        ```sh
        $ pulumi import proxmoxve:Network/networkVlan:NetworkVlan vlan99 pve:vlan99
        ```

        :param str resource_name: The name of the resource.
        :param NetworkVlanArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(NetworkVlanArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 address: Optional[pulumi.Input[str]] = None,
                 address6: Optional[pulumi.Input[str]] = None,
                 autostart: Optional[pulumi.Input[bool]] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 gateway: Optional[pulumi.Input[str]] = None,
                 gateway6: Optional[pulumi.Input[str]] = None,
                 interface: Optional[pulumi.Input[str]] = None,
                 mtu: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 node_name: Optional[pulumi.Input[str]] = None,
                 vlan: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = NetworkVlanArgs.__new__(NetworkVlanArgs)

            __props__.__dict__["address"] = address
            __props__.__dict__["address6"] = address6
            __props__.__dict__["autostart"] = autostart
            __props__.__dict__["comment"] = comment
            __props__.__dict__["gateway"] = gateway
            __props__.__dict__["gateway6"] = gateway6
            __props__.__dict__["interface"] = interface
            __props__.__dict__["mtu"] = mtu
            __props__.__dict__["name"] = name
            if node_name is None and not opts.urn:
                raise TypeError("Missing required property 'node_name'")
            __props__.__dict__["node_name"] = node_name
            __props__.__dict__["vlan"] = vlan
        super(NetworkVlan, __self__).__init__(
            'proxmoxve:Network/networkVlan:NetworkVlan',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            address: Optional[pulumi.Input[str]] = None,
            address6: Optional[pulumi.Input[str]] = None,
            autostart: Optional[pulumi.Input[bool]] = None,
            comment: Optional[pulumi.Input[str]] = None,
            gateway: Optional[pulumi.Input[str]] = None,
            gateway6: Optional[pulumi.Input[str]] = None,
            interface: Optional[pulumi.Input[str]] = None,
            mtu: Optional[pulumi.Input[int]] = None,
            name: Optional[pulumi.Input[str]] = None,
            node_name: Optional[pulumi.Input[str]] = None,
            vlan: Optional[pulumi.Input[int]] = None) -> 'NetworkVlan':
        """
        Get an existing NetworkVlan resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] address: The interface IPv4/CIDR address.
        :param pulumi.Input[str] address6: The interface IPv6/CIDR address.
        :param pulumi.Input[bool] autostart: Automatically start interface on boot (defaults to `true`).
        :param pulumi.Input[str] comment: Comment for the interface.
        :param pulumi.Input[str] gateway: Default gateway address.
        :param pulumi.Input[str] gateway6: Default IPv6 gateway address.
        :param pulumi.Input[str] interface: The VLAN raw device. See also `name`.
        :param pulumi.Input[int] mtu: The interface MTU.
        :param pulumi.Input[str] name: The interface name. Either add the VLAN tag number to an existing interface name, e.g. `ens18.21` (and do not set `interface` and `vlan`), or use custom name, e.g. `vlan_lab` (`interface` and `vlan` are then required).
        :param pulumi.Input[str] node_name: The name of the node.
        :param pulumi.Input[int] vlan: The VLAN tag. See also `name`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _NetworkVlanState.__new__(_NetworkVlanState)

        __props__.__dict__["address"] = address
        __props__.__dict__["address6"] = address6
        __props__.__dict__["autostart"] = autostart
        __props__.__dict__["comment"] = comment
        __props__.__dict__["gateway"] = gateway
        __props__.__dict__["gateway6"] = gateway6
        __props__.__dict__["interface"] = interface
        __props__.__dict__["mtu"] = mtu
        __props__.__dict__["name"] = name
        __props__.__dict__["node_name"] = node_name
        __props__.__dict__["vlan"] = vlan
        return NetworkVlan(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def address(self) -> pulumi.Output[Optional[str]]:
        """
        The interface IPv4/CIDR address.
        """
        return pulumi.get(self, "address")

    @property
    @pulumi.getter
    def address6(self) -> pulumi.Output[Optional[str]]:
        """
        The interface IPv6/CIDR address.
        """
        return pulumi.get(self, "address6")

    @property
    @pulumi.getter
    def autostart(self) -> pulumi.Output[bool]:
        """
        Automatically start interface on boot (defaults to `true`).
        """
        return pulumi.get(self, "autostart")

    @property
    @pulumi.getter
    def comment(self) -> pulumi.Output[Optional[str]]:
        """
        Comment for the interface.
        """
        return pulumi.get(self, "comment")

    @property
    @pulumi.getter
    def gateway(self) -> pulumi.Output[Optional[str]]:
        """
        Default gateway address.
        """
        return pulumi.get(self, "gateway")

    @property
    @pulumi.getter
    def gateway6(self) -> pulumi.Output[Optional[str]]:
        """
        Default IPv6 gateway address.
        """
        return pulumi.get(self, "gateway6")

    @property
    @pulumi.getter
    def interface(self) -> pulumi.Output[str]:
        """
        The VLAN raw device. See also `name`.
        """
        return pulumi.get(self, "interface")

    @property
    @pulumi.getter
    def mtu(self) -> pulumi.Output[Optional[int]]:
        """
        The interface MTU.
        """
        return pulumi.get(self, "mtu")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The interface name. Either add the VLAN tag number to an existing interface name, e.g. `ens18.21` (and do not set `interface` and `vlan`), or use custom name, e.g. `vlan_lab` (`interface` and `vlan` are then required).
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="nodeName")
    def node_name(self) -> pulumi.Output[str]:
        """
        The name of the node.
        """
        return pulumi.get(self, "node_name")

    @property
    @pulumi.getter
    def vlan(self) -> pulumi.Output[int]:
        """
        The VLAN tag. See also `name`.
        """
        return pulumi.get(self, "vlan")

