/*
 * This file is part of SpongeAPI, licensed under the MIT License (MIT).
 *
 * Copyright (c) SpongePowered <https://www.spongepowered.org>
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.spongepowered.api.data.type;

import org.spongepowered.api.ResourceKey;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.registry.DefaultedRegistryReference;
import org.spongepowered.api.registry.RegistryKey;
import org.spongepowered.api.registry.RegistryScope;
import org.spongepowered.api.registry.RegistryScopes;
import org.spongepowered.api.registry.RegistryTypes;

/**
 * An enumeration of vanilla {@link PandaGene}s.
 */
@SuppressWarnings("unused")
@RegistryScopes(scopes = RegistryScope.GAME)
public final class PandaGenes {

    // @formatter:off

    // SORTFIELDS:ON

    public static final DefaultedRegistryReference<PandaGene> AGGRESSIVE = PandaGenes.key(ResourceKey.sponge("aggressive"));

    public static final DefaultedRegistryReference<PandaGene> BROWN = PandaGenes.key(ResourceKey.sponge("brown"));

    public static final DefaultedRegistryReference<PandaGene> LAZY = PandaGenes.key(ResourceKey.sponge("lazy"));

    public static final DefaultedRegistryReference<PandaGene> NORMAL = PandaGenes.key(ResourceKey.sponge("normal"));

    public static final DefaultedRegistryReference<PandaGene> PLAYFUL = PandaGenes.key(ResourceKey.sponge("playful"));

    public static final DefaultedRegistryReference<PandaGene> WEAK = PandaGenes.key(ResourceKey.sponge("weak"));

    public static final DefaultedRegistryReference<PandaGene> WORRIED = PandaGenes.key(ResourceKey.sponge("worried"));

    // SORTFIELDS:OFF

    // @formatter:on

    private PandaGenes() {
    }

    private static DefaultedRegistryReference<PandaGene> key(final ResourceKey location) {
        return RegistryKey.of(RegistryTypes.PANDA_GENE, location).asDefaultedReference(Sponge::game);
    }
}
