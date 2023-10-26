# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'HostsEntryArgs',
    'ProviderSshArgs',
    'ProviderSshNodeArgs',
]

@pulumi.input_type
class HostsEntryArgs:
    def __init__(__self__, *,
                 address: pulumi.Input[str],
                 hostnames: pulumi.Input[Sequence[pulumi.Input[str]]]):
        """
        :param pulumi.Input[str] address: The IP address.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] hostnames: The hostnames.
        """
        HostsEntryArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            address=address,
            hostnames=hostnames,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             address: Optional[pulumi.Input[str]] = None,
             hostnames: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if address is None:
            raise TypeError("Missing 'address' argument")
        if hostnames is None:
            raise TypeError("Missing 'hostnames' argument")

        _setter("address", address)
        _setter("hostnames", hostnames)

    @property
    @pulumi.getter
    def address(self) -> pulumi.Input[str]:
        """
        The IP address.
        """
        return pulumi.get(self, "address")

    @address.setter
    def address(self, value: pulumi.Input[str]):
        pulumi.set(self, "address", value)

    @property
    @pulumi.getter
    def hostnames(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        The hostnames.
        """
        return pulumi.get(self, "hostnames")

    @hostnames.setter
    def hostnames(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "hostnames", value)


@pulumi.input_type
class ProviderSshArgs:
    def __init__(__self__, *,
                 agent: Optional[pulumi.Input[bool]] = None,
                 agent_socket: Optional[pulumi.Input[str]] = None,
                 nodes: Optional[pulumi.Input[Sequence[pulumi.Input['ProviderSshNodeArgs']]]] = None,
                 password: Optional[pulumi.Input[str]] = None,
                 username: Optional[pulumi.Input[str]] = None):
        ProviderSshArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            agent=agent,
            agent_socket=agent_socket,
            nodes=nodes,
            password=password,
            username=username,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             agent: Optional[pulumi.Input[bool]] = None,
             agent_socket: Optional[pulumi.Input[str]] = None,
             nodes: Optional[pulumi.Input[Sequence[pulumi.Input['ProviderSshNodeArgs']]]] = None,
             password: Optional[pulumi.Input[str]] = None,
             username: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if agent_socket is None and 'agentSocket' in kwargs:
            agent_socket = kwargs['agentSocket']

        if agent is not None:
            _setter("agent", agent)
        if agent_socket is not None:
            _setter("agent_socket", agent_socket)
        if nodes is not None:
            _setter("nodes", nodes)
        if password is not None:
            _setter("password", password)
        if username is not None:
            _setter("username", username)

    @property
    @pulumi.getter
    def agent(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "agent")

    @agent.setter
    def agent(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "agent", value)

    @property
    @pulumi.getter(name="agentSocket")
    def agent_socket(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "agent_socket")

    @agent_socket.setter
    def agent_socket(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "agent_socket", value)

    @property
    @pulumi.getter
    def nodes(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ProviderSshNodeArgs']]]]:
        return pulumi.get(self, "nodes")

    @nodes.setter
    def nodes(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ProviderSshNodeArgs']]]]):
        pulumi.set(self, "nodes", value)

    @property
    @pulumi.getter
    def password(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "password")

    @password.setter
    def password(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "password", value)

    @property
    @pulumi.getter
    def username(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "username")

    @username.setter
    def username(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "username", value)


@pulumi.input_type
class ProviderSshNodeArgs:
    def __init__(__self__, *,
                 address: pulumi.Input[str],
                 name: pulumi.Input[str],
                 port: Optional[pulumi.Input[int]] = None):
        ProviderSshNodeArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            address=address,
            name=name,
            port=port,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             address: Optional[pulumi.Input[str]] = None,
             name: Optional[pulumi.Input[str]] = None,
             port: Optional[pulumi.Input[int]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if address is None:
            raise TypeError("Missing 'address' argument")
        if name is None:
            raise TypeError("Missing 'name' argument")

        _setter("address", address)
        _setter("name", name)
        if port is not None:
            _setter("port", port)

    @property
    @pulumi.getter
    def address(self) -> pulumi.Input[str]:
        return pulumi.get(self, "address")

    @address.setter
    def address(self, value: pulumi.Input[str]):
        pulumi.set(self, "address", value)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Input[str]:
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[str]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def port(self) -> Optional[pulumi.Input[int]]:
        return pulumi.get(self, "port")

    @port.setter
    def port(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "port", value)


