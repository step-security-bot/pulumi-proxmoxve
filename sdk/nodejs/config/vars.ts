// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

declare var exports: any;
const __config = new pulumi.Config("proxmoxve");

/**
 * The API token for the Proxmox VE API.
 */
export declare const apiToken: string | undefined;
Object.defineProperty(exports, "apiToken", {
    get() {
        return __config.get("apiToken");
    },
    enumerable: true,
});

/**
 * The endpoint for the Proxmox VE API.
 */
export declare const endpoint: string | undefined;
Object.defineProperty(exports, "endpoint", {
    get() {
        return __config.get("endpoint");
    },
    enumerable: true,
});

/**
 * Whether to skip the TLS verification step.
 */
export declare const insecure: boolean | undefined;
Object.defineProperty(exports, "insecure", {
    get() {
        return __config.getObject<boolean>("insecure");
    },
    enumerable: true,
});

/**
 * The minimum required TLS version for API calls.Supported values: `1.0|1.1|1.2|1.3`. Defaults to `1.3`.
 */
export declare const minTls: string | undefined;
Object.defineProperty(exports, "minTls", {
    get() {
        return __config.get("minTls");
    },
    enumerable: true,
});

/**
 * The one-time password for the Proxmox VE API.
 */
export declare const otp: string | undefined;
Object.defineProperty(exports, "otp", {
    get() {
        return __config.get("otp");
    },
    enumerable: true,
});

/**
 * The password for the Proxmox VE API.
 */
export declare const password: string | undefined;
Object.defineProperty(exports, "password", {
    get() {
        return __config.get("password");
    },
    enumerable: true,
});

/**
 * The SSH configuration for the Proxmox nodes.
 */
export declare const ssh: outputs.config.Ssh | undefined;
Object.defineProperty(exports, "ssh", {
    get() {
        return __config.getObject<outputs.config.Ssh>("ssh");
    },
    enumerable: true,
});

/**
 * The alternative temporary directory.
 */
export declare const tmpDir: string | undefined;
Object.defineProperty(exports, "tmpDir", {
    get() {
        return __config.get("tmpDir");
    },
    enumerable: true,
});

/**
 * The username for the Proxmox VE API.
 */
export declare const username: string | undefined;
Object.defineProperty(exports, "username", {
    get() {
        return __config.get("username");
    },
    enumerable: true,
});

