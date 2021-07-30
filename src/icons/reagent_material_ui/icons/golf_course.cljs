(ns reagent-material-ui.icons.golf-course
  "Imports @material-ui/icons/GolfCourse as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def golf-course (create-svg-icon [(e "circle" #js {"cx" "19.5", "cy" "19.5", "r" "1.5"}) (e "path" #js {"d" "M17 5.92 9 2v18H7v-1.73c-1.79.35-3 .99-3 1.73 0 1.1 2.69 2 6 2s6-.9 6-2c0-.99-2.16-1.81-5-1.97V8.98l6-3.06z"})]
                                  "GolfCourse"))
