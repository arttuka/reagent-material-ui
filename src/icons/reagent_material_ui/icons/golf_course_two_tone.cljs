(ns reagent-material-ui.icons.golf-course-two-tone
  "Imports @material-ui/icons/GolfCourseTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def golf-course-two-tone (create-svg-icon (e react/Fragment nil (e "circle" #js {"cy" "19.5", "r" "1.5", "cx" "19.5", "opacity" ".3"}) (e "path" #js {"d" "M17 5.92L9 2v18H7v-1.73c-1.79.35-3 .99-3 1.73 0 1.1 2.69 2 6 2s6-.9 6-2c0-.99-2.16-1.81-5-1.97V8.98l6-3.06z", "opacity" ".3"}) (e "circle" #js {"cy" "19.5", "r" "1.5", "cx" "19.5"}) (e "path" #js {"d" "M17 5.92L9 2v18H7v-1.73c-1.79.35-3 .99-3 1.73 0 1.1 2.69 2 6 2s6-.9 6-2c0-.99-2.16-1.81-5-1.97V8.98l6-3.06z"}))
                                           "GolfCourseTwoTone"))
