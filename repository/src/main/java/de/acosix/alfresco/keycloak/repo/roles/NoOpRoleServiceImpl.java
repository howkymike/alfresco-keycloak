/*
 * Copyright 2019 - 2020 Acosix GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.acosix.alfresco.keycloak.repo.roles;

import java.util.Collections;
import java.util.List;

/**
 * This no-op implementation class of a role service may be used as a default implemenation in a subsystem proxy to avoid failing if no
 * Keycloak subsystem instance is active.
 *
 * @author Axel Faust
 */
public class NoOpRoleServiceImpl implements RoleService
{

    /**
     *
     * {@inheritDoc}
     */
    @Override
    public List<Role> findRoles(final String shortNameFilter)
    {
        return Collections.emptyList();
    }

    /**
     *
     * {@inheritDoc}
     */
    @Override
    public List<Role> findRoles(final String shortNameFilter, final boolean realmOnly)
    {
        return Collections.emptyList();
    }

    /**
     *
     * {@inheritDoc}
     */
    @Override
    public List<Role> findRoles(final String resourceName, final String shortNameFilter)
    {
        return Collections.emptyList();
    }

}