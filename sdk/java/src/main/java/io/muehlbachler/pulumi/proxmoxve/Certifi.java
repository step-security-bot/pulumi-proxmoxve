// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import io.muehlbachler.pulumi.proxmoxve.CertifiArgs;
import io.muehlbachler.pulumi.proxmoxve.Utilities;
import io.muehlbachler.pulumi.proxmoxve.inputs.CertifiState;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages the custom SSL/TLS certificate for a specific node.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.tls.PrivateKey;
 * import com.pulumi.tls.PrivateKeyArgs;
 * import com.pulumi.tls.SelfSignedCert;
 * import com.pulumi.tls.SelfSignedCertArgs;
 * import com.pulumi.tls.inputs.SelfSignedCertSubjectArgs;
 * import com.pulumi.proxmoxve.Certifi;
 * import com.pulumi.proxmoxve.CertifiArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var proxmoxVirtualEnvironmentCertificatePrivateKey = new PrivateKey(&#34;proxmoxVirtualEnvironmentCertificatePrivateKey&#34;, PrivateKeyArgs.builder()        
 *             .algorithm(&#34;RSA&#34;)
 *             .rsaBits(2048)
 *             .build());
 * 
 *         var proxmoxVirtualEnvironmentCertificateSelfSignedCert = new SelfSignedCert(&#34;proxmoxVirtualEnvironmentCertificateSelfSignedCert&#34;, SelfSignedCertArgs.builder()        
 *             .keyAlgorithm(proxmoxVirtualEnvironmentCertificatePrivateKey.algorithm())
 *             .privateKeyPem(proxmoxVirtualEnvironmentCertificatePrivateKey.privateKeyPem())
 *             .subject(SelfSignedCertSubjectArgs.builder()
 *                 .commonName(&#34;example.com&#34;)
 *                 .organization(&#34;Terraform Provider for Proxmox&#34;)
 *                 .build())
 *             .validityPeriodHours(8760)
 *             .allowedUses(            
 *                 &#34;key_encipherment&#34;,
 *                 &#34;digital_signature&#34;,
 *                 &#34;server_auth&#34;)
 *             .build());
 * 
 *         var example = new Certifi(&#34;example&#34;, CertifiArgs.builder()        
 *             .certificate(proxmoxVirtualEnvironmentCertificateSelfSignedCert.certPem())
 *             .nodeName(&#34;first-node&#34;)
 *             .privateKey(proxmoxVirtualEnvironmentCertificatePrivateKey.privateKeyPem())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 */
@ResourceType(type="proxmoxve:index/certifi:Certifi")
public class Certifi extends com.pulumi.resources.CustomResource {
    /**
     * The PEM encoded certificate.
     * 
     */
    @Export(name="certificate", refs={String.class}, tree="[0]")
    private Output<String> certificate;

    /**
     * @return The PEM encoded certificate.
     * 
     */
    public Output<String> certificate() {
        return this.certificate;
    }
    /**
     * The PEM encoded certificate chain.
     * 
     */
    @Export(name="certificateChain", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> certificateChain;

    /**
     * @return The PEM encoded certificate chain.
     * 
     */
    public Output<Optional<String>> certificateChain() {
        return Codegen.optional(this.certificateChain);
    }
    /**
     * The expiration date (RFC 3339).
     * 
     */
    @Export(name="expirationDate", refs={String.class}, tree="[0]")
    private Output<String> expirationDate;

    /**
     * @return The expiration date (RFC 3339).
     * 
     */
    public Output<String> expirationDate() {
        return this.expirationDate;
    }
    /**
     * The file name.
     * 
     */
    @Export(name="fileName", refs={String.class}, tree="[0]")
    private Output<String> fileName;

    /**
     * @return The file name.
     * 
     */
    public Output<String> fileName() {
        return this.fileName;
    }
    /**
     * The issuer.
     * 
     */
    @Export(name="issuer", refs={String.class}, tree="[0]")
    private Output<String> issuer;

    /**
     * @return The issuer.
     * 
     */
    public Output<String> issuer() {
        return this.issuer;
    }
    /**
     * A node name.
     * 
     */
    @Export(name="nodeName", refs={String.class}, tree="[0]")
    private Output<String> nodeName;

    /**
     * @return A node name.
     * 
     */
    public Output<String> nodeName() {
        return this.nodeName;
    }
    /**
     * Whether to overwrite an existing certificate
     * 
     */
    @Export(name="overwrite", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> overwrite;

    /**
     * @return Whether to overwrite an existing certificate
     * 
     */
    public Output<Optional<Boolean>> overwrite() {
        return Codegen.optional(this.overwrite);
    }
    /**
     * The PEM encoded private key.
     * 
     */
    @Export(name="privateKey", refs={String.class}, tree="[0]")
    private Output<String> privateKey;

    /**
     * @return The PEM encoded private key.
     * 
     */
    public Output<String> privateKey() {
        return this.privateKey;
    }
    /**
     * The public key size.
     * 
     */
    @Export(name="publicKeySize", refs={Integer.class}, tree="[0]")
    private Output<Integer> publicKeySize;

    /**
     * @return The public key size.
     * 
     */
    public Output<Integer> publicKeySize() {
        return this.publicKeySize;
    }
    /**
     * The public key type.
     * 
     */
    @Export(name="publicKeyType", refs={String.class}, tree="[0]")
    private Output<String> publicKeyType;

    /**
     * @return The public key type.
     * 
     */
    public Output<String> publicKeyType() {
        return this.publicKeyType;
    }
    /**
     * The SSL fingerprint.
     * 
     */
    @Export(name="sslFingerprint", refs={String.class}, tree="[0]")
    private Output<String> sslFingerprint;

    /**
     * @return The SSL fingerprint.
     * 
     */
    public Output<String> sslFingerprint() {
        return this.sslFingerprint;
    }
    /**
     * The start date (RFC 3339).
     * 
     */
    @Export(name="startDate", refs={String.class}, tree="[0]")
    private Output<String> startDate;

    /**
     * @return The start date (RFC 3339).
     * 
     */
    public Output<String> startDate() {
        return this.startDate;
    }
    /**
     * The subject.
     * 
     */
    @Export(name="subject", refs={String.class}, tree="[0]")
    private Output<String> subject;

    /**
     * @return The subject.
     * 
     */
    public Output<String> subject() {
        return this.subject;
    }
    /**
     * The subject alternative names.
     * 
     */
    @Export(name="subjectAlternativeNames", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> subjectAlternativeNames;

    /**
     * @return The subject alternative names.
     * 
     */
    public Output<List<String>> subjectAlternativeNames() {
        return this.subjectAlternativeNames;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Certifi(String name) {
        this(name, CertifiArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Certifi(String name, CertifiArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Certifi(String name, CertifiArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("proxmoxve:index/certifi:Certifi", name, args == null ? CertifiArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Certifi(String name, Output<String> id, @Nullable CertifiState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("proxmoxve:index/certifi:Certifi", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "privateKey"
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Certifi get(String name, Output<String> id, @Nullable CertifiState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Certifi(name, id, state, options);
    }
}
