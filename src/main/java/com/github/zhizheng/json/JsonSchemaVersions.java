/*
 * Copyright 2013-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.zhizheng.json;

/**
 * Json Schema 规范版本
 *
 * @author Zhang Zhizheng <zhizheng118@gmail.com>
 * @since 0.0.1-SNAPSHOT
 */
public enum JsonSchemaVersions {

	V3("http://json-schema.org/draft-03/schema#"),// 历史版本
	V4("http://json-schema.org/draft-04/schema#"),// 历史版本
	VC("http://json-schema.org/draft-04/schema#");// 当前版本
	
	private String version;

	/**
	 * @param version
	 */
	private JsonSchemaVersions(String version) {
		this.version = version;
	}

	public String getVersion() {
		return version;
	}
}