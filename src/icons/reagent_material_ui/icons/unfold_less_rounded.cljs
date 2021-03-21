(ns reagent-material-ui.icons.unfold-less-rounded
  "Imports @material-ui/icons/UnfoldLessRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def unfold-less-rounded (create-svg-icon (e "path" #js {"d" "M14.38 4.7L12 7.08 9.62 4.7a.9959.9959 0 0 0-1.41 0c-.39.39-.39 1.03 0 1.42l3.08 3.08c.39.39 1.02.39 1.41 0l3.08-3.08c.39-.39.39-1.03 0-1.42-.38-.39-1.02-.38-1.4 0zM9.62 19.3L12 16.92l2.38 2.38c.39.39 1.02.39 1.41 0 .39-.39.39-1.03 0-1.42l-3.08-3.08a.9959.9959 0 0 0-1.41 0l-3.08 3.08c-.39.39-.39 1.03 0 1.42.38.39 1.02.38 1.4 0z"})
                                          "UnfoldLessRounded"))
