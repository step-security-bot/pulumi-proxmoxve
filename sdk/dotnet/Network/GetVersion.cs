// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ProxmoxVE.Network
{
    public static class GetVersion
    {
        /// <summary>
        /// Retrieves API version details.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using ProxmoxVE = Pulumi.ProxmoxVE;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = ProxmoxVE.Network.GetVersion.Invoke();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["dataProxmoxVirtualEnvironmentVersion"] = 
        ///         {
        ///             { "release", example.Apply(getVersionResult =&gt; getVersionResult.Release) },
        ///             { "repository_id", example.Apply(getVersionResult =&gt; getVersionResult.RepositoryId) },
        ///             { "version", example.Apply(getVersionResult =&gt; getVersionResult.Version) },
        ///         },
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetVersionResult> InvokeAsync(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetVersionResult>("proxmoxve:Network/getVersion:getVersion", InvokeArgs.Empty, options.WithDefaults());

        /// <summary>
        /// Retrieves API version details.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using ProxmoxVE = Pulumi.ProxmoxVE;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = ProxmoxVE.Network.GetVersion.Invoke();
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["dataProxmoxVirtualEnvironmentVersion"] = 
        ///         {
        ///             { "release", example.Apply(getVersionResult =&gt; getVersionResult.Release) },
        ///             { "repository_id", example.Apply(getVersionResult =&gt; getVersionResult.RepositoryId) },
        ///             { "version", example.Apply(getVersionResult =&gt; getVersionResult.Version) },
        ///         },
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetVersionResult> Invoke(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetVersionResult>("proxmoxve:Network/getVersion:getVersion", InvokeArgs.Empty, options.WithDefaults());
    }


    [OutputType]
    public sealed class GetVersionResult
    {
        /// <summary>
        /// Placeholder identifier attribute.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The current Proxmox VE point release in `x.y` format.
        /// </summary>
        public readonly string Release;
        /// <summary>
        /// The short git revision from which this version was build.
        /// </summary>
        public readonly string RepositoryId;
        /// <summary>
        /// The full pve-manager package version of this node.
        /// </summary>
        public readonly string Version;

        [OutputConstructor]
        private GetVersionResult(
            string id,

            string release,

            string repositoryId,

            string version)
        {
            Id = id;
            Release = release;
            RepositoryId = repositoryId;
            Version = version;
        }
    }
}
