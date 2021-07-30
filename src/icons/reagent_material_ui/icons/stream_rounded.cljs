(ns reagent-material-ui.icons.stream-rounded
  "Imports @material-ui/icons/StreamRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def stream-rounded (create-svg-icon [(e "circle" #js {"cx" "20", "cy" "12", "r" "2"}) (e "circle" #js {"cx" "4", "cy" "12", "r" "2"}) (e "circle" #js {"cx" "12", "cy" "20", "r" "2"}) (e "path" #js {"d" "m7.89 14.65-2.94 2.93c-.39.39-.39 1.02 0 1.41s1.02.39 1.41 0l2.94-2.93c.39-.38.39-1.02 0-1.41a.9959.9959 0 0 0-1.41 0zM6.41 4.94a.9959.9959 0 0 0-1.41 0c-.39.39-.39 1.02 0 1.41l2.93 2.94c.39.39 1.02.39 1.42 0 .38-.39.38-1.02-.01-1.41L6.41 4.94zm9.71 9.71c-.39-.39-1.02-.39-1.42 0-.39.39-.39 1.02 0 1.41L17.64 19c.39.39 1.02.39 1.41 0s.39-1.02 0-1.41l-2.93-2.94zm-.06-5.32 2.99-2.98c.39-.4.39-1.03 0-1.42a.9959.9959 0 0 0-1.41 0l-2.99 2.98c-.39.39-.39 1.02 0 1.42.39.39 1.02.39 1.41 0z"}) (e "circle" #js {"cx" "12", "cy" "4", "r" "2"})]
                                     "StreamRounded"))
