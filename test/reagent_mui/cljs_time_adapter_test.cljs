(ns reagent-mui.cljs-time-adapter-test
  (:require [cljs.test :refer-macros [deftest testing is use-fixtures]]
            [cljs-time.core :as time]
            [reagent-mui.cljs-time-adapter :refer [cljs-time-adapter]])
  (:import (goog.i18n DateTimeSymbols_fi)
           (goog.date DateTime)))

(def test-date (time/date-time 2018 10 30 11 44 22 0))
(def timestamp "2018-10-30T11:44:22.000Z")
(def utils (cljs-time-adapter #js {}))
(def datetime-format "yyyy-MM-dd HH:mm")
(defn format-datetime
  ([date]
   (format-datetime date datetime-format))
  ([date fmt]
   (.formatByString utils date fmt)))
(defn equal? [this that]
  (.isEqual utils this that))
(defn date
  ([]
   (date js/undefined))
  ([obj]
   (.date utils obj)))

(deftest date-test
  (testing "date"
    (is (equal? test-date (date timestamp)))
    (is (equal? test-date (date (js/Date. timestamp))))
    (is (equal? test-date (date (date timestamp))))
    (is (nil? (date nil)))
    (is (some? (date js/undefined)))
    (is (instance? DateTime (date (time/local-date 2018 10 30))))))

(deftest is-valid-test
  (testing "isValid"
    (let [invalid-date (date "2018-42-30T11:60:00.000Z")]
      (is (.isValid utils test-date))
      (is (not (.isValid utils invalid-date)))
      (is (.isValid utils js/undefined))
      (is (not (.isValid utils nil)))
      (is (not (.isValid utils "2018-42-30T11:60:00.000Z"))))))

(deftest add-seconds-test
  (testing "addSeconds"
    (is (= "23" (format-datetime (.addSeconds utils test-date 1) "ss")))))

(deftest add-minutes-test
  (testing "addMinutes"
    (is (= "45" (format-datetime (.addMinutes utils test-date 1) "mm")))))

(deftest add-hours-test
  (testing "addHours"
    (is (= "12" (format-datetime (.addHours utils test-date 1) "HH")))))

(deftest add-days-test
  (testing "addDays"
    (is (= "31" (format-datetime (.addDays utils test-date 1) "dd")))))

(deftest add-weeks-test
  (testing "addWeeks"
    (is (= "2018-11-06" (format-datetime (.addWeeks utils test-date 1) "yyyy-MM-dd")))))

(deftest add-months-test
  (testing "addMonths"
    (is (= "2018-12-30" (format-datetime (.addMonths utils test-date 2) "yyyy-MM-dd")))
    (is (= "2018-08-30" (format-datetime (.addMonths utils test-date -2) "yyyy-MM-dd")))))

(deftest add-years-test
  (testing "addYears"
    (is (= "2019-10-30" (format-datetime (.addYears utils test-date 1) "yyyy-MM-dd")))))

(deftest start-of-day-test
  (testing "startOfDay"
    (is (= "2018-10-30 00:00" (format-datetime (.startOfDay utils test-date))))))

(deftest end-of-day-test
  (testing "endOfDay"
    (is (= "2018-10-30 23:59" (format-datetime (.endOfDay utils test-date))))))

(deftest start-of-year-test
  (testing "startOfYear"
    (is (= "2018-01-01 00:00" (format-datetime (.startOfYear utils test-date))))))

(deftest end-of-year-test
  (testing "endOfYear"
    (is (= "2018-12-31 23:59" (format-datetime (.endOfYear utils test-date))))))

(deftest start-of-month-test
  (testing "startOfMonth"
    (is (= "2018-10-01 00:00" (format-datetime (.startOfMonth utils test-date))))))

(deftest end-of-month-test
  (testing "endOfMonth"
    (is (= "2018-10-31 23:59" (format-datetime (.endOfMonth utils test-date))))))

(deftest start-of-week-test
  (testing "startOfWeek"
    (is (= "2018-10-28 00:00" (format-datetime (.startOfWeek utils test-date))))))

(deftest end-of-week-test
  (testing "endOfWeek"
    (is (= "2018-11-03 23:59" (format-datetime (.endOfWeek utils test-date))))))

(deftest get-previous-month-test
  (testing "getPreviousMonth"
    (is (= "2018-09-30 11:44" (format-datetime (.getPreviousMonth utils test-date))))))

(deftest get-month-array-test
  (testing "getMonthArray"
    (is (= ["2018-01-01 00:00"
            "2018-02-01 00:00"
            "2018-03-01 00:00"
            "2018-04-01 00:00"
            "2018-05-01 00:00"
            "2018-06-01 00:00"
            "2018-07-01 00:00"
            "2018-08-01 00:00"
            "2018-09-01 00:00"
            "2018-10-01 00:00"
            "2018-11-01 00:00"
            "2018-12-01 00:00"]
           (map format-datetime (.getMonthArray utils test-date))))))

(deftest get-next-month-test
  (testing "getNextMonth"
    (is (= "2018-11-30 11:44" (format-datetime (.getNextMonth utils test-date))))))

(deftest get-year-test
  (testing "getYear"
    (is (= 2018 (.getYear utils test-date)))))

(deftest get-month-test
  (testing "getMonth"
    (is (= 9 (.getMonth utils test-date)))))

(deftest get-date-test
  (testing "getDate"
    (is (= 30 (.getDate utils test-date)))))

(deftest get-hours-test
  (testing "getHours"
    (is (= 11 (.getHours utils test-date)))))

(deftest get-minutes-test
  (testing "getMinutes"
    (is (= 44 (.getMinutes utils test-date)))))

(deftest get-seconds-test
  (testing "getSeconds"
    (is (= 22 (.getSeconds utils test-date)))))

(deftest get-days-in-month-test
  (testing "getDaysInMonth"
    (is (= [31 28 31 30 31 30 31 31 30 31 30 31]
           (map #(.getDaysInMonth utils (time/date-time 2018 % 1)) [1 2 3 4 5 6 7 8 9 10 11 12])))
    (is (= 29 (.getDaysInMonth utils (time/date-time 2016 2 1))))))

(deftest set-year-test
  (testing "setYear"
    (is (= "2011-10-30 11:44" (format-datetime (.setYear utils test-date 2011))))))

(deftest set-month-test
  (testing "setMonth"
    (is (= "2018-05-30 11:44" (format-datetime (.setMonth utils test-date 4))))))

(deftest set-date-test
  (testing "setDate"
    (is (= "2018-10-05 11:44" (format-datetime (.setDate utils test-date 5))))))

(deftest set-hours-test
  (testing "setHours"
    (is (= "2018-10-30 00:44" (format-datetime (.setHours utils test-date 0))))))

(deftest set-minutes-test
  (testing "setMinutes"
    (is (= "2018-10-30 11:12" (format-datetime (.setMinutes utils test-date 12))))))

(deftest set-seconds-test
  (testing "setSeconds"
    (is (.setSeconds utils test-date 11))))

(deftest is-after-test
  (testing "isAfter"
    (is (.isAfter utils (date) test-date))
    (is (not (.isAfter utils test-date (date))))))

(deftest is-before-test
  (testing "isBefore"
    (is (.isBefore utils test-date (date)))
    (is (not (.isBefore utils (date) test-date)))))

(deftest is-after-day-test
  (testing "isAfterDay"
    (let [next-day (.addDays utils test-date 1)]
      (is (.isAfterDay utils next-day test-date))
      (is (not (.isAfterDay utils test-date next-day))))))

(deftest is-before-day-test
  (testing "isBeforeDay"
    (let [prev-day (.addDays utils test-date -1)]
      (is (.isBeforeDay utils prev-day test-date))
      (is (not (.isBeforeDay utils test-date prev-day))))))

(deftest is-after-year-test
  (testing "isAfterYear"
    (let [next-year (.setYear utils test-date 2019)]
      (is (.isAfterYear utils next-year test-date))
      (is (not (.isAfterYear utils test-date next-year))))))

(deftest is-before-year-test
  (testing "isBeforeYear"
    (let [prev-year (.setYear utils test-date 2017)]
      (is (.isBeforeYear utils prev-year test-date))
      (is (not (.isBeforeYear utils test-date prev-year))))))

(deftest get-week-array-test
  (testing "getWeekArray"
    (let [week-array (.getWeekArray utils test-date)]
      (is (= 5 (count week-array)))
      (doseq [week week-array]
        (is (= 7 (count week)))))))

(deftest get-year-range-test
  (testing "getYearRange"
    (let [year-range (.getYearRange utils test-date (.setYear utils test-date 2124))
          empty-year-range (.getYearRange utils test-date (.setYear utils test-date 2017))]
      (is (= 107 (count year-range)))
      (is (= 2124 (.getYear utils (last year-range))))
      (is (empty? empty-year-range)))))

(deftest get-diff-test
  (testing "getDiff"
    (is (= 86400000 (.getDiff utils test-date (date "2018-10-29T11:44:22.000Z"))))
    (is (= -86400000 (.getDiff utils test-date (date "2018-10-31T11:44:22.000Z"))))
    (is (= -86400000 (.getDiff utils test-date "2018-10-31T11:44:22.000Z")))))

(deftest merge-date-and-time-test
  (testing "mergeDateAndTime"
    (let [merged-date (.mergeDateAndTime utils test-date (date "2018-01-01T14:15:16.000Z"))]
      (is (= "2018-10-30T14:15:16.000Z" (.toISOString (.toJsDate utils merged-date)))))))

(deftest is-equal-test
  (testing "isEqual"
    (is (equal? (date nil) nil))
    (is (equal? test-date (date timestamp)))
    (is (not (equal? nil (date timestamp))))))

(deftest parse-test
  (testing "parse"
    (is (equal? test-date (.parse utils "2018-10-30 11:44:22" "yyyy-MM-dd HH:mm:ss")))
    (is (nil? (.parse utils "" datetime-format)))
    (is (not (.isValid utils (.parse utils "99-99-9999" datetime-format))))))

(deftest is-null-test
  (testing "isNull"
    (is (.isNull utils nil))
    (is (not (.isNull utils test-date)))))

(deftest is-same-year-test
  (testing "isSameYear"
    (is (.isSameYear utils test-date (date "2018-10-01T00:00:00.000Z")))
    (is (not (.isSameYear utils test-date (date "2019-10-01T00:00:00.000Z"))))))

(deftest is-same-month-test
  (testing "isSameMonth"
    (is (.isSameMonth utils test-date (date "2018-10-01T00:00:00.000Z")))
    (is (not (.isSameMonth utils test-date (date "2019-10-01T00:00:00.000Z"))))))

(deftest is-same-day-test
  (testing "isSameDay"
    (is (.isSameDay utils test-date (date "2018-10-30T00:00:00.000Z")))
    (is (not (.isSameDay utils test-date (date "2019-10-30T00:00:00.000Z"))))))

(deftest is-same-hour-test
  (testing "isSameHour"
    (is (.isSameHour utils test-date (date "2018-10-30T11:20:00.000Z")))
    (is (not (.isSameHour utils test-date (date "2018-10-27T11:20:00.000Z"))))))

(deftest to-js-date-test
  (testing "toJsDate"
    (is (instance? js/Date (.toJsDate utils test-date)))))

(deftest is-within-range-test
  (testing "isWithinRange"
    (is (.isWithinRange utils
                        (date "2019-10-01T00:00:00.000Z")
                        #js [(date "2019-09-01T00:00:00.000Z")
                             (date "2019-11-01T00:00:00.000Z")]))
    (is (not (.isWithinRange utils
                             (date "2019-12-01T00:00:00.000Z")
                             #js [(date "2019-09-01T00:00:00.000Z")
                                  (date "2019-11-01T00:00:00.000Z")])))
    (testing "range is inclusive"
      (is (.isWithinRange utils
                          (date "2019-09-01T00:00:00.000Z")
                          #js [(date "2019-09-01T00:00:00.000Z")
                               (date "2019-12-01T00:00:00.000Z")]))
      (is (.isWithinRange utils
                          (date "2019-12-01T00:00:00.000Z")
                          #js [(date "2019-09-01T00:00:00.000Z")
                               (date "2019-12-01T00:00:00.000Z")])))))

(deftest get-current-locale-code-test
  (testing "getCurrentLocaleCode"
    (is (= "en" (.getCurrentLocaleCode (cljs-time-adapter #js {}))))
    (is (= "fi" (.getCurrentLocaleCode (cljs-time-adapter #js {:locale DateTimeSymbols_fi}))))))
