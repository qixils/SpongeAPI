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
package org.spongepowered.api.util.orientation;

import org.spongepowered.api.ResourceKey;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.entity.hanging.ItemFrame;
import org.spongepowered.api.item.inventory.ItemStack;
import org.spongepowered.api.registry.DefaultedRegistryReference;
import org.spongepowered.api.registry.Registry;
import org.spongepowered.api.registry.RegistryKey;
import org.spongepowered.api.registry.RegistryScope;
import org.spongepowered.api.registry.RegistryScopes;
import org.spongepowered.api.registry.RegistryTypes;

/**
 * An enumeration of possible rotations for something that can rotate,
 * such as an {@link ItemStack} within an {@link ItemFrame}.
 */
@SuppressWarnings("unused")
@RegistryScopes(scopes = RegistryScope.GAME)
public final class Orientations {

    // @formatter:off

    // SORTFIELDS:ON

    public static final DefaultedRegistryReference<Orientation> BOTTOM = Orientations.key(ResourceKey.sponge("bottom"));

    public static final DefaultedRegistryReference<Orientation> BOTTOM_LEFT = Orientations.key(ResourceKey.sponge("bottom_left"));

    public static final DefaultedRegistryReference<Orientation> BOTTOM_RIGHT = Orientations.key(ResourceKey.sponge("bottom_right"));

    public static final DefaultedRegistryReference<Orientation> LEFT = Orientations.key(ResourceKey.sponge("left"));

    public static final DefaultedRegistryReference<Orientation> RIGHT = Orientations.key(ResourceKey.sponge("right"));

    public static final DefaultedRegistryReference<Orientation> TOP = Orientations.key(ResourceKey.sponge("top"));

    public static final DefaultedRegistryReference<Orientation> TOP_LEFT = Orientations.key(ResourceKey.sponge("top_left"));

    public static final DefaultedRegistryReference<Orientation> TOP_RIGHT = Orientations.key(ResourceKey.sponge("top_right"));

    // SORTFIELDS:OFF

    // @formatter:on

    private Orientations() {
    }

    public static Registry<Orientation> registry() {
        return Sponge.game().registries().registry(RegistryTypes.ORIENTATION);
    }

    private static DefaultedRegistryReference<Orientation> key(final ResourceKey location) {
        return RegistryKey.of(RegistryTypes.ORIENTATION, location).asDefaultedReference(() -> Sponge.game().registries());
    }
}
