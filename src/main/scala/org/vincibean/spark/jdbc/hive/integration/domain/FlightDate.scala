package org.vincibean.spark.jdbc.hive.integration.domain

import org.apache.spark.sql.Row
import org.vincibean.spark.jdbc.hive.integration.util.NullCellHandler.RowWithDefaults

object FlightDate {

  def parse(row: Row): FlightDate = FlightDate(
    year = row.getIntOrElse(row.fieldIndex("year"), -1),
    month = row.getIntOrElse(row.fieldIndex("month"), -1),
    dayofmonth = row.getIntOrElse(row.fieldIndex("dayofmonth"), -1),
    dayofweek = row.getIntOrElse(row.fieldIndex("dayofweek"), -1)
  )

}

case class FlightDate(year: Int, month: Int, dayofmonth: Int, dayofweek: Int)
