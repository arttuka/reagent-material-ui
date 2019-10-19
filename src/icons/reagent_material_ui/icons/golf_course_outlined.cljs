(ns reagent-material-ui.icons.golf-course-outlined
  "Imports @material-ui/icons/GolfCourseOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def golf-course-outlined (create-svg-icon (e (.-Fragment js/React) nil (e "circle" #js {"cy" "19.5", "r" "1.5", "cx" "19.5"}) (e "path" #js {"d" "M17 5.92L9 2v18H7v-1.73c-1.79.35-3 .99-3 1.73 0 1.1 2.69 2 6 2s6-.9 6-2c0-.99-2.16-1.81-5-1.97V8.98l6-3.06z"}))
                                           "GolfCourseOutlined"))
