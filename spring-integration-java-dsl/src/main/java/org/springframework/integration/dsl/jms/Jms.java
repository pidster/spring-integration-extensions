/*
 * Copyright 2014 the original author or authors.
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

package org.springframework.integration.dsl.jms;

import javax.jms.ConnectionFactory;

/**
 * @author Artem Bilan
 */
public abstract class Jms {

	public static <S extends JmsPollableMessageChannelSpec<S>> JmsPollableMessageChannelSpec<S>	pollableChannel(ConnectionFactory connectionFactory) {
		return pollableChannel(null, connectionFactory);
	}

	public static <S extends JmsPollableMessageChannelSpec<S>> JmsPollableMessageChannelSpec<S> pollableChannel(String id,
			ConnectionFactory connectionFactory) {
		return new JmsPollableMessageChannelSpec<S>(connectionFactory).id(id);
	}

	public static <S extends JmsMessageChannelSpec<S>> JmsMessageChannelSpec<S> channel(ConnectionFactory connectionFactory) {
		return channel(null, connectionFactory);
	}

	public static <S extends JmsMessageChannelSpec<S>> JmsMessageChannelSpec<S> channel(String id,
			ConnectionFactory connectionFactory) {
		return new JmsMessageChannelSpec<S>(connectionFactory).id(id);
	}

	public static JmsPublishSubscribeMessageChannelSpec publishSubscribeChannel(ConnectionFactory connectionFactory) {
		return publishSubscribeChannel(null, connectionFactory);
	}

	public static JmsPublishSubscribeMessageChannelSpec publishSubscribeChannel(String id,
			ConnectionFactory connectionFactory) {
		return new JmsPublishSubscribeMessageChannelSpec(connectionFactory).id(id);
	}
}