/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.xwiki.action;

import org.xwiki.resource.Resource;
import org.xwiki.stability.Unstable;

/**
 * Allows calling the next {@link org.xwiki.action.Action} in the chain. An instance of this class is passed to
 * {@link Action#execute(org.xwiki.resource.Resource, ActionChain)} and it's up to the Action implementation to
 * decide if it wants to stop the execution chain or not.
 *
 * @version $Id$
 * @since 6.0M1
 */
@Unstable
public interface ActionChain
{
    /**
     * Executes the next Action in the chain.
     *
     * @param resource the Resource on which to execute the Action
     * @throws ActionException if an error happens during the Action execution
     */
    void executeNext(Resource resource) throws ActionException;
}
