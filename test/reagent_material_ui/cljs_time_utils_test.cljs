(ns reagent-material-ui.cljs-time-utils-test
  (:require [cljs.test :refer-macros [deftest testing is use-fixtures]]
            [cljs-time.core :as time]
            [reagent-material-ui.cljs-time-utils :refer [cljs-time-utils]]))

(def date (time/date-time 2018 10 30 11 44 0 0))
(def timestamp "2018-10-30T11:44:00.000Z")
(def utils (cljs-time-utils #js {}))
(def datetime-format "yyyy-MM-dd HH:mm")
(defn format-datetime [date]
  (.formatByString utils date datetime-format))

(deftest date-test
  (testing "date"
    (is (.isEqual utils date (.date utils timestamp)))
    (is (.isEqual utils date (.date utils (js/Date. timestamp))))
    (is (.isEqual utils date (.date utils (.date utils timestamp))))
    (is (nil? (.date utils nil)))
    (is (some? (.date utils js/undefined)))))

(deftest is-valid-test
  (testing "isValid"
    (let [invalid-date (.date utils "2018-42-30T11:60:00.000Z")]
      (is (.isValid utils date))
      (is (not (.isValid utils invalid-date)))
      (is (.isValid utils js/undefined))
      (is (not (.isValid utils nil)))
      (is (not (.isValid utils "2018-42-30T11:60:00.000Z"))))))

(deftest add-days-test
  (testing "addDays"
    (is (= "31" (.format utils (.addDays utils date 1) "dayOfMonth")))))

(deftest add-months-test
  (testing "addMonths"
    (is (= "December 2018" (.format utils (.addMonths utils date 2) "monthAndYear")))
    (is (= "August 2018" (.format utils (.addMonths utils date -2) "monthAndYear")))))

(deftest start-of-day-test
  (testing "startOfDay"
    (is (= "2018-10-30 00:00" (format-datetime (.startOfDay utils date))))))

(deftest end-of-day-test
  (testing "endOfDay"
    (is (= "2018-10-30 23:59" (format-datetime (.endOfDay utils date))))))

(deftest start-of-month-test
  (testing "startOfMonth"
    (is (= "2018-10-01 00:00" (format-datetime (.startOfMonth utils date))))))

(deftest end-of-month-test
  (testing "endOfMonth"
    (is (= "2018-10-31 23:59" (format-datetime (.endOfMonth utils date))))))

(deftest start-of-week-test
  (testing "startOfWeek"
    (is (= "2018-10-28 00:00" (format-datetime (.startOfWeek utils date))))))

(deftest end-of-week-test
  (testing "endOfWeek"
    (is (= "2018-11-03 23:59" (format-datetime (.endOfWeek utils date))))))

(deftest get-previous-month-test
  (testing "getPreviousMonth"
    (is (= "2018-09-30 11:44" (format-datetime (.getPreviousMonth utils date))))))

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
           (map format-datetime (.getMonthArray utils date))))))

(deftest get-next-month-test
  (testing "getNextMonth"
    (is (= "2018-11-30 11:44" (format-datetime (.getNextMonth utils date))))))

(deftest get-year-test
  (testing "getYear"
    (is (= 2018 (.getYear utils date)))))

(deftest get-month-test
  (testing "getMonth"
    (is (= 9 (.getMonth utils date)))))

(deftest get-hours-test
  (testing "getHours"
    (is (= 11 (.getHours utils date)))))

(deftest get-minutes-test
  (testing "getMinutes"
    (is (= 44 (.getMinutes utils date)))))

(deftest get-seconds-test
  (testing "getSeconds"
    (is (= 0 (.getSeconds utils date)))))

(deftest set-year-test
  (testing "setYear"
    (is (= "2011-10-30 11:44" (format-datetime (.setYear utils date 2011))))))

(deftest set-month-test
  (testing "setMonth"
    (is (= "2018-05-30 11:44" (format-datetime (.setMonth utils date 4))))))

(deftest set-hours-test
  (testing "setHours"
    (is (= "2018-10-30 00:44" (format-datetime (.setHours utils date 0))))))

(deftest set-minutes-test
  (testing "setMinutes"
    (is (= "2018-10-30 11:12" (format-datetime (.setMinutes utils date 12))))))

(deftest set-seconds-test
  (testing "setSeconds"
    (is (.setSeconds utils date 11))))

(deftest is-after-test
  (testing "isAfter"
    (is (.isAfter utils (.date utils) date))
    (is (not (.isAfter utils date (.date utils))))))

(deftest is-before-test
  (testing "isBefore"
    (is (.isBefore utils date (.date utils)))
    (is (not (.isBefore utils (.date utils) date)))))

(deftest is-after-day-test
  (testing "isAfterDay"
    (let [next-day (.addDays utils date 1)]
      (is (.isAfterDay utils next-day date))
      (is (not (.isAfterDay utils date next-day))))))

(deftest is-before-day-test
  (testing "isBeforeDay"
    (let [prev-day (.addDays utils date -1)]
      (is (.isBeforeDay utils prev-day date))
      (is (not (.isBeforeDay utils date prev-day))))))

(deftest is-after-year-test
  (testing "isAfterYear"
    (let [next-year (.setYear utils date 2019)]
      (is (.isAfterYear utils next-year date))
      (is (not (.isAfterYear utils date next-year))))))

(deftest is-before-year-test
  (testing "isBeforeYear"
    (let [prev-year (.setYear utils date 2017)]
      (is (.isBeforeYear utils prev-year date))
      (is (not (.isBeforeYear utils date prev-year))))))

(deftest get-week-array-test
  (testing "getWeekArray"
    (let [week-array (.getWeekArray utils date)]
      (is (= 5 (count week-array)))
      (doseq [week week-array]
        (is (= 7 (count week)))))))

(deftest get-year-range-test
  (testing "getYearRange"
    (let [year-range (.getYearRange utils date (.setYear utils date 2124))
          empty-year-range (.getYearRange utils date (.setYear utils date 2017))]
      (is (= 107 (count year-range)))
      (is (= 2124 (.getYear utils (last year-range))))
      (is (empty? empty-year-range)))))

(deftest get-diff-test
  (testing "getDiff"
    (is (= 86400000 (.getDiff utils date (.date utils "2018-10-29T11:44:00.000Z"))))
    (is (= -86400000 (.getDiff utils date (.date utils "2018-10-31T11:44:00.000Z"))))
    (is (= -86400000 (.getDiff utils date "2018-10-31T11:44:00.000Z")))))

(deftest merge-date-and-time-test
  (testing "mergeDateAndTime"
    (let [merged-date (.mergeDateAndTime utils date (.date utils "2018-01-01T14:15:16.000Z"))]
      (is (= "2018-10-30T14:15:16.000Z" (.toISOString (.toJsDate utils merged-date)))))))

(deftest is-equal-test
  (testing "isEqual"
    (is (.isEqual utils (.date utils nil) nil))
    (is (.isEqual utils date (.date utils timestamp)))
    (is (not (.isEqual utils nil (.date utils timestamp))))))

(deftest parse-test
  (testing "parse"
    (is (.isEqual utils date (.parse utils "2018-10-30 11:44" datetime-format)))
    (is (nil? (.parse utils "" datetime-format)))
    (is (not (.isValid utils (.parse utils "99-99-9999" datetime-format))))))

(deftest is-null-test
  (testing "isNull"
    (is (.isNull utils nil))
    (is (not (.isNull utils date)))))

(deftest is-same-year-test
  (testing "isSameYear"
    (is (.isSameYear utils date (.date utils "2018-10-01T00:00:00.000Z")))
    (is (not (.isSameYear utils date (.date utils "2019-10-01T00:00:00.000Z"))))))

(deftest is-same-month-test
  (testing "isSameMonth"
    (is (.isSameMonth utils date (.date utils "2018-10-01T00:00:00.000Z")))
    (is (not (.isSameMonth utils date (.date utils "2019-10-01T00:00:00.000Z"))))))

(deftest is-same-day-test
  (testing "isSameDay"
    (is (.isSameDay utils date (.date utils "2018-10-30T00:00:00.000Z")))
    (is (not (.isSameDay utils date (.date utils "2019-10-30T00:00:00.000Z"))))))

(deftest is-same-hour-test
  (testing "isSameHour"
    (is (.isSameHour utils date (.date utils "2018-10-30T11:20:00.000Z")))
    (is (not (.isSameHour utils date (.date utils "2018-10-27T11:20:00.000Z"))))))

(deftest to-js-date-test
  (testing "toJsDate"
    (is (instance? js/Date (.toJsDate utils date)))))

(deftest is-within-range-test
  (testing "isWithinRange"
    (is (.isWithinRange utils
                        (.date utils "2019-10-01T00:00:00.000Z")
                        #js [(.date utils "2019-09-01T00:00:00.000Z")
                             (.date utils "2019-11-01T00:00:00.000Z")]))
    (is (not (.isWithinRange utils
                             (.date utils "2019-12-01T00:00:00.000Z")
                             #js [(.date utils "2019-09-01T00:00:00.000Z")
                                  (.date utils "2019-11-01T00:00:00.000Z")])))
    (testing "range is inclusive"
      (is (.isWithinRange utils
                          (.date utils "2019-09-01T00:00:00.000Z")
                          #js [(.date utils "2019-09-01T00:00:00.000Z")
                               (.date utils "2019-12-01T00:00:00.000Z")]))
      (is (.isWithinRange utils
                          (.date utils "2019-12-01T00:00:00.000Z")
                          #js [(.date utils "2019-09-01T00:00:00.000Z")
                               (.date utils "2019-12-01T00:00:00.000Z")])))))
