// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ProxmoxVE.Storage.Inputs
{

    public sealed class FileSourceFileGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether the source file has changed since the last run
        /// </summary>
        [Input("changed")]
        public Input<bool>? Changed { get; set; }

        /// <summary>
        /// The SHA256 checksum of the source file.
        /// </summary>
        [Input("checksum")]
        public Input<string>? Checksum { get; set; }

        /// <summary>
        /// The file name to use instead of the source file
        /// name. Useful when the source file does not have a valid file extension,
        /// for example when the source file is a URL referencing a `.qcow2` image.
        /// </summary>
        [Input("fileName")]
        public Input<string>? FileName { get; set; }

        /// <summary>
        /// Whether to skip the TLS verification step for
        /// HTTPS sources (defaults to `false`).
        /// </summary>
        [Input("insecure")]
        public Input<bool>? Insecure { get; set; }

        /// <summary>
        /// The minimum required TLS version for HTTPS
        /// sources. "Supported values: `1.0|1.1|1.2|1.3` (defaults to `1.3`).
        /// </summary>
        [Input("minTls")]
        public Input<string>? MinTls { get; set; }

        /// <summary>
        /// A path to a local file or a URL.
        /// </summary>
        [Input("path", required: true)]
        public Input<string> Path { get; set; } = null!;

        public FileSourceFileGetArgs()
        {
        }
        public static new FileSourceFileGetArgs Empty => new FileSourceFileGetArgs();
    }
}
