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
package org.spongepowered.api.item.inventory.equipment;

import org.spongepowered.api.ResourceKey;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.registry.DefaultedRegistryReference;
import org.spongepowered.api.registry.RegistryKey;
import org.spongepowered.api.registry.RegistryScope;
import org.spongepowered.api.registry.RegistryScopes;
import org.spongepowered.api.registry.RegistryTypes;

/**
 * All built-in equipment types.
 */
@SuppressWarnings("unused")
@RegistryScopes(scopes = RegistryScope.GAME)
public final class EquipmentTypes {

    // @formatter:off

    // SORTFIELDS:ON

    public static final DefaultedRegistryReference<EquipmentType> FEET = EquipmentTypes.key(ResourceKey.sponge("feet"));

    public static final DefaultedRegistryReference<EquipmentType> CHEST = EquipmentTypes.key(ResourceKey.sponge("chest"));

    public static final DefaultedRegistryReference<EquipmentType> HEAD = EquipmentTypes.key(ResourceKey.sponge("head"));

    public static final DefaultedRegistryReference<EquipmentType> LEGS = EquipmentTypes.key(ResourceKey.sponge("legs"));

    public static final DefaultedRegistryReference<EquipmentType> MAIN_HAND = EquipmentTypes.key(ResourceKey.sponge("main_hand"));

    public static final DefaultedRegistryReference<EquipmentType> OFF_HAND = EquipmentTypes.key(ResourceKey.sponge("off_hand"));

    // SORTFIELDS:OFF

    // @formatter:on

    private EquipmentTypes() {
    }

    private static DefaultedRegistryReference<EquipmentType> key(final ResourceKey location) {
        return RegistryKey.of(RegistryTypes.EQUIPMENT_TYPE, location).asDefaultedReference(Sponge::game);
    }
}
