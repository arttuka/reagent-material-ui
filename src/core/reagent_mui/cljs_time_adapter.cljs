(ns reagent-mui.cljs-time-adapter
  "Adapter for using cljs-time with reagent-mui.lab.localization-provider"
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
    (undefined? value) (time/time-now)
    (nil? value) nil
    (time/date? value) value
    (sequential? value) nil
    (array? value) nil
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

(defn ^:private locale-code [locale]
  (condp identical? locale
    goog.i18n.DateTimeSymbols_en_ISO "en_ISO"
    goog.i18n.DateTimeSymbols_af "af"
    goog.i18n.DateTimeSymbols_am "am"
    goog.i18n.DateTimeSymbols_ar "ar"
    goog.i18n.DateTimeSymbols_ar_DZ "ar_DZ"
    goog.i18n.DateTimeSymbols_ar_EG "ar_EG"
    goog.i18n.DateTimeSymbols_az "az"
    goog.i18n.DateTimeSymbols_be "be"
    goog.i18n.DateTimeSymbols_bg "bg"
    goog.i18n.DateTimeSymbols_bn "bn"
    goog.i18n.DateTimeSymbols_br "br"
    goog.i18n.DateTimeSymbols_bs "bs"
    goog.i18n.DateTimeSymbols_ca "ca"
    goog.i18n.DateTimeSymbols_chr "chr"
    goog.i18n.DateTimeSymbols_cs "cs"
    goog.i18n.DateTimeSymbols_cy "cy"
    goog.i18n.DateTimeSymbols_da "da"
    goog.i18n.DateTimeSymbols_de "de"
    goog.i18n.DateTimeSymbols_de_AT "de_AT"
    goog.i18n.DateTimeSymbols_de_CH "de_CH"
    goog.i18n.DateTimeSymbols_el "el"
    goog.i18n.DateTimeSymbols_en "en"
    goog.i18n.DateTimeSymbols_en_AU "en_AU"
    goog.i18n.DateTimeSymbols_en_CA "en_CA"
    goog.i18n.DateTimeSymbols_en_GB "en_GB"
    goog.i18n.DateTimeSymbols_en_IE "en_IE"
    goog.i18n.DateTimeSymbols_en_IN "en_IN"
    goog.i18n.DateTimeSymbols_en_SG "en_SG"
    goog.i18n.DateTimeSymbols_en_US "en_US"
    goog.i18n.DateTimeSymbols_en_ZA "en_ZA"
    goog.i18n.DateTimeSymbols_es "es"
    goog.i18n.DateTimeSymbols_es_419 "es_419"
    goog.i18n.DateTimeSymbols_es_ES "es_ES"
    goog.i18n.DateTimeSymbols_es_MX "es_MX"
    goog.i18n.DateTimeSymbols_es_US "es_US"
    goog.i18n.DateTimeSymbols_et "et"
    goog.i18n.DateTimeSymbols_eu "eu"
    goog.i18n.DateTimeSymbols_fa "fa"
    goog.i18n.DateTimeSymbols_fi "fi"
    goog.i18n.DateTimeSymbols_fil "fil"
    goog.i18n.DateTimeSymbols_fr "fr"
    goog.i18n.DateTimeSymbols_fr_CA "fr_CA"
    goog.i18n.DateTimeSymbols_ga "ga"
    goog.i18n.DateTimeSymbols_gl "gl"
    goog.i18n.DateTimeSymbols_gsw "gsw"
    goog.i18n.DateTimeSymbols_gu "gu"
    goog.i18n.DateTimeSymbols_haw "haw"
    goog.i18n.DateTimeSymbols_he "he"
    goog.i18n.DateTimeSymbols_hi "hi"
    goog.i18n.DateTimeSymbols_hr "hr"
    goog.i18n.DateTimeSymbols_hu "hu"
    goog.i18n.DateTimeSymbols_hy "hy"
    goog.i18n.DateTimeSymbols_id "id"
    goog.i18n.DateTimeSymbols_in "in"
    goog.i18n.DateTimeSymbols_is "is"
    goog.i18n.DateTimeSymbols_it "it"
    goog.i18n.DateTimeSymbols_iw "iw"
    goog.i18n.DateTimeSymbols_ja "ja"
    goog.i18n.DateTimeSymbols_ka "ka"
    goog.i18n.DateTimeSymbols_kk "kk"
    goog.i18n.DateTimeSymbols_km "km"
    goog.i18n.DateTimeSymbols_kn "kn"
    goog.i18n.DateTimeSymbols_ko "ko"
    goog.i18n.DateTimeSymbols_ky "ky"
    goog.i18n.DateTimeSymbols_ln "ln"
    goog.i18n.DateTimeSymbols_lo "lo"
    goog.i18n.DateTimeSymbols_lt "lt"
    goog.i18n.DateTimeSymbols_lv "lv"
    goog.i18n.DateTimeSymbols_mk "mk"
    goog.i18n.DateTimeSymbols_ml "ml"
    goog.i18n.DateTimeSymbols_mn "mn"
    goog.i18n.DateTimeSymbols_mo "mo"
    goog.i18n.DateTimeSymbols_mr "mr"
    goog.i18n.DateTimeSymbols_ms "ms"
    goog.i18n.DateTimeSymbols_mt "mt"
    goog.i18n.DateTimeSymbols_my "my"
    goog.i18n.DateTimeSymbols_nb "nb"
    goog.i18n.DateTimeSymbols_ne "ne"
    goog.i18n.DateTimeSymbols_nl "nl"
    goog.i18n.DateTimeSymbols_no "no"
    goog.i18n.DateTimeSymbols_no_NO "no_NO"
    goog.i18n.DateTimeSymbols_or "or"
    goog.i18n.DateTimeSymbols_pa "pa"
    goog.i18n.DateTimeSymbols_pl "pl"
    goog.i18n.DateTimeSymbols_pt "pt"
    goog.i18n.DateTimeSymbols_pt_BR "pt_BR"
    goog.i18n.DateTimeSymbols_pt_PT "pt_PT"
    goog.i18n.DateTimeSymbols_ro "ro"
    goog.i18n.DateTimeSymbols_ru "ru"
    goog.i18n.DateTimeSymbols_sh "sh"
    goog.i18n.DateTimeSymbols_si "si"
    goog.i18n.DateTimeSymbols_sk "sk"
    goog.i18n.DateTimeSymbols_sl "sl"
    goog.i18n.DateTimeSymbols_sq "sq"
    goog.i18n.DateTimeSymbols_sr "sr"
    goog.i18n.DateTimeSymbols_sr_Latn "sr_Latn"
    goog.i18n.DateTimeSymbols_sv "sv"
    goog.i18n.DateTimeSymbols_sw "sw"
    goog.i18n.DateTimeSymbols_ta "ta"
    goog.i18n.DateTimeSymbols_te "te"
    goog.i18n.DateTimeSymbols_th "th"
    goog.i18n.DateTimeSymbols_tl "tl"
    goog.i18n.DateTimeSymbols_tr "tr"
    goog.i18n.DateTimeSymbols_uk "uk"
    goog.i18n.DateTimeSymbols_ur "ur"
    goog.i18n.DateTimeSymbols_uz "uz"
    goog.i18n.DateTimeSymbols_vi "vi"
    goog.i18n.DateTimeSymbols_zh "zh"
    goog.i18n.DateTimeSymbols_zh_CN "zh_CN"
    goog.i18n.DateTimeSymbols_zh_HK "zh_HK"
    goog.i18n.DateTimeSymbols_zh_TW "zh_TW"
    goog.i18n.DateTimeSymbols_zu "zu"
    "en"))

(defn cljs-time-adapter
  "Adapter for using cljs-time with reagent-mui.lab.localization-provider"
  [opts]
  (let [^DateTimeSymbols locale (or (obj/get opts "locale") DateTimeSymbols)
        formats (or (js->clj (obj/get opts "formats")) default-formats)
        format (fn [date format-str]
                 (let [^DateTimeFormat formatter (DateTimeFormat. format-str locale)]
                   (.format formatter date)))]
    #js {:locale                       locale
         :formats                      (clj->js formats)
         :date                         to-cljs-date
         :toJsDate                     (fn [value]
                                         (coerce/to-date value))
         :parse                        (fn [value format-str]
                                         (let [date (coerce/to-date-time 0)
                                               ^DateTimeParse parser (DateTimeParse. format-str locale)
                                               cnt (.strictParse parser value date)]
                                           (when (pos? cnt)
                                             date)))
         :getCurrentLocaleCode         (fn []
                                         (locale-code locale))
         :is12HourCycleInCurrentLocale (constantly true)
         :getFormatHelperText          (constantly "")
         :isNull                       (fn [value]
                                         (nil? value))
         :isValid                      (fn [value]
                                         (some? (to-cljs-date value)))
         :getDiff                      (fn [to from]
                                         (let [to (to-cljs-date to)
                                               from (to-cljs-date from)]
                                           (if (time/before? from to)
                                             (time/in-millis (time/interval from to))
                                             (- (time/in-millis (time/interval to from))))))
         :isEqual                      (fn [left right]
                                         (cond
                                           (and (nil? left) (nil? right)) true
                                           (or (nil? left) (nil? right)) false
                                           :else (time/equal? (to-cljs-date left)
                                                              (to-cljs-date right))))
         :isSameHour                   (fn [left right]
                                         (time/equal? (start-of-hour left)
                                                      (start-of-hour right)))
         :isSameDay                    (fn [left right]
                                         (time/equal? (start-of-day left)
                                                      (start-of-day right)))
         :isSameMonth                  (fn [left right]
                                         (time/equal? (start-of-month left)
                                                      (start-of-month right)))
         :isSameYear                   (fn [left right]
                                         (time/equal? (start-of-year left)
                                                      (start-of-year right)))
         :isAfter                      (fn [this that]
                                         (time/after? this that))
         :isAfterDay                   (fn [this that]
                                         (time/after? this (end-of-day that)))
         :isAfterYear                  (fn [this that]
                                         (time/after? this (end-of-year that)))
         :isBefore                     (fn [this that]
                                         (time/before? this that))
         :isBeforeDay                  (fn [this that]
                                         (time/before? this (start-of-day that)))
         :isBeforeYear                 (fn [this that]
                                         (time/before? this (start-of-year that)))
         :isWithinRange                (fn [date [from to]]
                                         (or (time/within? from to date)
                                             (time/equal? to date)))
         :startOfYear                  (fn [date]
                                         (start-of-year date))
         :endOfYear                    (fn [date]
                                         (end-of-year date))
         :startOfMonth                 (fn [date]
                                         (start-of-month date))
         :endOfMonth                   (fn [date]
                                         (end-of-month date))
         :startOfWeek                  (fn [date]
                                         (start-of-week date locale))
         :endOfWeek                    (fn [date]
                                         (end-of-week date locale))
         :addDays                      (fn [date n]
                                         (time/plus date (time/days n)))
         :addMonths                    (fn [date n]
                                         (time/plus date (time/months n)))
         :startOfDay                   (fn [date]
                                         (start-of-day date))
         :endOfDay                     (fn [date]
                                         (end-of-day date))
         :format                       (fn [date format-key]
                                         (format date (get formats format-key)))
         :formatByString               format
         :formatNumber                 (fn [number]
                                         number)
         :getHours                     (fn [date]
                                         (time/hour date))
         :setHours                     (fn [^DateTime date n]
                                         (doto ^DateTime (.clone date)
                                           (.setHours n)))
         :getMinutes                   (fn [date]
                                         (time/minute date))
         :setMinutes                   (fn [^DateTime date n]
                                         (doto ^DateTime (.clone date)
                                           (.setMinutes n)))
         :getSeconds                   (fn [date]
                                         (time/second date))
         :setSeconds                   (fn [^DateTime date n]
                                         (doto ^DateTime (.clone date)
                                           (.setSeconds n)))
         :getMonth                     (fn [^DateTime date]
                                         (.getMonth date))
         :setMonth                     (fn [^DateTime date n]
                                         (let [last-day-of-month (time/day (time/last-day-of-the-month (time/year date) (inc n)))]
                                           (doto ^DateTime (.clone date)
                                             (.setDate (min last-day-of-month (time/day date)))
                                             (.setMonth n))))
         :getNextMonth                 (fn [date]
                                         (time/plus date (time/months 1)))
         :getPreviousMonth             (fn [date]
                                         (time/minus date (time/months 1)))
         :getMonthArray                (fn [date]
                                         (clj->js (take 12 (date-seq (start-of-year date) (time/months 1)))))
         :getYear                      (fn [date]
                                         (time/year date))
         :setYear                      (fn [^DateTime date n]
                                         (doto ^DateTime (.clone date)
                                           (.setFullYear n)))
         :mergeDateAndTime             (fn [^DateTime date time]
                                         (doto ^DateTime (.clone date)
                                           (.setHours (time/hour time))
                                           (.setMinutes (time/minute time))
                                           (.setSeconds (time/second time))
                                           (.setMilliseconds (time/milli time))))
         :getWeekdays                  (fn []
                                         (let [weekday-names (.-STANDALONESHORTWEEKDAYS locale)
                                               first-day-of-week (mod (inc (.-FIRSTDAYOFWEEK locale)) 7)]
                                           (clj->js (concat (drop first-day-of-week weekday-names)
                                                            (take first-day-of-week weekday-names)))))
         :getWeekArray                 (fn [date]
                                         (let [start (start-of-week (start-of-month date) locale)
                                               end (end-of-week (end-of-month date) locale)]
                                           (clj->js (for [start-of-week (date-seq start (time/days 7))
                                                          :while (time/before? start-of-week end)]
                                                      (take 7 (date-seq start-of-week (time/days 1)))))))
         :getYearRange                 (fn [from to]
                                         (let [start (start-of-year from)
                                               end (end-of-year to)]
                                           (clj->js (take-while #(time/before? % end) (date-seq start (time/years 1))))))
         :getMeridiemText              (fn [ampm]
                                         (if (= "am" ampm) "AM" "PM"))
         :getCalendarHeaderText        (fn [date]
                                         (format date "MMMM yyyy"))
         :getDatePickerHeaderText      (fn [date]
                                         (format date "EEE, MMM d"))
         :getDateTimePickerHeaderText  (fn [date]
                                         (format date "MMM d"))
         :getMonthText                 (fn [date]
                                         (format date "MMM"))
         :getDayText                   (fn [date]
                                         (format date "d"))
         :getHourText                  (fn [date ampm]
                                         (format date (if ampm "hh" "HH")))
         :getMinuteText                (fn [date]
                                         (format date "mm"))
         :getSecondText                (fn [date]
                                         (format date "ss"))
         :getYearText                  (fn [date]
                                         (format date "yyyy"))}))
