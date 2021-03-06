package io.vertx.test.codegen.testapi.streams;

import io.vertx.codegen.annotations.VertxGen;
import io.vertx.core.streams.ReadStream;

import java.util.List;

/*
 * Mimics MessageConsumer<T> extends ReadStream<Message<T>>.
 *
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
@VertxGen
public interface ReadStreamWithParameterizedTypeArg<T> extends ReadStream<List<T>> {
  void foo();
}
