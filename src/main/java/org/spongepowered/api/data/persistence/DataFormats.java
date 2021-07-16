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
package org.spongepowered.api.data.persistence;

import org.spongepowered.api.ResourceKey;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.registry.DefaultedRegistryReference;
import org.spongepowered.api.registry.Registry;
import org.spongepowered.api.registry.RegistryKey;
import org.spongepowered.api.registry.RegistryScope;
import org.spongepowered.api.registry.RegistryScopes;
import org.spongepowered.api.registry.RegistryTypes;

/**
 * A pseudo-enum of supported {@link DataFormat}s.
 */
@SuppressWarnings("unused")
@RegistryScopes(scopes = RegistryScope.GAME)
public final class DataFormats {

    // @formatter:off

    // SORTFIELDS:ON

    public static final DefaultedRegistryReference<StringDataFormat> HOCON = DataFormats.stringKey(ResourceKey.sponge("hocon"));

    public static final DefaultedRegistryReference<StringDataFormat> JSON = DataFormats.stringKey(ResourceKey.sponge("json"));

    public static final DefaultedRegistryReference<DataFormat> NBT = DataFormats.key(ResourceKey.sponge("nbt"));

    // SORTFIELDS:OFF

    // @formatter:on

    private DataFormats() {
    }

    public static Registry<DataFormat> registry() {
        return Sponge.game().registries().registry(RegistryTypes.DATA_FORMAT);
    }

    private static DefaultedRegistryReference<StringDataFormat> stringKey(final ResourceKey location) {
        return RegistryKey.of(RegistryTypes.DATA_FORMAT, location).asDefaultedReference(() -> Sponge.game().registries());
    }

    private static DefaultedRegistryReference<DataFormat> key(final ResourceKey location) {
        return RegistryKey.of(RegistryTypes.DATA_FORMAT, location).asDefaultedReference(() -> Sponge.game().registries());
    }
}
