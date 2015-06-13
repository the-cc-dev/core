/*
 * See LICENSE.md in the distribution for the full license text including,
 * but not limited to, a notice of warranty and distribution rights.
 */
package net.rpgtoolkit.common.assets.resources;

import net.rpgtoolkit.common.assets.AssetDescriptor;
import net.rpgtoolkit.common.assets.AssetHandle;
import net.rpgtoolkit.common.assets.AssetHandleResolver;

/**
 *
 * @author Chris Hutchinson <chris@cshutchinson.com>
 */
public class ResourceAssetHandleResolver implements AssetHandleResolver {

    @Override
    public boolean canResolve(AssetDescriptor descriptor) {
        return descriptor.getURI().getScheme().equals("resource");
    }

    @Override
    public AssetHandle resolve(AssetDescriptor descriptor) {
        return new ResourceAssetHandle(descriptor);
    }
    
}