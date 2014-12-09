package com.github.j5ik2o.aws.dynamodb.document

import com.amazonaws.services.dynamodbv2.document.internal.Filter
import com.github.j5ik2o.aws.PimpedType


class RichFilter[T <: Filter[T]](val underlying: Filter[T]) extends AnyVal with PimpedType[Filter[T]] {

  def values: Option[Array[AnyRef]] =
    Option(underlying.getValues)

}