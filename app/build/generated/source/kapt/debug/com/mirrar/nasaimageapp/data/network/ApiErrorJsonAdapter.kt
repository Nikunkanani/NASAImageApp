// Code generated by moshi-kotlin-codegen. Do not edit.
@file:Suppress("DEPRECATION", "unused", "ClassName", "REDUNDANT_PROJECTION",
    "RedundantExplicitType", "LocalVariableName", "RedundantVisibilityModifier",
    "PLATFORM_CLASS_MAPPED_TO_KOTLIN", "IMPLICIT_NOTHING_TYPE_ARGUMENT_IN_RETURN_POSITION")

package com.mirrar.nasaimageapp.`data`.network

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Moshi
import com.squareup.moshi.`internal`.Util
import java.lang.NullPointerException
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.emptySet
import kotlin.text.buildString

public class ApiErrorJsonAdapter(
  moshi: Moshi,
) : JsonAdapter<ApiError>() {
  private val options: JsonReader.Options = JsonReader.Options.of("code", "msg", "service_version")

  private val intAdapter: JsonAdapter<Int> = moshi.adapter(Int::class.java, emptySet(), "code")

  private val stringAdapter: JsonAdapter<String> = moshi.adapter(String::class.java, emptySet(),
      "msg")

  public override fun toString(): String = buildString(30) {
      append("GeneratedJsonAdapter(").append("ApiError").append(')') }

  public override fun fromJson(reader: JsonReader): ApiError {
    var code: Int? = null
    var msg: String? = null
    var service_version: String? = null
    reader.beginObject()
    while (reader.hasNext()) {
      when (reader.selectName(options)) {
        0 -> code = intAdapter.fromJson(reader) ?: throw Util.unexpectedNull("code", "code", reader)
        1 -> msg = stringAdapter.fromJson(reader) ?: throw Util.unexpectedNull("msg", "msg", reader)
        2 -> service_version = stringAdapter.fromJson(reader) ?:
            throw Util.unexpectedNull("service_version", "service_version", reader)
        -1 -> {
          // Unknown name, skip it.
          reader.skipName()
          reader.skipValue()
        }
      }
    }
    reader.endObject()
    return ApiError(
        code = code ?: throw Util.missingProperty("code", "code", reader),
        msg = msg ?: throw Util.missingProperty("msg", "msg", reader),
        service_version = service_version ?: throw Util.missingProperty("service_version",
            "service_version", reader)
    )
  }

  public override fun toJson(writer: JsonWriter, value_: ApiError?): Unit {
    if (value_ == null) {
      throw NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.")
    }
    writer.beginObject()
    writer.name("code")
    intAdapter.toJson(writer, value_.code)
    writer.name("msg")
    stringAdapter.toJson(writer, value_.msg)
    writer.name("service_version")
    stringAdapter.toJson(writer, value_.service_version)
    writer.endObject()
  }
}
