(ns reagent-material-ui.cljs-time-utils
  "Interface for using cljs-time with Material UI Pickers"
  (:require [cljs-time.core :as time]
            [cljs-time.coerce :as coerce]
            [goog.object :as obj])
  (:import (goog.date DateTime)
           (goog.i18n DateTimeFormat DateTimeParse DateTimeSymbols)))

(def ^:private default-formats {"dayOfMonth"            "d"
                                "fullDate"              "dd MMM yyyy"
                                "fullDateWithWeekday"   "EEEE dd MMMM yyyy"
                                "fullDateTime"          "dd MMM yyyy HH:mm"
                                "fullDateTime12h"       "dd MMM yyyy hh:mm aaa"
                                "fullDateTime24h"       "dd MMM yyyy HH:mm"
                                "fullTime"              "HH:mm"
                                "fullTime12h"           "hh:mm aaa"
                                "fullTime24h"           "HH:mm"
                                "hours12h"              "hh"
                                "hours24h"              "HH"
                                "keyboardDate"          "dd MMM yyyy"
                                "keyboardDateTime"      "dd MMM yyyy HH:mm"
                                "keyboardDateTime12h"   "dd MMM yyyy hh:mm aaa"
                                "keyboardDateTime24h"   "dd MMM yyyy HH:mm"
                                "minutes"               "mm"
                                "month"                 "MMMM"
                                "monthAndDate"          "MMMM d"
                                "monthAndYear"          "MMMM yyyy"
                                "monthShort"            "MMM"
                                "weekday"               "EEEE"
                                "weekdayShort"          "EEE"
                                "normalDate"            "d MMMM"
                                "normalDateWithWeekday" "EEE, MMM d"
                                "seconds"               "ss"
                                "shortDate"             "MMM d"
                                "year"                  "yyyy"})

(defn ^:private to-cljs-date [value]
  (cond
    (undefined? value) (time/now)
    (nil? value) nil
    (time/date? value) value
    :else (coerce/to-date-time value)))

(defn ^:private to-start-of-day [^DateTime date]
  (doto date
    (.setHours 0)
    (.setMinutes 0)
    (.setSeconds 0)
    (.setMilliseconds 0)))

(defn ^:private start-of-day [^DateTime date]
  (to-start-of-day (.clone date)))

(defn ^:private to-end-of-day [^DateTime date]
  (doto date
    (.setHours 23)
    (.setMinutes 59)
    (.setSeconds 59)
    (.setMilliseconds 999)))

(defn ^:private end-of-day [^DateTime date]
  (to-end-of-day (.clone date)))

(defn ^:private start-of-month [^DateTime date]
  (doto ^DateTime (.clone date)
    (.setDate 1)
    (to-start-of-day)))

(defn ^:private end-of-month [date]
  (doto ^DateTime (time/plus date (time/months 1))
    (.setDate 0)
    (to-end-of-day)))

(defn ^:private end-of-year [date]
  (doto ^DateTime (time/plus date (time/years 1))
    (.setMonth 0)
    (.setDate 0)
    (to-end-of-day)))

(defn ^:private start-of-year [^DateTime date]
  (doto ^DateTime (.clone date)
    (.setMonth 0)
    (.setDate 1)
    (to-start-of-day)))

(defn ^:private start-of-week [^DateTime date ^DateTimeSymbols locale]
  (let [first-day-of-week (.-FIRSTDAYOFWEEK locale)
        day-of-week (mod (dec (.getDay date)) 7)
        diff (+ (if (< day-of-week first-day-of-week) 7 0)
                day-of-week
                (- first-day-of-week))]
    (to-start-of-day (time/minus date (time/days diff)))))

(defn ^:private end-of-week [date locale]
  (-> (start-of-week date locale)
      (time/plus (time/days 6))
      (to-end-of-day)))

(defn ^:private start-of-hour [date]
  (doto (.clone date)
    (.setMinutes 0)
    (.setSeconds 0)
    (.setMilliseconds 0)))

(defn ^:private date-seq [from increment]
  (iterate #(time/plus % increment) from))

(defn cljs-time-utils
  "Interface for using cljs-time with Material UI Pickers"
  [opts]
  (let [^DateTimeSymbols locale (obj/get opts "locale" DateTimeSymbols)
        formats (js->clj (obj/get opts "formats" default-formats))
        format (fn [date format-str]
                 (let [^DateTimeFormat formatter (DateTimeFormat. format-str locale)]
                   (.format formatter date)))]
    #js {:locale                      locale
         :yearFormat                  "yyyy"
         :yearMonthFormat             "MMMM yyyy"
         :dateTime12hFormat           "MMMM d hh:mm A"
         :dateTime24hFormat           "MMMM d HH:mm"
         :time12hFormat               "hh:mm A"
         :time24hFormat               "HH:mm"
         :dateFormat                  "MMMM d"
         :date                        to-cljs-date
         :toJsDate                    (fn [value]
                                        (coerce/to-date value))
         :parse                       (fn [value format-str]
                                        (let [date (coerce/to-date-time 0)
                                              ^DateTimeParse parser (DateTimeParse. format-str locale)
                                              cnt (.strictParse parser value date)]
                                          (when (pos? cnt)
                                            date)))
         :isNull                      (fn [value]
                                        (nil? value))
         :isValid                     (fn [value]
                                        (some? (to-cljs-date value)))
         :getDiff                     (fn [to from]
                                        (let [to (to-cljs-date to)
                                              from (to-cljs-date from)]
                                          (if (time/before? from to)
                                            (time/in-millis (time/interval from to))
                                            (- (time/in-millis (time/interval to from))))))
         :isEqual                     (fn [left right]
                                        (cond
                                          (and (nil? left) (nil? right)) true
                                          (or (nil? left) (nil? right)) false
                                          :else (time/equal? (to-cljs-date left)
                                                             (to-cljs-date right))))
         :isSameHour                  (fn [left right]
                                        (time/equal? (start-of-hour left)
                                                     (start-of-hour right)))
         :isSameDay                   (fn [left right]
                                        (time/equal? (start-of-day left)
                                                     (start-of-day right)))
         :isSameMonth                 (fn [left right]
                                        (time/equal? (start-of-month left)
                                                     (start-of-month right)))
         :isSameYear                  (fn [left right]
                                        (time/equal? (start-of-year left)
                                                     (start-of-year right)))
         :isAfter                     (fn [this that]
                                        (time/after? this that))
         :isAfterDay                  (fn [this that]
                                        (time/after? this (end-of-day that)))
         :isAfterYear                 (fn [this that]
                                        (time/after? this (end-of-year that)))
         :isBefore                    (fn [this that]
                                        (time/before? this that))
         :isBeforeDay                 (fn [this that]
                                        (time/before? this (start-of-day that)))
         :isBeforeYear                (fn [this that]
                                        (time/before? this (start-of-year that)))
         :isWithinRange               (fn [date [from to]]
                                        (or (time/within? from to date)
                                            (time/equal? to date)))
         :startOfMonth                (fn [date]
                                        (start-of-month date))
         :endOfMonth                  (fn [date]
                                        (end-of-month date))
         :startOfWeek                 (fn [date]
                                        (start-of-week date locale))
         :endOfWeek                   (fn [date]
                                        (end-of-week date locale))
         :addDays                     (fn [date n]
                                        (time/plus date (time/days n)))
         :addMonths                   (fn [date n]
                                        (time/plus date (time/months n)))
         :startOfDay                  (fn [date]
                                        (start-of-day date))
         :endOfDay                    (fn [date]
                                        (end-of-day date))
         :format                      (fn [date format-key]
                                        (format date (get formats format-key)))
         :formatByString              format
         :formatNumber                (fn [number]
                                        number)
         :getHours                    (fn [date]
                                        (time/hour date))
         :setHours                    (fn [^DateTime date n]
                                        (doto ^DateTime (.clone date)
                                          (.setHours n)))
         :getMinutes                  (fn [date]
                                        (time/minute date))
         :setMinutes                  (fn [^DateTime date n]
                                        (doto ^DateTime (.clone date)
                                          (.setMinutes n)))
         :getSeconds                  (fn [date]
                                        (time/second date))
         :setSeconds                  (fn [^DateTime date n]
                                        (doto ^DateTime (.clone date)
                                          (.setSeconds n)))
         :getMonth                    (fn [^DateTime date]
                                        (.getMonth date))
         :setMonth                    (fn [^DateTime date n]
                                        (let [last-day-of-month (time/day (time/last-day-of-the-month (time/year date) (inc n)))]
                                          (doto ^DateTime (.clone date)
                                            (.setDate (min last-day-of-month (time/day date)))
                                            (.setMonth n))))
         :getNextMonth                (fn [date]
                                        (time/plus date (time/months 1)))
         :getPreviousMonth            (fn [date]
                                        (time/minus date (time/months 1)))
         :getMonthArray               (fn [date]
                                        (clj->js (take 12 (date-seq (start-of-year date) (time/months 1)))))
         :getYear                     (fn [date]
                                        (time/year date))
         :setYear                     (fn [^DateTime date n]
                                        (doto ^DateTime (.clone date)
                                          (.setFullYear n)))
         :mergeDateAndTime            (fn [^DateTime date time]
                                        (doto ^DateTime (.clone date)
                                          (.setHours (time/hour time))
                                          (.setMinutes (time/minute time))
                                          (.setSeconds (time/second time))
                                          (.setMilliseconds (time/milli time))))
         :getWeekdays                 (fn []
                                        (let [weekday-names (.-STANDALONESHORTWEEKDAYS locale)
                                              first-day-of-week (mod (inc (.-FIRSTDAYOFWEEK locale)) 7)]
                                          (clj->js (concat (drop first-day-of-week weekday-names)
                                                           (take first-day-of-week weekday-names)))))
         :getWeekArray                (fn [date]
                                        (let [start (start-of-week (start-of-month date) locale)
                                              end (end-of-week (end-of-month date) locale)]
                                          (clj->js (for [start-of-week (date-seq start (time/days 7))
                                                         :while (time/before? start-of-week end)]
                                                     (take 7 (date-seq start-of-week (time/days 1)))))))
         :getYearRange                (fn [from to]
                                        (let [start (start-of-year from)
                                              end (end-of-year to)]
                                          (clj->js (take-while #(time/before? % end) (date-seq start (time/years 1))))))
         :getMeridiemText             (fn [ampm]
                                        (if (= "am" ampm) "AM" "PM"))
         :getCalendarHeaderText       (fn [date]
                                        (format date "MMMM yyyy"))
         :getDatePickerHeaderText     (fn [date]
                                        (format date "EEE, MMM d"))
         :getDateTimePickerHeaderText (fn [date]
                                        (format date "MMM d"))
         :getMonthText                (fn [date]
                                        (format date "MMM"))
         :getDayText                  (fn [date]
                                        (format date "d"))
         :getHourText                 (fn [date ampm]
                                        (format date (if ampm "hh" "HH")))
         :getMinuteText               (fn [date]
                                        (format date "mm"))
         :getSecondText               (fn [date]
                                        (format date "ss"))
         :getYearText                 (fn [date]
                                        (format date "yyyy"))}))
