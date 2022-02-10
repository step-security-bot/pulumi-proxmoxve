// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cluster

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func GetNodes(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetNodesResult, error) {
	opts = pkgInvokeDefaultOpts(opts)
	var rv GetNodesResult
	err := ctx.Invoke("proxmoxve:Cluster/getNodes:getNodes", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getNodes.
type GetNodesResult struct {
	CpuCounts       []int     `pulumi:"cpuCounts"`
	CpuUtilizations []float64 `pulumi:"cpuUtilizations"`
	// The provider-assigned unique ID for this managed resource.
	Id               string   `pulumi:"id"`
	MemoryAvailables []int    `pulumi:"memoryAvailables"`
	MemoryUseds      []int    `pulumi:"memoryUseds"`
	Names            []string `pulumi:"names"`
	Onlines          []bool   `pulumi:"onlines"`
	SslFingerprints  []string `pulumi:"sslFingerprints"`
	SupportLevels    []string `pulumi:"supportLevels"`
	Uptimes          []string `pulumi:"uptimes"`
}
