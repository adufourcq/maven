package org.apache.maven.repository.internal;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import org.codehaus.plexus.component.annotations.Component;
import org.eclipse.aether.RepositorySystemSession;
import org.eclipse.aether.deployment.DeployRequest;
import org.eclipse.aether.impl.MetadataGenerator;
import org.eclipse.aether.impl.MetadataGeneratorFactory;
import org.eclipse.aether.installation.InstallRequest;

/**
 * @author Benjamin Bentmann
 */
@Component( role = MetadataGeneratorFactory.class, hint = "versions" )
public class VersionsMetadataGeneratorFactory
    implements MetadataGeneratorFactory
{

    public MetadataGenerator newInstance( RepositorySystemSession session, InstallRequest request )
    {
        return new VersionsMetadataGenerator( session, request );
    }

    public MetadataGenerator newInstance( RepositorySystemSession session, DeployRequest request )
    {
        return new VersionsMetadataGenerator( session, request );
    }

    public float getPriority()
    {
        return 5;
    }

}