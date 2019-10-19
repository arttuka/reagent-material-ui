(ns reagent-material-ui.cljs-time-utils
  "Interface for using cljs-time with Material UI Pickers"
  (:require [cljs-time.core :as time]
            [cljs-time.coerce :as coerce]
            [cljs-time.format :as format]
            [goog.object :as obj]
            [goog.i18n.DateTimeSymbols]
            [goog.i18n.DateTimeFormat]))

(defn ^:private start-of-day [d]
  (time/at-midnight d))

(defn ^:private end-of-day [d]
  (doto (.clone d)
    (.setHours 23)
    (.setMinutes 59)
    (.setSeconds 59)
    (.setMilliseconds 999)))

(defn ^:private start-of-month [d]
  (doto (time/at-midnight d)
    (.setDate 1)))

(defn ^:private end-of-month [d]
  (doto (time/plus d (time/months 1))
    (.setDate 0)
    (.setHours 23)
    (.setMinutes 59)
    (.setSeconds 59)
    (.setMilliseconds 999)))

(defn ^:private end-of-year [d]
  (doto (time/plus d (time/years 1))
    (.setMonth 0)
    (.setDate 0)
    (.setHours 23)
    (.setMinutes 59)
    (.setSeconds 59)
    (.setMilliseconds 999)))

(defn ^:private start-of-year [d]
  (doto (time/at-midnight d)
    (.setMonth 0)
    (.setDate 1)))

(defn ^:private start-of-week [date locale]
  (let [first-day-of-week (.-FIRSTDAYOFWEEK locale)
        day-of-week (mod (dec (.getDay date)) 7)
        diff (+ (if (< day-of-week first-day-of-week) 7 0)
                day-of-week
                (- first-day-of-week))]
    (time/at-midnight (time/minus date (time/days diff)))))

(defn ^:private end-of-week [date locale]
  (-> (start-of-week date locale)
      (time/plus (time/days 6))
      (end-of-day)))

(defn ^:private date-seq [from increment]
  (iterate #(time/plus % increment) from))

(defn cljs-time-utils
  "Interface for using cljs-time with Material UI Pickers"
  [opts]
  (let [locale (obj/get opts "locale" goog.i18n.DateTimeSymbols)
        format (fn [value format-str]
                 (let [formatter (goog.i18n.DateTimeFormat. format-str locale)]
                   (.format formatter value)))]
    #js {:locale                      locale
         :yearFormat                  "yyyy"
         :yearMonthFormat             "MMMM yyyy"
         :dateTime12hFormat           "MMMM do hh:mm A"
         :dateTime24hFormat           "MMMM do HH:mm"
         :time12hFormat               "hh:mm A"
         :time24hFormat               "HH:mm"
         :dateFormat                  "MMMM do"
         :date                        (fn [value]
                                        (cond
                                          (undefined? value) (time/now)
                                          (nil? value) nil
                                          :else (coerce/to-date-time value)))
         :parse                       (fn [value format-str]
                                        (format/parse (format/formatter format-str) value))
         :isNull                      (fn [value]
                                        (nil? value))
         :isValid                     (fn [value]
                                        (some? (coerce/to-date-time value)))
         :getDiff                     (fn [to from]
                                        (time/in-millis (time/interval from to)))
         :isEqual                     (fn [left right]
                                        (cond
                                          (and (nil? left) (nil? right)) true
                                          (or (nil? left) (nil? right)) false
                                          :else (time/equal? (coerce/to-date-time left)
                                                             (coerce/to-date-time right))))
         :isSameDay                   (fn [left right]
                                        (time/equal? (start-of-day left)
                                                     (start-of-day right)))
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
         :startOfMonth                (fn [value]
                                        (start-of-month value))
         :endOfMonth                  (fn [value]
                                        (end-of-month value))
         :addDays                     (fn [value n]
                                        (time/plus value (time/days n)))
         :startOfDay                  (fn [value]
                                        (start-of-day value))
         :endOfDay                    (fn [value]
                                        (end-of-day value))
         :format                      format
         :formatNumber                (fn [number]
                                        number)
         :getHours                    (fn [value]
                                        (time/hour value))
         :setHours                    (fn [value n]
                                        (doto (.clone value)
                                          (.setHours n)))
         :getMinutes                  (fn [value]
                                        (time/minute value))
         :setMinutes                  (fn [value n]
                                        (doto (.clone value)
                                          (.setMinutes n)))
         :getSeconds                  (fn [value]
                                        (time/second value))
         :setSeconds                  (fn [value n]
                                        (doto (.clone value)
                                          (.setSeconds n)))
         :getMonth                    (fn [value]
                                        (.getMonth value))
         :setMonth                    (fn [value n]
                                        (let [last-day-of-month (time/day (time/last-day-of-the-month (time/year value) (inc n)))]
                                          (doto (.clone value)
                                            (.setDate (min last-day-of-month (time/day value)))
                                            (.setMonth n))))
         :getNextMonth                (fn [value]
                                        (time/plus value (time/months 1)))
         :getPreviousMonth            (fn [value]
                                        (time/minus value (time/months 1)))
         :getMonthArray               (fn [value]
                                        (clj->js (take 12 (date-seq (start-of-year value) (time/months 1)))))
         :getYear                     (fn [value]
                                        (time/year value))
         :setYear                     (fn [value n]
                                        (doto (.clone value)
                                          (.setFullYear n)))
         :mergeDateAndTime            (fn [date time]
                                        (doto (.clone date)
                                          (.setHours (time/hour time))
                                          (.setMinutes (time/minute time))))
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
