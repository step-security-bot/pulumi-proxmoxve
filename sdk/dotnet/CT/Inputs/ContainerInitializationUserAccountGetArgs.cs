// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ProxmoxVE.CT.Inputs
{

    public sealed class ContainerInitializationUserAccountGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("keys")]
        private InputList<string>? _keys;

        /// <summary>
        /// The SSH keys for the root account.
        /// </summary>
        public InputList<string> Keys
        {
            get => _keys ?? (_keys = new InputList<string>());
            set => _keys = value;
        }

        [Input("password")]
        private Input<string>? _password;

        /// <summary>
        /// The password for the root account.
        /// </summary>
        public Input<string>? Password
        {
            get => _password;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _password = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public ContainerInitializationUserAccountGetArgs()
        {
        }
        public static new ContainerInitializationUserAccountGetArgs Empty => new ContainerInitializationUserAccountGetArgs();
    }
}
