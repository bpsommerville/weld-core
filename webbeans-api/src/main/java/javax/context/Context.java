/*
 * JBoss, Home of Professional Open Source
 * Copyright 2008, Red Hat Middleware LLC, and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,  
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package javax.context;

import java.lang.annotation.Annotation;

/**
 * The contract between the Web Bean manager and a Web Beans context object.
 * This interface should not be called directly by the application.
 * 
 * @author Gavin King
 * @author Pete Muir
 */

public interface Context
{

   public Class<? extends Annotation> getScopeType();

   public <T> T get(Contextual<T> bean, boolean create);

   boolean isActive();

}