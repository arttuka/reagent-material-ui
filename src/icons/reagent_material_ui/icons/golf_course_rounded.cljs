(ns reagent-material-ui.icons.golf-course-rounded
  "Imports @material-ui/icons/GolfCourseRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def golf-course-rounded (create-svg-icon (e react/Fragment nil (e "circle" #js {"cy" "19.5", "r" "1.5", "cx" "19.5"}) (e "path" #js {"d" "M11 18.03V8.98l4.22-2.15c.73-.37.73-1.43-.01-1.79l-4.76-2.33C9.78 2.38 9 2.86 9 3.6V19c0 .55-.45 1-1 1s-1-.45-1-1v-.73c-1.79.35-3 .99-3 1.73 0 1.1 2.69 2 6 2s6-.9 6-2c0-.99-2.16-1.81-5-1.97z"}))
                                          "GolfCourseRounded"))
