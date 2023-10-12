// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Retrieves information about a specific VM.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as proxmoxve from "@pulumi/proxmoxve";
 *
 * const testVm = proxmoxve.VM.getVirtualMachine({
 *     nodeName: "test",
 *     vmId: 100,
 * });
 * ```
 */
export function getVirtualMachine(args: GetVirtualMachineArgs, opts?: pulumi.InvokeOptions): Promise<GetVirtualMachineResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("proxmoxve:VM/getVirtualMachine:getVirtualMachine", {
        "nodeName": args.nodeName,
        "vmId": args.vmId,
    }, opts);
}

/**
 * A collection of arguments for invoking getVirtualMachine.
 */
export interface GetVirtualMachineArgs {
    /**
     * The node name.
     */
    nodeName: string;
    /**
     * The VM identifier.
     */
    vmId: number;
}

/**
 * A collection of values returned by getVirtualMachine.
 */
export interface GetVirtualMachineResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The virtual machine name.
     */
    readonly name: string;
    readonly nodeName: string;
    /**
     * A list of tags of the VM.
     */
    readonly tags: string[];
    readonly vmId: number;
}
/**
 * Retrieves information about a specific VM.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as proxmoxve from "@pulumi/proxmoxve";
 *
 * const testVm = proxmoxve.VM.getVirtualMachine({
 *     nodeName: "test",
 *     vmId: 100,
 * });
 * ```
 */
export function getVirtualMachineOutput(args: GetVirtualMachineOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetVirtualMachineResult> {
    return pulumi.output(args).apply((a: any) => getVirtualMachine(a, opts))
}

/**
 * A collection of arguments for invoking getVirtualMachine.
 */
export interface GetVirtualMachineOutputArgs {
    /**
     * The node name.
     */
    nodeName: pulumi.Input<string>;
    /**
     * The VM identifier.
     */
    vmId: pulumi.Input<number>;
}
