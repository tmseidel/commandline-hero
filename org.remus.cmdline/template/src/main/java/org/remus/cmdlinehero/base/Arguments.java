/**
 * Copyright (c) 2014 Tom Seidel, Remus Software.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License, Version 2.0 (the
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
package org.remus.cmdlinehero.base;

import java.util.HashMap;
import java.util.Map;

/**
 * A class representing a simple map of values.
 * 
 * @author Tom Seidel - tom.seidel@remus-software.org
 * 
 */
public class Arguments {

	private final Map<String, String> keys = new HashMap<String, String>();

	public String get(final String key) {
		return keys.get(key);
	}

	public Arguments add(final String key, final String value) {
		keys.put(key, value);
		return this;
	}

	@Override
	public String toString() {
		return "Arguments [keys=" + keys + "]";
	}

}
